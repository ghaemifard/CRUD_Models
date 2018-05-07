/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.Disjunction;
import edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship;
import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet;

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
 * An implementation of the model object '<em><b>Query Conditional Instalmnet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.QueryConditionalInstalmnetImpl#getDisjunctionrelationships <em>Disjunctionrelationships</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.QueryConditionalInstalmnetImpl#getDisjunctions <em>Disjunctions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryConditionalInstalmnetImpl extends MinimalEObjectImpl.Container implements QueryConditionalInstalmnet {
	/**
	 * The cached value of the '{@link #getDisjunctionrelationships() <em>Disjunctionrelationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjunctionrelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<DisjunctionRelationship> disjunctionrelationships;

	/**
	 * The cached value of the '{@link #getDisjunctions() <em>Disjunctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Disjunction> disjunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryConditionalInstalmnetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.QUERY_CONDITIONAL_INSTALMNET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisjunctionRelationship> getDisjunctionrelationships() {
		if (disjunctionrelationships == null) {
			disjunctionrelationships = new EObjectContainmentEList<DisjunctionRelationship>(DisjunctionRelationship.class, this, GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONRELATIONSHIPS);
		}
		return disjunctionrelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Disjunction> getDisjunctions() {
		if (disjunctions == null) {
			disjunctions = new EObjectContainmentEList<Disjunction>(Disjunction.class, this, GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONS);
		}
		return disjunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONRELATIONSHIPS:
				return ((InternalEList<?>)getDisjunctionrelationships()).basicRemove(otherEnd, msgs);
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONS:
				return ((InternalEList<?>)getDisjunctions()).basicRemove(otherEnd, msgs);
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
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONRELATIONSHIPS:
				return getDisjunctionrelationships();
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONS:
				return getDisjunctions();
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
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONRELATIONSHIPS:
				getDisjunctionrelationships().clear();
				getDisjunctionrelationships().addAll((Collection<? extends DisjunctionRelationship>)newValue);
				return;
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONS:
				getDisjunctions().clear();
				getDisjunctions().addAll((Collection<? extends Disjunction>)newValue);
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
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONRELATIONSHIPS:
				getDisjunctionrelationships().clear();
				return;
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONS:
				getDisjunctions().clear();
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
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONRELATIONSHIPS:
				return disjunctionrelationships != null && !disjunctionrelationships.isEmpty();
			case GhaemiPackage.QUERY_CONDITIONAL_INSTALMNET__DISJUNCTIONS:
				return disjunctions != null && !disjunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QueryConditionalInstalmnetImpl
