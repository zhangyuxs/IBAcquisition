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
 * @Description  TODO 停机位IB Message 处理者
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月7日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月7日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
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
		 * 查询对应的停机位
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
		 * 更新停机位数据
		 */
		standService.update(stand);
		
	}

}
