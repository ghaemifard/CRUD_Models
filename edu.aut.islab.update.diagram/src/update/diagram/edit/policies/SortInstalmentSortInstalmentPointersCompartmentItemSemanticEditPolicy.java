/*
* 
*/
package update.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import update.diagram.edit.commands.FieldSPointerCreateCommand;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class SortInstalmentSortInstalmentPointersCompartmentItemSemanticEditPolicy
		extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SortInstalmentSortInstalmentPointersCompartmentItemSemanticEditPolicy() {
		super(UpdateElementTypes.SortInstalment_2005);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UpdateElementTypes.FieldSPointer_3030 == req.getElementType()) {
			return getGEFWrapper(new FieldSPointerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
