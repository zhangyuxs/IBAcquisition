package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.enums.aodb.ResourceStatusCode;
import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.models.aodb.basic.Gate;
import com.airport.ais.models.aodb.basic.Stand;
import com.airport.ais.service.INNGAodbService;
import com.airport.ais.utils.DateTimeUtil;



/**
 * 
 * 
 * FileName      StandHandler.java
 * @Description  TODO ͣ��λIB Message ������
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��7��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��7��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class StandHandler implements IMessageHandler<com.ultra_as.schema.BasicData.Stand> {

	@Resource
	private INNGAodbService<String, Stand> standService;
	
	@Resource
	private INNGAodbService<String, Gate> gateService;

	
	@Override
	public void handle(com.ultra_as.schema.BasicData.Stand ibStand) throws Exception {
		/*
		 * ��ѯ��Ӧ��ͣ��λ
		 */
		String standPosition = Utils.LOCALAIRPORTIATACODE+"_"+ibStand.getTerminalCode()+"_"+ibStand.getIdentification().getStandPosition();
		Stand stand = standService.findByID(standPosition, Stand.class);
		if (stand == null){
			stand = new Stand();
			stand.setStandPosition(standPosition);
		}
		if (ibStand.getStandDescription() != null){
			stand.setDescription(ibStand.getStandDescription().getValue());
		}
		if (ibStand.getGateNumber() != null){
			String gateNumber = Utils.LOCALAIRPORTIATACODE+"_"+ibStand.getTerminalCode()+ibStand.getGateNumber().getValue();
			stand.setGate(gateService.findByID(gateNumber, Gate.class));
		}
		if (ibStand.getStandStatus() != null){
			stand.setStatusCode(ResourceStatusCode.valueOf(ibStand.getStandStatus().getValue().toString()));
		}
		if (ibStand.getStandStatusReason() != null){
			stand.setStatusReason(ibStand.getStandStatusReason().getValue());
		}
		if (ibStand.getStandStatusStartDateTime() != null){
			stand.setStatusStartDateTime(DateTimeUtil.convertToDate(
					ibStand.getStandStatusStartDateTime().getValue()));
		}
		if (ibStand.getStandStatusEndDateTime() != null){
			stand.setStatusEndDateTime(DateTimeUtil.convertToDate(
					ibStand.getStandStatusEndDateTime().getValue()));
		}
		/*
		 * ����ͣ��λ����
		 */
		standService.update(stand);
		
	}

}
