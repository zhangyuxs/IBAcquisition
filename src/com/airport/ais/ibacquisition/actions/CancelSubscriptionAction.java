package com.airport.ais.ibacquisition.actions;

import javax.annotation.Resource;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.springframework.stereotype.Component;

import com.airport.ais.ibacquisition.service.MessageService;

/**
 * 
 * 
 * FileName      CancelSubscriptionAction.java
 * @Description  TODO 取消订阅的Action 
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017年7月2日
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017年7月2日      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <修改原因描述>
 */


@Component
public class CancelSubscriptionAction implements IWorkbenchWindowActionDelegate {
	
	  
	
	@Resource
	private MessageService AFDSMessageService;
	
	@Resource
	private MessageService RDDSMessageService;
	
	@Resource
	private MessageService BDDSMessageService;
	
	@Resource
	private MessageService SFDSMessageService; 
	

	@Override
	public void run(IAction action) {
		MessageService  messageService = null;
		
		switch (action.getActionDefinitionId()) {
		case "AFDS":
			messageService = AFDSMessageService;
			break;
		case "RDDS":
			messageService = RDDSMessageService;
			break;
		case "BDDS":
			messageService = BDDSMessageService;
			break;
		case "SFDS":
			messageService = SFDSMessageService;
			break;
		}
		messageService.setSubscription(false);
		messageService.sendCancelSubscriptionMessage();
	}

	@Override
	public void selectionChanged(IAction arg0, ISelection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow arg0) {
		// TODO Auto-generated method stub

	}

}
