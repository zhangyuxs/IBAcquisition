package com.airport.ais.ibacquisition.handler;

import com.airport.ais.ibacquisition.service.MessageService;
import com.ultra_as.schema.RequestStatus;

/**
 * 
 * 
 * FileName      CancellationMessageHandler.java
 * @Description  TODO  ȡ��Response�Ĵ����� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��2��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��2��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */


public abstract class CancellationMessageHandler {

	/**
	 * ���ݷ��ص�״̬�����ж�Ӧ�Ĵ���
	 * @param requestStatus
	 */
	protected void handleCancellation(RequestStatus requestStatus){
		
		switch (requestStatus) {
		case ACCEPTED:
			getMessageService().setInterfaceUp(false);
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
	 * ��ȡ��Ӧ����Ϣ������
	 * @return the messageService
	 */
	public abstract MessageService getMessageService();

}
