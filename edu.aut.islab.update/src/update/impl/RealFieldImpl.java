/**
 */
package update.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import update.LinkField;
import update.MyTable;
import update.RealField;
import update.Subtype;
import update.Type;
import update.UpdatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link update.impl.RealFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link update.impl.RealFieldImpl#getTable <em>Table</em>}</li>
 *   <li>{@link update.impl.RealFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link update.impl.RealFieldImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link update.impl.RealFieldImpl#isListable <em>Listable</em>}</li>
 *   <li>{@link update.impl.RealFieldImpl#getLinkf <em>Linkf</em>}</li>
 *   <li>{@link update.impl.RealFieldImpl#isDistict <em>Distict</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealFieldImpl extends EObjectImpl implements RealField {
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
	 * The cached value of the '{@link #getLinkf() <em>Linkf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkf()
	 * @generated
	 * @ordered
	 */
	protected LinkField linkf;

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
	protected RealFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpdatePackage.Literals.REAL_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpdatePackage.REAL_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyTable getTable() {
		if (eContainerFeatureID() != UpdatePackage.REAL_FIELD__TABLE) return null;
		return (MyTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(MyTable newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, UpdatePackage.REAL_FIELD__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(MyTable newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != UpdatePackage.REAL_FIELD__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, UpdatePackage.MY_TABLE__FAKES, MyTable.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpdatePackage.REAL_FIELD__TABLE, newTable, newTable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpdatePackage.REAL_FIELD__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpdatePackage.REAL_FIELD__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpdatePackage.REAL_FIELD__SUBTYPE, oldSubtype, subtype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpdatePackage.REAL_FIELD__SUBTYPE, oldSubtype, subtype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpdatePackage.REAL_FIELD__LISTABLE, oldListable, listable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkField getLinkf() {
		if (linkf != null && linkf.eIsProxy()) {
			InternalEObject oldLinkf = (InternalEObject)linkf;
			linkf = (LinkField)eResolveProxy(oldLinkf);
			if (linkf != oldLinkf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpdatePackage.REAL_FIELD__LINKF, oldLinkf, linkf));
			}
		}
		return linkf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkField basicGetLinkf() {
		return linkf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkf(LinkField newLinkf, NotificationChain msgs) {
		LinkField oldLinkf = linkf;
		linkf = newLinkf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UpdatePackage.REAL_FIELD__LINKF, oldLinkf, newLinkf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkf(LinkField newLinkf) {
		if (newLinkf != linkf) {
			NotificationChain msgs = null;
			if (linkf != null)
				msgs = ((InternalEObject)linkf).eInverseRemove(this, UpdatePackage.LINK_FIELD__SRC, LinkField.class, msgs);
			if (newLinkf != null)
				msgs = ((InternalEObject)newLinkf).eInverseAdd(this, UpdatePackage.LINK_FIELD__SRC, LinkField.class, msgs);
			msgs = basicSetLinkf(newLinkf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpdatePackage.REAL_FIELD__LINKF, newLinkf, newLinkf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UpdatePackage.REAL_FIELD__DISTICT, oldDistict, distict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UpdatePackage.REAL_FIELD__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((MyTable)otherEnd, msgs);
			case UpdatePackage.REAL_FIELD__LINKF:
				if (linkf != null)
					msgs = ((InternalEObject)linkf).eInverseRemove(this, UpdatePackage.LINK_FIELD__SRC, LinkField.class, msgs);
				return basicSetLinkf((LinkField)otherEnd, msgs);
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
			case UpdatePackage.REAL_FIELD__TABLE:
				return basicSetTable(null, msgs);
			case UpdatePackage.REAL_FIELD__LINKF:
				return basicSetLinkf(null, msgs);
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
			case UpdatePackage.REAL_FIELD__TABLE:
				return eInternalContainer().eInverseRemove(this, UpdatePackage.MY_TABLE__FAKES, MyTable.class, msgs);
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
			case UpdatePackage.REAL_FIELD__NAME:
				return getName();
			case UpdatePackage.REAL_FIELD__TABLE:
				return getTable();
			case UpdatePackage.REAL_FIELD__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case UpdatePackage.REAL_FIELD__SUBTYPE:
				if (resolve) return getSubtype();
				return basicGetSubtype();
			case UpdatePackage.REAL_FIELD__LISTABLE:
				return isListable();
			case UpdatePackage.REAL_FIELD__LINKF:
				if (resolve) return getLinkf();
				return basicGetLinkf();
			case UpdatePackage.REAL_FIELD__DISTICT:
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
			case UpdatePackage.REAL_FIELD__NAME:
				setName((String)newValue);
				return;
			case UpdatePackage.REAL_FIELD__TABLE:
				setTable((MyTable)newValue);
				return;
			case UpdatePackage.REAL_FIELD__TYPE:
				setType((Type)newValue);
				return;
			case UpdatePackage.REAL_FIELD__SUBTYPE:
				setSubtype((Subtype)newValue);
				return;
			case UpdatePackage.REAL_FIELD__LISTABLE:
				setListable((Boolean)newValue);
				return;
			case UpdatePackage.REAL_FIELD__LINKF:
				setLinkf((LinkField)newValue);
				return;
			case UpdatePackage.REAL_FIELD__DISTICT:
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
			case UpdatePackage.REAL_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UpdatePackage.REAL_FIELD__TABLE:
				setTable((MyTable)null);
				return;
			case UpdatePackage.REAL_FIELD__TYPE:
				setType((Type)null);
				return;
			case UpdatePackage.REAL_FIELD__SUBTYPE:
				setSubtype((Subtype)null);
				return;
			case UpdatePackage.REAL_FIELD__LISTABLE:
				setListable(LISTABLE_EDEFAULT);
				return;
			case UpdatePackage.REAL_FIELD__LINKF:
				setLinkf((LinkField)null);
				return;
			case UpdatePackage.REAL_FIELD__DISTICT:
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
			case UpdatePackage.REAL_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UpdatePackage.REAL_FIELD__TABLE:
				return getTable() != null;
			case UpdatePackage.REAL_FIELD__TYPE:
				return type != null;
			case UpdatePackage.REAL_FIELD__SUBTYPE:
				return subtype != null;
			case UpdatePackage.REAL_FIELD__LISTABLE:
				return listable != LISTABLE_EDEFAULT;
			case UpdatePackage.REAL_FIELD__LINKF:
				return linkf != null;
			case UpdatePackage.REAL_FIELD__DISTICT:
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
		result.append(", listable: ");
		result.append(listable);
		result.append(", distict: ");
		result.append(distict);
		result.append(')');
		return result.toString();
	}

} //RealFieldImpl
