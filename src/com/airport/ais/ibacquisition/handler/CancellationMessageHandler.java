package com.airport.ais.ibacquisition.handler;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.RequestStatus;

/**
 * 
 * 
 * FileName      CancellationMessageHandler.java
 * @Description  TODO  取消Response的处理者 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月2日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月2日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */


public abstract class CancellationMessageHandler {

	/**
	 * 根据返回的状态，进行对应的处理
	 * @param requestStatus
	 */
	protected void handleCancellation(RequestStatus requestStatus){
		
		switch (requestStatus) {
		case ACCEPTED:
			getMessageService().setInterfaceUp(false);
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
	 * 获取对应的消息服务者
	 * @return the messageService
	 */
	public abstract MessageService getMessageService();

}
