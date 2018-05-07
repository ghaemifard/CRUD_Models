/**
 */
package insert.impl;

import insert.Field;
import insert.InsertPackage;
import insert.Table;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link insert.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link insert.impl.FieldImpl#getTable <em>Table</em>}</li>
 *   <li>{@link insert.impl.FieldImpl#getTableName <em>Table Name</em>}</li>
 *   <li>{@link insert.impl.FieldImpl#getTable_ref <em>Table ref</em>}</li>
 *   <li>{@link insert.impl.FieldImpl#isDistict <em>Distict</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends NodeImpl implements Field {
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
	 * The default value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableName() <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableName()
	 * @generated
	 * @ordered
	 */
	protected String tableName = TABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTable_ref() <em>Table ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable_ref()
	 * @generated
	 * @ordered
	 */
	protected Table table_ref;

	/**
	 * The default value of the '{@link #isDistict() <em>Distict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistict()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTICT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDistict() <em>Distict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistict()
	 * @generated
	 * @ordered
	 */
	protected boolean distict = DISTICT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InsertPackage.Literals.FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (eContainerFeatureID() != InsertPackage.FIELD__TABLE) return null;
		return (Table)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, InsertPackage.FIELD__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != InsertPackage.FIELD__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, InsertPackage.TABLE__FIELDS, Table.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.FIELD__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableName(String newTableName) {
		String oldTableName = tableName;
		tableName = newTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.FIELD__TABLE_NAME, oldTableName, tableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable_ref() {
		if (table_ref != null && table_ref.eIsProxy()) {
			InternalEObject oldTable_ref = (InternalEObject)table_ref;
			table_ref = (Table)eResolveProxy(oldTable_ref);
			if (table_ref != oldTable_ref) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InsertPackage.FIELD__TABLE_REF, oldTable_ref, table_ref));
			}
		}
		return table_ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetTable_ref() {
		return table_ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable_ref(Table newTable_ref) {
		Table oldTable_ref = table_ref;
		table_ref = newTable_ref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.FIELD__TABLE_REF, oldTable_ref, table_ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistict() {
		return distict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistict(boolean newDistict) {
		boolean oldDistict = distict;
		distict = newDistict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InsertPackage.FIELD__DISTICT, oldDistict, distict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InsertPackage.FIELD__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((Table)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InsertPackage.FIELD__TABLE:
				return basicSetTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InsertPackage.FIELD__TABLE:
				return eInternalContainer().eInverseRemove(this, InsertPackage.TABLE__FIELDS, Table.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InsertPackage.FIELD__NAME:
				return getName();
			case InsertPackage.FIELD__TABLE:
				return getTable();
			case InsertPackage.FIELD__TABLE_NAME:
				return getTableName();
			case InsertPackage.FIELD__TABLE_REF:
				if (resolve) return getTable_ref();
				return basicGetTable_ref();
			case InsertPackage.FIELD__DISTICT:
				return isDistict();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InsertPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case InsertPackage.FIELD__TABLE:
				setTable((Table)newValue);
				return;
			case InsertPackage.FIELD__TABLE_NAME:
				setTableName((String)newValue);
				return;
			case InsertPackage.FIELD__TABLE_REF:
				setTable_ref((Table)newValue);
				return;
			case InsertPackage.FIELD__DISTICT:
				setDistict((Boolean)newValue);
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
			case InsertPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InsertPackage.FIELD__TABLE:
				setTable((Table)null);
				return;
			case InsertPackage.FIELD__TABLE_NAME:
				setTableName(TABLE_NAME_EDEFAULT);
				return;
			case InsertPackage.FIELD__TABLE_REF:
				setTable_ref((Table)null);
				return;
			case InsertPackage.FIELD__DISTICT:
				setDistict(DISTICT_EDEFAULT);
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
			case InsertPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InsertPackage.FIELD__TABLE:
				return getTable() != null;
			case InsertPackage.FIELD__TABLE_NAME:
				return TABLE_NAME_EDEFAULT == null ? tableName != null : !TABLE_NAME_EDEFAULT.equals(tableName);
			case InsertPackage.FIELD__TABLE_REF:
				return table_ref != null;
			case InsertPackage.FIELD__DISTICT:
				return distict != DISTICT_EDEFAULT;
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
		result.append(", tableName: ");
		result.append(tableName);
		result.append(", distict: ");
		result.append(distict);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
