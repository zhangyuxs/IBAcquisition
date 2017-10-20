package com.airport.ais.ibacquisition.handler;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.ServiceStatus;
/**
 * 
 * 
 * FileName      StatusResponseMessageHandler.java
 * @Description  TODO   心跳Response的处理者
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年6月28日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年6月28日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */


public abstract class StatusResponseMessageHandler {

	
	/**
	 * 根据返回的服务状态进行对应的处理
	 * @param serviceStatus
	 */
	protected void handleStatusResponse(ServiceStatus serviceStatus) {
		
		switch (serviceStatus) {
		
		case DOWN:
			getMessageService().setInterfaceUp(false);
			/*如果是在订阅器件，则继续发送订阅消息*/
			if (getMessageService().isSubscription()){
				getMessageService().sendSubscriptionRequestMessage(null);
			}
			break;
		case UNAVAILABLE:
			getMessageService().setInterfaceUp(false);
			break;
		case UP:
			getMessageService().setInterfaceUp(true);
			break;
	
		}
		
	}

	/**
	 * 返回对应的消息服务者
	 * @return the messageService
	 */
	public abstract MessageService getMessageService();

	

	

	
}