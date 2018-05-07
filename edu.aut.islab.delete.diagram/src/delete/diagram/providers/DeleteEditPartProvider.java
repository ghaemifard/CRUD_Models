/*
 * 
 */
package delete.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import delete.diagram.edit.parts.DeleteEditPartFactory;
import delete.diagram.edit.parts.DeleteSurfaceEditPart;
import delete.diagram.part.DeleteVisualIDRegistry;

/**
 * @generated
 */
public class DeleteEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DeleteEditPartProvider() {
		super(new DeleteEditPartFactory(), DeleteVisualIDRegistry.TYPED_INSTANCE, DeleteSurfaceEditPart.MODEL_ID);
	}

}
