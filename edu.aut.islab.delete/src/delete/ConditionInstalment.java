/**
 */
package delete;

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
 *   <li>{@link delete.ConditionInstalment#getName <em>Name</em>}</li>
 *   <li>{@link delete.ConditionInstalment#getParts <em>Parts</em>}</li>
 *   <li>{@link delete.ConditionInstalment#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getConditionInstalment()
 * @model annotation="gmf.node label='name' size='250,500'"
 * @generated
 */
public interface ConditionInstalment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Where"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see delete.DeletePackage#getConditionInstalment_Name()
	 * @model default="Where" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link delete.AbstractConditionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see delete.DeletePackage#getConditionInstalment_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConditionElement> getParts();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link delete.JuncRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see delete.DeletePackage#getConditionInstalment_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<JuncRelationship> getLinks();

} // ConditionInstalment
