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
public class QueryModelingAssistantProviderOfOutputInstalmentEditPart extends QueryModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(QueryElementTypes.CallQuerySurface_3016);
		types.add(QueryElementTypes.Field_3017);
		types.add(QueryElementTypes.Literal_3018);
		types.add(QueryElementTypes.NullLiteral_3019);
		types.add(QueryElementTypes.Function_3020);
		types.add(QueryElementTypes.Input_3021);
		types.add(QueryElementTypes.MyTable_3022);
		return types;
	}

}
