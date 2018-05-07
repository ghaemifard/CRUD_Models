/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.OutputNode#getIndex <em>Index</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.OutputNode#getNodeRef <em>Node Ref</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getOutputNode()
 * @model
 * @generated
 */
public interface OutputNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getOutputNode_Index()
	 * @model default="0"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.OutputNode#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Ref</em>' reference.
	 * @see #setNodeRef(Node)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getOutputNode_NodeRef()
	 * @model required="true"
	 * @generated
	 */
	Node getNodeRef();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.OutputNode#getNodeRef <em>Node Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Ref</em>' reference.
	 * @see #getNodeRef()
	 * @generated
	 */
	void setNodeRef(Node value);

} // OutputNode
