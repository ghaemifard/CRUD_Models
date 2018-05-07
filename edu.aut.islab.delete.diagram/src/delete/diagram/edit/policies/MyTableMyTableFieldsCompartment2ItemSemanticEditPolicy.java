/*
* 
*/
package delete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import delete.diagram.edit.commands.FieldCreateCommand;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class MyTableMyTableFieldsCompartment2ItemSemanticEditPolicy extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MyTableMyTableFieldsCompartment2ItemSemanticEditPolicy() {
		super(DeleteElementTypes.MyTable_3053);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeleteElementTypes.Field_3052 == req.getElementType()) {
			return getGEFWrapper(new FieldCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
