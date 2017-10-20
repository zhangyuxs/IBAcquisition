package com.airport.ais.ibacquisition.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.airport.ais.ibacquisition.view.MessageContentView;
import com.airport.ais.ibacquisition.view.MessageDBView;
import com.airport.ais.ibacquisition.view.MessageInView;
import com.airport.ais.ibacquisition.view.MessageOutView;
import com.airport.ais.ibacquisition.view.StatusView;



/**
 * 
 * FileName      MessagePerspective.java
 * @Description  TODO  ������ͼ
 * @author       ZhangYu    Company:    LZAirport
 * @version      V0.9a CreateDate: 2017��5��25��
 * @ModificationHistory
 * Date         Author     Version   Description
 * <p>---------------------------------------------
 * <p>2017��5��25��      ZhangYu    1.0        1.0
 * <p>Why & What is modified: <�޸�ԭ������>
 */
public class MessagePerspective implements IPerspectiveFactory {

	public static final String ID = "MessagePerspective";
	
	@Override
	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub

		layout.setEditorAreaVisible(false);
		layout.addView(StatusView.ID,  IPageLayout.LEFT, 0.1f, IPageLayout.ID_EDITOR_AREA);
		layout.addView(MessageDBView.ID, IPageLayout.RIGHT, 0.05f, IPageLayout.ID_EDITOR_AREA);	
		IFolderLayout lfBottom = layout.createFolder("folder_Bottom", IPageLayout.BOTTOM, 0.76f, MessageDBView.ID);
		lfBottom.addView(MessageInView.ID);
		lfBottom.addView(MessageOutView.ID);
		IFolderLayout lfRight = layout.createFolder("folder_Right", IPageLayout.RIGHT, 0.66f, MessageDBView.ID);
		lfRight.addView(MessageContentView.ID);

	}

}
