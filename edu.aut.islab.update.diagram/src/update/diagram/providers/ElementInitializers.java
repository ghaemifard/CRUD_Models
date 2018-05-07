/*
 * 
 */
package update.diagram.providers;

import update.diagram.part.UpdateDiagramEditorPlugin;

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
		ElementInitializers cached = UpdateDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			UpdateDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
