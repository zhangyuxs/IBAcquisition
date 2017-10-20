package com.airport.ais.ibacquisition.message;

import java.util.ResourceBundle;
import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.stereotype.Component;
import com.ultra_as.schema.AFDSCancelSubscription;
import com.ultra_as.schema.AFDSStatusRequest;

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
public class AFDSMessageGenerator extends MessageGenerator {

	public AFDSMessageGenerator() {
		super();
		SubscriptionPROPS = ResourceBundle.getBundle("resource.afdsSubscription");
	}

	@Override
	protected Object getStatusRequest(XMLGregorianCalendar calendar) {
		AFDSStatusRequest afdsStatusRequest = objectFactory.createAFDSStatusRequest();
		if (calendar != null){
			afdsStatusRequest.setDateTimeStatusRequestSent(objectFactory.createAFDSStatusRequestDateTimeStatusRequestSent(calendar));
		}
		return afdsStatusRequest;
	}

	@Override
	protected Object getCancelSubscription(XMLGregorianCalendar calendar)  {
		AFDSCancelSubscription afdsCancelSubscription = objectFactory.createAFDSCancelSubscription();
		if (calendar != null){
			afdsCancelSubscription.setDateTimeSubscriptionCancelled(objectFactory.createAFDSCancelSubscriptionDateTimeSubscriptionCancelled(calendar));
		}
		return afdsCancelSubscription;
	}



	@Override
	protected Object getSubscriptionRequest() {
		
		return objectFactory.createAFDSSubscriptionRequest();
	}

	@Override
	public void setSubscriptionCategory(String cateogory) {
		// AFDS不进行处理
		
	}

}
