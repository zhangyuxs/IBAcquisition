package com.airport.ais.ibacquisition.handler;

/**
 * 
 * 
 * FileName      IMessageParser.java
 * @Description  TODO 解析的接口 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年6月10日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年6月10日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

public interface IMessageHandler<E> {

	/**
	 * 解析XML文件的方法 
	 * @param message
	 * @throws Exception 
	 */
	public void handle(E ibObject) throws Exception;
}
