package com.airport.ais.ibacquisition.test;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.airport.ais.dao.parameter.QueryCondition;
import com.airport.ais.models.aodb.basic.AirRoute;
import com.airport.ais.models.aodb.flight.DynamicFlight;
import com.airport.ais.service.IAodbService;
import com.airport.ais.utils.DateTimeUtil;
import com.airport.ais.utils.ObjectMethodUtil;

public class AodbServiceTest {
	
	private ClassPathXmlApplicationContext ctx;
	
	private IAodbService<Integer, DynamicFlight> aodbService;
	
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext("/BeansXml/ApplicationContext-*.xml");
	}

	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void test() throws Exception   {
		 AirRoute airRoute = new AirRoute();
		 airRoute.setArrivalAirportCode("LZH");
		 System.out.println(airRoute.getClass().getField("arrivalAirportCode").get(airRoute));
	}
		
	@SuppressWarnings("unchecked")
	@Test
	public void test2() throws Exception   {
		
		 
	}
	
	
}
