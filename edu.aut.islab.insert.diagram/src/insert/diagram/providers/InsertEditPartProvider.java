/*
 * 
 */
package insert.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import insert.diagram.edit.parts.InsertEditPartFactory;
import insert.diagram.edit.parts.InsertSurfaceEditPart;
import insert.diagram.part.InsertVisualIDRegistry;

/**
 * @generated
 */
public class InsertEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public InsertEditPartProvider() {
		super(new InsertEditPartFactory(), InsertVisualIDRegistry.TYPED_INSTANCE, InsertSurfaceEditPart.MODEL_ID);
	}

}
