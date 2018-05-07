/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.Node;
import edu.aut.islab.ghaemi.ghaemi.Subtypes;
import edu.aut.islab.ghaemi.ghaemi.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.NodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.NodeImpl#getSubtypes <em>Subtypes</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.NodeImpl#getID <em>ID</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.NodeImpl#isAsOutput <em>As Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends MinimalEObjectImpl.Container implements Node {
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
	 * The cached value of the '{@link #getSubtypes() <em>Subtypes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected Subtypes subtypes;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isAsOutput() <em>As Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsOutput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AS_OUTPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAsOutput() <em>As Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAsOutput()
	 * @generated
	 * @ordered
	 */
	protected boolean asOutput = AS_OUTPUT_EDEFAULT;

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
		return GhaemiPackage.Literals.NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.NODE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtypes getSubtypes() {
		if (subtypes != null && subtypes.eIsProxy()) {
			InternalEObject oldSubtypes = (InternalEObject)subtypes;
			subtypes = (Subtypes)eResolveProxy(oldSubtypes);
			if (subtypes != oldSubtypes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.NODE__SUBTYPES, oldSubtypes, subtypes));
			}
		}
		return subtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtypes basicGetSubtypes() {
		return subtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtypes(Subtypes newSubtypes) {
		Subtypes oldSubtypes = subtypes;
		subtypes = newSubtypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.NODE__SUBTYPES, oldSubtypes, subtypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.NODE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAsOutput() {
		return asOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsOutput(boolean newAsOutput) {
		boolean oldAsOutput = asOutput;
		asOutput = newAsOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.NODE__AS_OUTPUT, oldAsOutput, asOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GhaemiPackage.NODE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case GhaemiPackage.NODE__SUBTYPES:
				if (resolve) return getSubtypes();
				return basicGetSubtypes();
			case GhaemiPackage.NODE__ID:
				return getID();
			case GhaemiPackage.NODE__AS_OUTPUT:
				return isAsOutput();
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
			case GhaemiPackage.NODE__TYPE:
				setType((Type)newValue);
				return;
			case GhaemiPackage.NODE__SUBTYPES:
				setSubtypes((Subtypes)newValue);
				return;
			case GhaemiPackage.NODE__ID:
				setID((String)newValue);
				return;
			case GhaemiPackage.NODE__AS_OUTPUT:
				setAsOutput((Boolean)newValue);
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
			case GhaemiPackage.NODE__TYPE:
				setType((Type)null);
				return;
			case GhaemiPackage.NODE__SUBTYPES:
				setSubtypes((Subtypes)null);
				return;
			case GhaemiPackage.NODE__ID:
				setID(ID_EDEFAULT);
				return;
			case GhaemiPackage.NODE__AS_OUTPUT:
				setAsOutput(AS_OUTPUT_EDEFAULT);
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
			case GhaemiPackage.NODE__TYPE:
				return type != null;
			case GhaemiPackage.NODE__SUBTYPES:
				return subtypes != null;
			case GhaemiPackage.NODE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GhaemiPackage.NODE__AS_OUTPUT:
				return asOutput != AS_OUTPUT_EDEFAULT;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", asOutput: ");
		result.append(asOutput);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
