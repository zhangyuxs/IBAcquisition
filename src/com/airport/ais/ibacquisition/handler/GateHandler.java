package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.enums.aodb.ResourceStatusCode;
import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.models.aodb.basic.BoardingBridge;
import com.airport.ais.models.aodb.basic.Gate;
import com.airport.ais.service.INNGAodbService;
import com.airport.ais.utils.DateTimeUtil;

/**
 * 
 * 
 * FileName      GateHandler.java
 * @Description  TODO 登机口的IB Message 处理者 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月7日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月7日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
@Component
public class GateHandler implements IMessageHandler<com.ultra_as.schema.BasicData.Gate> {
	
	@Resource
	private INNGAodbService<String, Gate> gateService;
	
	
	@Resource
	private INNGAodbService<String, BoardingBridge> bridgeService;

	@Override
	public void handle(com.ultra_as.schema.BasicData.Gate ibGate) throws Exception {
		String gateNumber = Utils.LOCALAIRPORTIATACODE+"_"+ibGate.getTerminalCode()
				+"_"+ibGate.getIdentification().getGateNumber();
		Gate gate = gateService.findByID(gateNumber, Gate.class);
		
		if (gate == null){
			gate = new Gate();
			gate.setGateNumber(gateNumber);
		}
		if (ibGate.getGateDescription() != null){
			gate.setDescription(ibGate.getGateDescription().getValue());
		}
		if (ibGate.getBridgeID().size() >0){
			for(String ibBridgeID:ibGate.getBridgeID()){
				String bridgeID = Utils.LOCALAIRPORTIATACODE+"_"+ibGate.getTerminalCode()+ibBridgeID;
				gate.getBoardingBridges().add(bridgeService.findByID(bridgeID, BoardingBridge.class));
			}
		}
		if (ibGate.getGateStatus() != null){
			gate.setStatusCode(ResourceStatusCode.valueOf(ibGate.getGateStatus().getValue().toString()));
		}
		if (ibGate.getGateStatusReason() != null){
			gate.setStatusReason(ibGate.getGateStatusReason().getValue());
		}
		if (ibGate.getGateStatusStartDateTime() != null){
			gate.setStatusStartDateTime(DateTimeUtil.convertToDate(
					ibGate.getGateStatusStartDateTime().getValue()));
		}
		if (ibGate.getGateStatusEndDateTime() != null){
			gate.setStatusEndDateTime(DateTimeUtil.convertToDate(
					ibGate.getGateStatusEndDateTime().getValue()));
		}
		/*
		 * 更新登机口数据
		 */
		gateService.update(gate);
		
	}

}
