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
 * @Description  TODO ������Ϣ���ݵĴ����� 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��7��6��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��7��6��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */

@Component
public class BDDSBasicDataMessageHandler implements IMessageHandler<BDDSBasicData> {
	
	/**
	 * ����ĺ�׺��
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
					 * �ϳɴ����ߵ�����
					 * 1��get������getȥ��
					 * 1����ڶ�����ĸ�Ǵ�д���򱣳�beanName���䣬���� CAACDelay
					 * 2������Ҫ����һ����ĸ��ΪСдterminal
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
							 * ���ô�����Ϊû�б�д��Ӧ�Ĵ�����
							 */
						}
					}
				}
			}
		}
	}

}
