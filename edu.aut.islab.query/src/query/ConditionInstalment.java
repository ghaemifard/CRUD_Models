/**
 */
package query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Instalment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.ConditionInstalment#getParts <em>Parts</em>}</li>
 *   <li>{@link query.ConditionInstalment#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getConditionInstalment()
 * @model abstract="true"
 *        annotation="gmf.node label='name' size='250,500'"
 * @generated
 */
public interface ConditionInstalment extends EObject {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link query.AbstractConditionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see query.QueryPackage#getConditionInstalment_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConditionElement> getParts();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link query.JuncRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see query.QueryPackage#getConditionInstalment_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<JuncRelationship> getLinks();

} // ConditionInstalment
