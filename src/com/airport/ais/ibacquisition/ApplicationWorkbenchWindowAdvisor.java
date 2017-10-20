package com.airport.ais.ibacquisition;

import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import com.airport.ais.ibacquisition.handler.MessageHandler;
import com.airport.ais.ibacquisition.service.MessageService;

import ibacquisition.Activator;



public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {
	
	private void messageServiceStart(){
		MessageService AFDSmessageService = (MessageService) Activator.getDefault().getCtx().getBean("AFDSMessageService");
		MessageService BDDSmessageService = (MessageService) Activator.getDefault().getCtx().getBean("BDDSMessageService");
		//MessageService RDDSmessageService = (MessageService) Activator.getDefault().getCtx().getBean("RDDSMessageService");
		//MessageService SFDSmessageService = (MessageService) Activator.getDefault().getCtx().getBean("SFDSMessageService");
		MessageHandler messageHandler = (MessageHandler) Activator.getDefault().getCtx().getBean("messageHandler");
		AFDSmessageService.start();
		BDDSmessageService.start();
		messageHandler.start();
//		RDDSmessageService.start();
//		SFDSmessageService.start();
	}

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }
    
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        configurer.setShowMenuBar(true);
		configurer.setShowCoolBar(true);
		configurer.setShowPerspectiveBar(true);
		configurer.setShowProgressIndicator(true);
		configurer.setShowStatusLine(true);
		
    }

	
	@Override
	public void postWindowOpen() {
		messageServiceStart();
		super.postWindowOpen();
	}
    
    
    
}
