package com.airport.ais.ibacquisition.message;

import java.io.IOException;
import java.util.Date;

/**
 * FileName      IMessageGenerator.java
 * @Description  TODO ��Ϣ�������Ľӿ�   
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��5��29��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��5��29��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */


public interface IMessageGenerator {

	
	/**
	 * ����ȡ�����ĵ�XML��Ϣ
	 * @return
	 * @throws IOException
	 */
	String generateCancelSubscriptionMessage(Date time) throws Exception;

	/**
	 * ���ɶ���������XML��Ϣ
	 * @return
	 * @throws IOException
	 */
	String generateStatusRequestMessage(Date time) throws Exception;

	/**
	 * ���ɶ��ĵ�XML��Ϣ
	 * @return
	 * @throws IOException
	 */
	String generateSubscriptionRequestMessage(Date time) throws Exception;
	
	/**
	 * ���ݴ�������ȷ����������
	 * @param cateogory
	 */
	void setSubscriptionCategory(String category);
	

}