/**
 */
package insert;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link insert.InsertSurface#getInputInstalment <em>Input Instalment</em>}</li>
 *   <li>{@link insert.InsertSurface#getPrepareList <em>Prepare List</em>}</li>
 *   <li>{@link insert.InsertSurface#getTableInstalment <em>Table Instalment</em>}</li>
 *   <li>{@link insert.InsertSurface#getTypes <em>Types</em>}</li>
 *   <li>{@link insert.InsertSurface#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link insert.InsertSurface#getName <em>Name</em>}</li>
 *   <li>{@link insert.InsertSurface#getDescription <em>Description</em>}</li>
 *   <li>{@link insert.InsertSurface#getAssociatedClass <em>Associated Class</em>}</li>
 *   <li>{@link insert.InsertSurface#getUserName <em>User Name</em>}</li>
 *   <li>{@link insert.InsertSurface#getPassword <em>Password</em>}</li>
 *   <li>{@link insert.InsertSurface#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see insert.InsertPackage#getInsertSurface()
 * @model annotation="gmf.diagram diagram.extension='idext' model.extension='imext'"
 * @generated
 */
public interface InsertSurface extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Instalment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Instalment</em>' containment reference.
	 * @see #setInputInstalment(InputInstalment)
	 * @see insert.InsertPackage#getInsertSurface_InputInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputInstalment getInputInstalment();

	/**
	 * Sets the value of the '{@link insert.InsertSurface#getInputInstalment <em>Input Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Instalment</em>' containment reference.
	 * @see #getInputInstalment()
	 * @generated
	 */
	void setInputInstalment(InputInstalment value);

	/**
	 * Returns the value of the '<em><b>Prepare List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prepare List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prepare List</em>' containment reference.
	 * @see #setPrepareList(PrepareList)
	 * @see insert.InsertPackage#getInsertSurface_PrepareList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrepareList getPrepareList();

	/**
	 * Sets the value of the '{@link insert.InsertSurface#getPrepareList <em>Prepare List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepare List</em>' containment reference.
	 * @see #getPrepareList()
	 * @generated
	 */
	void setPrepareList(PrepareList value);

	/**
	 * Returns the value of the '<em><b>Table Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Instalment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Instalment</em>' containment reference.
	 * @see #setTableInstalment(Table)
	 * @see insert.InsertPackage#getInsertSurface_TableInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Table getTableInstalment();

	/**
	 * Sets the value of the '{@link insert.InsertSurface#getTableInstalment <em>Table Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Instalment</em>' containment reference.
	 * @see #getTableInstalment()
	 * @generated
	 */
	void setTableInstalment(Table value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link insert.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see insert.InsertPackage#getInsertSurface_Types()
	 * @model
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Funcs</b></em>' reference list.
	 * The list contents are of type {@link insert.FunctionDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcs</em>' reference list.
	 * @see insert.InsertPackage#getInsertSurface_Funcs()
	 * @model
	 * @generated
	 */
	EList<FunctionDef> getFuncs();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see insert.InsertPackage#getInsertSurface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link insert.InsertSurface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see insert.InsertPackage#getInsertSurface_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link insert.InsertSurface#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Associated Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Class</em>' attribute.
	 * @see #setAssociatedClass(String)
	 * @see insert.InsertPackage#getInsertSurface_AssociatedClass()
	 * @model
	 * @generated
	 */
	String getAssociatedClass();

	/**
	 * Sets the value of the '{@link insert.InsertSurface#getAssociatedClass <em>Associated Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Class</em>' attribute.
	 * @see #getAssociatedClass()
	 * @generated
	 */
	void setAssociatedClass(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see insert.InsertPackage#getInsertSurface_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link insert.InsertSurface#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see insert.InsertPackage#getInsertSurface_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link insert.InsertSurface#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see insert.InsertPackage#getInsertSurface_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link insert.InsertSurface#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // InsertSurface
