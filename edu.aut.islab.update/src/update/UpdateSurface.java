/**
 */
package update;

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
 *   <li>{@link update.UpdateSurface#getInputInstalment <em>Input Instalment</em>}</li>
 *   <li>{@link update.UpdateSurface#getPrepareList <em>Prepare List</em>}</li>
 *   <li>{@link update.UpdateSurface#getTableInstalment <em>Table Instalment</em>}</li>
 *   <li>{@link update.UpdateSurface#getSortInstalment <em>Sort Instalment</em>}</li>
 *   <li>{@link update.UpdateSurface#getWhereInstalment <em>Where Instalment</em>}</li>
 *   <li>{@link update.UpdateSurface#getLfs <em>Lfs</em>}</li>
 *   <li>{@link update.UpdateSurface#getTypes <em>Types</em>}</li>
 *   <li>{@link update.UpdateSurface#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link update.UpdateSurface#getName <em>Name</em>}</li>
 *   <li>{@link update.UpdateSurface#getDescription <em>Description</em>}</li>
 *   <li>{@link update.UpdateSurface#getAssociatedClass <em>Associated Class</em>}</li>
 *   <li>{@link update.UpdateSurface#getUserName <em>User Name</em>}</li>
 *   <li>{@link update.UpdateSurface#getPassword <em>Password</em>}</li>
 *   <li>{@link update.UpdateSurface#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see update.UpdatePackage#getUpdateSurface()
 * @model annotation="gmf.diagram diagram.extension='udext' model.extension='umext'"
 * @generated
 */
public interface UpdateSurface extends EObject {
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
	 * @see update.UpdatePackage#getUpdateSurface_InputInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputInstalment getInputInstalment();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getInputInstalment <em>Input Instalment</em>}' containment reference.
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
	 * @see update.UpdatePackage#getUpdateSurface_PrepareList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrepareList getPrepareList();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getPrepareList <em>Prepare List</em>}' containment reference.
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
	 * @see #setTableInstalment(TableSelection)
	 * @see update.UpdatePackage#getUpdateSurface_TableInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TableSelection getTableInstalment();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getTableInstalment <em>Table Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Instalment</em>' containment reference.
	 * @see #getTableInstalment()
	 * @generated
	 */
	void setTableInstalment(TableSelection value);

	/**
	 * Returns the value of the '<em><b>Sort Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Instalment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Instalment</em>' containment reference.
	 * @see #setSortInstalment(SortInstalment)
	 * @see update.UpdatePackage#getUpdateSurface_SortInstalment()
	 * @model containment="true"
	 * @generated
	 */
	SortInstalment getSortInstalment();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getSortInstalment <em>Sort Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Instalment</em>' containment reference.
	 * @see #getSortInstalment()
	 * @generated
	 */
	void setSortInstalment(SortInstalment value);

	/**
	 * Returns the value of the '<em><b>Where Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Instalment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Instalment</em>' containment reference.
	 * @see #setWhereInstalment(ConditionInstalment)
	 * @see update.UpdatePackage#getUpdateSurface_WhereInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionInstalment getWhereInstalment();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getWhereInstalment <em>Where Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Instalment</em>' containment reference.
	 * @see #getWhereInstalment()
	 * @generated
	 */
	void setWhereInstalment(ConditionInstalment value);

	/**
	 * Returns the value of the '<em><b>Lfs</b></em>' containment reference list.
	 * The list contents are of type {@link update.LinkField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lfs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lfs</em>' containment reference list.
	 * @see update.UpdatePackage#getUpdateSurface_Lfs()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkField> getLfs();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link update.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see update.UpdatePackage#getUpdateSurface_Types()
	 * @model
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Funcs</b></em>' reference list.
	 * The list contents are of type {@link update.FunctionDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcs</em>' reference list.
	 * @see update.UpdatePackage#getUpdateSurface_Funcs()
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
	 * @see update.UpdatePackage#getUpdateSurface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getName <em>Name</em>}' attribute.
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
	 * @see update.UpdatePackage#getUpdateSurface_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getDescription <em>Description</em>}' attribute.
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
	 * @see update.UpdatePackage#getUpdateSurface_AssociatedClass()
	 * @model
	 * @generated
	 */
	String getAssociatedClass();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getAssociatedClass <em>Associated Class</em>}' attribute.
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
	 * @see update.UpdatePackage#getUpdateSurface_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getUserName <em>User Name</em>}' attribute.
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
	 * @see update.UpdatePackage#getUpdateSurface_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getPassword <em>Password</em>}' attribute.
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
	 * @see update.UpdatePackage#getUpdateSurface_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link update.UpdateSurface#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // UpdateSurface
