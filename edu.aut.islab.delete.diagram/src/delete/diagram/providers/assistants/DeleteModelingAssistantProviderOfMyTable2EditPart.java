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
public class DeleteModelingAssistantProviderOfMyTable2EditPart extends DeleteModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DeleteElementTypes.Field_3052);
		return types;
	}

}
