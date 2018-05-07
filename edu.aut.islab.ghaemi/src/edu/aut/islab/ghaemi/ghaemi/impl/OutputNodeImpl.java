/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.Node;
import edu.aut.islab.ghaemi.ghaemi.OutputNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.OutputNodeImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.OutputNodeImpl#getNodeRef <em>Node Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputNodeImpl extends MinimalEObjectImpl.Container implements OutputNode {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodeRef() <em>Node Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeRef()
	 * @generated
	 * @ordered
	 */
	protected Node nodeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.OUTPUT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.OUTPUT_NODE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNodeRef() {
		if (nodeRef != null && nodeRef.eIsProxy()) {
			InternalEObject oldNodeRef = (InternalEObject)nodeRef;
			nodeRef = (Node)eResolveProxy(oldNodeRef);
			if (nodeRef != oldNodeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.OUTPUT_NODE__NODE_REF, oldNodeRef, nodeRef));
			}
		}
		return nodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNodeRef() {
		return nodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeRef(Node newNodeRef) {
		Node oldNodeRef = nodeRef;
		nodeRef = newNodeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.OUTPUT_NODE__NODE_REF, oldNodeRef, nodeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GhaemiPackage.OUTPUT_NODE__INDEX:
				return getIndex();
			case GhaemiPackage.OUTPUT_NODE__NODE_REF:
				if (resolve) return getNodeRef();
				return basicGetNodeRef();
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
			case GhaemiPackage.OUTPUT_NODE__INDEX:
				setIndex((Integer)newValue);
				return;
			case GhaemiPackage.OUTPUT_NODE__NODE_REF:
				setNodeRef((Node)newValue);
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
			case GhaemiPackage.OUTPUT_NODE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case GhaemiPackage.OUTPUT_NODE__NODE_REF:
				setNodeRef((Node)null);
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
			case GhaemiPackage.OUTPUT_NODE__INDEX:
				return index != INDEX_EDEFAULT;
			case GhaemiPackage.OUTPUT_NODE__NODE_REF:
				return nodeRef != null;
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
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //OutputNodeImpl
