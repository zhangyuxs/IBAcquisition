package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.SFDSCancellation;


/**
 * 
 * 
 * FileName      SFDSCancellationMessageHandler.java
 * @Description  TODO SFDS���ĵ�ȡ����Ϣ������ 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��2��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��2��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class SFDSCancellationMessageHandler extends CancellationMessageHandler implements IMessageHandler<SFDSCancellation> {
	
	@Resource
	private MessageService SFDSMessageService;

	@Override
	public void handle(SFDSCancellation cancellation) {
		handleCancellation(cancellation.getRequestStatus());
	}

	@Override
	public MessageService getMessageService() {
		return SFDSMessageService;
	}

}
