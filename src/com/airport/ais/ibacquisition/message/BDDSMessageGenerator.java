package com.airport.ais.ibacquisition.message;

import java.util.ResourceBundle;
import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.stereotype.Component;
import com.ultra_as.schema.BDDSCancelSubscription;
import com.ultra_as.schema.BDDSStatusRequest;
import com.ultra_as.schema.BDDSSubscriptionRequest;
import com.ultra_as.schema.BasicDataCategory;

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
public class BDDSMessageGenerator extends MessageGenerator {
	
	



	public BDDSMessageGenerator() {
		super();
		SubscriptionPROPS = ResourceBundle.getBundle("resource.bddsSubscription");
	}
	
	@Override
	public void setSubscriptionCategory(String cateogory){
		BDDSSubscriptionRequest bddsSubscriptionRequest = (BDDSSubscriptionRequest) subscriptionRequest;
		bddsSubscriptionRequest.setBasicDataCategory(BasicDataCategory.fromValue(cateogory));
	}

	@Override
	protected Object getStatusRequest(XMLGregorianCalendar calendar) {
		BDDSStatusRequest bddsStatusRequest = objectFactory.createBDDSStatusRequest();
		if (calendar != null){
			bddsStatusRequest.setDateTimeStatusRequestSent(objectFactory.createBDDSStatusRequestDateTimeStatusRequestSent(calendar));
		}
		return bddsStatusRequest;
	}

	@Override
	protected Object getCancelSubscription(XMLGregorianCalendar calendar)  {
		BDDSCancelSubscription bddsCancelSubscription = objectFactory.createBDDSCancelSubscription();
		if (calendar != null){
			bddsCancelSubscription.setDateTimeSubscriptionCancelled(objectFactory.createBDDSCancelSubscriptionDateTimeSubscriptionCancelled(calendar));
		}
		return bddsCancelSubscription;
	}

	@Override
	protected Object getSubscriptionRequest() {
		
		return objectFactory.createBDDSSubscriptionRequest();
	}

}
