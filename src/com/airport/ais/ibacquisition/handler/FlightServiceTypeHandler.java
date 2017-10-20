package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.models.aodb.basic.FlightNature;
import com.airport.ais.models.aodb.basic.FlightServiceType;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      FlightServiceTypeHandler.java
 * @Description  TODO  �����������IB Message������
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��7��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��7��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class FlightServiceTypeHandler implements IMessageHandler<com.ultra_as.schema.BasicData.FlightServiceType> {
	
	
	@Resource
	private INNGAodbService<String, FlightServiceType> typeService;
	
	@Resource
	private INNGAodbService<String, FlightNature> natureService;

	@Override
	public void handle(com.ultra_as.schema.BasicData.FlightServiceType ibType) throws Exception {
		FlightServiceType type = typeService.findByID(ibType.getIdentification().getFlightServiceTypeIATACode(), FlightServiceType.class);
		
		if (type == null){
			type = new FlightServiceType();
			type.setServiceTypeIATACode(ibType.getIdentification().getFlightServiceTypeIATACode());
		}
		if (ibType.getFlightServiceTypeDescription() != null){
			type.setChineseDescription(ibType.getFlightServiceTypeDescription().getValue());
		}
		
		if(ibType.getFlightNatureCode() != null){
			type.setFlightNature(natureService.findByID(ibType.getFlightNatureCode(), FlightNature.class));
		}
		typeService.update(type);
		
		
	}

}
