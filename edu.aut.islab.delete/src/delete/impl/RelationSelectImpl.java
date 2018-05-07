/**
 */
package delete.impl;

import delete.DeletePackage;
import delete.Field;
import delete.RelationSelect;
import delete.RelationSelectOperationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link delete.impl.RelationSelectImpl#getSource <em>Source</em>}</li>
 *   <li>{@link delete.impl.RelationSelectImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link delete.impl.RelationSelectImpl#getOpType <em>Op Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationSelectImpl extends EObjectImpl implements RelationSelect {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Field source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Field target;

	/**
	 * The default value of the '{@link #getOpType() <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpType()
	 * @generated
	 * @ordered
	 */
	protected static final RelationSelectOperationType OP_TYPE_EDEFAULT = RelationSelectOperationType.EQUAL;

	/**
	 * The cached value of the '{@link #getOpType() <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpType()
	 * @generated
	 * @ordered
	 */
	protected RelationSelectOperationType opType = OP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeletePackage.Literals.RELATION_SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Field)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeletePackage.RELATION_SELECT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Field newSource) {
		Field oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.RELATION_SELECT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Field)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeletePackage.RELATION_SELECT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Field newTarget) {
		Field oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.RELATION_SELECT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationSelectOperationType getOpType() {
		return opType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpType(RelationSelectOperationType newOpType) {
		RelationSelectOperationType oldOpType = opType;
		opType = newOpType == null ? OP_TYPE_EDEFAULT : newOpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.RELATION_SELECT__OP_TYPE, oldOpType, opType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeletePackage.RELATION_SELECT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case DeletePackage.RELATION_SELECT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DeletePackage.RELATION_SELECT__OP_TYPE:
				return getOpType();
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
			case DeletePackage.RELATION_SELECT__SOURCE:
				setSource((Field)newValue);
				return;
			case DeletePackage.RELATION_SELECT__TARGET:
				setTarget((Field)newValue);
				return;
			case DeletePackage.RELATION_SELECT__OP_TYPE:
				setOpType((RelationSelectOperationType)newValue);
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
			case DeletePackage.RELATION_SELECT__SOURCE:
				setSource((Field)null);
				return;
			case DeletePackage.RELATION_SELECT__TARGET:
				setTarget((Field)null);
				return;
			case DeletePackage.RELATION_SELECT__OP_TYPE:
				setOpType(OP_TYPE_EDEFAULT);
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
			case DeletePackage.RELATION_SELECT__SOURCE:
				return source != null;
			case DeletePackage.RELATION_SELECT__TARGET:
				return target != null;
			case DeletePackage.RELATION_SELECT__OP_TYPE:
				return opType != OP_TYPE_EDEFAULT;
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
		result.append(" (opType: ");
		result.append(opType);
		result.append(')');
		return result.toString();
	}

} //RelationSelectImpl
