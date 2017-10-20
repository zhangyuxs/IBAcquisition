package com.airport.ais.ibacquisition.message;

import java.util.ResourceBundle;

import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.stereotype.Component;
import com.ultra_as.schema.RDDSCancelSubscription;
import com.ultra_as.schema.RDDSStatusRequest;
import com.ultra_as.schema.RDDSSubscriptionRequest;
import com.ultra_as.schema.ResourceDataCategory;

/**
 * 
 * 
 * FileName      RDDSMessageGenerator.java
 * @Description  TODO 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年6月1日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年6月1日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */
@Component
public class RDDSMessageGenerator extends MessageGenerator {



	public RDDSMessageGenerator() {
		super();
		SubscriptionPROPS = ResourceBundle.getBundle("resource.rddsSubscription");
	}

	
	@Override
	public void setSubscriptionCategory(String cateogory){
		RDDSSubscriptionRequest rddsSubscriptionRequest = (RDDSSubscriptionRequest) subscriptionRequest;
		rddsSubscriptionRequest.setResourceDataCategory(ResourceDataCategory.fromValue(cateogory));
	}
	
	@Override
	protected Object getStatusRequest(XMLGregorianCalendar calendar) {
		RDDSStatusRequest rddsStatusRequest = objectFactory.createRDDSStatusRequest();
		if (calendar != null){
			rddsStatusRequest.setDateTimeStatusRequestSent(objectFactory.createRDDSStatusRequestDateTimeStatusRequestSent(calendar));
		}
		return rddsStatusRequest;
	}

	@Override
	protected Object getCancelSubscription(XMLGregorianCalendar calendar) {
		RDDSCancelSubscription rddsCancelSubscription = objectFactory.createRDDSCancelSubscription();
		if (calendar != null){
			rddsCancelSubscription.setDateTimeSubscriptionCancelled(objectFactory.createRDDSCancelSubscriptionDateTimeSubscriptionCancelled(calendar));
		}
		return rddsCancelSubscription;
	}

	@Override
	protected Object getSubscriptionRequest() {
		
		return objectFactory.createRDDSSubscriptionRequest();
	}

}
