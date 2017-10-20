package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.enums.aodb.ResourceStatusCode;
import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.models.aodb.basic.BaggageMakeupPosition;
import com.airport.ais.service.INNGAodbService;
import com.airport.ais.utils.DateTimeUtil;


/**
 * 
 * 
 * FileName      BaggageMakeupPositionHandler.java
 * @Description  TODO ����װ��ת�� IB Message������ 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��7��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��7��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class BaggageMakeupPositionHandler implements IMessageHandler<com.ultra_as.schema.BasicData.BaggageMakeupPosition> {
	
	@Resource
	private INNGAodbService<String, BaggageMakeupPosition> baggageMakeupPostionService;
	
	

	@Override
	public void handle(com.ultra_as.schema.BasicData.BaggageMakeupPosition ibBaggageMakeupPosition) throws Exception {
		
	    String baggageMakeupPositionID = Utils.LOCALAIRPORTIATACODE+"_"+
	    		ibBaggageMakeupPosition.getIdentification().getTerminalCode()+"_"+ibBaggageMakeupPosition.getIdentification().getBaggageMakeupPositionID();
		BaggageMakeupPosition baggageMakeupPosition = baggageMakeupPostionService.findByID(baggageMakeupPositionID, BaggageMakeupPosition.class);
		/*
		 * ������ݿ����޸ú�վ¥�����޷����и��º���������
		 */
		if (baggageMakeupPosition ==null){
			baggageMakeupPosition = new BaggageMakeupPosition();
			baggageMakeupPosition.setBaggageMakeupPositionID(baggageMakeupPositionID);
		}
		if (ibBaggageMakeupPosition.getMakeupPositionCapacity() != null){
			baggageMakeupPosition.setCapacity(
					ibBaggageMakeupPosition.getMakeupPositionCapacity().getValue());
		}
		if (ibBaggageMakeupPosition.getMakeupPositionDescription() != null){
			baggageMakeupPosition.setDescription(
					ibBaggageMakeupPosition.getMakeupPositionDescription().getValue());
		}
		if (ibBaggageMakeupPosition.getMakeupPositionStatus() != null){
			baggageMakeupPosition.setStatusCode(ResourceStatusCode.valueOf(
					ibBaggageMakeupPosition.getMakeupPositionStatus().toString()));
		}
		if (ibBaggageMakeupPosition.getMakeupPositionStatusReason() != null){
			baggageMakeupPosition.setStatusReason(
					ibBaggageMakeupPosition.getMakeupPositionStatusReason().getValue());
		}
		if (ibBaggageMakeupPosition.getMakeupPositionStatusStartDateTime() != null){
			baggageMakeupPosition.setStatusStartDateTime(DateTimeUtil.convertToDate(
					ibBaggageMakeupPosition.getMakeupPositionStatusStartDateTime().getValue()));
		}
		if (ibBaggageMakeupPosition.getMakeupPositionStatusEndDateTime() != null){
			baggageMakeupPosition.setStatusEndDateTime(DateTimeUtil.convertToDate(
					ibBaggageMakeupPosition.getMakeupPositionStatusStartDateTime().getValue()));
		}
		/*
		 * ��������װ��ת������
		 */
		baggageMakeupPostionService.update(baggageMakeupPosition);
	}
	

}
