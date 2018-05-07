/*
* 
*/
package insert.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import insert.diagram.edit.commands.InputBitsDefCreateCommand;
import insert.diagram.edit.commands.InputDateDefCreateCommand;
import insert.diagram.edit.commands.InputFloatDefCreateCommand;
import insert.diagram.edit.commands.InputIntDefCreateCommand;
import insert.diagram.edit.commands.InputStringDefCreateCommand;
import insert.diagram.providers.InsertElementTypes;

/**
 * @generated
 */
public class InputInstalmentInputInstalmentInputsCompartmentItemSemanticEditPolicy
		extends InsertBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputInstalmentInputInstalmentInputsCompartmentItemSemanticEditPolicy() {
		super(InsertElementTypes.InputInstalment_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (InsertElementTypes.InputStringDef_3002 == req.getElementType()) {
			return getGEFWrapper(new InputStringDefCreateCommand(req));
		}
		if (InsertElementTypes.InputIntDef_3003 == req.getElementType()) {
			return getGEFWrapper(new InputIntDefCreateCommand(req));
		}
		if (InsertElementTypes.InputDateDef_3004 == req.getElementType()) {
			return getGEFWrapper(new InputDateDefCreateCommand(req));
		}
		if (InsertElementTypes.InputBitsDef_3005 == req.getElementType()) {
			return getGEFWrapper(new InputBitsDefCreateCommand(req));
		}
		if (InsertElementTypes.InputFloatDef_3019 == req.getElementType()) {
			return getGEFWrapper(new InputFloatDefCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
