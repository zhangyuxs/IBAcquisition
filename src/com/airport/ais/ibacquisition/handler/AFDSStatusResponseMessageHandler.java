package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;


import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.AFDSStatusResponse;

/**
 * 
 * 
 * FileName      AFDSStatusResponseMessageHandler.java
 * @Description  TODO AFDS心跳回应消息的处理者
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年6月28日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年6月28日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

@Component
public class AFDSStatusResponseMessageHandler extends StatusResponseMessageHandler implements IMessageHandler<AFDSStatusResponse> {
	
	@Resource
	private MessageService AFDSMessageService;
	
	/**
	 * @return the messageService
	 */
	@Override
	public MessageService getMessageService() {
		return AFDSMessageService;
	}

	@Override
	public void handle(AFDSStatusResponse afdsStatusResponse) {
		handleStatusResponse(afdsStatusResponse.getServiceStatus());
	}


}
