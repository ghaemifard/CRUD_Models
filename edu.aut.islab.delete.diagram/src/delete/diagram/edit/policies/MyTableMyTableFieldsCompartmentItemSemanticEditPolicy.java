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
public class MyTableMyTableFieldsCompartmentItemSemanticEditPolicy extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MyTableMyTableFieldsCompartmentItemSemanticEditPolicy() {
		super(DeleteElementTypes.MyTable_3051);
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
