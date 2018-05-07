/*
 * 
 */
package update.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import update.diagram.providers.UpdateElementTypes;
import update.diagram.providers.UpdateModelingAssistantProvider;

/**
 * @generated
 */
public class UpdateModelingAssistantProviderOfInputInstalmentEditPart extends UpdateModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UpdateElementTypes.InputStringDef_3001);
		types.add(UpdateElementTypes.InputIntDef_3002);
		types.add(UpdateElementTypes.InputDateDef_3003);
		types.add(UpdateElementTypes.InputBitsDef_3004);
		types.add(UpdateElementTypes.InputFloatDef_3028);
		return types;
	}

}
