package com.airport.ais.ibacquisition.message;

import java.util.ResourceBundle;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Component;

import com.ultra_as.schema.SFDSCancelSubscription;
import com.ultra_as.schema.SFDSStatusRequest;

/**
 * 
 * 
 * FileName      AFDSMessageGenerator.java
 * @Description  TODO 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年5月29日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年5月29日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */

@Component
public class SFDSMessageGenerator extends MessageGenerator {
	
	



	public SFDSMessageGenerator() {
		super();
		SubscriptionPROPS = ResourceBundle.getBundle("resource.sfdsSubscription");
	}

	@Override
	protected Object getStatusRequest(XMLGregorianCalendar calendar) {
		SFDSStatusRequest sfdsStatusRequest = objectFactory.createSFDSStatusRequest();
		if (calendar != null){
			sfdsStatusRequest.setDateTimeStatusRequestSent(objectFactory.createSFDSStatusRequestDateTimeStatusRequestSent(calendar));
		}
		return sfdsStatusRequest;
	}

	@Override
	protected Object getCancelSubscription(XMLGregorianCalendar calendar)  {
		SFDSCancelSubscription sfdsCancelSubscription = objectFactory.createSFDSCancelSubscription();
		if (calendar != null){
			sfdsCancelSubscription.setDateTimeSubscriptionCancelled(objectFactory.createSFDSCancelSubscriptionDateTimeSubscriptionCancelled(calendar));
		}
		return sfdsCancelSubscription;
	}

	@Override
	protected Object getSubscriptionRequest() {
		// TODO Auto-generated method stub
		return objectFactory.createSFDSScheduleRequest();
	}

	@Override
	public void setSubscriptionCategory(String cateogory) {
		// SFDS 不进行处理
		
	}

}
