package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.airport.ais.enums.aodb.ResourceStatusCode;
import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.models.aodb.basic.BoardingBridge;
import com.airport.ais.service.INNGAodbService;
import com.airport.ais.utils.DateTimeUtil;

/**
 * 
 * 
 * FileName      BoardingBridgeHandler.java
 * @Description  TODO �ǻ���IB Message�Ĵ����� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��7��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��7��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */
@Component
public class BoardingBridgeHandler implements IMessageHandler<com.ultra_as.schema.BasicData.BoardingBridge> {

	@Resource
	private INNGAodbService<String,BoardingBridge> boardingBridgeService;
	
	
	
	@Override
	public void handle(com.ultra_as.schema.BasicData.BoardingBridge ibBridge) throws Exception {
		
		String bridgeID = Utils.LOCALAIRPORTIATACODE+"_"+ibBridge.getIdentification().getTerminalCode()+
				"_"+ibBridge.getIdentification().getBridgeID();
		/*
		 * ��ѯ��Ӧ������
		 */
		BoardingBridge bridge = boardingBridgeService.findByID(bridgeID, BoardingBridge.class);
		if (bridge == null){
			bridge = new BoardingBridge();
			bridge.setBridgeID(bridgeID);
		}
			
		if (ibBridge.getBridgeDescription() != null){
			bridge.setDescription(
					ibBridge.getBridgeDescription().getValue());
		}
		if (ibBridge.getBridgeStatusGeneral() != null){
			bridge.setStatusGeneral(ResourceStatusCode.valueOf(
					ibBridge.getBridgeStatusGeneral().getValue().toString()));
		}
		if (ibBridge.getBridgeStatusGeneralStartDateTime() != null){
			bridge.setStatusGeneralStartDateTime(DateTimeUtil.convertToDate(
					ibBridge.getBridgeStatusGeneralStartDateTime().getValue()));
		}
		if (ibBridge.getBridgeStatusGeneralEndDateTime() != null){
			bridge.setStatusGeneralEndDateTime(DateTimeUtil.convertToDate(
					ibBridge.getBridgeStatusGeneralStartDateTime().getValue()));
		}
		if (ibBridge.getBridgeStatusPCA() != null){
			bridge.setStatusPCA(ResourceStatusCode.valueOf(
					ibBridge.getBridgeStatusPCA().getValue().toString()));
		}
		if (ibBridge.getBridgeStatusPCAStartDateTime() != null){
			bridge.setStatusPCAStartDateTime(DateTimeUtil.convertToDate(
					ibBridge.getBridgeStatusPCAStartDateTime().getValue()));
		}
		if (ibBridge.getBridgeStatusPCAEndDateTime() != null){
			bridge.setStatusPCAEndDateTime(DateTimeUtil.convertToDate(
					ibBridge.getBridgeStatusPCAStartDateTime().getValue()));
		}
		if (ibBridge.getBridgeStatusPower() != null){
			bridge.setStatusPower(ResourceStatusCode.valueOf(
					ibBridge.getBridgeStatusPower().getValue().toString()));
		}
		if (ibBridge.getBridgeStatusPowerStartDateTime() != null){
			bridge.setStatusPowerStartDateTime(DateTimeUtil.convertToDate(
					ibBridge.getBridgeStatusPowerStartDateTime().getValue()));
		}
		if (ibBridge.getBridgeStatusGeneralEndDateTime() != null){
			bridge.setStatusGeneralEndDateTime(DateTimeUtil.convertToDate(
					ibBridge.getBridgeStatusPowerStartDateTime().getValue()));
		}
		/*
		 * ���µǻ�������
		 */
		boardingBridgeService.update(bridge);
			
			
	}

}
