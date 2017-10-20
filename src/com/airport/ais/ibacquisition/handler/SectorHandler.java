package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.airport.ais.enums.aodb.SectorCode;
import com.airport.ais.models.aodb.basic.Sector;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      SectorHandler.java
 * @Description  TODO ����IB Message�Ĵ�����
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��7��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��7��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class SectorHandler implements IMessageHandler<com.ultra_as.schema.BasicData.FlightSector> {
	
	@Resource
	private INNGAodbService<SectorCode, Sector> sectorService;

	@Override
	public void handle(com.ultra_as.schema.BasicData.FlightSector ibSector) throws Exception {
		Sector sector = sectorService.findByID(SectorCode.valueOf(ibSector.getIdentification().getFlightSectorCode().toString()), Sector.class);
		if (sector == null){
			sector = new Sector();
			sector.setSectorCode(
					SectorCode.valueOf(ibSector.getIdentification().getFlightSectorCode().toString()));
		}
		
		if (ibSector.getFlightSectorDescription() != null){
			sector.setEnglishDescription(ibSector.getFlightSectorDescription().getValue());
		}
		sectorService.update(sector);
	}

}
