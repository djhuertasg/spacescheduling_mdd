/**
 */
package SpaceScheduling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.Attribute#getPrimitive_type <em>Primitive type</em>}</li>
 *   <li>{@link SpaceScheduling.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link SpaceScheduling.Attribute#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see SpaceScheduling.SpaceSchedulingPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Primitive type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive type</em>' reference.
	 * @see #setPrimitive_type(Primitive_type)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getAttribute_Primitive_type()
	 * @model
	 * @generated
	 */
	Primitive_type getPrimitive_type();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Attribute#getPrimitive_type <em>Primitive type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive type</em>' reference.
	 * @see #getPrimitive_type()
	 * @generated
	 */
	void setPrimitive_type(Primitive_type value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' attribute list.
	 * The list contents are of type {@link SpaceScheduling.Enumeration}.
	 * The literals are from the enumeration {@link SpaceScheduling.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' attribute list.
	 * @see SpaceScheduling.Enumeration
	 * @see SpaceScheduling.SpaceSchedulingPackage#getAttribute_Enumeration()
	 * @model
	 * @generated
	 */
	EList<Enumeration> getEnumeration();

} // Attribute
