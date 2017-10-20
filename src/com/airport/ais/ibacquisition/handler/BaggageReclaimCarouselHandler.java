package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.enums.aodb.ResourceStatusCode;
import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.models.aodb.basic.BaggageReclaimCarousel;
import com.airport.ais.service.INNGAodbService;
import com.airport.ais.utils.DateTimeUtil;

@Component
public class BaggageReclaimCarouselHandler implements IMessageHandler<com.ultra_as.schema.BasicData.BaggageReclaimCarousel> {
	
	@Resource
	private INNGAodbService<String, BaggageReclaimCarousel> baggageReclaimCarouselService;
	

	@Override
	public void handle(com.ultra_as.schema.BasicData.BaggageReclaimCarousel ibBaggageReclaimCarousel) throws Exception {
	
		String baggageMakeupPositionID = Utils.LOCALAIRPORTIATACODE+"_"+
				ibBaggageReclaimCarousel.getIdentification().getTerminalCode()+"_"+ibBaggageReclaimCarousel.getIdentification().getBaggageReclaimCarouselID();
		BaggageReclaimCarousel baggageReclaimCarousel = baggageReclaimCarouselService.findByID(baggageMakeupPositionID, BaggageReclaimCarousel.class);
		/*
		 * 如果数据库中无该航站楼，就无法进行更新和新增操作
		 */
		if (baggageReclaimCarousel ==null){
			baggageReclaimCarousel = new BaggageReclaimCarousel();
			baggageReclaimCarousel.setBaggageReclaimCarouselID(baggageMakeupPositionID);
		}
		if (ibBaggageReclaimCarousel.getReclaimCarouselCapacity() != null){
			baggageReclaimCarousel.setCapacity(
					ibBaggageReclaimCarousel.getReclaimCarouselCapacity().getValue());
		}
		if (ibBaggageReclaimCarousel.getReclaimCarouselDescription() != null){
			baggageReclaimCarousel.setDescription(
					ibBaggageReclaimCarousel.getReclaimCarouselDescription().getValue());
		}
		if (ibBaggageReclaimCarousel.getReclaimCarouselStatus() != null){
			baggageReclaimCarousel.setStatusCode(ResourceStatusCode.valueOf(
					ibBaggageReclaimCarousel.getReclaimCarouselStatus().toString()));
		}
		if (ibBaggageReclaimCarousel.getReclaimCarouselStatusReason() != null){
			baggageReclaimCarousel.setStatusReason(
					ibBaggageReclaimCarousel.getReclaimCarouselStatusReason().getValue());
		}
		if (ibBaggageReclaimCarousel.getReclaimCarouselStatusStartDateTime() != null){
			baggageReclaimCarousel.setStatusStartDateTime(DateTimeUtil.convertToDate(
					ibBaggageReclaimCarousel.getReclaimCarouselStatusStartDateTime().getValue()));
		}
		if (ibBaggageReclaimCarousel.getReclaimCarouselStatusEndDateTime() != null){
			baggageReclaimCarousel.setStatusEndDateTime(DateTimeUtil.convertToDate(
					ibBaggageReclaimCarousel.getReclaimCarouselStatusStartDateTime().getValue()));
		}
		/*
		 * 更新提取转盘
		 */
		baggageReclaimCarouselService.update(baggageReclaimCarousel);
		
		
	}

}
