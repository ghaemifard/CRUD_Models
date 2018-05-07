/*
* 
*/
package query.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import query.diagram.edit.commands.FieldSPointerCreateCommand;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class SortInstalmentSortInstalmentPointersCompartmentItemSemanticEditPolicy
		extends QueryBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SortInstalmentSortInstalmentPointersCompartmentItemSemanticEditPolicy() {
		super(QueryElementTypes.SortInstalment_2006);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QueryElementTypes.FieldSPointer_3031 == req.getElementType()) {
			return getGEFWrapper(new FieldSPointerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
