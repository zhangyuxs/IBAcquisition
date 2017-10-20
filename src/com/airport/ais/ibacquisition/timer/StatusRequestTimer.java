

package com.airport.ais.ibacquisition.timer;

import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;

import com.airport.ais.ibacquisition.service.MessageService;


/**
 * 
 * 
 * FileName      StatusRequestTimer.java
 * @Description  TODO ������ѯ�������ڲ�ѯ���ļ��� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��2��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��2��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */
public class StatusRequestTimer
{
   private Logger logger = Logger.getLogger(this.getClass().getName());
   /**
    * �����ļ�
    */
   private ResourceBundle props = ResourceBundle.getBundle("resource.client");
   /**
    * ʱ������
    */
   private TimerTask task = null;
   /**
    * ��ʱ��
    */
   private Timer timer = null;
   /**
    * ���б�ʶ
    */
   private boolean running = false;
   /**
    * ʱ�������뵥λ
    */
   private int period = 0;
   /**
    * IB��Ϣ������
    */
   private MessageService messageService = null;

   /**
    * ����ϴδ�IMFû���յ��κ���Ϣ������������������´�����û���յ���Ϣ������
    * ȡ�����붩��
    */
   private int noMessageRecievedOnLastCheck = 0;

   public StatusRequestTimer()
   {
	   this.period = Integer.parseInt(props.getString("status.request.timer.period"));
   }

   /**
    * ��ʼ���
    */
   public void start()
   {
      logger.debug("Starting StatusRequest timer");
      if (!isRunning())
      {
         stop();
         setTask(new StatusRequestTimerTask());
         setTimer(new Timer("StatusRequestTimout Thread"));
         /**
          * ��period�������Ϊʱ���������������
          */
         getTimer().schedule(getTask(), 0, period * 1000);
         setRunning(true);
      }
   }
   /**
    * �������
    */
   public void stop()
   {
      if (getTimer() != null)
      {
         getTimer().cancel();
      }
      setRunning(false);
   }
   
   /**
    * 
    * 
    * FileName      StatusRequestTimer.java
    * @Description  TODO ������鶨ʱ�� 
    * @author       ZhangYu    Company:    LZAirport
    * @version      V0.9a CreateDate: 2017��7��2��
    * @ModificationHistory
    * Date         Author     Version   Description
    * <p>---------------------------------------------
    * <p>2017��7��2��      ZhangYu    1.0        1.0
    * <p>Why & What is modified: <�޸�ԭ������>
    */
   public class StatusRequestTimerTask extends TimerTask
   {
      @Override
      public void run()
      {
         
    	  
    	  if (messageService.isInterfaceUp() && messageService.isMessageReceived()){
    		  noMessageRecievedOnLastCheck = 0;
    	  }
    	          
    	  /*
           * ����ӿ�����������û���յ�����IMF����Ϣ��
           */
         if (messageService.isInterfaceUp() && !messageService.isMessageReceived())
         {
            /* ���ǵ��ĸ�ʧ�ܵļ�飬ȡ�����ġ�  */
            if (noMessageRecievedOnLastCheck >= 4)
            {
            	noMessageRecievedOnLastCheck = 0;
            	logger.info("No message recieved from IB in last 4 checks");
                messageService.sendCancelSubscriptionMessage();
            }

            /* ������ǵ�һ�Σ��������һ�μ��*/
            else
            {
               noMessageRecievedOnLastCheck += 1;
            }
         }

         messageService.sendStatusRequestMessage();
         messageService.setMessageReceived(false);
      }
   }

   
   
   
   public MessageService getMessageService() {
	   return messageService;
   }

   public void setMessageService(MessageService messageService) {
	   this.messageService = messageService;
   }

   public TimerTask getTask()
   {
      return task;
   }

   public void setTask(TimerTask task)
   {
      this.task = task;
   }

   public Timer getTimer()
   {
      return timer;
   }

   public void setTimer(Timer timer)
   {
      this.timer = timer;
   }

   public boolean isRunning()
   {
      return running;
   }

   public void setRunning(boolean running)
   {
      this.running = running;
   }
}
