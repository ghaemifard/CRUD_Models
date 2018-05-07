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
public class UpdateModelingAssistantProviderOfUpdateSurfaceEditPart extends UpdateModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UpdateElementTypes.InputInstalment_2001);
		types.add(UpdateElementTypes.PrepareList_2002);
		types.add(UpdateElementTypes.TableSelection_2003);
		types.add(UpdateElementTypes.SortInstalment_2005);
		types.add(UpdateElementTypes.ConditionInstalment_2004);
		return types;
	}

}
