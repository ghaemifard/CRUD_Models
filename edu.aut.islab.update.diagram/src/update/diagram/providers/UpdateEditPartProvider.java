/*
 * 
 */
package update.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import update.diagram.edit.parts.UpdateEditPartFactory;
import update.diagram.edit.parts.UpdateSurfaceEditPart;
import update.diagram.part.UpdateVisualIDRegistry;

/**
 * @generated
 */
public class UpdateEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public UpdateEditPartProvider() {
		super(new UpdateEditPartFactory(), UpdateVisualIDRegistry.TYPED_INSTANCE, UpdateSurfaceEditPart.MODEL_ID);
	}

}
