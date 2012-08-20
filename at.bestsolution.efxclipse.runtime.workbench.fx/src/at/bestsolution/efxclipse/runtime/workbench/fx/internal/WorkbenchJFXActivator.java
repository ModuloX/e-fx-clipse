package at.bestsolution.efxclipse.runtime.workbench.fx.internal;

import org.eclipse.osgi.service.datalocation.Location;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.util.tracker.ServiceTracker;

public class WorkbenchJFXActivator implements BundleActivator {

	public static final String PI_RENDERERS = "at.bestsolution.efxclipse.runtime.workbench.fx"; //$NON-NLS-1$

	private BundleContext context;
	private ServiceTracker locationTracker;
	private static WorkbenchJFXActivator activator;
	
	/**
	 * Get the default activator.
	 * 
	 * @return a BundleActivator
	 */
	public static WorkbenchJFXActivator getDefault() {
		return activator;
	}

	/**
	 * @return this bundles context
	 */
	public BundleContext getContext() {
		return context;
	}

	public void start(BundleContext context) throws Exception {
		activator = this;
		this.context = context;
	}

	public void stop(BundleContext context) throws Exception {
		this.context = null;
		activator = null;
	}

	public Bundle getBundle() {
		if (context == null)
			return null;
		return context.getBundle();
	}

	/**
	 * @return the instance Location service
	 */
	public Location getInstanceLocation() {
		if (locationTracker == null) {
			Filter filter = null;
			try {
				filter = context.createFilter(Location.INSTANCE_FILTER);
			} catch (InvalidSyntaxException e) {
				// ignore this. It should never happen as we have tested the
				// above format.
			}
			locationTracker = new ServiceTracker(context, filter, null);
			locationTracker.open();
		}
		return (Location) locationTracker.getService();
	}
}