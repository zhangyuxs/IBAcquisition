

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
 * @Description  TODO 心跳查询器，用于查询订阅激活 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月2日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月2日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
public class StatusRequestTimer
{
   private Logger logger = Logger.getLogger(this.getClass().getName());
   /**
    * 配置文件
    */
   private ResourceBundle props = ResourceBundle.getBundle("resource.client");
   /**
    * 时间任务
    */
   private TimerTask task = null;
   /**
    * 定时器
    */
   private Timer timer = null;
   /**
    * 运行标识
    */
   private boolean running = false;
   /**
    * 时间间隔，秒单位
    */
   private int period = 0;
   /**
    * IB消息服务者
    */
   private MessageService messageService = null;

   /**
    * 如果上次从IMF没有收到任何消息，则发送心跳请求，如果下次依旧没有收到消息，则发送
    * 取消顶与订阅
    */
   private int noMessageRecievedOnLastCheck = 0;

   public StatusRequestTimer()
   {
	   this.period = Integer.parseInt(props.getString("status.request.timer.period"));
   }

   /**
    * 开始检查
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
          * 以period代表的秒为时间间隔进行心跳检查
          */
         getTimer().schedule(getTask(), 0, period * 1000);
         setRunning(true);
      }
   }
   /**
    * 结束检查
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
    * @Description  TODO 心跳检查定时器 
    * @author       ZhangYu    Company:    LZAirport
    * @version      V0.9a CreateDate: 2017年7月2日
    * @ModificationHistory
    * Date         Author     Version   Description
    * <p>---------------------------------------------
    * <p>2017年7月2日      ZhangYu    1.0        1.0
    * <p>Why & What is modified: <修改原因描述>
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
           * 如果接口已启动，则没有收到来自IMF的消息。
           */
         if (messageService.isInterfaceUp() && !messageService.isMessageReceived())
         {
            /* 这是第四个失败的检查，取消订阅。  */
            if (noMessageRecievedOnLastCheck >= 4)
            {
            	noMessageRecievedOnLastCheck = 0;
            	logger.info("No message recieved from IB in last 4 checks");
                messageService.sendCancelSubscriptionMessage();
            }

            /* 如果这是第一次，则进行下一次检查*/
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
