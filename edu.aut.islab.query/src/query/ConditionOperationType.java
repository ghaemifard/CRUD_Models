/**
 */
package query;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see query.QueryPackage#getConditionOperationType()
 * @model
 * @generated
 */
public enum ConditionOperationType implements Enumerator {
	/**
	 * The '<em><b>EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(0, "EQUAL", "EQUAL"),

	/**
	 * The '<em><b>GREATER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER(1, "GREATER", "GREATER"),

	/**
	 * The '<em><b>GEREATER Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEREATER_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	GEREATER_EQUAL(2, "GEREATER_Equal", "GEREATER_Equal"),

	/**
	 * The '<em><b>LOWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER(3, "LOWER", "LOWER"),

	/**
	 * The '<em><b>LOWER EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWER_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER_EQUAL(4, "LOWER_EQUAL", "LOWER_EQUAL"),

	/**
	 * The '<em><b>IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_VALUE
	 * @generated
	 * @ordered
	 */
	IN(5, "IN", "IN"),

	/**
	 * The '<em><b>BETWEEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BETWEEN_VALUE
	 * @generated
	 * @ordered
	 */
	BETWEEN(6, "BETWEEN", "BETWEEN");

	/**
	 * The '<em><b>EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 0;

	/**
	 * The '<em><b>GREATER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GREATER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_VALUE = 1;

	/**
	 * The '<em><b>GEREATER Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GEREATER Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEREATER_EQUAL
	 * @model name="GEREATER_Equal"
	 * @generated
	 * @ordered
	 */
	public static final int GEREATER_EQUAL_VALUE = 2;

	/**
	 * The '<em><b>LOWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_VALUE = 3;

	/**
	 * The '<em><b>LOWER EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWER EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWER_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_EQUAL_VALUE = 4;

	/**
	 * The '<em><b>IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_VALUE = 5;

	/**
	 * The '<em><b>BETWEEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BETWEEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BETWEEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BETWEEN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Condition Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionOperationType[] VALUES_ARRAY =
		new ConditionOperationType[] {
			EQUAL,
			GREATER,
			GEREATER_EQUAL,
			LOWER,
			LOWER_EQUAL,
			IN,
			BETWEEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionOperationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Operation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionOperationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionOperationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Operation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionOperationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionOperationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Operation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionOperationType get(int value) {
		switch (value) {
			case EQUAL_VALUE: return EQUAL;
			case GREATER_VALUE: return GREATER;
			case GEREATER_EQUAL_VALUE: return GEREATER_EQUAL;
			case LOWER_VALUE: return LOWER;
			case LOWER_EQUAL_VALUE: return LOWER_EQUAL;
			case IN_VALUE: return IN;
			case BETWEEN_VALUE: return BETWEEN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConditionOperationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConditionOperationType
