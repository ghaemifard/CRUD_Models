/**
 */
package query;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relation Select Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see query.QueryPackage#getRelationSelectType()
 * @model
 * @generated
 */
public enum RelationSelectType implements Enumerator {
	/**
	 * The '<em><b>Inner Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INNER_JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	INNER_JOIN(0, "InnerJoin", "InnerJoin"),

	/**
	 * The '<em><b>Left Outer Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_OUTER_JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_OUTER_JOIN(1, "LeftOuterJoin", "LeftOuterJoin"),

	/**
	 * The '<em><b>Right Outer Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_OUTER_JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_OUTER_JOIN(2, "RightOuterJoin", "RightOuterJoin"),

	/**
	 * The '<em><b>Full Outer Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_OUTER_JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_OUTER_JOIN(3, "FullOuterJoin", "FullOuterJoin");

	/**
	 * The '<em><b>Inner Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inner Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INNER_JOIN
	 * @model name="InnerJoin"
	 * @generated
	 * @ordered
	 */
	public static final int INNER_JOIN_VALUE = 0;

	/**
	 * The '<em><b>Left Outer Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left Outer Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_OUTER_JOIN
	 * @model name="LeftOuterJoin"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_OUTER_JOIN_VALUE = 1;

	/**
	 * The '<em><b>Right Outer Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Outer Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_OUTER_JOIN
	 * @model name="RightOuterJoin"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_OUTER_JOIN_VALUE = 2;

	/**
	 * The '<em><b>Full Outer Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Full Outer Join</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL_OUTER_JOIN
	 * @model name="FullOuterJoin"
	 * @generated
	 * @ordered
	 */
	public static final int FULL_OUTER_JOIN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Relation Select Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationSelectType[] VALUES_ARRAY =
		new RelationSelectType[] {
			INNER_JOIN,
			LEFT_OUTER_JOIN,
			RIGHT_OUTER_JOIN,
			FULL_OUTER_JOIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Relation Select Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationSelectType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relation Select Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationSelectType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationSelectType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Select Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationSelectType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationSelectType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relation Select Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationSelectType get(int value) {
		switch (value) {
			case INNER_JOIN_VALUE: return INNER_JOIN;
			case LEFT_OUTER_JOIN_VALUE: return LEFT_OUTER_JOIN;
			case RIGHT_OUTER_JOIN_VALUE: return RIGHT_OUTER_JOIN;
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
	private RelationSelectType(int value, String name, String literal) {
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
	
} //RelationSelectType
