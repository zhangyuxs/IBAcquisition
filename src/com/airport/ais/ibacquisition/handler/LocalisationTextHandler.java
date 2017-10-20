package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.dao.parameter.QueryCondition;
import com.airport.ais.models.aodb.basic.IBText;
import com.airport.ais.service.INNGAodbService;
import com.ultra_as.schema.BasicData.LocalisationText;

@Component
public class LocalisationTextHandler implements IMessageHandler<LocalisationText> {

	@Resource
	private INNGAodbService<Integer, IBText> ibTextService;
	
	@Override
	public void handle(LocalisationText ibLocalisationText) throws Exception {
		QueryCondition condition = new QueryCondition();
		condition.setExpression(new Object[]{IBText.TEXTCATEGORYCODE,"=",ibLocalisationText.getIdentification().getTextCategoryCode(),
				"AND",IBText.TEXTCODE,"=",ibLocalisationText.getIdentification().getTextCode()});
		IBText ibText = ibTextService.findByConditionSingle(condition, IBText.class);
		if (ibText == null){
			ibText = new IBText();
			ibText.setTextCategoryCode(ibLocalisationText.getIdentification().getTextCategoryCode());
			ibText.setTextCode(ibLocalisationText.getIdentification().getTextCode());
		}
		if (ibLocalisationText.getChineseLanguageText() != null){
			ibText.setChineseLanguageText(ibLocalisationText.getChineseLanguageText().getValue());
		}
		if (ibLocalisationText.getEnglishLanguageText() != null){
			ibText.setEnglishLanguageText(ibLocalisationText.getEnglishLanguageText().getValue());
		}
		
		ibTextService.update(ibText);
	}

}
