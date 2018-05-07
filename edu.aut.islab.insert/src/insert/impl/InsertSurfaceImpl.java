/**
 */
package insert.impl;

import insert.FunctionDef;
import insert.InputInstalment;
import insert.InsertPackage;
import insert.InsertSurface;
import insert.PrepareList;
import insert.Table;
import insert.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getInputInstalment <em>Input Instalment</em>}</li>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getPrepareList <em>Prepare List</em>}</li>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getTableInstalment <em>Table Instalment</em>}</li>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getAssociatedClass <em>Associated Class</em>}</li>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link insert.impl.InsertSurfaceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertSurfaceImpl extends EObjectImpl implements InsertSurface {
	/**
	 * The cached value of the '{@link #getInputInstalment() <em>Input Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputInstalment()
	 * @generated
	 * @ordered
	 */
	protected InputInstalment inputInstalment;

	/**
	 * The cached value of the '{@link #getPrepareList() <em>Prepare List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrepareList()
	 * @generated
	 * @ordered
	 */
	protected PrepareList prepareList;

	/**
	 * The cached value of the '{@link #getTableInstalment() <em>Table Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableInstalment()
	 * @generated
	 * @ordered
	 */
	protected Table tableInstalment;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getFuncs() <em>Funcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncs()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionDef> funcs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociatedClass() <em>Associated Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedClass() <em>Associated Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedClass()
	 * @generated
	 * @ordered
	 */
	protected String associatedClass = ASSOCIATED_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InsertPackage.Literals.INSERT_SURFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputInstalment getInputInstalment() {
		return inputInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputInstalment(InputInstalment newInputInstalment, NotificationChain msgs) {
		InputInstalment oldInputInstalment = inputInstalment;
		inputInstalment = newInputInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__INPUT_INSTALMENT, oldInputInstalment, newInputInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputInstalment(InputInstalment newInputInstalment) {
		if (newInputInstalment != inputInstalment) {
			NotificationChain msgs = null;
			if (inputInstalment != null)
				msgs = ((InternalEObject)inputInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InsertPackage.INSERT_SURFACE__INPUT_INSTALMENT, null, msgs);
			if (newInputInstalment != null)
				msgs = ((InternalEObject)newInputInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InsertPackage.INSERT_SURFACE__INPUT_INSTALMENT, null, msgs);
			msgs = basicSetInputInstalment(newInputInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__INPUT_INSTALMENT, newInputInstalment, newInputInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrepareList getPrepareList() {
		return prepareList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrepareList(PrepareList newPrepareList, NotificationChain msgs) {
		PrepareList oldPrepareList = prepareList;
		prepareList = newPrepareList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__PREPARE_LIST, oldPrepareList, newPrepareList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrepareList(PrepareList newPrepareList) {
		if (newPrepareList != prepareList) {
			NotificationChain msgs = null;
			if (prepareList != null)
				msgs = ((InternalEObject)prepareList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InsertPackage.INSERT_SURFACE__PREPARE_LIST, null, msgs);
			if (newPrepareList != null)
				msgs = ((InternalEObject)newPrepareList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InsertPackage.INSERT_SURFACE__PREPARE_LIST, null, msgs);
			msgs = basicSetPrepareList(newPrepareList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__PREPARE_LIST, newPrepareList, newPrepareList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTableInstalment() {
		return tableInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableInstalment(Table newTableInstalment, NotificationChain msgs) {
		Table oldTableInstalment = tableInstalment;
		tableInstalment = newTableInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__TABLE_INSTALMENT, oldTableInstalment, newTableInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableInstalment(Table newTableInstalment) {
		if (newTableInstalment != tableInstalment) {
			NotificationChain msgs = null;
			if (tableInstalment != null)
				msgs = ((InternalEObject)tableInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InsertPackage.INSERT_SURFACE__TABLE_INSTALMENT, null, msgs);
			if (newTableInstalment != null)
				msgs = ((InternalEObject)newTableInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InsertPackage.INSERT_SURFACE__TABLE_INSTALMENT, null, msgs);
			msgs = basicSetTableInstalment(newTableInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__TABLE_INSTALMENT, newTableInstalment, newTableInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<Type>(Type.class, this, InsertPackage.INSERT_SURFACE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionDef> getFuncs() {
		if (funcs == null) {
			funcs = new EObjectResolvingEList<FunctionDef>(FunctionDef.class, this, InsertPackage.INSERT_SURFACE__FUNCS);
		}
		return funcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociatedClass() {
		return associatedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedClass(String newAssociatedClass) {
		String oldAssociatedClass = associatedClass;
		associatedClass = newAssociatedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__ASSOCIATED_CLASS, oldAssociatedClass, associatedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.INSERT_SURFACE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InsertPackage.INSERT_SURFACE__INPUT_INSTALMENT:
				return basicSetInputInstalment(null, msgs);
			case InsertPackage.INSERT_SURFACE__PREPARE_LIST:
				return basicSetPrepareList(null, msgs);
			case InsertPackage.INSERT_SURFACE__TABLE_INSTALMENT:
				return basicSetTableInstalment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InsertPackage.INSERT_SURFACE__INPUT_INSTALMENT:
				return getInputInstalment();
			case InsertPackage.INSERT_SURFACE__PREPARE_LIST:
				return getPrepareList();
			case InsertPackage.INSERT_SURFACE__TABLE_INSTALMENT:
				return getTableInstalment();
			case InsertPackage.INSERT_SURFACE__TYPES:
				return getTypes();
			case InsertPackage.INSERT_SURFACE__FUNCS:
				return getFuncs();
			case InsertPackage.INSERT_SURFACE__NAME:
				return getName();
			case InsertPackage.INSERT_SURFACE__DESCRIPTION:
				return getDescription();
			case InsertPackage.INSERT_SURFACE__ASSOCIATED_CLASS:
				return getAssociatedClass();
			case InsertPackage.INSERT_SURFACE__USER_NAME:
				return getUserName();
			case InsertPackage.INSERT_SURFACE__PASSWORD:
				return getPassword();
			case InsertPackage.INSERT_SURFACE__URI:
				return getUri();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InsertPackage.INSERT_SURFACE__INPUT_INSTALMENT:
				setInputInstalment((InputInstalment)newValue);
				return;
			case InsertPackage.INSERT_SURFACE__PREPARE_LIST:
				setPrepareList((PrepareList)newValue);
				return;
			case InsertPackage.INSERT_SURFACE__TABLE_INSTALMENT:
				setTableInstalment((Table)newValue);
				return;
			case InsertPackage.INSERT_SURFACE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case InsertPackage.INSERT_SURFACE__FUNCS:
				getFuncs().clear();
				getFuncs().addAll((Collection<? extends FunctionDef>)newValue);
				return;
			case InsertPackage.INSERT_SURFACE__NAME:
				setName((String)newValue);
				return;
			case InsertPackage.INSERT_SURFACE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InsertPackage.INSERT_SURFACE__ASSOCIATED_CLASS:
				setAssociatedClass((String)newValue);
				return;
			case InsertPackage.INSERT_SURFACE__USER_NAME:
				setUserName((String)newValue);
				return;
			case InsertPackage.INSERT_SURFACE__PASSWORD:
				setPassword((String)newValue);
				return;
			case InsertPackage.INSERT_SURFACE__URI:
				setUri((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InsertPackage.INSERT_SURFACE__INPUT_INSTALMENT:
				setInputInstalment((InputInstalment)null);
				return;
			case InsertPackage.INSERT_SURFACE__PREPARE_LIST:
				setPrepareList((PrepareList)null);
				return;
			case InsertPackage.INSERT_SURFACE__TABLE_INSTALMENT:
				setTableInstalment((Table)null);
				return;
			case InsertPackage.INSERT_SURFACE__TYPES:
				getTypes().clear();
				return;
			case InsertPackage.INSERT_SURFACE__FUNCS:
				getFuncs().clear();
				return;
			case InsertPackage.INSERT_SURFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InsertPackage.INSERT_SURFACE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InsertPackage.INSERT_SURFACE__ASSOCIATED_CLASS:
				setAssociatedClass(ASSOCIATED_CLASS_EDEFAULT);
				return;
			case InsertPackage.INSERT_SURFACE__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case InsertPackage.INSERT_SURFACE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case InsertPackage.INSERT_SURFACE__URI:
				setUri(URI_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InsertPackage.INSERT_SURFACE__INPUT_INSTALMENT:
				return inputInstalment != null;
			case InsertPackage.INSERT_SURFACE__PREPARE_LIST:
				return prepareList != null;
			case InsertPackage.INSERT_SURFACE__TABLE_INSTALMENT:
				return tableInstalment != null;
			case InsertPackage.INSERT_SURFACE__TYPES:
				return types != null && !types.isEmpty();
			case InsertPackage.INSERT_SURFACE__FUNCS:
				return funcs != null && !funcs.isEmpty();
			case InsertPackage.INSERT_SURFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InsertPackage.INSERT_SURFACE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InsertPackage.INSERT_SURFACE__ASSOCIATED_CLASS:
				return ASSOCIATED_CLASS_EDEFAULT == null ? associatedClass != null : !ASSOCIATED_CLASS_EDEFAULT.equals(associatedClass);
			case InsertPackage.INSERT_SURFACE__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case InsertPackage.INSERT_SURFACE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case InsertPackage.INSERT_SURFACE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", associatedClass: ");
		result.append(associatedClass);
		result.append(", userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //InsertSurfaceImpl
