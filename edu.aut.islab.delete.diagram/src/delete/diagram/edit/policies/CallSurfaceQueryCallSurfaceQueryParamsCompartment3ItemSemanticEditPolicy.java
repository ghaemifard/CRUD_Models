/*
* 
*/
package delete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import delete.diagram.edit.commands.CallSurfaceQuery2CreateCommand;
import delete.diagram.edit.commands.Field2CreateCommand;
import delete.diagram.edit.commands.FunctionCreateCommand;
import delete.diagram.edit.commands.InputCreateCommand;
import delete.diagram.edit.commands.LiteralCreateCommand;
import delete.diagram.edit.commands.NullLiteralCreateCommand;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class CallSurfaceQueryCallSurfaceQueryParamsCompartment3ItemSemanticEditPolicy
		extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CallSurfaceQueryCallSurfaceQueryParamsCompartment3ItemSemanticEditPolicy() {
		super(DeleteElementTypes.CallSurfaceQuery_3044);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeleteElementTypes.CallSurfaceQuery_3014 == req.getElementType()) {
			return getGEFWrapper(new CallSurfaceQuery2CreateCommand(req));
		}
		if (DeleteElementTypes.Field_3015 == req.getElementType()) {
			return getGEFWrapper(new Field2CreateCommand(req));
		}
		if (DeleteElementTypes.Literal_3016 == req.getElementType()) {
			return getGEFWrapper(new LiteralCreateCommand(req));
		}
		if (DeleteElementTypes.NullLiteral_3017 == req.getElementType()) {
			return getGEFWrapper(new NullLiteralCreateCommand(req));
		}
		if (DeleteElementTypes.Function_3018 == req.getElementType()) {
			return getGEFWrapper(new FunctionCreateCommand(req));
		}
		if (DeleteElementTypes.Input_3019 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
