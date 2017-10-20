package com.airport.ais.ibacquisition.handler;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.ServiceStatus;
/**
 * 
 * 
 * FileName      StatusResponseMessageHandler.java
 * @Description  TODO   ����Response�Ĵ�����
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��6��28��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��6��28��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */


public abstract class StatusResponseMessageHandler {

	
	/**
	 * ���ݷ��صķ���״̬���ж�Ӧ�Ĵ���
	 * @param serviceStatus
	 */
	protected void handleStatusResponse(ServiceStatus serviceStatus) {
		
		switch (serviceStatus) {
		
		case DOWN:
			getMessageService().setInterfaceUp(false);
			/*������ڶ�����������������Ͷ�����Ϣ*/
			if (getMessageService().isSubscription()){
				getMessageService().sendSubscriptionRequestMessage(null);
			}
			break;
		case UNAVAILABLE:
			getMessageService().setInterfaceUp(false);
			break;
		case UP:
			getMessageService().setInterfaceUp(true);
			break;
	
		}
		
	}

	/**
	 * ���ض�Ӧ����Ϣ������
	 * @return the messageService
	 */
	public abstract MessageService getMessageService();

	

	

	
}