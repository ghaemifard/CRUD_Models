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
public class UpdateModelingAssistantProviderOfPrepareListEditPart extends UpdateModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(UpdateElementTypes.CallSurfaceQuery_3005);
		types.add(UpdateElementTypes.Field_3012);
		types.add(UpdateElementTypes.Literal_3013);
		types.add(UpdateElementTypes.NullLiteral_3014);
		types.add(UpdateElementTypes.Function_3015);
		types.add(UpdateElementTypes.Input_3016);
		return types;
	}

}
