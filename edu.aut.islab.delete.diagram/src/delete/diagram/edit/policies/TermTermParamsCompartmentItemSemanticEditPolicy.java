/*
* 
*/
package delete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import delete.diagram.edit.commands.CallSurfaceQueryCreateCommand;
import delete.diagram.edit.commands.Field3CreateCommand;
import delete.diagram.edit.commands.Function2CreateCommand;
import delete.diagram.edit.commands.Input2CreateCommand;
import delete.diagram.edit.commands.Literal2CreateCommand;
import delete.diagram.edit.commands.NullLiteral2CreateCommand;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class TermTermParamsCompartmentItemSemanticEditPolicy extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TermTermParamsCompartmentItemSemanticEditPolicy() {
		super(DeleteElementTypes.Term_3042);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeleteElementTypes.CallSurfaceQuery_3025 == req.getElementType()) {
			return getGEFWrapper(new CallSurfaceQueryCreateCommand(req));
		}
		if (DeleteElementTypes.Field_3012 == req.getElementType()) {
			return getGEFWrapper(new Field3CreateCommand(req));
		}
		if (DeleteElementTypes.Literal_3026 == req.getElementType()) {
			return getGEFWrapper(new Literal2CreateCommand(req));
		}
		if (DeleteElementTypes.NullLiteral_3027 == req.getElementType()) {
			return getGEFWrapper(new NullLiteral2CreateCommand(req));
		}
		if (DeleteElementTypes.Function_3028 == req.getElementType()) {
			return getGEFWrapper(new Function2CreateCommand(req));
		}
		if (DeleteElementTypes.Input_3029 == req.getElementType()) {
			return getGEFWrapper(new Input2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
