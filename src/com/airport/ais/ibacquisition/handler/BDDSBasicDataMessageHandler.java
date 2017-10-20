package com.airport.ais.ibacquisition.handler;

import java.lang.reflect.Method;

import org.springframework.stereotype.Component;

import com.ultra_as.schema.BDDSBasicData;
import com.ultra_as.schema.BasicData;

import ibacquisition.Activator;

/**
 * 
 * 
 * FileName      BasicDataMessageHandler.java
 * @Description  TODO 基础信息数据的处理者 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月6日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月6日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

@Component
public class BDDSBasicDataMessageHandler implements IMessageHandler<BDDSBasicData> {
	
	/**
	 * 处理的后缀名
	 */
	private static final String sufix = "Handler";
	

	@Override
	@SuppressWarnings("unchecked")
	public void handle(BDDSBasicData bddsBasicData ) throws Exception {
		BasicData basicData = bddsBasicData.getBasicData();
		
		if (basicData != null){
			for(Method m:basicData.getClass().getDeclaredMethods()){
				if (m.getName().indexOf("get") != -1){
					/*
					 * 合成处理者的名字
					 * 1将get方法的get去掉
					 * 1如果第二个字母是大写，则保持beanName不变，例如 CAACDelay
					 * 2否则需要将第一个字母变为小写terminal
					 */
					String beanName = m.getName().substring(3)+sufix;
					if (Character.isLowerCase(beanName.charAt(1))){
						beanName = beanName.substring(0,1).toLowerCase()+beanName.substring(1);
					}
					Object ibObject = m.invoke(basicData);
					
					if (ibObject != null){
						IMessageHandler<Object> handler;
						try {
							handler = (IMessageHandler<Object>) Activator.getDefault().getCtx().getBean(beanName);
							handler.handle(ibObject);
							
							
						} catch (Exception e) {
							/*
							 * 不用处理，因为没有编写对应的处理方法
							 */
						}
					}
				}
			}
		}
	}

}
