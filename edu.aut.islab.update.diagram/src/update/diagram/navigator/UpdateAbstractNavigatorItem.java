/*
* 
*/
package update.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * @generated
 */
public abstract class UpdateAbstractNavigatorItem extends PlatformObject {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { ITabbedPropertySheetPageContributor.class };
		final ITabbedPropertySheetPageContributor propertySheetPageContributor = new ITabbedPropertySheetPageContributor() {
			public String getContributorId() {
				return "edu.aut.islab.update.diagram"; //$NON-NLS-1$
			}
		};
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof update.diagram.navigator.UpdateAbstractNavigatorItem
						&& adapterType == ITabbedPropertySheetPageContributor.class) {
					return propertySheetPageContributor;
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, update.diagram.navigator.UpdateAbstractNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private Object myParent;

	/**
	* @generated
	*/
	protected UpdateAbstractNavigatorItem(Object parent) {
		myParent = parent;
	}

	/**
	* @generated
	*/
	public Object getParent() {
		return myParent;
	}

}
