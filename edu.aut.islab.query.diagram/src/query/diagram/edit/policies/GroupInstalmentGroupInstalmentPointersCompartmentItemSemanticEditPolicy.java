/*
* 
*/
package query.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import query.diagram.edit.commands.FieldGPointerCreateCommand;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class GroupInstalmentGroupInstalmentPointersCompartmentItemSemanticEditPolicy
		extends QueryBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupInstalmentGroupInstalmentPointersCompartmentItemSemanticEditPolicy() {
		super(QueryElementTypes.GroupInstalment_2005);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QueryElementTypes.FieldGPointer_3030 == req.getElementType()) {
			return getGEFWrapper(new FieldGPointerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
