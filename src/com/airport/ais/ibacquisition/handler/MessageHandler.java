package com.airport.ais.ibacquisition.handler;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Component;

import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.models.collection.IBMessage;
import com.airport.ais.service.IGeneralService;
import com.ultra_as.schema.Envelope;


/**
 * 
 * 
 * FileName      MessageHandler.java
 * @Description  TODO 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��8��1��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��8��1��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class MessageHandler  extends Thread{
	
	@Resource
	private IGeneralService<Integer, IBMessage> ibMessageService;
	/**
     *  ���������ǰ׺
     */
    private static final String COM_ULTRA_AS_SCHEMA = "com.ultra_as.schema.";
    
    /**
     * �ж϶�������͵��ֶ���
     */
    private static final String Message_Type = "MessageType";
	
	 /**
		 * ���ı���XML��ʽת��Ϊ��Ӧ�Ķ���
		 * @param message
		 * @return
		 * @throws IBException 
		 */
	    
	public  Envelope  convertMessageOjbect(String message) throws Exception{
			/*������Ϣ�����ͣ����÷��似��ת���ɶ�Ӧ����*/
		String messageType = Utils.extractElementValueFromMessage(Message_Type, message);
		Class<?> clazz = Class.forName(COM_ULTRA_AS_SCHEMA+messageType);
			
		/*��JAXB����ת��Ϊ��Ӧ�Ķ���*/
			
		InputStream is =  new   ByteArrayInputStream(message.getBytes("UTF-8"));
        JAXBContext jc = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        JAXBElement<?> jaxbElement = (JAXBElement<?>) unmarshaller.unmarshal(is);
        Envelope envelope = (Envelope)jaxbElement.getValue();
		return envelope;
	}

	@Override
	public void run() {
		while (true){
			
			int noProcessedMessage = 0;
			try {
				List<IBMessage> ibMessages = ibMessageService.findByFieldAll(IBMessage.PROCESSED,false,IBMessage.class);
				noProcessedMessage = ibMessages.size();
				for (IBMessage ibMessage:ibMessages){
					ibMessage.setProcessed(true);
					ibMessageService.update(ibMessage);
					
					Envelope envelope = convertMessageOjbect(ibMessage.getContent());
					/*
					 *   ��ȡ��Ӧ�Ĵ�������д��� 
					 */
					IMessageHandler<Object> handler = HandlerFactory.getHandler(ibMessage.getMessageType());
					if (handler != null){
						handler.handle(envelope.getBody().getAny());
					}
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (noProcessedMessage == 0){
				Utils.sleepThread(1);
			}
			
		}
		
	}
	
	

}
