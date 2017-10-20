package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.models.aodb.basic.AircraftSubtype;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      AircraftSubtypeHandler.java
 * @Description  TODO 机型的IB Message 处理者
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月7日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月7日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

@Component
public class AircraftSubtypeHandler implements IMessageHandler<com.ultra_as.schema.BasicData.AircraftSubtype> {

	@Resource
	private INNGAodbService<String, AircraftSubtype> aircraftSubtypeService;
	
	
	@Override
	public   void handle(com.ultra_as.schema.BasicData.AircraftSubtype ibAircraftSubtype) {
		/*
		 * 查找机型数据库中有无该机型数据
		 */
		AircraftSubtype aircraftSubtype = aircraftSubtypeService.findByFieldSingle(AircraftSubtype.SUBTYPEIATACODE, 
				ibAircraftSubtype.getIdentification().getAircraftSubtypeIATACode(), AircraftSubtype.class);
		/*
		 * 如果没有创建一个新机型实体
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
		 * 更新机型数据
		 */
		aircraftSubtypeService.update(aircraftSubtype);
		
	}

}
