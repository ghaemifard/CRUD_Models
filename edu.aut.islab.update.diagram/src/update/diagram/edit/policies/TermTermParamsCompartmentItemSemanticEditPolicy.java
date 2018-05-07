/*
* 
*/
package update.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import update.diagram.edit.commands.CallSurfaceQuery3CreateCommand;
import update.diagram.edit.commands.Field3CreateCommand;
import update.diagram.edit.commands.Function3CreateCommand;
import update.diagram.edit.commands.Input3CreateCommand;
import update.diagram.edit.commands.Literal3CreateCommand;
import update.diagram.edit.commands.NullLiteral3CreateCommand;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class TermTermParamsCompartmentItemSemanticEditPolicy extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TermTermParamsCompartmentItemSemanticEditPolicy() {
		super(UpdateElementTypes.Term_3019);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UpdateElementTypes.CallSurfaceQuery_3020 == req.getElementType()) {
			return getGEFWrapper(new CallSurfaceQuery3CreateCommand(req));
		}
		if (UpdateElementTypes.Field_3021 == req.getElementType()) {
			return getGEFWrapper(new Field3CreateCommand(req));
		}
		if (UpdateElementTypes.Literal_3022 == req.getElementType()) {
			return getGEFWrapper(new Literal3CreateCommand(req));
		}
		if (UpdateElementTypes.NullLiteral_3023 == req.getElementType()) {
			return getGEFWrapper(new NullLiteral3CreateCommand(req));
		}
		if (UpdateElementTypes.Function_3024 == req.getElementType()) {
			return getGEFWrapper(new Function3CreateCommand(req));
		}
		if (UpdateElementTypes.Input_3025 == req.getElementType()) {
			return getGEFWrapper(new Input3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
