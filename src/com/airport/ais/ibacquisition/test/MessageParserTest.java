package com.airport.ais.ibacquisition.test;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.airport.ais.dao.parameter.QueryCondition;
import com.airport.ais.ibacquisition.handler.AFDSFlightDataMessageHandler;
import com.airport.ais.ibacquisition.handler.MessageParser;
import com.airport.ais.models.collection.IBMessage;
import com.airport.ais.service.IGeneralService;
import com.airport.ais.utils.DateTimeUtil;
import com.ultra_as.schema.AFDSFlightData;
import com.ultra_as.schema.Envelope;

public class MessageParserTest {
	
	private String message;
	private ClassPathXmlApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
//		File file = new File("D:/ENVELOPE.xml");
//		StringBuilder builder = new StringBuilder();
//        BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
//        String s = null;
//        while((s = br.readLine())!=null){//使用readLine方法，一次读一行
//           	builder.append(s);
//           	System.out.println(s);
//        }
//        br.close();
//        message = builder.toString();
       // ctx = new ClassPathXmlApplicationContext("/BeansXml/ApplicationContext-*.xml");
		
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test() throws Exception {
//		MessageParser messageParser = (MessageParser) ctx.getBean("messageParser");
//		IGeneralService<Integer, IBMessage> messageService = (IGeneralService<Integer, IBMessage>) ctx.getBean("generalService");
		
//		IBMessage ibMessage = messageService.findByID(77019, IBMessage.class);
//		System.out.println(ibMessage.getContent());
//		 Envelope envelope = messageParser.convertMessageOjbect(ibMessage.getContent());
//		 AFDSFlightDataMessageHandler messageHandler = (AFDSFlightDataMessageHandler) ctx.getBean("AFDSFlightDataMessageHandler");
//		 messageHandler.handle((AFDSFlightData) envelope.getBody().getAny());
		
	
		
		System.out.println(DateTimeUtil.strToDate("2017-07-19T22:41:49.173+08:00"));
		
//		QueryCondition condition = new QueryCondition();
//		condition.setExpression(new Object[]{IBMessage.MESSAGETYPE,"=","AFDSFlightData","AND",IBMessage.ID,">=",1});
//		List<IBMessage> messages = messageService.findByConditionAll(condition, IBMessage.class);
//		for(IBMessage message:messages){
//			 System.out.println(message.getMessageSequenceNumber()+" "+message.getMessageSentDateTime().toString());
//			 Envelope envelope = messageParser.convertMessageOjbect(message.getContent());
//			 AFDSFlightDataMessageHandler messageHandler = (AFDSFlightDataMessageHandler) ctx.getBean("AFDSFlightDataMessageHandler");
//			 messageHandler.handle((AFDSFlightData) envelope.getBody().getAny());
//		}
//	   
	}

}
