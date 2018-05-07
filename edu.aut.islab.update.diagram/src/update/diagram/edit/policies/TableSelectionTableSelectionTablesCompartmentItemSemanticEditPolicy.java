/*
* 
*/
package update.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import update.diagram.edit.commands.MyTableCreateCommand;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class TableSelectionTableSelectionTablesCompartmentItemSemanticEditPolicy
		extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TableSelectionTableSelectionTablesCompartmentItemSemanticEditPolicy() {
		super(UpdateElementTypes.TableSelection_2003);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UpdateElementTypes.MyTable_3026 == req.getElementType()) {
			return getGEFWrapper(new MyTableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
