/**
 */
package delete.impl;

import delete.ConditionInstalment;
import delete.DeletePackage;
import delete.DeleteSurface;
import delete.Dummy;
import delete.FunctionDef;
import delete.InputInstalment;
import delete.SortInstalment;
import delete.TableListInstalment;
import delete.Type;

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
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getInputInsta <em>Input Insta</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getTableInsta <em>Table Insta</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getWhereInsta <em>Where Insta</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getSortInstalment <em>Sort Instalment</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getDummy <em>Dummy</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getAssociatedClass <em>Associated Class</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link delete.impl.DeleteSurfaceImpl#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteSurfaceImpl extends EObjectImpl implements DeleteSurface {
	/**
	 * The cached value of the '{@link #getInputInsta() <em>Input Insta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputInsta()
	 * @generated
	 * @ordered
	 */
	protected InputInstalment inputInsta;

	/**
	 * The cached value of the '{@link #getTableInsta() <em>Table Insta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableInsta()
	 * @generated
	 * @ordered
	 */
	protected TableListInstalment tableInsta;

	/**
	 * The cached value of the '{@link #getWhereInsta() <em>Where Insta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereInsta()
	 * @generated
	 * @ordered
	 */
	protected ConditionInstalment whereInsta;

	/**
	 * The cached value of the '{@link #getSortInstalment() <em>Sort Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortInstalment()
	 * @generated
	 * @ordered
	 */
	protected SortInstalment sortInstalment;

	/**
	 * The cached value of the '{@link #getDummy() <em>Dummy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDummy()
	 * @generated
	 * @ordered
	 */
	protected Dummy dummy;

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
	protected DeleteSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeletePackage.Literals.DELETE_SURFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputInstalment getInputInsta() {
		return inputInsta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputInsta(InputInstalment newInputInsta, NotificationChain msgs) {
		InputInstalment oldInputInsta = inputInsta;
		inputInsta = newInputInsta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__INPUT_INSTA, oldInputInsta, newInputInsta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputInsta(InputInstalment newInputInsta) {
		if (newInputInsta != inputInsta) {
			NotificationChain msgs = null;
			if (inputInsta != null)
				msgs = ((InternalEObject)inputInsta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeletePackage.DELETE_SURFACE__INPUT_INSTA, null, msgs);
			if (newInputInsta != null)
				msgs = ((InternalEObject)newInputInsta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeletePackage.DELETE_SURFACE__INPUT_INSTA, null, msgs);
			msgs = basicSetInputInsta(newInputInsta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__INPUT_INSTA, newInputInsta, newInputInsta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableListInstalment getTableInsta() {
		return tableInsta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableInsta(TableListInstalment newTableInsta, NotificationChain msgs) {
		TableListInstalment oldTableInsta = tableInsta;
		tableInsta = newTableInsta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__TABLE_INSTA, oldTableInsta, newTableInsta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableInsta(TableListInstalment newTableInsta) {
		if (newTableInsta != tableInsta) {
			NotificationChain msgs = null;
			if (tableInsta != null)
				msgs = ((InternalEObject)tableInsta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeletePackage.DELETE_SURFACE__TABLE_INSTA, null, msgs);
			if (newTableInsta != null)
				msgs = ((InternalEObject)newTableInsta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeletePackage.DELETE_SURFACE__TABLE_INSTA, null, msgs);
			msgs = basicSetTableInsta(newTableInsta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__TABLE_INSTA, newTableInsta, newTableInsta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionInstalment getWhereInsta() {
		return whereInsta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhereInsta(ConditionInstalment newWhereInsta, NotificationChain msgs) {
		ConditionInstalment oldWhereInsta = whereInsta;
		whereInsta = newWhereInsta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__WHERE_INSTA, oldWhereInsta, newWhereInsta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereInsta(ConditionInstalment newWhereInsta) {
		if (newWhereInsta != whereInsta) {
			NotificationChain msgs = null;
			if (whereInsta != null)
				msgs = ((InternalEObject)whereInsta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeletePackage.DELETE_SURFACE__WHERE_INSTA, null, msgs);
			if (newWhereInsta != null)
				msgs = ((InternalEObject)newWhereInsta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeletePackage.DELETE_SURFACE__WHERE_INSTA, null, msgs);
			msgs = basicSetWhereInsta(newWhereInsta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__WHERE_INSTA, newWhereInsta, newWhereInsta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortInstalment getSortInstalment() {
		return sortInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortInstalment(SortInstalment newSortInstalment, NotificationChain msgs) {
		SortInstalment oldSortInstalment = sortInstalment;
		sortInstalment = newSortInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__SORT_INSTALMENT, oldSortInstalment, newSortInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortInstalment(SortInstalment newSortInstalment) {
		if (newSortInstalment != sortInstalment) {
			NotificationChain msgs = null;
			if (sortInstalment != null)
				msgs = ((InternalEObject)sortInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeletePackage.DELETE_SURFACE__SORT_INSTALMENT, null, msgs);
			if (newSortInstalment != null)
				msgs = ((InternalEObject)newSortInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeletePackage.DELETE_SURFACE__SORT_INSTALMENT, null, msgs);
			msgs = basicSetSortInstalment(newSortInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__SORT_INSTALMENT, newSortInstalment, newSortInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dummy getDummy() {
		return dummy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDummy(Dummy newDummy, NotificationChain msgs) {
		Dummy oldDummy = dummy;
		dummy = newDummy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__DUMMY, oldDummy, newDummy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDummy(Dummy newDummy) {
		if (newDummy != dummy) {
			NotificationChain msgs = null;
			if (dummy != null)
				msgs = ((InternalEObject)dummy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeletePackage.DELETE_SURFACE__DUMMY, null, msgs);
			if (newDummy != null)
				msgs = ((InternalEObject)newDummy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeletePackage.DELETE_SURFACE__DUMMY, null, msgs);
			msgs = basicSetDummy(newDummy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__DUMMY, newDummy, newDummy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<Type>(Type.class, this, DeletePackage.DELETE_SURFACE__TYPES);
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
			funcs = new EObjectResolvingEList<FunctionDef>(FunctionDef.class, this, DeletePackage.DELETE_SURFACE__FUNCS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__ASSOCIATED_CLASS, oldAssociatedClass, associatedClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__USER_NAME, oldUserName, userName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.DELETE_SURFACE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeletePackage.DELETE_SURFACE__INPUT_INSTA:
				return basicSetInputInsta(null, msgs);
			case DeletePackage.DELETE_SURFACE__TABLE_INSTA:
				return basicSetTableInsta(null, msgs);
			case DeletePackage.DELETE_SURFACE__WHERE_INSTA:
				return basicSetWhereInsta(null, msgs);
			case DeletePackage.DELETE_SURFACE__SORT_INSTALMENT:
				return basicSetSortInstalment(null, msgs);
			case DeletePackage.DELETE_SURFACE__DUMMY:
				return basicSetDummy(null, msgs);
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
			case DeletePackage.DELETE_SURFACE__INPUT_INSTA:
				return getInputInsta();
			case DeletePackage.DELETE_SURFACE__TABLE_INSTA:
				return getTableInsta();
			case DeletePackage.DELETE_SURFACE__WHERE_INSTA:
				return getWhereInsta();
			case DeletePackage.DELETE_SURFACE__SORT_INSTALMENT:
				return getSortInstalment();
			case DeletePackage.DELETE_SURFACE__DUMMY:
				return getDummy();
			case DeletePackage.DELETE_SURFACE__TYPES:
				return getTypes();
			case DeletePackage.DELETE_SURFACE__FUNCS:
				return getFuncs();
			case DeletePackage.DELETE_SURFACE__NAME:
				return getName();
			case DeletePackage.DELETE_SURFACE__DESCRIPTION:
				return getDescription();
			case DeletePackage.DELETE_SURFACE__ASSOCIATED_CLASS:
				return getAssociatedClass();
			case DeletePackage.DELETE_SURFACE__USER_NAME:
				return getUserName();
			case DeletePackage.DELETE_SURFACE__PASSWORD:
				return getPassword();
			case DeletePackage.DELETE_SURFACE__URI:
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
			case DeletePackage.DELETE_SURFACE__INPUT_INSTA:
				setInputInsta((InputInstalment)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__TABLE_INSTA:
				setTableInsta((TableListInstalment)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__WHERE_INSTA:
				setWhereInsta((ConditionInstalment)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__SORT_INSTALMENT:
				setSortInstalment((SortInstalment)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__DUMMY:
				setDummy((Dummy)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__FUNCS:
				getFuncs().clear();
				getFuncs().addAll((Collection<? extends FunctionDef>)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__NAME:
				setName((String)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__ASSOCIATED_CLASS:
				setAssociatedClass((String)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__USER_NAME:
				setUserName((String)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__PASSWORD:
				setPassword((String)newValue);
				return;
			case DeletePackage.DELETE_SURFACE__URI:
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
			case DeletePackage.DELETE_SURFACE__INPUT_INSTA:
				setInputInsta((InputInstalment)null);
				return;
			case DeletePackage.DELETE_SURFACE__TABLE_INSTA:
				setTableInsta((TableListInstalment)null);
				return;
			case DeletePackage.DELETE_SURFACE__WHERE_INSTA:
				setWhereInsta((ConditionInstalment)null);
				return;
			case DeletePackage.DELETE_SURFACE__SORT_INSTALMENT:
				setSortInstalment((SortInstalment)null);
				return;
			case DeletePackage.DELETE_SURFACE__DUMMY:
				setDummy((Dummy)null);
				return;
			case DeletePackage.DELETE_SURFACE__TYPES:
				getTypes().clear();
				return;
			case DeletePackage.DELETE_SURFACE__FUNCS:
				getFuncs().clear();
				return;
			case DeletePackage.DELETE_SURFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeletePackage.DELETE_SURFACE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DeletePackage.DELETE_SURFACE__ASSOCIATED_CLASS:
				setAssociatedClass(ASSOCIATED_CLASS_EDEFAULT);
				return;
			case DeletePackage.DELETE_SURFACE__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case DeletePackage.DELETE_SURFACE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case DeletePackage.DELETE_SURFACE__URI:
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
			case DeletePackage.DELETE_SURFACE__INPUT_INSTA:
				return inputInsta != null;
			case DeletePackage.DELETE_SURFACE__TABLE_INSTA:
				return tableInsta != null;
			case DeletePackage.DELETE_SURFACE__WHERE_INSTA:
				return whereInsta != null;
			case DeletePackage.DELETE_SURFACE__SORT_INSTALMENT:
				return sortInstalment != null;
			case DeletePackage.DELETE_SURFACE__DUMMY:
				return dummy != null;
			case DeletePackage.DELETE_SURFACE__TYPES:
				return types != null && !types.isEmpty();
			case DeletePackage.DELETE_SURFACE__FUNCS:
				return funcs != null && !funcs.isEmpty();
			case DeletePackage.DELETE_SURFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeletePackage.DELETE_SURFACE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DeletePackage.DELETE_SURFACE__ASSOCIATED_CLASS:
				return ASSOCIATED_CLASS_EDEFAULT == null ? associatedClass != null : !ASSOCIATED_CLASS_EDEFAULT.equals(associatedClass);
			case DeletePackage.DELETE_SURFACE__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case DeletePackage.DELETE_SURFACE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case DeletePackage.DELETE_SURFACE__URI:
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

} //DeleteSurfaceImpl
