/*
* 
*/
package delete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import delete.diagram.edit.commands.JunctionCreateCommand;
import delete.diagram.edit.commands.RootJunctionCreateCommand;
import delete.diagram.edit.commands.TermCreateCommand;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class ConditionInstalmentConditionInstalmentPartsCompartmentItemSemanticEditPolicy
		extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConditionInstalmentConditionInstalmentPartsCompartmentItemSemanticEditPolicy() {
		super(DeleteElementTypes.ConditionInstalment_2005);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeleteElementTypes.RootJunction_3040 == req.getElementType()) {
			return getGEFWrapper(new RootJunctionCreateCommand(req));
		}
		if (DeleteElementTypes.Junction_3041 == req.getElementType()) {
			return getGEFWrapper(new JunctionCreateCommand(req));
		}
		if (DeleteElementTypes.Term_3042 == req.getElementType()) {
			return getGEFWrapper(new TermCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
