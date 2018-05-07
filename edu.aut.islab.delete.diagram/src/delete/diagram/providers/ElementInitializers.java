/*
 * 
 */
package delete.diagram.providers;

import delete.diagram.part.DeleteDiagramEditorPlugin;

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
		ElementInitializers cached = DeleteDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			DeleteDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
