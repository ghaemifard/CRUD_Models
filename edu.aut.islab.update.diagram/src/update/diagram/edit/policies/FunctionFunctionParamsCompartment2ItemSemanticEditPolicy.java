/*
* 
*/
package update.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import update.diagram.edit.commands.CallSurfaceQuery2CreateCommand;
import update.diagram.edit.commands.FieldCreateCommand;
import update.diagram.edit.commands.FunctionCreateCommand;
import update.diagram.edit.commands.InputCreateCommand;
import update.diagram.edit.commands.LiteralCreateCommand;
import update.diagram.edit.commands.NullLiteralCreateCommand;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class FunctionFunctionParamsCompartment2ItemSemanticEditPolicy extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FunctionFunctionParamsCompartment2ItemSemanticEditPolicy() {
		super(UpdateElementTypes.Function_3015);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UpdateElementTypes.CallSurfaceQuery_3006 == req.getElementType()) {
			return getGEFWrapper(new CallSurfaceQuery2CreateCommand(req));
		}
		if (UpdateElementTypes.Field_3007 == req.getElementType()) {
			return getGEFWrapper(new FieldCreateCommand(req));
		}
		if (UpdateElementTypes.Literal_3008 == req.getElementType()) {
			return getGEFWrapper(new LiteralCreateCommand(req));
		}
		if (UpdateElementTypes.NullLiteral_3009 == req.getElementType()) {
			return getGEFWrapper(new NullLiteralCreateCommand(req));
		}
		if (UpdateElementTypes.Function_3010 == req.getElementType()) {
			return getGEFWrapper(new FunctionCreateCommand(req));
		}
		if (UpdateElementTypes.Input_3011 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
