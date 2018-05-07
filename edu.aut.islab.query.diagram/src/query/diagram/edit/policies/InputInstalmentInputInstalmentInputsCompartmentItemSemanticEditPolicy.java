/*
* 
*/
package query.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import query.diagram.edit.commands.InputBitsDefCreateCommand;
import query.diagram.edit.commands.InputDateDefCreateCommand;
import query.diagram.edit.commands.InputFloatDefCreateCommand;
import query.diagram.edit.commands.InputIntDefCreateCommand;
import query.diagram.edit.commands.InputStringDefCreateCommand;
import query.diagram.providers.QueryElementTypes;

/**
 * @generated
 */
public class InputInstalmentInputInstalmentInputsCompartmentItemSemanticEditPolicy
		extends QueryBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputInstalmentInputInstalmentInputsCompartmentItemSemanticEditPolicy() {
		super(QueryElementTypes.InputInstalment_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (QueryElementTypes.InputStringDef_3024 == req.getElementType()) {
			return getGEFWrapper(new InputStringDefCreateCommand(req));
		}
		if (QueryElementTypes.InputIntDef_3025 == req.getElementType()) {
			return getGEFWrapper(new InputIntDefCreateCommand(req));
		}
		if (QueryElementTypes.InputDateDef_3026 == req.getElementType()) {
			return getGEFWrapper(new InputDateDefCreateCommand(req));
		}
		if (QueryElementTypes.InputBitsDef_3027 == req.getElementType()) {
			return getGEFWrapper(new InputBitsDefCreateCommand(req));
		}
		if (QueryElementTypes.InputFloatDef_3032 == req.getElementType()) {
			return getGEFWrapper(new InputFloatDefCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
