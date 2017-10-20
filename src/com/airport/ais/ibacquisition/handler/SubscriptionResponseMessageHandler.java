package com.airport.ais.ibacquisition.handler;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.RequestStatus;

/**
 * 
 * 
 * FileName      SubscriptionResponseMessageHandler.java
 * @Description  TODO 订阅Response消息的处理者的基类
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年6月28日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年6月28日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
public abstract class SubscriptionResponseMessageHandler {
	
	/**
	 * 根据返回的订阅状态进行对应的处理
	 * @param requestStatus
	 */
	protected void handleSubscriptionResponse(RequestStatus requestStatus){
		
		switch (requestStatus) {
		case ACCEPTED:
			getMessageService().setInterfaceUp(true);
			break;
		case REJECTED:
			break;
		case UNAVAILABLE:
			getMessageService().setInterfaceUp(false);
			break;

		default:
			break;
		}
	}
	
	/**
	 * 
	 * 获取对应消息服务者
	 * @return the messageService
	 */
	public abstract MessageService getMessageService();



}
