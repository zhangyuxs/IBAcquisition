package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.models.aodb.basic.CheckinClass;
import com.airport.ais.service.IAodbService;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      CheckinAirlineClassHandler.java
 * @Description  TODO ֵ����̨�ȼ� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��7��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��7��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */
@Component
public class CheckinClassHandler implements IMessageHandler<com.ultra_as.schema.BasicData.CheckinClass> {

	@Resource
	private INNGAodbService<String, CheckinClass> checkinClassService;
	
	@Override
	public void handle(com.ultra_as.schema.BasicData.CheckinClass ibCheckinClass) throws Exception {
		
		CheckinClass checkinClass = checkinClassService.findByID(ibCheckinClass.getIdentification().getCheckinClassCode(), CheckinClass.class);
		if (checkinClass == null){
			checkinClass = new CheckinClass();
			checkinClass.setClassCode(ibCheckinClass.getIdentification().getCheckinClassCode());
		}
		if (ibCheckinClass.getCheckinClassDescription() != null){
			checkinClass.setChineseDescription(
					ibCheckinClass.getCheckinClassDescription().getValue());
		}
		checkinClassService.update(checkinClass);
	}

}
