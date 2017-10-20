package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.BDDSStatusResponse;

/**
 * 
 * 
 * FileName      BDDSStatusResponseMessageHandler.java
 * @Description  TODO BDDS������Ӧ��Ϣ�Ĵ����� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��2��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��2��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class BDDSStatusResponseMessageHandler extends StatusResponseMessageHandler implements IMessageHandler<BDDSStatusResponse> {
	
	@Resource
	private MessageService BDDSMessageService;
	
	/**
	 * @return the messageService
	 */
	@Override
	public MessageService getMessageService() {
		return BDDSMessageService;
	}

	@Override
	public void handle(BDDSStatusResponse statusResponse ) {
		handleStatusResponse(statusResponse.getServiceStatus());
	}


}
