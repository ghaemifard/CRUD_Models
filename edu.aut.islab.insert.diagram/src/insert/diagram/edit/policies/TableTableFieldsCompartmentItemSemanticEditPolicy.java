/*
* 
*/
package insert.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import insert.diagram.edit.commands.FieldCreateCommand;
import insert.diagram.providers.InsertElementTypes;

/**
 * @generated
 */
public class TableTableFieldsCompartmentItemSemanticEditPolicy extends InsertBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TableTableFieldsCompartmentItemSemanticEditPolicy() {
		super(InsertElementTypes.Table_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InsertElementTypes.Field_3018 == req.getElementType()) {
			return getGEFWrapper(new FieldCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
