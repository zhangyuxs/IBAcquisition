package com.airport.ais.ibacquisition.handler;

/**
 * 
 * 
 * FileName      IMessageParser.java
 * @Description  TODO �����Ľӿ� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��6��10��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��6��10��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

public interface IMessageHandler<E> {

	/**
	 * ����XML�ļ��ķ��� 
	 * @param message
	 * @throws Exception 
	 */
	public void handle(E ibObject) throws Exception;
}
