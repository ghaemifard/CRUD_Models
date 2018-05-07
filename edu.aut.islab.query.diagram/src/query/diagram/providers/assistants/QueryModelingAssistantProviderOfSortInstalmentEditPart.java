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
public class QueryModelingAssistantProviderOfSortInstalmentEditPart extends QueryModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(QueryElementTypes.FieldSPointer_3031);
		return types;
	}

}
