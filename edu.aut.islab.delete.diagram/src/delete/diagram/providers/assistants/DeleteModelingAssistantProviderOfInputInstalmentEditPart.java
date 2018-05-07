/*
 * 
 */
package delete.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import delete.diagram.providers.DeleteElementTypes;
import delete.diagram.providers.DeleteModelingAssistantProvider;

/**
 * @generated
 */
public class DeleteModelingAssistantProviderOfInputInstalmentEditPart extends DeleteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(DeleteElementTypes.InputStringDef_3001);
		types.add(DeleteElementTypes.InputIntDef_3002);
		types.add(DeleteElementTypes.InputDateDef_3003);
		types.add(DeleteElementTypes.InputBitsDef_3004);
		types.add(DeleteElementTypes.InputFloatDef_3037);
		return types;
	}

}
