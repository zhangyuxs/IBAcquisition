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
 * @Description  TODO IB消息的服务程序，继承线程 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月2日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月2日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

public class MessageService extends Thread  {
	
    private Logger logger = Logger.getLogger(this.getClass().getName());
	/**
	 *  ActiveMq联接者
	 */
	private ActiveMQConnector activeMQConnector;
	/**
	 *  状态查询者
	 */
	private StatusRequestTimer statusRequestTimer;
	/**
	 * 消息解析器
	 */
	private MessageParser messageParser;
	/**
	 * XML消息产生者
	 */
	private IMessageGenerator messageGenerator;
	/**
	 * 订阅的类型比如 AFDS BDDS RDDS
	 */
	private String subscriptionType;
	/**
	 * 状态View 
	 */
	private StatusView statusView;
	/**
	 * 订阅标识
	 */
	private boolean subscription = false;
	 /**
	  * 订阅状态标识
	  */
	private boolean interfaceUp = false;
	/**
	 * 是否有消息收到标识
	 */
	private boolean messageReceived = false;
	

	
	
	/**
	 *    相关属性的Set,Get方法，是为了Spring注入需要
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
	 *   操作属性，用异步锁方式，为了线程安全
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
	 *   发送心跳信息
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
	 * 发送订阅信息
	 * @param time  从何时的数据开始订阅
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
	 *   发送取消订阅的消息
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
	 *   入站消息轮询
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
            logger.error("无法从IB接收信息", e);
         }
         /* 如果有消息进入，处理该消息*/
         if (message != null){
            received = true;
            try {
               	setMessageReceived(true);
               	messageParser.parse(message);
			} catch (Exception e) {
	            logger.error("处理错误", e);					
				e.printStackTrace();
			}
         }

         /* 如果没有消息，再次尝试读取 */
         if (!received){
            Utils.sleepThread(2);
         }
      }
	}
	
	
	/**
	 * 启动方法
	 */
	@Override
	public synchronized void start() {
		try {
			activeMQConnector.connect();
			/*
			 * 如果定时器不为空，则启动定时器
			 */
			if (statusRequestTimer != null){
				statusRequestTimer.start();
			}
		} catch (IBException e) {
			/*
			 *   连接出错
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
			logger.error("关闭activeMQ连接出错", e);				
			e.printStackTrace();
		} finally {
			super.interrupt();
		}
		
	}
	 
	
	
	 
}
