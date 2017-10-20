package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.models.aodb.basic.FlightNature;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      FlightNatureHandler.java
 * @Description  TODO 航班性质 IB Message 处理者
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月7日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月7日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

@Component
public class FlightNatureHandler implements IMessageHandler<com.ultra_as.schema.BasicData.FlightNature> {

	@Resource
	private INNGAodbService<String, FlightNature> natureService;
	
	@Override
	public void handle(com.ultra_as.schema.BasicData.FlightNature ibNature) throws Exception {
		FlightNature nature = natureService.findByID(
				ibNature.getIdentification().getFlightNatureCode(), FlightNature.class);
		if (nature == null){
			nature = new FlightNature();
			nature.setNatureCode(ibNature.getIdentification().getFlightNatureCode());
		}
		if (ibNature.getFlightNatureDescription() != null){
			nature.setChineseDescription(ibNature.getFlightNatureDescription().getValue());
		}
		natureService.update(nature);
	}

}
