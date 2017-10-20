package com.airport.ais.ibacquisition.handler;

import org.springframework.beans.BeansException;

import ibacquisition.Activator;

/**
 * 
 * 
 * FileName      HandlerFactory.java
 * @Description  TODO �����ߵĹ�����
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��6��30��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��6��30��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

public class HandlerFactory {
	/**
	 * ����ĺ�׺��
	 */
	private static final String sufix = "MessageHandler";
	
	/**
	 * ��Spring�����л�ȡ��Ӧ�Ĵ���Bean;
	 * @param MessageType
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static IMessageHandler<Object> getHandler(String MessageType){
		Object handler =  null;
		try {
			handler = Activator.getDefault().getCtx().getBean(MessageType+sufix);
		} catch (BeansException e) {
			return null;
		}
		return (IMessageHandler<Object>) handler;
		
	}

}
