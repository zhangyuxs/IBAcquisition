package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.SFDSStatusResponse;

/**
 * 
 * 
 * FileName      SFDSStatusResponseMessageHandler.java
 * @Description  TODO SFDS������Ӧ��Ϣ�Ĵ����� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��2��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��2��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class SFDSStatusResponseMessageHandler extends StatusResponseMessageHandler implements IMessageHandler<SFDSStatusResponse>{
	
	@Resource
	protected MessageService RDDSMessageService;

	@Override
	public MessageService getMessageService() {
		return RDDSMessageService;
	}

	@Override
	public void handle(SFDSStatusResponse statusResponse) {
		handleStatusResponse(statusResponse.getServiceStatus());		
	}

	

}
