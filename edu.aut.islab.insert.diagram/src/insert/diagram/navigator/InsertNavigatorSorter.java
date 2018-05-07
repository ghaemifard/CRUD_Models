/*
* 
*/
package insert.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import insert.diagram.part.InsertVisualIDRegistry;

/**
 * @generated
 */
public class InsertNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7010;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7009;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof InsertNavigatorItem) {
			InsertNavigatorItem item = (InsertNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return InsertVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
