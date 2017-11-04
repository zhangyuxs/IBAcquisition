package com.airport.ais.ibacquisition.actions;

import javax.annotation.Resource;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.springframework.stereotype.Component;

import com.airport.ais.ibacquisition.service.NNGAommsTimerService;
import com.airport.ais.models.collection.IBMessage;
import com.airport.ais.service.IGeneralService;

/**
 * 
 * @author 2
 *
 */


@Component
public class GroundServiceAction implements IWorkbenchWindowActionDelegate {

	@Resource
	private NNGAommsTimerService aommsTimerService;
	
	@Resource
	private IGeneralService<Integer, IBMessage> generalService;
	
	@Override
	public void run(IAction arg0) {
		try {
			aommsTimerService.timerUpdateByVAommsInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
