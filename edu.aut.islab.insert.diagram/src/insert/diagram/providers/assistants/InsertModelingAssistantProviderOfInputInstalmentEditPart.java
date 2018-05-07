/*
 * 
 */
package insert.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import insert.diagram.providers.InsertElementTypes;
import insert.diagram.providers.InsertModelingAssistantProvider;

/**
 * @generated
 */
public class InsertModelingAssistantProviderOfInputInstalmentEditPart extends InsertModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(InsertElementTypes.InputStringDef_3002);
		types.add(InsertElementTypes.InputIntDef_3003);
		types.add(InsertElementTypes.InputDateDef_3004);
		types.add(InsertElementTypes.InputBitsDef_3005);
		types.add(InsertElementTypes.InputFloatDef_3019);
		return types;
	}

}
