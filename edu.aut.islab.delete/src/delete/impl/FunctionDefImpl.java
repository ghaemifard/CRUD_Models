/**
 */
package delete.impl;

import delete.DeletePackage;
import delete.FunctionDef;
import delete.Subtype;
import delete.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link delete.impl.FunctionDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link delete.impl.FunctionDefImpl#getReturntype <em>Returntype</em>}</li>
 *   <li>{@link delete.impl.FunctionDefImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDefImpl extends EObjectImpl implements FunctionDef {
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
	 * The cached value of the '{@link #getReturntype() <em>Returntype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturntype()
	 * @generated
	 * @ordered
	 */
	protected Subtype returntype;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected Type args;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeletePackage.Literals.FUNCTION_DEF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.FUNCTION_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtype getReturntype() {
		if (returntype != null && returntype.eIsProxy()) {
			InternalEObject oldReturntype = (InternalEObject)returntype;
			returntype = (Subtype)eResolveProxy(oldReturntype);
			if (returntype != oldReturntype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeletePackage.FUNCTION_DEF__RETURNTYPE, oldReturntype, returntype));
			}
		}
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtype basicGetReturntype() {
		return returntype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturntype(Subtype newReturntype) {
		Subtype oldReturntype = returntype;
		returntype = newReturntype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.FUNCTION_DEF__RETURNTYPE, oldReturntype, returntype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getArgs() {
		if (args != null && args.eIsProxy()) {
			InternalEObject oldArgs = (InternalEObject)args;
			args = (Type)eResolveProxy(oldArgs);
			if (args != oldArgs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeletePackage.FUNCTION_DEF__ARGS, oldArgs, args));
			}
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgs(Type newArgs) {
		Type oldArgs = args;
		args = newArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeletePackage.FUNCTION_DEF__ARGS, oldArgs, args));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeletePackage.FUNCTION_DEF__NAME:
				return getName();
			case DeletePackage.FUNCTION_DEF__RETURNTYPE:
				if (resolve) return getReturntype();
				return basicGetReturntype();
			case DeletePackage.FUNCTION_DEF__ARGS:
				if (resolve) return getArgs();
				return basicGetArgs();
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
			case DeletePackage.FUNCTION_DEF__NAME:
				setName((String)newValue);
				return;
			case DeletePackage.FUNCTION_DEF__RETURNTYPE:
				setReturntype((Subtype)newValue);
				return;
			case DeletePackage.FUNCTION_DEF__ARGS:
				setArgs((Type)newValue);
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
			case DeletePackage.FUNCTION_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeletePackage.FUNCTION_DEF__RETURNTYPE:
				setReturntype((Subtype)null);
				return;
			case DeletePackage.FUNCTION_DEF__ARGS:
				setArgs((Type)null);
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
			case DeletePackage.FUNCTION_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeletePackage.FUNCTION_DEF__RETURNTYPE:
				return returntype != null;
			case DeletePackage.FUNCTION_DEF__ARGS:
				return args != null;
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
		result.append(')');
		return result.toString();
	}

} //FunctionDefImpl
