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
public class InsertModelingAssistantProviderOfInsertSurfaceEditPart extends InsertModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(InsertElementTypes.Table_2004);
		types.add(InsertElementTypes.InputInstalment_2002);
		types.add(InsertElementTypes.PrepareList_2003);
		return types;
	}

}
