package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.enums.aodb.ResourceStatusCode;
import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.models.aodb.basic.Runway;
import com.airport.ais.service.INNGAodbService;
import com.airport.ais.utils.DateTimeUtil;


/**
 * 
 * 
 * FileName      RunwayHandler.java
 * @Description  TODO 跑道的IB Message处理者 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月7日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月7日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

@Component
public class RunwayHandler implements IMessageHandler<com.ultra_as.schema.BasicData.Runway> {
	
	@Resource
	private INNGAodbService<String, Runway> runwayService;

	@Override
	public void handle(com.ultra_as.schema.BasicData.Runway ibRunway) throws Exception {
		String runwayID = Utils.LOCALAIRPORTIATACODE+"_"+ibRunway.getIdentification().getRunwayID();
		Runway runway = runwayService.findByID(runwayID, Runway.class);
		if (runway == null){
			runway = new Runway();
			runway.setRunwayID(runwayID);
		}
		if (ibRunway.getRunwayDescription() != null){
			runway.setDescription(ibRunway.getRunwayDescription().getValue());
		}
		if (ibRunway.getRunwayStatus() != null){
			runway.setStatusCode(ResourceStatusCode.valueOf(
					ibRunway.getRunwayStatus().toString()));
		}
		if (ibRunway.getRunwayStatusReason() != null){
			runway.setStatusReason(
					ibRunway.getRunwayStatusReason().getValue());
		}
		if (ibRunway.getRunwayStatusStartDateTime() != null){
			runway.setStatusStartDateTime(DateTimeUtil.convertToDate(
					ibRunway.getRunwayStatusStartDateTime().getValue()));
		}
		if (ibRunway.getRunwayStatusEndDateTime() != null){
			runway.setStatusEndDateTime(DateTimeUtil.convertToDate(
					ibRunway.getRunwayStatusStartDateTime().getValue()));
		}
		runwayService.update(runway);
	}

}
