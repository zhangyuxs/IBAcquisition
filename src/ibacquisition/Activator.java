package ibacquisition;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "IBAcquisition"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * Spring容器的CTX
	 */
	private AbstractApplicationContext ctx;
	
	/**
	 * 初始化Srping容器的ctx
	 */
	private void initContext() {
		// TODO Auto-generated method stub
		//更换ClassLoader
		 ClassLoader oldLoader = Thread.currentThread().getContextClassLoader();
	        try {
	            Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
	            this.ctx = new ClassPathXmlApplicationContext("/BeansXml/ApplicationContext-*.xml");

	            
	        } finally {
	            Thread.currentThread().setContextClassLoader(oldLoader);
	        }
		
	}
	
	/**
	 * The constructor
	 */
	public Activator() {
	}
	
	/**
	 * @return the ctx
	 */
	public AbstractApplicationContext getCtx() {
		return ctx;
		
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		initContext();    
	}


	
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
