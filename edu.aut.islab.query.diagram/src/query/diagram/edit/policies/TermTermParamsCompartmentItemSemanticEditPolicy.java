/*
* 
*/
package query.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import query.diagram.edit.commands.CallQuerySurfaceCreateCommand;
import query.diagram.edit.commands.Field2CreateCommand;
import query.diagram.edit.commands.Function2CreateCommand;
import query.diagram.edit.commands.Input2CreateCommand;
import query.diagram.edit.commands.Literal2CreateCommand;
import query.diagram.edit.commands.NullLiteral2CreateCommand;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class TermTermParamsCompartmentItemSemanticEditPolicy extends QueryBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TermTermParamsCompartmentItemSemanticEditPolicy() {
		super(QueryElementTypes.Term_3003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QueryElementTypes.CallQuerySurface_3004 == req.getElementType()) {
			return getGEFWrapper(new CallQuerySurfaceCreateCommand(req));
		}
		if (QueryElementTypes.Field_3011 == req.getElementType()) {
			return getGEFWrapper(new Field2CreateCommand(req));
		}
		if (QueryElementTypes.Literal_3012 == req.getElementType()) {
			return getGEFWrapper(new Literal2CreateCommand(req));
		}
		if (QueryElementTypes.NullLiteral_3013 == req.getElementType()) {
			return getGEFWrapper(new NullLiteral2CreateCommand(req));
		}
		if (QueryElementTypes.Function_3014 == req.getElementType()) {
			return getGEFWrapper(new Function2CreateCommand(req));
		}
		if (QueryElementTypes.Input_3015 == req.getElementType()) {
			return getGEFWrapper(new Input2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
