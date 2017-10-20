package com.airport.ais.ibacquisition.jms;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.ResourceBundle;
import javax.jms.BytesMessage;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.log4j.Logger;
import com.airport.ais.ibacquisition.exception.IBException;
import com.airport.ais.ibacquisition.view.MessageInView;
import com.airport.ais.ibacquisition.view.MessageOutView;



/**
 * 
 * FileName      ActiveMQConnector.java
 * @Description  TODO  连接IB的ActiveMq类
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年5月28日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年5月28日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

public class ActiveMQConnector implements ExceptionListener 
{
	
	   /* 获取连接属性 */
	   private ResourceBundle PROPS =null;

	   private Logger logger = Logger.getLogger(this.getClass().getName());
	   
	   

	   /* Custom Sonic implementation of javax.jms.QueueConnectionFactory */
	   private QueueConnectionFactory queueConnectionFactory = null;

	   /* 标准 JMS API 连接类 */
	   private QueueConnection connection = null;
	   private QueueSession session = null;
	   private QueueSender queueSender = null;
	   private QueueReceiver queueReceiver = null;
	   private Context jndiContext = null;
	   private Queue queueSenderQ = null;
	   private Queue queueReceiverQ = null;

	   /* 标准的连接属性*/
	   private String connectionFactoryName = null;
	   private String providerURL = null;
	   private String connectionFactoryLookup = null;
	   private String receiveDestination = null;
	   private String sendDestination = null;

	   /* 连接属性 */
	   private String sslCACertificatesDir = null;
//	   private String mfContextDomain = null;
	   private String domainName = null;
	   private String username = null;
	   private String password = null;
	   private int timeToLive;

	   /** 连接标志 */
	   private boolean connected = false;

	   /* Sonic proprietary headers */
//	   private static final String JMS_SONIC_MQ_PRESERVE_UNDELIVERED = "JMS_SonicMQ_preserveUndelivered";
//	   private static final String JMS_SONIC_MQ_NOTIFY_UNDELIVERED = "JMS_SonicMQ_notifyUndelivered";

	   /* UltraIB 专用的消息头 */
	   private static final String HEADER_IB_EXPIRY_PRIORITY_NAME = "IBExpiryPriority";
	   private static final String HEADER_IB_EXPIRY_PRIORITY_VALUE = "WARN";

	   /*消息发送视图*/
	   private MessageOutView messageOutView;
	   /*小心接收视图*/
	   private MessageInView  messageInView;
	   
	   
	   
	   
	   /**
	    * 默认的构造器，初始化连接属性
	    * @param connectProps     订阅文件名称
	    * @throws IBException
	    */
	   public ActiveMQConnector(String connectProps) throws IBException
	   {
		  PROPS = ResourceBundle.getBundle(connectProps);		   
	      init();
	   }

	   /**
	    * 根据连接属性文件初始化所有的属性
	    */
	   public void init() throws IBException
	   {
	      try
	      {
	         setUsername(PROPS.getString("username"));
	         setPassword(PROPS.getString("password"));
	         setProviderURL(PROPS.getString("provider.url"));
	         setReceiveDestination(PROPS.getString("recieve.queue"));
	         setSendDestination(PROPS.getString("send.queue"));
	         //setDomainName(PROPS.getString("domain.name"));
	         setTimeToLive(Integer.parseInt(PROPS.getString("jms.time.to.live")));
	         setConnectionFactoryName(PROPS.getString("connection.factory.name"));
	         setConnectionFactoryLookup(PROPS.getString("connection.factory.lookup"));
	         //setMfContextDomain(PROPS.getString("sonic.mf.context.domain"));
	         //setSslCACertificatesDir(PROPS.getString("jms.ssl.ca.certs.dir"));

	         logger.debug("Username                  : " + getUsername());
	         logger.debug("Password                  : ************");
	         logger.debug("Provider URL              : " + getProviderURL());
	         logger.debug("Receive Queue             : " + getReceiveDestination());
	         logger.debug("Send Queue                : " + getSendDestination());
	        // logger.debug("Domain Name               : " + getDomainName());
	         logger.debug("JMS Time-To-Live          : " + getTimeToLive());
	         logger.debug("Connection Factory Name   : " + getConnectionFactoryName());
	         logger.debug("Connection Factory Lookup : " + getConnectionFactoryLookup());
	        // logger.debug("SSL CA Certs Directory    : " + getSslCACertificatesDir());
	        // logger.debug("MF Context Domain         : " + getMfContextDomain());
	      }
	      catch (Exception e)
	      {
	         throw new IBException(
	               "未能正确加载连接属性。请检查connection.properties文件包含所有需要的属性值",
	               e);
	      }
	   }

	   /**
	    * 尝试建立与接口的连接. 如果连接不成功抛出异常
	    * 
	    */
	   public synchronized void connect() throws IBException
	   {
	      logger.info("连接至Actvie JMS 协议");

	         logger.debug("尝试连接至 IB");
	         
	         try
	         {
				
				setupJNDIContext();
				
	         /* 设置发送队列 */
	             
			 setQueueSenderQ((Queue) getJndiContext().lookup(getSendDestination()));
	             
	         /* 设置接收队列 */
	         setQueueReceiverQ((Queue) getJndiContext().lookup(getReceiveDestination()));
	         /* 设置队列连接工厂 */
	         setQueueConnectionFactory((QueueConnectionFactory) getJndiContext().lookup(
	               getConnectionFactoryLookup()));
	         //getQueueConnectionFactory().setDefaultUser(getUsername());
	         //getQueueConnectionFactory().setDefaultPassword(getPassword());
	         
	         /* 设置连接 */
	         setConnection(getQueueConnectionFactory().createQueueConnection(getUsername(), getPassword()));
	         getConnection().setExceptionListener(this);
	         getConnection().start();
	         

	         /* 设置队列的Session */
	         setSession(getConnection().createQueueSession(false, Session.AUTO_ACKNOWLEDGE));
	         /* 设置队列接收者 */
	         setQueueReceiver(getSession().createReceiver(getQueueReceiverQ()));

	         /* 设置队列发送者 */
	         setQueueSender(getSession().createSender(getQueueSenderQ()));
	         getQueueSender().setTimeToLive(getTimeToLive());
	         
	         setConnected(true);

	         purgeQueue();
	         logger.info("连接 JMS 接口完成");
	      }
	      catch (Exception e)
	      {
	         throw new IBException(e);
	      }
	   }

	   /**
	    * 设置初始化 JndiContext
	    * 
	    * @throws IBException
	    * @throws NamingException
	    */
	   protected void setupJNDIContext() throws NamingException
	   {
	      Hashtable<String, String> jndiEnv = new Hashtable<String, String>();

	      /* Set name parameters for intial context */
	      jndiEnv.put(Context.INITIAL_CONTEXT_FACTORY, getConnectionFactoryName());
	      jndiEnv.put(Context.PROVIDER_URL, getProviderURL());
	      //jndiEnv.put(Context.SECURITY_PRINCIPAL, getUsername());
	      //jndiEnv.put(Context.SECURITY_CREDENTIALS, getPassword());
	      //jndiEnv.put(getMfContextDomain(), getDomainName());
	     

	      /*
	       * Authenticate SPI connection and set the certificates directory property
	       */
	      //System.setProperty("SonicMQ.LOGIN_SPI", "com.sonicsw.pso.pass.client.loginspi.Login");
	      //System.setProperty("SSL_CA_CERTIFICATES_DIR", getSslCACertificatesDir());
	      
	      setJndiContext(new InitialContext(jndiEnv));
	   }

	   /**
	    * 设置连接标志到false。随后connectio尝试重新连接连接
	    * 
	    * 
	    * @see javax.jms.ExceptionListener#onException(javax.jms.JMSException)
	    */
	   public void onException(JMSException jmsException)
	   {
	      setConnected(false);
	   }

	   /**
	    * 从接收队列接收消息返回文本形式的Message
	    * @param wait 是否等待
	    * @return
	    * @throws IBException
	    * @throws IOException 
	    */
	   public String receiveMessage(boolean wait) throws IBException
	   {
	      /* 检查连接是否存活 */
	      if (!isConnected())
	      {
	         connect();
	      }

	      String message = null;

	      try
	      {
	         Message msg = null;

	         msg = getQueueReceiver().receiveNoWait();
	         

	         if (msg != null)
	         {	
	        	 if(msg instanceof TextMessage)
	        	 {
	               message = ((TextMessage) msg).getText();
	              
	               

	               logger.debug("message received:");
	               logger.debug(message);
	        	 }
	        	 else if (msg instanceof BytesMessage)
	        	 {
	        		 
	        		  byte data[] = new byte[(int) ((BytesMessage) msg).getBodyLength()];
	        		 ((BytesMessage) msg).readBytes(data);
	        		String str;
					try {
						str = new String(data , "UTF-8");
	        		message = str;
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	 }
	        	 messageInView.appendMessage(message);
	         }
	      }
	      catch (JMSException e)
	      {
	         throw new IBException(e);
	      }

	      return message;
	   }

	   
	   /**
	    * 发送消息
	    * @param message
	    * @throws IBException
	    */
	   public void sendMessage(String message) throws IBException
	   {
	      /* 检查连接是否存活 */
	      if (!isConnected())
	      {
	         connect();
	      }

	      logger.debug("Sending message: ");
	      logger.debug(message);
	      try
	      {
	         TextMessage textMessage = getSession().createTextMessage();
	         textMessage.setText(message);
	         messageOutView.appendMessage(message);
	         /* Set required proprietary header values */
//	         textMessage.setBooleanProperty(JMS_SONIC_MQ_PRESERVE_UNDELIVERED, true);
//	         textMessage.setBooleanProperty(JMS_SONIC_MQ_NOTIFY_UNDELIVERED, true);
	         textMessage.setStringProperty(HEADER_IB_EXPIRY_PRIORITY_NAME, HEADER_IB_EXPIRY_PRIORITY_VALUE);

	         getQueueSender().send(textMessage);

	         if (logger.isDebugEnabled())
	         {
	            logger.debug("Message sent to: " + getQueueSender().getDestination().toString());
	         }
	      }
	      catch (JMSException e)
	      {
	         throw new IBException(e);
	      }
	   }

	   /**
	    * 关闭连接
	    * @see com.ultra_as.gxi.protocol.Protocol#close()
	    */
	   public void close() throws IBException
	   {
	      logger.debug("Closing JMS QueueConnection");

	      try
	      {
	         setConnected(false);

	         if (getConnection() != null)
	         {
	            getConnection().close();
	            setConnection(null);
	         }

	         setJndiContext(null);
	         setQueueConnectionFactory(null);
	         setQueueReceiver(null);
	         setQueueSender(null);
	      }
	      catch (JMSException e)
	      {
	         throw new IBException(e);
	      }
	   }

	   /**
	    * 清空接收队列中的消息
	    * 
	    * @throws IBException
	    */
	   public void purgeQueue() throws IBException
	   {
	      logger.debug("清空接收队列中的消息，请");

	      try
	      {
	         boolean purgeCompleted = false;

	         /* Continue to read off queue until it is empty */
	         while (purgeCompleted == false)
	         {
	            String receivedMessage = receiveMessage(false);

	            /* If no message received, queue is now empty */
	            if (receivedMessage == null)
	            {
	               purgeCompleted = true;
	            }
	         }
	      }
	      catch (Exception e)
	      {
	         // Handle to the queue could not be generated - log the error
	         logger.debug("清空错误: 不能连接至该队列:\r\n" + e);

	         // Raise a queue exception error
	         throw new IBException("");
	      }

	      logger.debug("完成清空");
	   }

	   /**
	    * 
	    */
	   public boolean isConnected()
	   {
	      return connected;
	   }

	   
	   
	   
	   
	   /**
	    * @return the messageOutView
	    */
	   public MessageOutView getMessageOutView() {
		   return messageOutView;
	   }

	   /**
	    * @param messageOutView the messageOutView to set
	    */
	   public void setMessageOutView(MessageOutView messageOutView) {
		   this.messageOutView = messageOutView;
	   }

	   /**
	    * @return the messageInView
	    */
	   public MessageInView getMessageInView() {
		   return messageInView;
	   }

	   /**
	    * @param messageInView the messageInView to set
	    */
	   public void setMessageInView(MessageInView messageInView) {
		   this.messageInView = messageInView;
	   }

	   protected QueueConnection getConnection()
	   {
	      return connection;
	   }

	   protected void setConnection(QueueConnection connection)
	   {
	      this.connection = connection;
	   }

	   protected QueueReceiver getQueueReceiver()
	   {
	      return queueReceiver;
	   }

	   protected void setQueueReceiver(QueueReceiver queueReceiver)
	   {
	      this.queueReceiver = queueReceiver;
	   }

	   protected QueueSender getQueueSender()
	   {
	      return queueSender;
	   }

	   protected void setQueueSender(QueueSender queueSender)
	   {
	      this.queueSender = queueSender;
	   }

	   protected QueueSession getSession()
	   {
	      return session;
	   }

	   protected void setSession(QueueSession session)
	   {
	      this.session = session;
	   }

	   protected QueueConnectionFactory getQueueConnectionFactory()
	   {
	      return queueConnectionFactory;
	   }

	   protected void setQueueConnectionFactory(QueueConnectionFactory queueConnectionFactory)
	   {
	      this.queueConnectionFactory = queueConnectionFactory;
	   }

	   protected Context getJndiContext()
	   {
	      return jndiContext;
	   }

	   protected void setJndiContext(Context jndiContext)
	   {
	      this.jndiContext = jndiContext;
	   }

	   protected String getPassword()
	   {
	      return password;
	   }

	   protected void setPassword(String password)
	   {
	      this.password = password;
	   }

	   protected String getUsername()
	   {
	      return username;
	   }

	   protected void setUsername(String username)
	   {
	      this.username = username;
	   }

	   protected Queue getQueueReceiverQ()
	   {
	      return queueReceiverQ;
	   }

	   protected void setQueueReceiverQ(Queue queueReceiverQ)
	   {
	      this.queueReceiverQ = queueReceiverQ;
	   }

	   protected Queue getQueueSenderQ()
	   {
	      return queueSenderQ;
	   }

	   protected void setQueueSenderQ(Queue queueSenderQ)
	   {
	      this.queueSenderQ = queueSenderQ;
	   }

	   protected String getConnectionFactoryLookup()
	   {
	      return connectionFactoryLookup;
	   }

	   protected void setConnectionFactoryLookup(String connectionFactoryLookup)
	   {
	      this.connectionFactoryLookup = connectionFactoryLookup;
	   }

	   protected String getConnectionFactoryName()
	   {
	      return connectionFactoryName;
	   }

	   protected void setConnectionFactoryName(String connectionFactoryName)
	   {
	      this.connectionFactoryName = connectionFactoryName;
	   }

	   protected String getDomainName()
	   {
	      return domainName;
	   }

	   protected void setDomainName(String domainName)
	   {
	      this.domainName = domainName;
	   }

//	   protected String getMfContextDomain()
//	   {
//	      return mfContextDomain;
//	   }
//
//	   protected void setMfContextDomain(String mfContextDomain)
//	   {
//	      this.mfContextDomain = mfContextDomain;
//	   }

	   protected String getProviderURL()
	   {
	      return providerURL;
	   }

	   protected void setProviderURL(String providerURL)
	   {
	      this.providerURL = providerURL;
	   }

	   protected String getReceiveDestination()
	   {
	      return receiveDestination;
	   }

	   protected void setReceiveDestination(String receiveDestination)
	   {
	      this.receiveDestination = receiveDestination;
	   }

	   protected String getSendDestination()
	   {
	      return sendDestination;
	   }

	   protected void setSendDestination(String sendDestination)
	   {
	      this.sendDestination = sendDestination;
	   }

	   protected String getSslCACertificatesDir()
	   {
	      return sslCACertificatesDir;
	   }

	   protected void setSslCACertificatesDir(String sslCACertificatesDir)
	   {
	      this.sslCACertificatesDir = sslCACertificatesDir;
	   }

	   public void setConnected(boolean connected)
	   {
	      this.connected = connected;
	   }

	   private int getTimeToLive()
	   {
	      return timeToLive;
	   }

	   private void setTimeToLive(int timeToLive)
	   {
	      this.timeToLive = timeToLive;
	   }
	   
	   
	   
}
