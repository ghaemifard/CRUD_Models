/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getOperatorType()
 * @model
 * @generated
 */
public enum OperatorType implements Enumerator {
	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(0, "equal", "equal"),

	/**
	 * The '<em><b>GR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GR_VALUE
	 * @generated
	 * @ordered
	 */
	GR(1, "GR", "GR"),

	/**
	 * The '<em><b>GRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRE_VALUE
	 * @generated
	 * @ordered
	 */
	GRE(2, "GRE", "GRE"),

	/**
	 * The '<em><b>LO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LO_VALUE
	 * @generated
	 * @ordered
	 */
	LO(3, "LO", "LO"),

	/**
	 * The '<em><b>LOE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOE_VALUE
	 * @generated
	 * @ordered
	 */
	LOE(4, "LOE", "LOE"),

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
	BETWEEN(6, "BETWEEN", "BETWEEN"),

	/**
	 * The '<em><b>IS NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_NULL_VALUE
	 * @generated
	 * @ordered
	 */
	IS_NULL(7, "IS_NULL", "IS_NULL"),

	/**
	 * The '<em><b>EXIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXIST_VALUE
	 * @generated
	 * @ordered
	 */
	EXIST(8, "EXIST", "EXIST"),

	/**
	 * The '<em><b>LIKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIKE_VALUE
	 * @generated
	 * @ordered
	 */
	LIKE(9, "LIKE", "LIKE");

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 0;

	/**
	 * The '<em><b>GR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GR_VALUE = 1;

	/**
	 * The '<em><b>GRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GRE_VALUE = 2;

	/**
	 * The '<em><b>LO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LO_VALUE = 3;

	/**
	 * The '<em><b>LOE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOE_VALUE = 4;

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
	 * The '<em><b>IS NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IS NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_NULL_VALUE = 7;

	/**
	 * The '<em><b>EXIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXIST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXIST_VALUE = 8;

	/**
	 * The '<em><b>LIKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIKE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIKE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIKE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperatorType[] VALUES_ARRAY =
		new OperatorType[] {
			EQUAL,
			GR,
			GRE,
			LO,
			LOE,
			IN,
			BETWEEN,
			IS_NULL,
			EXIST,
			LIKE,
		};

	/**
	 * A public read-only list of all the '<em><b>Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatorType get(int value) {
		switch (value) {
			case EQUAL_VALUE: return EQUAL;
			case GR_VALUE: return GR;
			case GRE_VALUE: return GRE;
			case LO_VALUE: return LO;
			case LOE_VALUE: return LOE;
			case IN_VALUE: return IN;
			case BETWEEN_VALUE: return BETWEEN;
			case IS_NULL_VALUE: return IS_NULL;
			case EXIST_VALUE: return EXIST;
			case LIKE_VALUE: return LIKE;
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
	private OperatorType(int value, String name, String literal) {
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
	
} //OperatorType
