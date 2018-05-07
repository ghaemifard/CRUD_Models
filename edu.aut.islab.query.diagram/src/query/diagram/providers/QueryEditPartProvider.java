/*
 * 
 */
package query.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import query.diagram.edit.parts.QueryEditPartFactory;
import query.diagram.edit.parts.QuerySurfaceEditPart;
import query.diagram.part.QueryVisualIDRegistry;

/**
 * @generated
 */
public class QueryEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public QueryEditPartProvider() {
		super(new QueryEditPartFactory(), QueryVisualIDRegistry.TYPED_INSTANCE, QuerySurfaceEditPart.MODEL_ID);
	}

}
