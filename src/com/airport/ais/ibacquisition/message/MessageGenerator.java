package com.airport.ais.ibacquisition.message;

import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.XMLGregorianCalendar;

import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.utils.DateTimeUtil;
import com.airport.ais.utils.ObjectMethodUtil;
import com.ultra_as.schema.Body;
import com.ultra_as.schema.Envelope;
import com.ultra_as.schema.Header;
import com.ultra_as.schema.ObjectFactory;

/**
 * 
 * 
 * FileName      MessageGenerator.java
 * @Description  TODO 消息产生器的基类
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年5月29日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年5月29日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */


public abstract class MessageGenerator implements IMessageGenerator {
	
	/**
	 *   获取消息固定的特性文件
	 */
    private static ResourceBundle PROPS = ResourceBundle.getBundle("resource.message");
    
    /**
     *  判断是否是傲创对象的字符串
     */
    private static final String COM_ULTRA_AS_SCHEMA = "com.ultra_as.schema";
    
    
    /**
     *   订阅消息的特性文件
     */
    protected  ResourceBundle SubscriptionPROPS;
    
    /**
     *  编码类型
     */
    private static final String ENCODING = "UTF-8";
    
    /**
     *  注解字段必须标识
     */
    private static final String ANNOTATION_FIELD_REQUIRED = "required";
    
    private static final String ENUM_VALUE_METHOD = "fromValue";
    
    
    /**
     *  消息实体类
     */
    protected Envelope envelope = null;
    
    /**
     *  对象工厂
     */
    @Resource
    protected  ObjectFactory objectFactory;
    
    /**
     * 订阅对象
     */
    protected Object subscriptionRequest;

	
	public MessageGenerator() {
		super();
		/*初始化实体*/
	    envelope = new Envelope();
		envelope.setHeader(new Header());
		envelope.setBody(new Body());
		objectFactory = new ObjectFactory();
		subscriptionRequest = getSubscriptionRequest();
	}

	/**
	 * 
	 * @return 将类生成XML字符串的方法
	 * @throws JAXBException
	 * @throws DatatypeConfigurationException
	 */
	protected String generateXMLMessage(Object bodyValue,int SequenceNumber) throws Exception{

		String bodyValueName = bodyValue.getClass().getSimpleName();
		envelope.getBody().setAny(bodyValue);
		
		/*设置消息头的信息*/
		envelope.getHeader().setDestinationSystemID(PROPS.getString("destinationSystemId"));
		envelope.getHeader().setMessageOriginatorID(PROPS.getString("sourceSystemId"));
		envelope.getHeader().setSourceSystemID(PROPS.getString("sourceSystemId"));
		envelope.getHeader().setMessageType(bodyValueName);
		envelope.getHeader().setMessageSequenceNumber(SequenceNumber);
		envelope.getHeader().setMessageSentDateTime(Utils.convertToXMLGregorianCalendar(new Date()));
		envelope.getHeader().setOriginatorDateTime(Utils.convertToXMLGregorianCalendar(new Date()));

		/*JAXB将对象转换为XML*/
		JAXBContext jaxbContext = JAXBContext.newInstance(bodyValue.getClass());
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, ENCODING);
		marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,"schema.ultra-as.com "+bodyValueName+".xsd");
		StringWriter writer = new StringWriter();
		marshaller.marshal(envelope,writer);

		return writer.toString();
	}
	

	/**
	 * 从PROPS文件获取相关属性
	 * @param field
	 * @return
	 * @throws SecurityException 
	 * @throws Exception 
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private Object getSubscriptionFromPROPS(Field field,Class<?> clazz) throws Exception{
		String propsStr = null; 
		Object result = null;
	    try {
	    	/*从定义文件获取字段属性*/
			propsStr =	SubscriptionPROPS.getString(field.getName());
		} catch (Exception e) {
			/*出错说明没有该字段或者没有该文件，字段属性为null*/
		}
		if (propsStr != null && propsStr !=""){
			if (List.class == field.getType()){
				/*  List类型的处理方法 */
				Object[]     objs = propsStr.split(",");
				List list = new ArrayList();
				if (Enum.class == clazz.getSuperclass()){
					for (Object obj:objs){
						Method method = clazz.getDeclaredMethod(ENUM_VALUE_METHOD, String.class);
						list.add(method.invoke(clazz, obj));
					}
				}else{
					for(Object obj:objs){
						list.add(obj);
					}
				}
				
				result = list;
			}else if (XMLGregorianCalendar.class == clazz){
				/* 日期类型的处理方法	 */
				Date  date = DateTimeUtil.strToDate(propsStr);
				result = Utils.convertToXMLGregorianCalendar(date);
			}else if (String.class == clazz){
				/*  字符类型的处理方法 */
				result = propsStr;
			}else if (Enum.class == clazz.getSuperclass()){
				/* 枚举类型得处理方法 */
				Method method = clazz.getDeclaredMethod(ENUM_VALUE_METHOD, String.class);
				result  = method.invoke(clazz, propsStr);
			}
		}
		return result;
	}
	
	/**
	 * 设置订阅的参数
	 * @param request
	 * @throws IllegalAccessException 
	 * @throws Exception 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private boolean setSubscriptionParameter(Object request,String fatherName) throws Exception{
		boolean isAssignment = false; 
		for(Field field:request.getClass().getDeclaredFields()){
			Class<?> clazz = null;
			/*获取字段得真实类型*/
			if (field.getType() == JAXBElement.class || field.getType() == List.class){
			    ParameterizedType type = (ParameterizedType)field.getGenericType();
			    clazz = (Class<?>) type.getActualTypeArguments()[0];
			}else{
				clazz = field.getType();
				
			}
			
			if (clazz.getName().indexOf(COM_ULTRA_AS_SCHEMA) != -1 &&
					clazz.getSuperclass().equals(Object.class) 
					){
				/*   如果字段是ULTRA所定义得对象，则递归调用本身*/
				boolean isRequired = false;
				for(Annotation annotation:field.getDeclaredAnnotations()){
					if (Utils.getAnnotationFieldValue(ANNOTATION_FIELD_REQUIRED, annotation, null).equals(true)){
						isRequired = true;
						break;
					}
				}
				Object parameter = field.getType().newInstance();
				if (setSubscriptionParameter(parameter,fatherName+request.getClass().getSimpleName())|| isRequired) {
					ObjectMethodUtil.setFieldObject(request, field.getName(),parameter,field.getType());
				}
			}else{
				
				
				Object obj = getSubscriptionFromPROPS(field, clazz);
				if (obj !=  null){
					isAssignment = true;
					if (field.getType().equals(JAXBElement.class)){
						/* 如果是JAXBElement，则需要在对象工厂中查找相关的创建方法*/
						String methodName = "create"+fatherName+request.getClass().getSimpleName()+field.getName().substring(0, 1).toUpperCase()+ field.getName().substring(1);
						Method method = objectFactory.getClass().getDeclaredMethod(methodName, clazz);
						obj = method.invoke(objectFactory, obj);
					}
					if (List.class != field.getType()) {
						/* 如果不是List类型，调用field的set方法进行赋值*/
						ObjectMethodUtil.setFieldObject(request, field.getName(),obj, field.getType());
					}else{
						/*  如果是List类型，获取对应的List然后调用addAll进行赋值*/
						 ((List) ObjectMethodUtil.getFieldObject(request, field.getName())).addAll((ArrayList) obj);
						
					}
				}
			}
		}
		return isAssignment;
	}
	
	

	@Override
	public String generateCancelSubscriptionMessage(Date time) throws Exception {
		XMLGregorianCalendar calendar = null;
	    if (time !=  null ){
			calendar = Utils.convertToXMLGregorianCalendar(time);
	    }
		return generateXMLMessage(getCancelSubscription(calendar),0);
	}

	@Override
	public String generateStatusRequestMessage(Date time) throws Exception {
		XMLGregorianCalendar calendar = null;
	    if (time !=  null ){
			calendar = Utils.convertToXMLGregorianCalendar(time);
	    }
		return generateXMLMessage(getStatusRequest(calendar),0);
	}
	
	


	@Override
	public String generateSubscriptionRequestMessage(Date time) throws Exception {
		
		setSubscriptionParameter(subscriptionRequest,"");
		return generateXMLMessage(subscriptionRequest, 0);
	}

	/**
	 * @return 心跳对象
	 */
	protected abstract Object getStatusRequest(XMLGregorianCalendar calendar); 
	
	
	/**
	 * 
	 * @return 取消订阅对象
	 */
	protected abstract Object getCancelSubscription(XMLGregorianCalendar calendar) ;
	

	/**
	 * 
	 * @return 订阅请求对象
	 */
	protected abstract Object getSubscriptionRequest();
	
}
