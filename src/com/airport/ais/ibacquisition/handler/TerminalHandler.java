package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.airport.ais.dao.parameter.QueryCondition;
import com.airport.ais.models.aodb.basic.Airport;
import com.airport.ais.models.aodb.basic.Terminal;
import com.airport.ais.service.INNGAodbService;

/**
 * 
 * 
 * FileName      TerminalHandler.java
 * @Description  TODO 航站楼 IB Message 处理者 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月7日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月7日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */



@Component
public class TerminalHandler implements IMessageHandler<com.ultra_as.schema.BasicData.Terminal> {
	
	@Resource
	
	private INNGAodbService<String, Terminal> terminalService;
	@Resource
	private INNGAodbService<String, Airport> airportService;

	@Override
	public void handle(com.ultra_as.schema.BasicData.Terminal ibTerminal) throws Exception {
		Airport airport = airportService.findByID(ibTerminal.getAirportIATACode(), Airport.class);
		QueryCondition condition = new QueryCondition();
		condition.setExpression(new Object[]{Terminal.AIRPORT,"=",airport,"AND",
				Terminal.TERMINALCODE,"=",ibTerminal.getIdentification().getTerminalCode()});
		Terminal terminal = terminalService.findByConditionSingle(condition, Terminal.class);
		if (airport != null){
			if (terminal == null){
				terminal = new Terminal();
				terminal.setAirport(airport);
				terminal.setTerminalCode(ibTerminal.getIdentification().getTerminalCode());
			}
			if (ibTerminal.getTerminalDescription() != null){
				terminal.setDescription(ibTerminal.getTerminalDescription().getValue());
			}
			terminalService.update(terminal);
		}
		
	}

}
