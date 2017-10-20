package com.airport.ais.ibacquisition.view;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Group;
import org.eclipse.wb.swt.SWTResourceManager;
import org.springframework.stereotype.Component;



@Component
public class StatusView extends ViewPart {
	
	protected  Label lbAFDS ;
	
	protected  Label lbRDDS;
	
	protected  Label lbBDDS;
	
	protected  Label lbSFDS;
	
	private Label lblAfus;
	private Label lblAfrs;
	private Label lblPars;
	private Label lblRdus;
	private Label lblWdds;
	private Label lblXfds;
	private Label lblXfus;
	
	
	public StatusView() {
	}
	
	public static final String ID = "statusView";
	
	

	@Override
	public void createPartControl(Composite arg0) {
		arg0.setLayout(new GridLayout(1, false));
		
		Group grpStatus = new Group(arg0, SWT.NONE);
		grpStatus.setText("\u8BA2\u9605\u72B6\u6001");
		GridData gd_grpStatus = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_grpStatus.heightHint = 58;
		grpStatus.setLayoutData(gd_grpStatus);
		
	    lbAFDS = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
	    lbAFDS.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lbAFDS.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbAFDS.setBounds(49, 29, 87, 25);
		lbAFDS.setText("AFDS");
		
		lbRDDS = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
		lbRDDS.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lbRDDS.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbRDDS.setText("RDDS");
		lbRDDS.setBounds(49, 83, 87, 25);
		
		lbBDDS = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
		lbBDDS.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lbBDDS.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbBDDS.setText("BDDS");
		lbBDDS.setBounds(49, 137, 87, 25);
		
		  
		
		lbSFDS = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
		lbSFDS.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lbSFDS.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbSFDS.setText("SFDS");
		lbSFDS.setBounds(49, 191, 87, 25);
		
		lbAFDS.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lbBDDS.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lbRDDS.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lbSFDS.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		
		lblAfus = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
		lblAfus.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lblAfus.setText("AFUS");
		lblAfus.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblAfus.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblAfus.setBounds(49, 245, 87, 25);
		
		lblAfrs = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
		lblAfrs.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lblAfrs.setText("AFRS");
		lblAfrs.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblAfrs.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblAfrs.setBounds(49, 299, 87, 25);
		
		lblPars = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
		lblPars.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lblPars.setText("PARS");
		lblPars.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblPars.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblPars.setBounds(49, 353, 87, 25);
		
		lblRdus = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
		lblRdus.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lblRdus.setText("RDUS");
		lblRdus.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblRdus.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblRdus.setBounds(49, 407, 87, 25);
		
		lblWdds = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
		lblWdds.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lblWdds.setText("WDDS");
		lblWdds.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblWdds.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblWdds.setBounds(49, 461, 87, 25);
		
		lblXfds = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
		lblXfds.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lblXfds.setText("XFDS");
		lblXfds.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblXfds.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblXfds.setBounds(49, 515, 87, 25);
		
		lblXfus = new Label(grpStatus, SWT.BORDER | SWT.CENTER);
		lblXfus.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.NORMAL));
		lblXfus.setText("XFUS");
		lblXfus.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblXfus.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		lblXfus.setBounds(49, 569, 87, 25);
	}
	
	public void setDispInterfaceUp(String subscriptionType,boolean interfaceUp){
		Display.getDefault().syncExec(new Runnable(){
			@Override
			public void run() {
				if (interfaceUp){
					switch (subscriptionType) {
					case "AFDS":
						lbAFDS.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
						break;
					case "BDDS":
						lbBDDS.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
						break;
					case "RDDS":
						lbRDDS.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
						break;
					case "SFDS":
						lbSFDS.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
						break;

					}
				}else{
					
					switch (subscriptionType) {
					case "AFDS":
						lbAFDS.setBackground(SWTResourceManager.getColor(220, 20, 60));
						break;
					case "BDDS":
						lbBDDS.setBackground(SWTResourceManager.getColor(220, 20, 60));
						break;
					case "RDDS":
						lbRDDS.setBackground(SWTResourceManager.getColor(220, 20, 60));
						break;
					case "SFDS":
						lbSFDS.setBackground(SWTResourceManager.getColor(220, 20, 60));
						break;

					}
				}
			}
			
		});
		
	}
	
	
	
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
}
