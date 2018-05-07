/*
* 
*/
package query.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import query.diagram.edit.commands.JunctionCreateCommand;
import query.diagram.edit.commands.RootJunctionCreateCommand;
import query.diagram.edit.commands.TermCreateCommand;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class HavingInstalmentHavingInstalmentPartsCompartmentItemSemanticEditPolicy
		extends QueryBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public HavingInstalmentHavingInstalmentPartsCompartmentItemSemanticEditPolicy() {
		super(QueryElementTypes.HavingInstalment_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QueryElementTypes.RootJunction_3001 == req.getElementType()) {
			return getGEFWrapper(new RootJunctionCreateCommand(req));
		}
		if (QueryElementTypes.Junction_3002 == req.getElementType()) {
			return getGEFWrapper(new JunctionCreateCommand(req));
		}
		if (QueryElementTypes.Term_3003 == req.getElementType()) {
			return getGEFWrapper(new TermCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
