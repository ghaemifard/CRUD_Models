/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.Node;
import edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment;
import edu.aut.islab.ghaemi.ghaemi.RelationShip;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Select Instalment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySelectInstalmentImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySelectInstalmentImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuerySelectInstalmentImpl extends MinimalEObjectImpl.Container implements QuerySelectInstalment {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationShip> relationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySelectInstalmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.QUERY_SELECT_INSTALMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, GhaemiPackage.QUERY_SELECT_INSTALMENT__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationShip> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<RelationShip>(RelationShip.class, this, GhaemiPackage.QUERY_SELECT_INSTALMENT__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GhaemiPackage.QUERY_SELECT_INSTALMENT__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case GhaemiPackage.QUERY_SELECT_INSTALMENT__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
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
			case GhaemiPackage.QUERY_SELECT_INSTALMENT__NODES:
				return getNodes();
			case GhaemiPackage.QUERY_SELECT_INSTALMENT__RELATIONSHIPS:
				return getRelationships();
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
			case GhaemiPackage.QUERY_SELECT_INSTALMENT__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case GhaemiPackage.QUERY_SELECT_INSTALMENT__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends RelationShip>)newValue);
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
			case GhaemiPackage.QUERY_SELECT_INSTALMENT__NODES:
				getNodes().clear();
				return;
			case GhaemiPackage.QUERY_SELECT_INSTALMENT__RELATIONSHIPS:
				getRelationships().clear();
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
			case GhaemiPackage.QUERY_SELECT_INSTALMENT__NODES:
				return nodes != null && !nodes.isEmpty();
			case GhaemiPackage.QUERY_SELECT_INSTALMENT__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuerySelectInstalmentImpl
