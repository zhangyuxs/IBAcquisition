

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
 * @Description  TODO  采集接口的工具类 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年5月29日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年5月29日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
public class Utils
{
	
	
	public static final String LOCALAIRPORTIATACODE = "NNG";
	
	/**
	 * 将Date类型转换为XMLGregorianCalendar类型
	 * @param date 需要转换的Date类型
	 * @return 转换的XMLGregorianCalendar
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
	 * 将XMLGregorianCalendar类型转换成Date类型
	 * @param cal 需要转换的XMLGregorianCalendar变量
	 * @return 转换的Date
	 * @throws Exception
	 */
	public static Date convertToDate(XMLGregorianCalendar cal) throws Exception{
         GregorianCalendar ca = cal.toGregorianCalendar();
         return ca.getTime();
     }

	/**
	 * 获取成员变量的Set方法的字符串
	 * @param fieldname 字段名
	 * @returnSet方法的字符串 
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
    * @param annotationField  需要获取的注解字段名
    * @param annotation       需要获取的注解
    * @return                 需要获取的注解字段值  
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
