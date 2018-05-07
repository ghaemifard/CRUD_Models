/**
 */
package delete.impl;

import delete.DeletePackage;
import delete.Node;
import delete.Subtype;
import delete.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link delete.impl.NodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link delete.impl.NodeImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link delete.impl.NodeImpl#getColumn_name <em>Column name</em>}</li>
 *   <li>{@link delete.impl.NodeImpl#isListable <em>Listable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends AbstractNodeImpl implements Node {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtype()
	 * @generated
	 * @ordered
	 */
	protected Subtype subtype;

	/**
	 * The default value of the '{@link #getColumn_name() <em>Column name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn_name()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn_name() <em>Column name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn_name()
	 * @generated
	 * @ordered
	 */
	protected String column_name = COLUMN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isListable() <em>Listable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isListable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LISTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isListable() <em>Listable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isListable()
	 * @generated
	 * @ordered
	 */
	protected boolean listable = LISTABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeletePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeletePackage.NODE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtype getSubtype() {
		if (subtype != null && subtype.eIsProxy()) {
			InternalEObject oldSubtype = (InternalEObject)subtype;
			subtype = (Subtype)eResolveProxy(oldSubtype);
			if (subtype != oldSubtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeletePackage.NODE__SUBTYPE, oldSubtype, subtype));
			}
		}
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtype basicGetSubtype() {
		return subtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtype(Subtype newSubtype) {
		Subtype oldSubtype = subtype;
		subtype = newSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.NODE__SUBTYPE, oldSubtype, subtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn_name() {
		return column_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn_name(String newColumn_name) {
		String oldColumn_name = column_name;
		column_name = newColumn_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.NODE__COLUMN_NAME, oldColumn_name, column_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isListable() {
		return listable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListable(boolean newListable) {
		boolean oldListable = listable;
		listable = newListable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.NODE__LISTABLE, oldListable, listable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeletePackage.NODE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case DeletePackage.NODE__SUBTYPE:
				if (resolve) return getSubtype();
				return basicGetSubtype();
			case DeletePackage.NODE__COLUMN_NAME:
				return getColumn_name();
			case DeletePackage.NODE__LISTABLE:
				return isListable();
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
			case DeletePackage.NODE__TYPE:
				setType((Type)newValue);
				return;
			case DeletePackage.NODE__SUBTYPE:
				setSubtype((Subtype)newValue);
				return;
			case DeletePackage.NODE__COLUMN_NAME:
				setColumn_name((String)newValue);
				return;
			case DeletePackage.NODE__LISTABLE:
				setListable((Boolean)newValue);
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
			case DeletePackage.NODE__TYPE:
				setType((Type)null);
				return;
			case DeletePackage.NODE__SUBTYPE:
				setSubtype((Subtype)null);
				return;
			case DeletePackage.NODE__COLUMN_NAME:
				setColumn_name(COLUMN_NAME_EDEFAULT);
				return;
			case DeletePackage.NODE__LISTABLE:
				setListable(LISTABLE_EDEFAULT);
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
			case DeletePackage.NODE__TYPE:
				return type != null;
			case DeletePackage.NODE__SUBTYPE:
				return subtype != null;
			case DeletePackage.NODE__COLUMN_NAME:
				return COLUMN_NAME_EDEFAULT == null ? column_name != null : !COLUMN_NAME_EDEFAULT.equals(column_name);
			case DeletePackage.NODE__LISTABLE:
				return listable != LISTABLE_EDEFAULT;
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
		result.append(" (column_name: ");
		result.append(column_name);
		result.append(", listable: ");
		result.append(listable);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
