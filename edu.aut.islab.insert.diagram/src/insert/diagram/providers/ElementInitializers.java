/*
 * 
 */
package insert.diagram.providers;

import insert.diagram.part.InsertDiagramEditorPlugin;

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
		ElementInitializers cached = InsertDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			InsertDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
