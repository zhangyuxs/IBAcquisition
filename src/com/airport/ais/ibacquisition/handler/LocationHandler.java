package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.enums.aodb.SectorCode;
import com.airport.ais.models.aodb.basic.Airport;
import com.airport.ais.models.aodb.basic.Sector;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      LocationHandler.java
 * @Description  TODO 机场信息的IB Message处理
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月11日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月11日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
@Component
public class LocationHandler implements IMessageHandler<com.ultra_as.schema.BasicData.Location> {
	
	
	@Resource
	private INNGAodbService<String, Airport> airportService;
	
	@Resource
	private INNGAodbService<SectorCode, Sector> sectorService;

	@Override
	public void handle(com.ultra_as.schema.BasicData.Location ibLocation) throws Exception {
		
		Airport airport = airportService.findByID(ibLocation.getIdentification().getLocationIATACode(), Airport.class);
		if (airport == null){
			airport = new Airport();
			airport.setIATACode(ibLocation.getIdentification().getLocationIATACode());
		}
		if (ibLocation.getLocationICAOCode() != null){
			airport.setICAOCode(ibLocation.getLocationICAOCode().getValue());
		}
		if(ibLocation.getLocationDescription() != null){
			airport.setChineseName(ibLocation.getLocationDescription().getValue());
		}
		if(ibLocation.getLocationName() != null){
			airport.setEnglishName(ibLocation.getLocationName().getValue());
		}
		if (ibLocation.getFlightSectorCode() != null){
			airport.setSector(sectorService.findByID(SectorCode.valueOf(ibLocation.getFlightSectorCode().getValue().toString()), Sector.class));
		}
		if (ibLocation.getCountryCode() != null){
			airport.setCountryCode(ibLocation.getCountryCode().getValue());
		}
		if (ibLocation.getCountryName() != null){
			airport.setCountryName(ibLocation.getCountryCode().getValue());
		}
		airportService.update(airport);
	}

}
