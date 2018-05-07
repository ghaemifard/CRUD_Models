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
public class InsertModelingAssistantProviderOfTableEditPart extends InsertModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(InsertElementTypes.Field_3018);
		return types;
	}

}
