package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.RDDSCancellation;


/**
 * 
 * 
 * FileName      RDDSCancellationMessageHandler.java
 * @Description  TODO  RDDS订阅的取消信息处理者 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月2日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月2日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
@Component
public class RDDSCancellationMessageHandler extends CancellationMessageHandler implements IMessageHandler<RDDSCancellation> {
	
	@Resource
	private MessageService RDDSMessageService;

	@Override
	public void handle(RDDSCancellation cancellation) {
		handleCancellation(cancellation.getRequestStatus());
	}

	@Override
	public MessageService getMessageService() {
		return RDDSMessageService;
	}

}
