package com.airport.ais.ibacquisition.message;

import java.io.IOException;
import java.util.Date;

/**
 * FileName      IMessageGenerator.java
 * @Description  TODO 消息产生器的接口   
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年5月29日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年5月29日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */


public interface IMessageGenerator {

	
	/**
	 * 生成取消订阅的XML信息
	 * @return
	 * @throws IOException
	 */
	String generateCancelSubscriptionMessage(Date time) throws Exception;

	/**
	 * 生成订阅心跳的XML信息
	 * @return
	 * @throws IOException
	 */
	String generateStatusRequestMessage(Date time) throws Exception;

	/**
	 * 生成订阅的XML信息
	 * @return
	 * @throws IOException
	 */
	String generateSubscriptionRequestMessage(Date time) throws Exception;
	
	/**
	 * 根据传入的类别确定订阅类型
	 * @param cateogory
	 */
	void setSubscriptionCategory(String category);
	

}