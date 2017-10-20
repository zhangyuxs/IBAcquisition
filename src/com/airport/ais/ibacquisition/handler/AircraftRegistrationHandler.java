package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.models.aodb.basic.Aircraft;
import com.airport.ais.models.aodb.basic.AircraftSubtype;
import com.airport.ais.models.aodb.basic.Carrier;
import com.airport.ais.service.INNGAodbService;
import com.ultra_as.schema.BasicData.AircraftRegistration;

/**
 * 
 * 
 * FileName      AircraftRegistrationHandler.java
 * @Description  TODO 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月6日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月6日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
@Component
public class AircraftRegistrationHandler implements IMessageHandler<AircraftRegistration> {

	@Resource
	private INNGAodbService<Integer, Aircraft> aircraftService;

	@Resource
	private INNGAodbService<Integer, AircraftSubtype> aircraftSubtypeService;
	
	@Resource
	private INNGAodbService<Integer, Carrier> carrierService;
	
	@Override
	public void handle(AircraftRegistration registration) {
		/*
		 * 查找飞机数据库有无该飞机数据
		 */
		Aircraft aircraft = aircraftService.findByFieldSingle(Aircraft.REGISTRATION,
				registration.getIdentification().getAircraftRegistration(),Aircraft.class);
		/*
		 * 如果没有则新建一个飞机信息
		 */
		if (aircraft == null){
			aircraft = new Aircraft();
			aircraft.setRegistration(registration.getIdentification().getAircraftRegistration());
		}
		if (registration.getAircraftNoseNumber() != null){
			aircraft.setAircraftNoseNumber(registration.getAircraftNoseNumber().getValue());
		}
		if (registration.getAircraftPassengerCapacity() != null){
			aircraft.setPassengerCapacity(registration.getAircraftPassengerCapacity().getValue());
		}
		if (registration.getAircraftSubtypeIATACode() != null){
			aircraft.setAircraftSubtype(aircraftSubtypeService.findByFieldSingle(AircraftSubtype.SUBTYPEIATACODE,
					registration.getAircraftSubtypeIATACode().getValue(), AircraftSubtype.class));
		}
		if (registration.getAircraftRegistrationDescription() != null ){
			aircraft.setRegistrationDescription(
					registration.getAircraftRegistrationDescription().getValue());
		}
		if (aircraft.getCarrier() == null){
			if (registration.getAircraftOwnerIATACode() != null){
				aircraft.setCarrier(carrierService.findByFieldSingle(Carrier.CARRIERCODE, 
						registration.getAircraftOwnerIATACode().getValue(), Carrier.class));
			}
		}

		/*
		 * 更新飞机数据
		 */
		aircraftService.update(aircraft);
		
	}

}
