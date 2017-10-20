package com.airport.ais.ibacquisition.view;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.springframework.stereotype.Component;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;



@Component
public class MessageContentView extends ViewPart {
	public MessageContentView() {
	}

	public static final String ID = "messageContentView";
	
	private Text txtContent;
	
	@Override
	public void createPartControl(Composite arg0) {
		arg0.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		txtContent = new Text(arg0, SWT.BORDER);
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
