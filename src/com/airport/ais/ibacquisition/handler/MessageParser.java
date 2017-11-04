package com.airport.ais.ibacquisition.handler;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.airport.ais.ibacquisition.utils.Utils;
import com.airport.ais.models.collection.IBMessage;
import com.airport.ais.service.IGeneralService;
import com.airport.ais.utils.DateTimeUtil;

/**
 * FileName      MessageParser.java
 * @Description  TODO  ���������ߣ�����ת��IB��Message��ת��Ϊ��Ӧ�Ķ���
 * �������ý��д���
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��6��10��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��6��10��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class MessageParser  {
	
	
	
    @Resource
    private IGeneralService<Integer, IBMessage> ibMessageService;
    
    /**
     * �ж϶�������͵��ֶ���
     */
    private static final String Message_Type            = "MessageType";
   
    private static final String MessageSentDateTime     = "MessageSentDateTime";
    
    private static final String MessageSequenceNumber   = "MessageSequenceNumber";
    
    private static final String SourceSystemID          = "SourceSystemID";
    
    private static final String DestinationSystemID     = "DestinationSystemID";
    
    private static final String MessageOriginatorID     = "MessageOriginatorID";
    
    private static final String OriginatorDateTime      = "OriginatorDateTime";
	

	/**
	 * ������Ϣ����
	 * @param message     �账�����Ϣ
	 * @throws Exception 
	 */
	public void parse(String message) throws Exception{
		
	    IBMessage ibMessage = new IBMessage();
	    ibMessage.setMessageType(Utils.extractElementValueFromMessage(Message_Type, message));
	    ibMessage.setDestinationSystemID(Utils.extractElementValueFromMessage(DestinationSystemID,message));
	    ibMessage.setMessageOriginatorID(Utils.extractElementValueFromMessage(MessageOriginatorID,message));
	    ibMessage.setSourceSystemID(Utils.extractElementValueFromMessage(SourceSystemID,message));
	    ibMessage.setMessageSequenceNumber(Integer.valueOf(Utils.extractElementValueFromMessage(MessageSequenceNumber,message)));
	    ibMessage.setMessageSentDateTime(DateTimeUtil.strToDate(Utils.extractElementValueFromMessage(MessageSentDateTime, message)));
	    ibMessage.setOriginatorDateTime(DateTimeUtil.strToDate(Utils.extractElementValueFromMessage(OriginatorDateTime, message)));
	    ibMessage.setContent(message);
	    ibMessage.setProcessed(false);
		ibMessageService.add(ibMessage);
		
	}
	
	
}
