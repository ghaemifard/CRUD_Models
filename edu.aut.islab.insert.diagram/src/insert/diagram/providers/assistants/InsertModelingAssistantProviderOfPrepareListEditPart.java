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
public class InsertModelingAssistantProviderOfPrepareListEditPart extends InsertModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(InsertElementTypes.CallSurfaceQuery_3006);
		types.add(InsertElementTypes.Field_3013);
		types.add(InsertElementTypes.Literal_3014);
		types.add(InsertElementTypes.NullLiteral_3015);
		types.add(InsertElementTypes.Function_3016);
		types.add(InsertElementTypes.Input_3017);
		return types;
	}

}
