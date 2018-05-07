/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.ConditionalOperator;
import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.Node;
import edu.aut.islab.ghaemi.ghaemi.Term;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.TermImpl#getOperand_one <em>Operand one</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.TermImpl#getOperand_two <em>Operand two</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.TermImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermImpl extends AbstractCondElementImpl implements Term {
	/**
	 * The cached value of the '{@link #getOperand_one() <em>Operand one</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand_one()
	 * @generated
	 * @ordered
	 */
	protected Node operand_one;

	/**
	 * The cached value of the '{@link #getOperand_two() <em>Operand two</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand_two()
	 * @generated
	 * @ordered
	 */
	protected Node operand_two;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected ConditionalOperator operator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getOperand_one() {
		if (operand_one != null && operand_one.eIsProxy()) {
			InternalEObject oldOperand_one = (InternalEObject)operand_one;
			operand_one = (Node)eResolveProxy(oldOperand_one);
			if (operand_one != oldOperand_one) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.TERM__OPERAND_ONE, oldOperand_one, operand_one));
			}
		}
		return operand_one;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetOperand_one() {
		return operand_one;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand_one(Node newOperand_one) {
		Node oldOperand_one = operand_one;
		operand_one = newOperand_one;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.TERM__OPERAND_ONE, oldOperand_one, operand_one));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getOperand_two() {
		if (operand_two != null && operand_two.eIsProxy()) {
			InternalEObject oldOperand_two = (InternalEObject)operand_two;
			operand_two = (Node)eResolveProxy(oldOperand_two);
			if (operand_two != oldOperand_two) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.TERM__OPERAND_TWO, oldOperand_two, operand_two));
			}
		}
		return operand_two;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetOperand_two() {
		return operand_two;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperand_two(Node newOperand_two) {
		Node oldOperand_two = operand_two;
		operand_two = newOperand_two;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.TERM__OPERAND_TWO, oldOperand_two, operand_two));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalOperator getOperator() {
		if (operator != null && operator.eIsProxy()) {
			InternalEObject oldOperator = (InternalEObject)operator;
			operator = (ConditionalOperator)eResolveProxy(oldOperator);
			if (operator != oldOperator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.TERM__OPERATOR, oldOperator, operator));
			}
		}
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalOperator basicGetOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(ConditionalOperator newOperator) {
		ConditionalOperator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.TERM__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GhaemiPackage.TERM__OPERAND_ONE:
				if (resolve) return getOperand_one();
				return basicGetOperand_one();
			case GhaemiPackage.TERM__OPERAND_TWO:
				if (resolve) return getOperand_two();
				return basicGetOperand_two();
			case GhaemiPackage.TERM__OPERATOR:
				if (resolve) return getOperator();
				return basicGetOperator();
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
			case GhaemiPackage.TERM__OPERAND_ONE:
				setOperand_one((Node)newValue);
				return;
			case GhaemiPackage.TERM__OPERAND_TWO:
				setOperand_two((Node)newValue);
				return;
			case GhaemiPackage.TERM__OPERATOR:
				setOperator((ConditionalOperator)newValue);
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
			case GhaemiPackage.TERM__OPERAND_ONE:
				setOperand_one((Node)null);
				return;
			case GhaemiPackage.TERM__OPERAND_TWO:
				setOperand_two((Node)null);
				return;
			case GhaemiPackage.TERM__OPERATOR:
				setOperator((ConditionalOperator)null);
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
			case GhaemiPackage.TERM__OPERAND_ONE:
				return operand_one != null;
			case GhaemiPackage.TERM__OPERAND_TWO:
				return operand_two != null;
			case GhaemiPackage.TERM__OPERATOR:
				return operator != null;
		}
		return super.eIsSet(featureID);
	}

} //TermImpl
