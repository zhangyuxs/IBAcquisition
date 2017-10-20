package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.models.aodb.basic.CAACDelayCategory;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      CAACDelayCategoryHandler.java
 * @Description  TODO �������IB Message������ 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��7��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��7��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */
@Component
public class CAACDelayCategoryHandler implements IMessageHandler<com.ultra_as.schema.BasicData.CAACDelayCategory> {

	@Resource
	private INNGAodbService<String, CAACDelayCategory> categoryService;
	
	
	@Override
	public void handle(com.ultra_as.schema.BasicData.CAACDelayCategory ibCategory) throws Exception {
		CAACDelayCategory  category = categoryService.findByID( 
				ibCategory.getIdentification().getCAACDelayCategory(), CAACDelayCategory.class);
		if (category == null){
			category =  new CAACDelayCategory();
			category.setCategoryCode(ibCategory.getIdentification().getCAACDelayCategory());
		}
		if (ibCategory.getCAACDelayCategoryDescription() != null){
			category.setEnglishDescription(ibCategory.getCAACDelayCategoryDescription().toString());
		}
		categoryService.update(category);
		
	}

}
