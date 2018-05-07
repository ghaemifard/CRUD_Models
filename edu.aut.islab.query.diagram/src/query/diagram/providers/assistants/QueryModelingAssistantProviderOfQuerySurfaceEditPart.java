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
public class QueryModelingAssistantProviderOfQuerySurfaceEditPart extends QueryModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(QueryElementTypes.WhereInstalment_2001);
		types.add(QueryElementTypes.HavingInstalment_2002);
		types.add(QueryElementTypes.OutputInstalment_2003);
		types.add(QueryElementTypes.InputInstalment_2004);
		types.add(QueryElementTypes.GroupInstalment_2005);
		types.add(QueryElementTypes.SortInstalment_2006);
		return types;
	}

}
