/*
* 
*/
package query.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import query.diagram.part.QueryVisualIDRegistry;

/**
 * @generated
 */
public class QueryNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7016;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7015;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof QueryNavigatorItem) {
			QueryNavigatorItem item = (QueryNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return QueryVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
