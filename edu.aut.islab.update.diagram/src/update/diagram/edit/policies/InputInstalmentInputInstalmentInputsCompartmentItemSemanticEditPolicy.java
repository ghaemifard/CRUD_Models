/*
* 
*/
package update.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import update.diagram.edit.commands.InputBitsDefCreateCommand;
import update.diagram.edit.commands.InputDateDefCreateCommand;
import update.diagram.edit.commands.InputFloatDefCreateCommand;
import update.diagram.edit.commands.InputIntDefCreateCommand;
import update.diagram.edit.commands.InputStringDefCreateCommand;
import update.diagram.providers.UpdateElementTypes;

/**
 * @generated
 */
public class InputInstalmentInputInstalmentInputsCompartmentItemSemanticEditPolicy
		extends UpdateBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputInstalmentInputInstalmentInputsCompartmentItemSemanticEditPolicy() {
		super(UpdateElementTypes.InputInstalment_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UpdateElementTypes.InputStringDef_3001 == req.getElementType()) {
			return getGEFWrapper(new InputStringDefCreateCommand(req));
		}
		if (UpdateElementTypes.InputIntDef_3002 == req.getElementType()) {
			return getGEFWrapper(new InputIntDefCreateCommand(req));
		}
		if (UpdateElementTypes.InputDateDef_3003 == req.getElementType()) {
			return getGEFWrapper(new InputDateDefCreateCommand(req));
		}
		if (UpdateElementTypes.InputBitsDef_3004 == req.getElementType()) {
			return getGEFWrapper(new InputBitsDefCreateCommand(req));
		}
		if (UpdateElementTypes.InputFloatDef_3028 == req.getElementType()) {
			return getGEFWrapper(new InputFloatDefCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
