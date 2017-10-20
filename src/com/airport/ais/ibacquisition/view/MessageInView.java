package com.airport.ais.ibacquisition.view;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.springframework.stereotype.Component;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;



@Component
public class MessageInView extends ViewPart {

	public static final String ID = "messageInView";
	
	private Text txtMessageIn;
	
	private Action displayAction;
	
	public MessageInView() {
	}
	
	@Override
	public void createPartControl(Composite composite) {
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		txtMessageIn = new Text(composite, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		/*
		 *  创建菜单
		 */
		displayAction = new Action("显示接受数据"){};
		displayAction.setChecked(false);
		IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
		menuManager.add(displayAction);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}


	public void appendMessage(String message){
		if (displayAction != null && displayAction.isChecked()){
			Display.getDefault().syncExec(new Runnable() {
			    public void run() {
			    	if (txtMessageIn != null){
			    		txtMessageIn.append(message);
			    	}
			    }
			});
		}
	}
	
}
