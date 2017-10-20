package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.models.aodb.basic.CAACDelayCategory;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      CAACDelayCategoryHandler.java
 * @Description  TODO 延误类别IB Message处理者 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月7日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月7日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
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
