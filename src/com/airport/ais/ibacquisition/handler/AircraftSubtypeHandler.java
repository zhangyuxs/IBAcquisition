package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.models.aodb.basic.AircraftSubtype;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      AircraftSubtypeHandler.java
 * @Description  TODO ���͵�IB Message ������
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��7��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��7��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class AircraftSubtypeHandler implements IMessageHandler<com.ultra_as.schema.BasicData.AircraftSubtype> {

	@Resource
	private INNGAodbService<String, AircraftSubtype> aircraftSubtypeService;
	
	
	@Override
	public   void handle(com.ultra_as.schema.BasicData.AircraftSubtype ibAircraftSubtype) {
		/*
		 * ���һ������ݿ������޸û�������
		 */
		AircraftSubtype aircraftSubtype = aircraftSubtypeService.findByFieldSingle(AircraftSubtype.SUBTYPEIATACODE, 
				ibAircraftSubtype.getIdentification().getAircraftSubtypeIATACode(), AircraftSubtype.class);
		/*
		 * ���û�д���һ���»���ʵ��
		 */
		if (aircraftSubtype == null){
			aircraftSubtype = new AircraftSubtype();
			aircraftSubtype.setSubtypeIATACode(ibAircraftSubtype.getIdentification().getAircraftSubtypeIATACode());
		}
		if (ibAircraftSubtype.getAircraftSubtypeDescription() != null){
			aircraftSubtype.setSubtypeDescription(
					ibAircraftSubtype.getAircraftSubtypeDescription().getValue());
		}
		if (ibAircraftSubtype.getAircraftHeight() != null){
			aircraftSubtype.setHeight(ibAircraftSubtype.getAircraftHeight().getValue());
		}
		if (ibAircraftSubtype.getAircraftLength() != null){
			aircraftSubtype.setLength(ibAircraftSubtype.getAircraftLength().getValue());
		}
		if (ibAircraftSubtype.getAircraftWeight() != null){
			aircraftSubtype.setWidth(ibAircraftSubtype.getAircraftWeight().getValue());
		}
		if (ibAircraftSubtype.getAircraftWidth() != null){
			aircraftSubtype.setWidth(ibAircraftSubtype.getAircraftWidth().getValue());
		}
		if (ibAircraftSubtype.getAircraftPassengerCapacity() != null){
			aircraftSubtype.setPassengerCapacity(
					ibAircraftSubtype.getAircraftPassengerCapacity().getValue());
		}
		if (ibAircraftSubtype.getFirstClassPassengerCapacity() != null){
			aircraftSubtype.setFirstClassPassengerCapacity(
					ibAircraftSubtype.getFirstClassPassengerCapacity().getValue());
		}
		if (ibAircraftSubtype.getBusinessClassPassengerCapacity() != null){
			aircraftSubtype.setBusinessClassPassengerCapacity(
					ibAircraftSubtype.getBusinessClassPassengerCapacity().getValue());
		}
		if (ibAircraftSubtype.getEconomyClassPassengerCapacity() != null){
			aircraftSubtype.setEconomyClassPassengerCapacity(
					ibAircraftSubtype.getEconomyClassPassengerCapacity().getValue());
		}
		if (ibAircraftSubtype.getAircraftTypeIATACode() != null){
			aircraftSubtype.setTypeIATACode(
					ibAircraftSubtype.getAircraftTypeIATACode().getValue());
		}
		if(ibAircraftSubtype.getAircraftTypeICAOCode() != null){
			aircraftSubtype.setTypeICAOCode(
					ibAircraftSubtype.getAircraftTypeICAOCode().getValue());
		}
		/*
		 * ���»�������
		 */
		aircraftSubtypeService.update(aircraftSubtype);
		
	}

}
