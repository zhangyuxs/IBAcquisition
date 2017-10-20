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
 * @Description  TODO  ����IB��ActiveMq��
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��5��28��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��5��28��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

public class ActiveMQConnector implements ExceptionListener 
{
	
	   /* ��ȡ�������� */
	   private ResourceBundle PROPS =null;

	   private Logger logger = Logger.getLogger(this.getClass().getName());
	   
	   

	   /* Custom Sonic implementation of javax.jms.QueueConnectionFactory */
	   private QueueConnectionFactory queueConnectionFactory = null;

	   /* ��׼ JMS API ������ */
	   private QueueConnection connection = null;
	   private QueueSession session = null;
	   private QueueSender queueSender = null;
	   private QueueReceiver queueReceiver = null;
	   private Context jndiContext = null;
	   private Queue queueSenderQ = null;
	   private Queue queueReceiverQ = null;

	   /* ��׼����������*/
	   private String connectionFactoryName = null;
	   private String providerURL = null;
	   private String connectionFactoryLookup = null;
	   private String receiveDestination = null;
	   private String sendDestination = null;

	   /* �������� */
	   private String sslCACertificatesDir = null;
//	   private String mfContextDomain = null;
	   private String domainName = null;
	   private String username = null;
	   private String password = null;
	   private int timeToLive;

	   /** ���ӱ�־ */
	   private boolean connected = false;

	   /* Sonic proprietary headers */
//	   private static final String JMS_SONIC_MQ_PRESERVE_UNDELIVERED = "JMS_SonicMQ_preserveUndelivered";
//	   private static final String JMS_SONIC_MQ_NOTIFY_UNDELIVERED = "JMS_SonicMQ_notifyUndelivered";

	   /* UltraIB ר�õ���Ϣͷ */
	   private static final String HEADER_IB_EXPIRY_PRIORITY_NAME = "IBExpiryPriority";
	   private static final String HEADER_IB_EXPIRY_PRIORITY_VALUE = "WARN";

	   /*��Ϣ������ͼ*/
	   private MessageOutView messageOutView;
	   /*С�Ľ�����ͼ*/
	   private MessageInView  messageInView;
	   
	   
	   
	   
	   /**
	    * Ĭ�ϵĹ���������ʼ����������
	    * @param connectProps     �����ļ�����
	    * @throws IBException
	    */
	   public ActiveMQConnector(String connectProps) throws IBException
	   {
		  PROPS = ResourceBundle.getBundle(connectProps);		   
	      init();
	   }

	   /**
	    * �������������ļ���ʼ�����е�����
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
	               "δ����ȷ�����������ԡ�����connection.properties�ļ�����������Ҫ������ֵ",
	               e);
	      }
	   }

	   /**
	    * ���Խ�����ӿڵ�����. ������Ӳ��ɹ��׳��쳣
	    * 
	    */
	   public synchronized void connect() throws IBException
	   {
	      logger.info("������Actvie JMS Э��");

	         logger.debug("���������� IB");
	         
	         try
	         {
				
				setupJNDIContext();
				
	         /* ���÷��Ͷ��� */
	             
			 setQueueSenderQ((Queue) getJndiContext().lookup(getSendDestination()));
	             
	         /* ���ý��ն��� */
	         setQueueReceiverQ((Queue) getJndiContext().lookup(getReceiveDestination()));
	         /* ���ö������ӹ��� */
	         setQueueConnectionFactory((QueueConnectionFactory) getJndiContext().lookup(
	               getConnectionFactoryLookup()));
	         //getQueueConnectionFactory().setDefaultUser(getUsername());
	         //getQueueConnectionFactory().setDefaultPassword(getPassword());
	         
	         /* �������� */
	         setConnection(getQueueConnectionFactory().createQueueConnection(getUsername(), getPassword()));
	         getConnection().setExceptionListener(this);
	         getConnection().start();
	         

	         /* ���ö��е�Session */
	         setSession(getConnection().createQueueSession(false, Session.AUTO_ACKNOWLEDGE));
	         /* ���ö��н����� */
	         setQueueReceiver(getSession().createReceiver(getQueueReceiverQ()));

	         /* ���ö��з����� */
	         setQueueSender(getSession().createSender(getQueueSenderQ()));
	         getQueueSender().setTimeToLive(getTimeToLive());
	         
	         setConnected(true);

	         purgeQueue();
	         logger.info("���� JMS �ӿ����");
	      }
	      catch (Exception e)
	      {
	         throw new IBException(e);
	      }
	   }

	   /**
	    * ���ó�ʼ�� JndiContext
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
	    * �������ӱ�־��false�����connectio����������������
	    * 
	    * 
	    * @see javax.jms.ExceptionListener#onException(javax.jms.JMSException)
	    */
	   public void onException(JMSException jmsException)
	   {
	      setConnected(false);
	   }

	   /**
	    * �ӽ��ն��н�����Ϣ�����ı���ʽ��Message
	    * @param wait �Ƿ�ȴ�
	    * @return
	    * @throws IBException
	    * @throws IOException 
	    */
	   public String receiveMessage(boolean wait) throws IBException
	   {
	      /* ��������Ƿ��� */
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
	    * ������Ϣ
	    * @param message
	    * @throws IBException
	    */
	   public void sendMessage(String message) throws IBException
	   {
	      /* ��������Ƿ��� */
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
	    * �ر�����
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
	    * ��ս��ն����е���Ϣ
	    * 
	    * @throws IBException
	    */
	   public void purgeQueue() throws IBException
	   {
	      logger.debug("��ս��ն����е���Ϣ����");

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
	         logger.debug("��մ���: �����������ö���:\r\n" + e);

	         // Raise a queue exception error
	         throw new IBException("");
	      }

	      logger.debug("������");
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
