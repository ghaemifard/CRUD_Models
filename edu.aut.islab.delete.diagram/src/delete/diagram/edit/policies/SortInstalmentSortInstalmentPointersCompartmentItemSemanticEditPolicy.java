/*
* 
*/
package delete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import delete.diagram.edit.commands.FieldSPointerCreateCommand;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class SortInstalmentSortInstalmentPointersCompartmentItemSemanticEditPolicy
		extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SortInstalmentSortInstalmentPointersCompartmentItemSemanticEditPolicy() {
		super(DeleteElementTypes.SortInstalment_2006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeleteElementTypes.FieldSPointer_3043 == req.getElementType()) {
			return getGEFWrapper(new FieldSPointerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
