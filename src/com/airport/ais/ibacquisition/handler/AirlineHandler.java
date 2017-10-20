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
 * @Description  TODO 航空公司IB MESSAGE 处理者
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月7日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月7日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
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
		 * 在航空公司数据库查询有无对应数据
		 */
		Airline airline = airlineService.findByID( 
				ibAirline.getIdentification().getAirlineICAOCode(), Airline.class);
		if (airline == null){
			airline = new Airline();
			airline.setICAOCode(ibAirline.getIdentification().getAirlineICAOCode());
		}
		/*
		 * 否则新建一个航空公司实体
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
		 * 更新航空公司数据
		 */
		airlineService.update(airline);
	}

}
