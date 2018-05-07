/*
* 
*/
package query.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import query.diagram.edit.commands.Field4CreateCommand;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class MyTableMyTableFieldsCompartmentItemSemanticEditPolicy extends QueryBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MyTableMyTableFieldsCompartmentItemSemanticEditPolicy() {
		super(QueryElementTypes.MyTable_3022);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QueryElementTypes.Field_3023 == req.getElementType()) {
			return getGEFWrapper(new Field4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
