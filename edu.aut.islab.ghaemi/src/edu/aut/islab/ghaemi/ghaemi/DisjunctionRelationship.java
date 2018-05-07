/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disjunction Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship#getSrc <em>Src</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship#getDst <em>Dst</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getDisjunctionRelationship()
 * @model
 * @generated
 */
public interface DisjunctionRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Disjunction)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getDisjunctionRelationship_Src()
	 * @model required="true"
	 * @generated
	 */
	Disjunction getSrc();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Disjunction value);

	/**
	 * Returns the value of the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst</em>' reference.
	 * @see #setDst(AbstractCondElement)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getDisjunctionRelationship_Dst()
	 * @model required="true"
	 * @generated
	 */
	AbstractCondElement getDst();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship#getDst <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst</em>' reference.
	 * @see #getDst()
	 * @generated
	 */
	void setDst(AbstractCondElement value);

} // DisjunctionRelationship
