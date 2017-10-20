package com.airport.ais.ibacquisition.handler;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.RequestStatus;

/**
 * 
 * 
 * FileName      SubscriptionResponseMessageHandler.java
 * @Description  TODO ����Response��Ϣ�Ĵ����ߵĻ���
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��6��28��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��6��28��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */
public abstract class SubscriptionResponseMessageHandler {
	
	/**
	 * ���ݷ��صĶ���״̬���ж�Ӧ�Ĵ���
	 * @param requestStatus
	 */
	protected void handleSubscriptionResponse(RequestStatus requestStatus){
		
		switch (requestStatus) {
		case ACCEPTED:
			getMessageService().setInterfaceUp(true);
			break;
		case REJECTED:
			break;
		case UNAVAILABLE:
			getMessageService().setInterfaceUp(false);
			break;

		default:
			break;
		}
	}
	
	/**
	 * 
	 * ��ȡ��Ӧ��Ϣ������
	 * @return the messageService
	 */
	public abstract MessageService getMessageService();



}
