package com.airport.ais.ibacquisition.handler;

import org.springframework.beans.BeansException;

import ibacquisition.Activator;

/**
 * 
 * 
 * FileName      HandlerFactory.java
 * @Description  TODO 处理者的工厂类
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年6月30日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年6月30日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

public class HandlerFactory {
	/**
	 * 处理的后缀名
	 */
	private static final String sufix = "MessageHandler";
	
	/**
	 * 从Spring容器中获取对应的处理Bean;
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
