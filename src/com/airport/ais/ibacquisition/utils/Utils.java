

package com.airport.ais.ibacquisition.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.airport.ais.ibacquisition.exception.IBException;

/**
 * 
 * 
 * FileName      Utils.java
 * @Description  TODO  �ɼ��ӿڵĹ����� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��5��29��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��5��29��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */
public class Utils
{
	
	
	public static final String LOCALAIRPORTIATACODE = "NNG";
	
	/**
	 * ��Date����ת��ΪXMLGregorianCalendar����
	 * @param date ��Ҫת����Date����
	 * @return ת����XMLGregorianCalendar
	 * @throws DatatypeConfigurationException 
	 */
	public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) throws DatatypeConfigurationException {

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        XMLGregorianCalendar gc = null;
        gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        return gc;
    }
 
	/**
	 * ��XMLGregorianCalendar����ת����Date����
	 * @param cal ��Ҫת����XMLGregorianCalendar����
	 * @return ת����Date
	 * @throws Exception
	 */
	public static Date convertToDate(XMLGregorianCalendar cal) throws Exception{
         GregorianCalendar ca = cal.toGregorianCalendar();
         return ca.getTime();
     }

	/**
	 * ��ȡ��Ա������Set�������ַ���
	 * @param fieldname �ֶ���
	 * @returnSet�������ַ��� 
	 */
	public static String getSetMethodName(String fieldname){
		return "set" + fieldname.substring(0, 1).toUpperCase()
				+ fieldname.substring(1);
	}
	
   /**
    * Extracts the value for the supplied element from the supplied message
    * message. A production implementation would be expected to use a more
    * robust mechanism than simple string matching. (by using DOM or JAXB APIs
    * for example)
    * 
    * @return
    */
   public static String extractElementValueFromMessage(String element, String message) throws IBException
   {
      int startPos = message.indexOf("<" + element + ">") + element.length() + 2;
      int endPos = message.indexOf("</" + element + ">");

      String messageType = null;

      if (startPos != -1 && endPos != -1)
      {
         messageType = message.substring(startPos, endPos);
      }
      else
      {
         throw new IBException("Could not extract value for " + element + " from incoming message!");
      }

      return messageType;
   }

   /**
    * 
    * @param annotationField  ��Ҫ��ȡ��ע���ֶ���
    * @param annotation       ��Ҫ��ȡ��ע��
    * @return                 ��Ҫ��ȡ��ע���ֶ�ֵ  
    * @throws SecurityException 
    * @throws NoSuchMethodException 
    */
   public static Object getAnnotationFieldValue(String annotationField,Annotation annotation,Class<?> clazz) {
    try {
    	annotation.getClass().getDeclaredMethods();
    	if (clazz == null){
    		Method method = annotation.getClass().getMethod(annotationField);
    		return method.invoke(annotation);
    	}else{
    		Method method = annotation.getClass().getMethod(annotationField,clazz);
    		return method.invoke(annotation,clazz);
    	}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		return null;
		
	}	   
	   
   }

   public static void sleepThread(int seconds)
   {
      try
      {
         Thread.sleep(seconds * 1000);
      }
      catch (InterruptedException ignore)
      {
      }
   }
}
