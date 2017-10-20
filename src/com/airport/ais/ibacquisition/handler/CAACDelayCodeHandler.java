package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.models.aodb.basic.CAACDelayCategory;
import com.airport.ais.models.aodb.basic.CAACDelayCode;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      CAACDelayCodeHandler.java
 * @Description  TODO 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月8日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月8日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
@Component
public class CAACDelayCodeHandler implements IMessageHandler<com.ultra_as.schema.BasicData.CAACDelayCode> {
	
	@Resource
	private INNGAodbService<String, CAACDelayCode> codeService;
	
	@Resource
	private INNGAodbService<String, CAACDelayCategory> categoryService;

	@Override
	public void handle(com.ultra_as.schema.BasicData.CAACDelayCode ibCode) throws Exception {
		CAACDelayCode code = codeService.findByID(ibCode.getIdentification().getCAACDelayCode(), CAACDelayCode.class);
		CAACDelayCategory category = categoryService.findByID(ibCode.getIdentification().getCAACDelayCategory(), CAACDelayCategory.class);
		if (code == null){
			code = new CAACDelayCode();
			code.setDelayCode(ibCode.getIdentification().getCAACDelayCode());
			code.setCaacDelayCategory(category);
		}
		if (ibCode.getCAACDelayCodeDescription() != null){
			code.setEnglishDescription(ibCode.getCAACDelayCodeDescription().getValue());
		}
		codeService.update(code);
	}

}
