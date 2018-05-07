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
public class DeleteModelingAssistantProviderOfDeleteSurfaceEditPart extends DeleteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(DeleteElementTypes.InputInstalment_2001);
		types.add(DeleteElementTypes.TableListInstalment_2002);
		types.add(DeleteElementTypes.ConditionInstalment_2005);
		types.add(DeleteElementTypes.SortInstalment_2006);
		types.add(DeleteElementTypes.Dummy_2007);
		return types;
	}

}
