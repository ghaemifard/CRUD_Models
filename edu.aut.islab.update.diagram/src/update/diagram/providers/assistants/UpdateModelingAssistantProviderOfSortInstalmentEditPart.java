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
public class UpdateModelingAssistantProviderOfSortInstalmentEditPart extends UpdateModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UpdateElementTypes.FieldSPointer_3030);
		return types;
	}

}
