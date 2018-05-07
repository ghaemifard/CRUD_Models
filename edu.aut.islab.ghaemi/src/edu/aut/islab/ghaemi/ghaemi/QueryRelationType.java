/**
 */
package edu.aut.islab.ghaemi.ghaemi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Query Relation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getQueryRelationType()
 * @model
 * @generated
 */
public enum QueryRelationType implements Enumerator {
	/**
	 * The '<em><b>Inner join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INNER_JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	INNER_JOIN(0, "inner_join", "inner_join"),

	/**
	 * The '<em><b>Left outer join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_OUTER_JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_OUTER_JOIN(1, "left_outer_join", "left_outer_join"),

	/**
	 * The '<em><b>Eight outer join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHT_OUTER_JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	EIGHT_OUTER_JOIN(2, "eight_outer_join", "eight_outer_join"),

	/**
	 * The '<em><b>Full outer join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_OUTER_JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_OUTER_JOIN(3, "full_outer_join", "full_outer_join");

	/**
	 * The '<em><b>Inner join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inner join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INNER_JOIN
	 * @model name="inner_join"
	 * @generated
	 * @ordered
	 */
	public static final int INNER_JOIN_VALUE = 0;

	/**
	 * The '<em><b>Left outer join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left outer join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_OUTER_JOIN
	 * @model name="left_outer_join"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_OUTER_JOIN_VALUE = 1;

	/**
	 * The '<em><b>Eight outer join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eight outer join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EIGHT_OUTER_JOIN
	 * @model name="eight_outer_join"
	 * @generated
	 * @ordered
	 */
	public static final int EIGHT_OUTER_JOIN_VALUE = 2;

	/**
	 * The '<em><b>Full outer join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Full outer join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL_OUTER_JOIN
	 * @model name="full_outer_join"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_OUTER_JOIN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Query Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final QueryRelationType[] VALUES_ARRAY =
		new QueryRelationType[] {
			INNER_JOIN,
			LEFT_OUTER_JOIN,
			EIGHT_OUTER_JOIN,
			FULL_OUTER_JOIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Query Relation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<QueryRelationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Query Relation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryRelationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueryRelationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Query Relation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryRelationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			QueryRelationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Query Relation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static QueryRelationType get(int value) {
		switch (value) {
			case INNER_JOIN_VALUE: return INNER_JOIN;
			case LEFT_OUTER_JOIN_VALUE: return LEFT_OUTER_JOIN;
			case EIGHT_OUTER_JOIN_VALUE: return EIGHT_OUTER_JOIN;
			case FULL_OUTER_JOIN_VALUE: return FULL_OUTER_JOIN;
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
	private QueryRelationType(int value, String name, String literal) {
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
	
} //QueryRelationType
