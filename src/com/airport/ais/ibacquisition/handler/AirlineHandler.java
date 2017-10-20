package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.enums.aodb.SectorCode;
import com.airport.ais.models.aodb.basic.Airline;
import com.airport.ais.models.aodb.basic.Sector;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      AirlineHandler.java
 * @Description  TODO ���չ�˾IB MESSAGE ������
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��7��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��7��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */
@Component
public class AirlineHandler implements IMessageHandler<com.ultra_as.schema.BasicData.Airline> {
	@Resource
	private INNGAodbService<String, Airline> airlineService;

	@Resource
	private INNGAodbService<SectorCode, Sector>  sectorService;
	
	@Override
	public void handle(com.ultra_as.schema.BasicData.Airline ibAirline) throws Exception {
		/*
		 * �ں��չ�˾���ݿ��ѯ���޶�Ӧ����
		 */
		Airline airline = airlineService.findByID( 
				ibAirline.getIdentification().getAirlineICAOCode(), Airline.class);
		if (airline == null){
			airline = new Airline();
			airline.setICAOCode(ibAirline.getIdentification().getAirlineICAOCode());
		}
		/*
		 * �����½�һ�����չ�˾ʵ��
		 */
		if (ibAirline.getAirlineIATACode() != null){
			airline.setIATACode(ibAirline.getAirlineIATACode());
		}
		if (ibAirline.getAirlineDescription() != null){
			airline.setEnglishName(ibAirline.getAirlineDescription().getValue());
		}
		if (ibAirline.getAirlineName() != null){
			airline.setDescription(ibAirline.getAirlineName().getValue());
		}
		if (ibAirline.getFlightSectorCode() != null){
			airline.setSector(sectorService.findByID(
					SectorCode.valueOf(ibAirline.getFlightSectorCode().getValue().toString()), Sector.class));
		}
		/*
		 * ���º��չ�˾����
		 */
		airlineService.update(airline);
	}

}
