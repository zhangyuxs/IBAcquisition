package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.models.aodb.basic.FlightClassification;
import com.airport.ais.models.aodb.basic.FlightServiceType;
import com.airport.ais.service.INNGAodbService;




/**
 * 
 * 
 * FileName      FlightClassificationHandler.java
 * @Description  TODO 航班分类的 IB Message处理者
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月7日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月7日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
@Component
public class FlightClassificationHandler implements IMessageHandler<com.ultra_as.schema.BasicData.FlightClassification> {
	
	@Resource
	private INNGAodbService<String, FlightClassification> classificationService;
	
	@Resource
	private INNGAodbService<String, FlightServiceType> flightServiceTypeService;

	@Override
	public void handle(com.ultra_as.schema.BasicData.FlightClassification ibClassification) throws Exception {
		FlightClassification classification = classificationService.findByID(ibClassification.getIdentification().getFlightClassificationCode(), FlightClassification.class);
		if (classification == null){
			classification = new FlightClassification();
			classification.setClassificationCode(ibClassification.getIdentification().getFlightClassificationCode());
		}
		if (ibClassification.getClassificationCodeDescription() != null){
			classification.setChineseDescription(
					ibClassification.getClassificationCodeDescription().getValue());
			
		}
		if (ibClassification.getFlightServiceTypeIATACode() != null) {
			classification.setFlightServiceType(flightServiceTypeService.findByID(ibClassification.getFlightServiceTypeIATACode(), FlightServiceType.class));
		}
		classificationService.update(classification);
		
	}

}
