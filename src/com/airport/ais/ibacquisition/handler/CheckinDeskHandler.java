package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.enums.aodb.ResourceStatusCode;
import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.models.aodb.basic.CheckinDesk;
import com.airport.ais.service.INNGAodbService;
import com.airport.ais.utils.DateTimeUtil;

/**
 * 
 * 
 * FileName      CheckinDeskHandler.java
 * @Description  TODO  ֵ����̨��IB Message ��Ϣ������ 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��7��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��7��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class CheckinDeskHandler implements IMessageHandler<com.ultra_as.schema.BasicData.CheckinDesk> {

	@Resource
	private INNGAodbService<String, CheckinDesk> checkinDeskService;
	
	
	@Override
	public void handle(com.ultra_as.schema.BasicData.CheckinDesk ibCheckinDesk) throws Exception {
		String checkDeskID = Utils.LOCALAIRPORTIATACODE+"_"+ibCheckinDesk.getIdentification().getTerminalCode()+"_"+
				ibCheckinDesk.getIdentification().getCheckinDeskID();
		CheckinDesk checkinDesk = checkinDeskService.findByID(checkDeskID, CheckinDesk.class);
		if (checkinDesk == null){
			checkinDesk = new CheckinDesk();
			checkinDesk.setCheckinDeskID(checkDeskID);
		}
		if (ibCheckinDesk.getCheckinDeskDescription() != null){
			checkinDesk.setDescription(ibCheckinDesk.getCheckinDeskDescription().getValue());
		}
		if (ibCheckinDesk.getCheckinDeskStatus() != null){
			checkinDesk.setStatusCode(ResourceStatusCode.valueOf(
					ibCheckinDesk.getCheckinDeskStatus().getValue().toString()));
		}
		if (ibCheckinDesk.getCheckinGroup() != null){
			checkinDesk.setCheckinGroup(ibCheckinDesk.getCheckinGroup().getValue());
		}
		if (ibCheckinDesk.getCheckinDeskStatusReason() != null){
			checkinDesk.setStatusReason(ibCheckinDesk.getCheckinDeskStatusReason().getValue());
		}
		if (ibCheckinDesk.getCheckinDeskStatusStartDateTime() != null){
			checkinDesk.setStatusStartDateTime(DateTimeUtil.convertToDate(
					ibCheckinDesk.getCheckinDeskStatusStartDateTime().getValue()));
		}
		if (ibCheckinDesk.getCheckinDeskStatusEndDateTime() != null){
			checkinDesk.setStatusEndDateTime(DateTimeUtil.convertToDate(
					ibCheckinDesk.getCheckinDeskStatusEndDateTime().getValue()));
		}
		/*
		 * ���¹�̨
		 */
		checkinDeskService.update(checkinDesk);
	}

}
