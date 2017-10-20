package com.airport.ais.ibacquisition.test;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.airport.ais.ibacquisition.message.AFDSMessageGenerator;
import com.ultra_as.schema.BasicData;

public class MessageServiceTest {
	
	private AbstractApplicationContext ctx;
	

	@Before
	public void setUp() throws Exception {
		
		ctx = new ClassPathXmlApplicationContext("/BeansXml/ApplicationContext-*.xml");
	}

	@Test
	public void testStart() throws Exception {
		AFDSMessageGenerator messageGenerator =(com.airport.ais.ibacquisition.message.AFDSMessageGenerator) ctx.getBean("AFDSMessageGenerator");
		System.out.println(messageGenerator.generateSubscriptionRequestMessage(null));
	}

}
