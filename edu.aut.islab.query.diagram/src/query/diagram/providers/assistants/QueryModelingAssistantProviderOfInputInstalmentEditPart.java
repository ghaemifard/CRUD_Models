/*
 * 
 */
package query.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import query.diagram.providers.QueryElementTypes;
import query.diagram.providers.QueryModelingAssistantProvider;

/**
 * @generated
 */
public class QueryModelingAssistantProviderOfInputInstalmentEditPart extends QueryModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(QueryElementTypes.InputStringDef_3024);
		types.add(QueryElementTypes.InputIntDef_3025);
		types.add(QueryElementTypes.InputDateDef_3026);
		types.add(QueryElementTypes.InputBitsDef_3027);
		types.add(QueryElementTypes.InputFloatDef_3032);
		return types;
	}

}
