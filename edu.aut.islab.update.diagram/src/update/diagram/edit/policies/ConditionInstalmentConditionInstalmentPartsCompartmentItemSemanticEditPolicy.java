/*
* 
*/
package update.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import update.diagram.edit.commands.JunctionCreateCommand;
import update.diagram.edit.commands.RootJunctionCreateCommand;
import update.diagram.edit.commands.TermCreateCommand;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class ConditionInstalmentConditionInstalmentPartsCompartmentItemSemanticEditPolicy
		extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConditionInstalmentConditionInstalmentPartsCompartmentItemSemanticEditPolicy() {
		super(UpdateElementTypes.ConditionInstalment_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UpdateElementTypes.RootJunction_3031 == req.getElementType()) {
			return getGEFWrapper(new RootJunctionCreateCommand(req));
		}
		if (UpdateElementTypes.Junction_3032 == req.getElementType()) {
			return getGEFWrapper(new JunctionCreateCommand(req));
		}
		if (UpdateElementTypes.Term_3019 == req.getElementType()) {
			return getGEFWrapper(new TermCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
