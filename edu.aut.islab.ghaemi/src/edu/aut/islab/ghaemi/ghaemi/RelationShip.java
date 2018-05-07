/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Ship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.RelationShip#getDstNode <em>Dst Node</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.RelationShip#getSrcNode <em>Src Node</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.RelationShip#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getRelationShip()
 * @model
 * @generated
 */
public interface RelationShip extends EObject {
	/**
	 * Returns the value of the '<em><b>Dst Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst Node</em>' reference.
	 * @see #setDstNode(Node)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getRelationShip_DstNode()
	 * @model required="true"
	 * @generated
	 */
	Node getDstNode();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.RelationShip#getDstNode <em>Dst Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst Node</em>' reference.
	 * @see #getDstNode()
	 * @generated
	 */
	void setDstNode(Node value);

	/**
	 * Returns the value of the '<em><b>Src Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Node</em>' reference.
	 * @see #setSrcNode(Node)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getRelationShip_SrcNode()
	 * @model required="true"
	 * @generated
	 */
	Node getSrcNode();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.RelationShip#getSrcNode <em>Src Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Node</em>' reference.
	 * @see #getSrcNode()
	 * @generated
	 */
	void setSrcNode(Node value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.aut.islab.ghaemi.ghaemi.QueryRelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.aut.islab.ghaemi.ghaemi.QueryRelationType
	 * @see #setType(QueryRelationType)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getRelationShip_Type()
	 * @model
	 * @generated
	 */
	QueryRelationType getType();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.RelationShip#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.aut.islab.ghaemi.ghaemi.QueryRelationType
	 * @see #getType()
	 * @generated
	 */
	void setType(QueryRelationType value);

} // RelationShip
