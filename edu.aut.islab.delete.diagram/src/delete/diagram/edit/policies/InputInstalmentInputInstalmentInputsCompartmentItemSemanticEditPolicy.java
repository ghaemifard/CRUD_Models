/*
* 
*/
package delete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import delete.diagram.edit.commands.InputBitsDefCreateCommand;
import delete.diagram.edit.commands.InputDateDefCreateCommand;
import delete.diagram.edit.commands.InputFloatDefCreateCommand;
import delete.diagram.edit.commands.InputIntDefCreateCommand;
import delete.diagram.edit.commands.InputStringDefCreateCommand;
import delete.diagram.providers.DeleteElementTypes;

/**
 * @generated
 */
public class InputInstalmentInputInstalmentInputsCompartmentItemSemanticEditPolicy
		extends DeleteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputInstalmentInputInstalmentInputsCompartmentItemSemanticEditPolicy() {
		super(DeleteElementTypes.InputInstalment_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DeleteElementTypes.InputStringDef_3001 == req.getElementType()) {
			return getGEFWrapper(new InputStringDefCreateCommand(req));
		}
		if (DeleteElementTypes.InputIntDef_3002 == req.getElementType()) {
			return getGEFWrapper(new InputIntDefCreateCommand(req));
		}
		if (DeleteElementTypes.InputDateDef_3003 == req.getElementType()) {
			return getGEFWrapper(new InputDateDefCreateCommand(req));
		}
		if (DeleteElementTypes.InputBitsDef_3004 == req.getElementType()) {
			return getGEFWrapper(new InputBitsDefCreateCommand(req));
		}
		if (DeleteElementTypes.InputFloatDef_3037 == req.getElementType()) {
			return getGEFWrapper(new InputFloatDefCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
