/*
 * 
 */
package query.diagram.providers;

import query.diagram.part.QueryDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = QueryDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			QueryDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
