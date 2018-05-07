/*
* 
*/
package delete.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import delete.diagram.part.DeleteVisualIDRegistry;

/**
 * @generated
 */
public class DeleteNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7028;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7027;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof DeleteNavigatorItem) {
			DeleteNavigatorItem item = (DeleteNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return DeleteVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
