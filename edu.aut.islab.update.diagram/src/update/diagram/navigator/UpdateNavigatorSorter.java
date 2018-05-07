/*
* 
*/
package update.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import update.diagram.part.UpdateVisualIDRegistry;

/**
 * @generated
 */
public class UpdateNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7015;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7014;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof UpdateNavigatorItem) {
			UpdateNavigatorItem item = (UpdateNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return UpdateVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
