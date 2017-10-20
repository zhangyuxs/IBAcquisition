package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.RDDSStatusResponse;

/**
 * 
 * 
 * FileName      RDDSStatusResponseMessageHandler.java
 * @Description  TODO  RDDS心跳回应消息的处理者 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月2日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月2日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

@Component
public class RDDSStatusResponseMessageHandler extends StatusResponseMessageHandler implements IMessageHandler<RDDSStatusResponse>{
	
	@Resource
	protected MessageService RDDSMessageService;

	@Override
	public MessageService getMessageService() {
		return RDDSMessageService;
	}

	@Override
	public void handle(RDDSStatusResponse statusResponse) {
		handleStatusResponse(statusResponse.getServiceStatus());		
	}

	

}
