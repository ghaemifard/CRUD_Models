/*
* 
*/
package insert.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import insert.diagram.edit.commands.CallSurfaceQueryCreateCommand;
import insert.diagram.edit.commands.Field3CreateCommand;
import insert.diagram.edit.commands.Function2CreateCommand;
import insert.diagram.edit.commands.Input2CreateCommand;
import insert.diagram.edit.commands.Literal2CreateCommand;
import insert.diagram.edit.commands.NullLiteral2CreateCommand;
import insert.diagram.providers.InsertElementTypes;

/**
 * @generated
 */
public class PrepareListPrepareListNodesCompartmentItemSemanticEditPolicy extends InsertBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PrepareListPrepareListNodesCompartmentItemSemanticEditPolicy() {
		super(InsertElementTypes.PrepareList_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InsertElementTypes.CallSurfaceQuery_3006 == req.getElementType()) {
			return getGEFWrapper(new CallSurfaceQueryCreateCommand(req));
		}
		if (InsertElementTypes.Field_3013 == req.getElementType()) {
			return getGEFWrapper(new Field3CreateCommand(req));
		}
		if (InsertElementTypes.Literal_3014 == req.getElementType()) {
			return getGEFWrapper(new Literal2CreateCommand(req));
		}
		if (InsertElementTypes.NullLiteral_3015 == req.getElementType()) {
			return getGEFWrapper(new NullLiteral2CreateCommand(req));
		}
		if (InsertElementTypes.Function_3016 == req.getElementType()) {
			return getGEFWrapper(new Function2CreateCommand(req));
		}
		if (InsertElementTypes.Input_3017 == req.getElementType()) {
			return getGEFWrapper(new Input2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
