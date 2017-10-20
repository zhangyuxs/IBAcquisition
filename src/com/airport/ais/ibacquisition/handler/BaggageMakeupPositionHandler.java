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
 * @Description  TODO 行李装载转盘 IB Message处理者 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月7日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月7日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
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
		 * 如果数据库中无该航站楼，就无法进行更新和新增操作
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
		 * 更新行李装载转盘数据
		 */
		baggageMakeupPostionService.update(baggageMakeupPosition);
	}
	

}
