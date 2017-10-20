package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.AFDSSubscriptionResponse;
/**
 * 
 * 
 * FileName      AFDSSubscriptionResponseMessageHandler.java
 * @Description  TODO AFDS���Ļ�Ӧ�Ĵ����� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��2��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��2��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class AFDSSubscriptionResponseMessageHandler extends SubscriptionResponseMessageHandler
		implements IMessageHandler<AFDSSubscriptionResponse> {
	
	@Resource
	protected MessageService AFDSMessageService;

	@Override
	public void handle(AFDSSubscriptionResponse response) {
		handleSubscriptionResponse(response.getRequestStatus());
	}

	@Override
	public MessageService getMessageService() {
		return AFDSMessageService;
	}

	

}
