package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.SFDSScheduleResponse;

/**
 * 
 * 
 * FileName      SFDSScheduleResponseMessageHandler.java
 * @Description  TODO SFDS���Ļ�Ӧ�Ĵ����� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��2��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��2��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */
@Component
public class SFDSScheduleResponseMessageHandler extends SubscriptionResponseMessageHandler
		implements IMessageHandler<SFDSScheduleResponse> {
	
	@Resource
	protected MessageService SFDSMessageService;

	@Override
	public void handle(SFDSScheduleResponse response) {
		
		handleSubscriptionResponse(response.getRequestStatus());
	}

	@Override
	public MessageService getMessageService() {
		return SFDSMessageService;
	}

	

}
