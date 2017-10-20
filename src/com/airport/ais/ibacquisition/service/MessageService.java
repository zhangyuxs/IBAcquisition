package com.airport.ais.ibacquisition.service;

import java.util.Date;
import org.apache.log4j.Logger;

import com.airport.ais.ibacquisition.exception.IBException;
import com.airport.ais.ibacquisition.handler.MessageParser;
import com.airport.ais.ibacquisition.jms.ActiveMQConnector;
import com.airport.ais.ibacquisition.message.IMessageGenerator;
import com.airport.ais.ibacquisition.timer.StatusRequestTimer;
import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.ibacquisition.view.StatusView;



/**
 * 
 * 
 * FileName      MessageService.java
 * @Description  TODO IB��Ϣ�ķ�����򣬼̳��߳� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��2��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��2��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

public class MessageService extends Thread  {
	
    private Logger logger = Logger.getLogger(this.getClass().getName());
	/**
	 *  ActiveMq������
	 */
	private ActiveMQConnector activeMQConnector;
	/**
	 *  ״̬��ѯ��
	 */
	private StatusRequestTimer statusRequestTimer;
	/**
	 * ��Ϣ������
	 */
	private MessageParser messageParser;
	/**
	 * XML��Ϣ������
	 */
	private IMessageGenerator messageGenerator;
	/**
	 * ���ĵ����ͱ��� AFDS BDDS RDDS
	 */
	private String subscriptionType;
	/**
	 * ״̬View 
	 */
	private StatusView statusView;
	/**
	 * ���ı�ʶ
	 */
	private boolean subscription = false;
	 /**
	  * ����״̬��ʶ
	  */
	private boolean interfaceUp = false;
	/**
	 * �Ƿ�����Ϣ�յ���ʶ
	 */
	private boolean messageReceived = false;
	

	
	
	/**
	 *    ������Ե�Set,Get��������Ϊ��Springע����Ҫ
	 */
	public ActiveMQConnector getActiveMQConnector() {
		return activeMQConnector;
	}

	public void setActiveMQConnector(ActiveMQConnector activeMQConnector) {
		this.activeMQConnector = activeMQConnector;
	}

	public IMessageGenerator getMessageGenerator() {
		return messageGenerator;
	}

	public void setMessageGenerator(IMessageGenerator messageGenerator) {
		this.messageGenerator = messageGenerator;
	}
	
	public MessageParser getMessageParser() {
		return messageParser;
	}

	public void setMessageParser(MessageParser messageParser) {
		this.messageParser = messageParser;
	}

	public StatusRequestTimer getStatusRequestTimer() {
		return statusRequestTimer;
	}

	public void setStatusRequestTimer(StatusRequestTimer statusRequestTimer) {
		this.statusRequestTimer = statusRequestTimer;
	}
	
	public StatusView getStatusView() {
		return statusView;
	}

	public void setStatusView(StatusView statusView) {
		this.statusView = statusView;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	/**
	 *   �������ԣ����첽����ʽ��Ϊ���̰߳�ȫ
	 */
	public synchronized boolean isInterfaceUp() {
		return interfaceUp;
	}

	public synchronized  void setInterfaceUp(boolean interfaceUp) {
		this.interfaceUp = interfaceUp;
		statusView.setDispInterfaceUp(subscriptionType, interfaceUp);
	}

	public synchronized boolean isMessageReceived() {
		return messageReceived;
	}

	public synchronized  void setMessageReceived(boolean messageReceived) {
		this.messageReceived = messageReceived;
	}

	public synchronized boolean  isSubscription() {
		return subscription;
	}

	public synchronized  void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}

	
	/**
	 *   ����������Ϣ
	 */
	public void sendStatusRequestMessage(){
      try
      {
         String statusRequestMessage = messageGenerator.generateStatusRequestMessage(null);
	         
         activeMQConnector.sendMessage(statusRequestMessage);
      }
      catch (Exception e)
      {
    	  setInterfaceUp(false);
      }
	}

	/**
	 * ���Ͷ�����Ϣ
	 * @param time  �Ӻ�ʱ�����ݿ�ʼ����
	 */
	public void sendSubscriptionRequestMessage(Date time){
      try
      {
         String subscriptionRequestMessage = messageGenerator.generateSubscriptionRequestMessage(time);

         activeMQConnector.sendMessage(subscriptionRequestMessage);
      }
      catch (Exception e)
      {
	         logger.warn(e.getMessage(), e);
	         setInterfaceUp(false);
      }
   }	 
	/**
	 *   ����ȡ�����ĵ���Ϣ
	 */
	public void sendCancelSubscriptionMessage() {
      if (interfaceUp)
      {
    	  setInterfaceUp(false);
         try
         {
            String cancelSubscriptionMessagae = messageGenerator.generateCancelSubscriptionMessage(null);

            activeMQConnector.sendMessage(cancelSubscriptionMessagae);
         }
         catch (Exception e)
         {
            logger.warn(e.getMessage(), e);
         }
      }
   }

	/**
	 *   ��վ��Ϣ��ѯ
	 */
	protected void pollForInboundMessages(){
      while (true)
      {
         boolean received = false;
         String message = null;
         try
         {
            message =activeMQConnector.receiveMessage(false);
         }
         catch (IBException e)
         {
            logger.error("�޷���IB������Ϣ", e);
         }
         /* �������Ϣ���룬�������Ϣ*/
         if (message != null){
            received = true;
            try {
               	setMessageReceived(true);
               	messageParser.parse(message);
			} catch (Exception e) {
	            logger.error("�������", e);					
				e.printStackTrace();
			}
         }

         /* ���û����Ϣ���ٴγ��Զ�ȡ */
         if (!received){
            Utils.sleepThread(2);
         }
      }
	}
	
	
	/**
	 * ��������
	 */
	@Override
	public synchronized void start() {
		try {
			activeMQConnector.connect();
			/*
			 * �����ʱ����Ϊ�գ���������ʱ��
			 */
			if (statusRequestTimer != null){
				statusRequestTimer.start();
			}
		} catch (IBException e) {
			/*
			 *   ���ӳ���
			 */
			e.printStackTrace();
		}
		super.start();
	}

	
	@Override
	public void run() {
		pollForInboundMessages();
	}

	@Override
	public void interrupt() {
		try {

			activeMQConnector.close();
			if (statusRequestTimer != null){
				statusRequestTimer.stop();
			}
		} catch (IBException e) {
			logger.error("�ر�activeMQ���ӳ���", e);				
			e.printStackTrace();
		} finally {
			super.interrupt();
		}
		
	}
	 
	
	
	 
}
