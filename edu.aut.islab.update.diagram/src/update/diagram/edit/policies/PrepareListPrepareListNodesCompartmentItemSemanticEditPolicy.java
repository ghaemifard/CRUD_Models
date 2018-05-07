/*
* 
*/
package update.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import update.diagram.edit.commands.CallSurfaceQueryCreateCommand;
import update.diagram.edit.commands.Field2CreateCommand;
import update.diagram.edit.commands.Function2CreateCommand;
import update.diagram.edit.commands.Input2CreateCommand;
import update.diagram.edit.commands.Literal2CreateCommand;
import update.diagram.edit.commands.NullLiteral2CreateCommand;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class PrepareListPrepareListNodesCompartmentItemSemanticEditPolicy extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PrepareListPrepareListNodesCompartmentItemSemanticEditPolicy() {
		super(UpdateElementTypes.PrepareList_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UpdateElementTypes.CallSurfaceQuery_3005 == req.getElementType()) {
			return getGEFWrapper(new CallSurfaceQueryCreateCommand(req));
		}
		if (UpdateElementTypes.Field_3012 == req.getElementType()) {
			return getGEFWrapper(new Field2CreateCommand(req));
		}
		if (UpdateElementTypes.Literal_3013 == req.getElementType()) {
			return getGEFWrapper(new Literal2CreateCommand(req));
		}
		if (UpdateElementTypes.NullLiteral_3014 == req.getElementType()) {
			return getGEFWrapper(new NullLiteral2CreateCommand(req));
		}
		if (UpdateElementTypes.Function_3015 == req.getElementType()) {
			return getGEFWrapper(new Function2CreateCommand(req));
		}
		if (UpdateElementTypes.Input_3016 == req.getElementType()) {
			return getGEFWrapper(new Input2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
