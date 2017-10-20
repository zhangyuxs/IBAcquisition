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
 * @Description  TODO ��Ϣ�������Ļ���
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��5��29��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��5��29��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */


public abstract class MessageGenerator implements IMessageGenerator {
	
	/**
	 *   ��ȡ��Ϣ�̶��������ļ�
	 */
    private static ResourceBundle PROPS = ResourceBundle.getBundle("resource.message");
    
    /**
     *  �ж��Ƿ��ǰ���������ַ���
     */
    private static final String COM_ULTRA_AS_SCHEMA = "com.ultra_as.schema";
    
    
    /**
     *   ������Ϣ�������ļ�
     */
    protected  ResourceBundle SubscriptionPROPS;
    
    /**
     *  ��������
     */
    private static final String ENCODING = "UTF-8";
    
    /**
     *  ע���ֶα����ʶ
     */
    private static final String ANNOTATION_FIELD_REQUIRED = "required";
    
    private static final String ENUM_VALUE_METHOD = "fromValue";
    
    
    /**
     *  ��Ϣʵ����
     */
    protected Envelope envelope = null;
    
    /**
     *  ���󹤳�
     */
    @Resource
    protected  ObjectFactory objectFactory;
    
    /**
     * ���Ķ���
     */
    protected Object subscriptionRequest;

	
	public MessageGenerator() {
		super();
		/*��ʼ��ʵ��*/
	    envelope = new Envelope();
		envelope.setHeader(new Header());
		envelope.setBody(new Body());
		objectFactory = new ObjectFactory();
		subscriptionRequest = getSubscriptionRequest();
	}

	/**
	 * 
	 * @return ��������XML�ַ����ķ���
	 * @throws JAXBException
	 * @throws DatatypeConfigurationException
	 */
	protected String generateXMLMessage(Object bodyValue,int SequenceNumber) throws Exception{

		String bodyValueName = bodyValue.getClass().getSimpleName();
		envelope.getBody().setAny(bodyValue);
		
		/*������Ϣͷ����Ϣ*/
		envelope.getHeader().setDestinationSystemID(PROPS.getString("destinationSystemId"));
		envelope.getHeader().setMessageOriginatorID(PROPS.getString("sourceSystemId"));
		envelope.getHeader().setSourceSystemID(PROPS.getString("sourceSystemId"));
		envelope.getHeader().setMessageType(bodyValueName);
		envelope.getHeader().setMessageSequenceNumber(SequenceNumber);
		envelope.getHeader().setMessageSentDateTime(Utils.convertToXMLGregorianCalendar(new Date()));
		envelope.getHeader().setOriginatorDateTime(Utils.convertToXMLGregorianCalendar(new Date()));

		/*JAXB������ת��ΪXML*/
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
	 * ��PROPS�ļ���ȡ�������
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
	    	/*�Ӷ����ļ���ȡ�ֶ�����*/
			propsStr =	SubscriptionPROPS.getString(field.getName());
		} catch (Exception e) {
			/*����˵��û�и��ֶλ���û�и��ļ����ֶ�����Ϊnull*/
		}
		if (propsStr != null && propsStr !=""){
			if (List.class == field.getType()){
				/*  List���͵Ĵ����� */
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
				/* �������͵Ĵ�����	 */
				Date  date = DateTimeUtil.strToDate(propsStr);
				result = Utils.convertToXMLGregorianCalendar(date);
			}else if (String.class == clazz){
				/*  �ַ����͵Ĵ����� */
				result = propsStr;
			}else if (Enum.class == clazz.getSuperclass()){
				/* ö�����͵ô����� */
				Method method = clazz.getDeclaredMethod(ENUM_VALUE_METHOD, String.class);
				result  = method.invoke(clazz, propsStr);
			}
		}
		return result;
	}
	
	/**
	 * ���ö��ĵĲ���
	 * @param request
	 * @throws IllegalAccessException 
	 * @throws Exception 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private boolean setSubscriptionParameter(Object request,String fatherName) throws Exception{
		boolean isAssignment = false; 
		for(Field field:request.getClass().getDeclaredFields()){
			Class<?> clazz = null;
			/*��ȡ�ֶε���ʵ����*/
			if (field.getType() == JAXBElement.class || field.getType() == List.class){
			    ParameterizedType type = (ParameterizedType)field.getGenericType();
			    clazz = (Class<?>) type.getActualTypeArguments()[0];
			}else{
				clazz = field.getType();
				
			}
			
			if (clazz.getName().indexOf(COM_ULTRA_AS_SCHEMA) != -1 &&
					clazz.getSuperclass().equals(Object.class) 
					){
				/*   ����ֶ���ULTRA������ö�����ݹ���ñ���*/
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
						/* �����JAXBElement������Ҫ�ڶ��󹤳��в�����صĴ�������*/
						String methodName = "create"+fatherName+request.getClass().getSimpleName()+field.getName().substring(0, 1).toUpperCase()+ field.getName().substring(1);
						Method method = objectFactory.getClass().getDeclaredMethod(methodName, clazz);
						obj = method.invoke(objectFactory, obj);
					}
					if (List.class != field.getType()) {
						/* �������List���ͣ�����field��set�������и�ֵ*/
						ObjectMethodUtil.setFieldObject(request, field.getName(),obj, field.getType());
					}else{
						/*  �����List���ͣ���ȡ��Ӧ��ListȻ�����addAll���и�ֵ*/
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
	 * @return ��������
	 */
	protected abstract Object getStatusRequest(XMLGregorianCalendar calendar); 
	
	
	/**
	 * 
	 * @return ȡ�����Ķ���
	 */
	protected abstract Object getCancelSubscription(XMLGregorianCalendar calendar) ;
	

	/**
	 * 
	 * @return �����������
	 */
	protected abstract Object getSubscriptionRequest();
	
}
