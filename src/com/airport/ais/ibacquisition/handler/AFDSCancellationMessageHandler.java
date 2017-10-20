package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.AFDSCancellation;

/**
 * 
 * 
 * FileName      AFDSCancellationMessageHandler.java
 * @Description  TODO AFDS���ĵ�ȡ����Ϣ������ 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��2��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��2��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */


@Component
public class AFDSCancellationMessageHandler extends CancellationMessageHandler implements IMessageHandler<AFDSCancellation> {
	
	@Resource
	private MessageService AFDSMessageService;

	@Override
	public void handle(AFDSCancellation cancellation) {
		handleCancellation(cancellation.getRequestStatus());
	}

	@Override
	public MessageService getMessageService() {
		return AFDSMessageService;
	}

}
