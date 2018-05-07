/*
* 
*/
package query.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import query.diagram.edit.commands.CallQuerySurface2CreateCommand;
import query.diagram.edit.commands.FieldCreateCommand;
import query.diagram.edit.commands.FunctionCreateCommand;
import query.diagram.edit.commands.InputCreateCommand;
import query.diagram.edit.commands.LiteralCreateCommand;
import query.diagram.edit.commands.NullLiteralCreateCommand;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class CallQuerySurfaceCallQuerySurfaceParamsCompartment3ItemSemanticEditPolicy
		extends QueryBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CallQuerySurfaceCallQuerySurfaceParamsCompartment3ItemSemanticEditPolicy() {
		super(QueryElementTypes.CallQuerySurface_3016);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QueryElementTypes.CallQuerySurface_3005 == req.getElementType()) {
			return getGEFWrapper(new CallQuerySurface2CreateCommand(req));
		}
		if (QueryElementTypes.Field_3006 == req.getElementType()) {
			return getGEFWrapper(new FieldCreateCommand(req));
		}
		if (QueryElementTypes.Literal_3007 == req.getElementType()) {
			return getGEFWrapper(new LiteralCreateCommand(req));
		}
		if (QueryElementTypes.NullLiteral_3008 == req.getElementType()) {
			return getGEFWrapper(new NullLiteralCreateCommand(req));
		}
		if (QueryElementTypes.Function_3009 == req.getElementType()) {
			return getGEFWrapper(new FunctionCreateCommand(req));
		}
		if (QueryElementTypes.Input_3010 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
