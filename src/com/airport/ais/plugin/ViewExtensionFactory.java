package com.airport.ais.plugin;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.ui.part.ViewPart;

import ibacquisition.Activator;





/**
 * 用于从Spring容器中取得Spring管理的View和首选项
 * @author ZhangYu
 * @version 0.9a 28/06/14
 * @since JDK 1.6
 *
 */



public class ViewExtensionFactory implements IExecutableExtensionFactory,
		IExecutableExtension {
	
	private Object obj;
	
	private String extensionType;

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		// TODO Auto-generated method stub
		//取得创建的类型
		
		extensionType = config.getName();
		this.obj = Activator.getDefault().getCtx().getBean(config.getAttribute("id"));
		if (extensionType.equals("view")){
			((ViewPart)this.obj).setInitializationData(config, propertyName, data);
		}
	}

	@Override
	public Object create() throws CoreException {
		// TODO Auto-generated method stub
		
		return this.obj;
	}

}
