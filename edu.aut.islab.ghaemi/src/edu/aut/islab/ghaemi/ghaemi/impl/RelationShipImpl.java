/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.Node;
import edu.aut.islab.ghaemi.ghaemi.QueryRelationType;
import edu.aut.islab.ghaemi.ghaemi.RelationShip;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Ship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.RelationShipImpl#getDstNode <em>Dst Node</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.RelationShipImpl#getSrcNode <em>Src Node</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.RelationShipImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationShipImpl extends MinimalEObjectImpl.Container implements RelationShip {
	/**
	 * The cached value of the '{@link #getDstNode() <em>Dst Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstNode()
	 * @generated
	 * @ordered
	 */
	protected Node dstNode;

	/**
	 * The cached value of the '{@link #getSrcNode() <em>Src Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcNode()
	 * @generated
	 * @ordered
	 */
	protected Node srcNode;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QueryRelationType TYPE_EDEFAULT = QueryRelationType.INNER_JOIN;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QueryRelationType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationShipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.RELATION_SHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getDstNode() {
		if (dstNode != null && dstNode.eIsProxy()) {
			InternalEObject oldDstNode = (InternalEObject)dstNode;
			dstNode = (Node)eResolveProxy(oldDstNode);
			if (dstNode != oldDstNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.RELATION_SHIP__DST_NODE, oldDstNode, dstNode));
			}
		}
		return dstNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetDstNode() {
		return dstNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDstNode(Node newDstNode) {
		Node oldDstNode = dstNode;
		dstNode = newDstNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.RELATION_SHIP__DST_NODE, oldDstNode, dstNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getSrcNode() {
		if (srcNode != null && srcNode.eIsProxy()) {
			InternalEObject oldSrcNode = (InternalEObject)srcNode;
			srcNode = (Node)eResolveProxy(oldSrcNode);
			if (srcNode != oldSrcNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.RELATION_SHIP__SRC_NODE, oldSrcNode, srcNode));
			}
		}
		return srcNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSrcNode() {
		return srcNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcNode(Node newSrcNode) {
		Node oldSrcNode = srcNode;
		srcNode = newSrcNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.RELATION_SHIP__SRC_NODE, oldSrcNode, srcNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryRelationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QueryRelationType newType) {
		QueryRelationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.RELATION_SHIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GhaemiPackage.RELATION_SHIP__DST_NODE:
				if (resolve) return getDstNode();
				return basicGetDstNode();
			case GhaemiPackage.RELATION_SHIP__SRC_NODE:
				if (resolve) return getSrcNode();
				return basicGetSrcNode();
			case GhaemiPackage.RELATION_SHIP__TYPE:
				return getType();
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
			case GhaemiPackage.RELATION_SHIP__DST_NODE:
				setDstNode((Node)newValue);
				return;
			case GhaemiPackage.RELATION_SHIP__SRC_NODE:
				setSrcNode((Node)newValue);
				return;
			case GhaemiPackage.RELATION_SHIP__TYPE:
				setType((QueryRelationType)newValue);
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
			case GhaemiPackage.RELATION_SHIP__DST_NODE:
				setDstNode((Node)null);
				return;
			case GhaemiPackage.RELATION_SHIP__SRC_NODE:
				setSrcNode((Node)null);
				return;
			case GhaemiPackage.RELATION_SHIP__TYPE:
				setType(TYPE_EDEFAULT);
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
			case GhaemiPackage.RELATION_SHIP__DST_NODE:
				return dstNode != null;
			case GhaemiPackage.RELATION_SHIP__SRC_NODE:
				return srcNode != null;
			case GhaemiPackage.RELATION_SHIP__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RelationShipImpl
