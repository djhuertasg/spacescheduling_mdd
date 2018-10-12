/**
 */
package SpaceScheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.Return_type#getPrimitive_type <em>Primitive type</em>}</li>
 *   <li>{@link SpaceScheduling.Return_type#getClass_ <em>Class</em>}</li>
 *   <li>{@link SpaceScheduling.Return_type#getVoid <em>Void</em>}</li>
 *   <li>{@link SpaceScheduling.Return_type#getInt <em>Int</em>}</li>
 *   <li>{@link SpaceScheduling.Return_type#getString <em>String</em>}</li>
 * </ul>
 *
 * @see SpaceScheduling.SpaceSchedulingPackage#getReturn_type()
 * @model
 * @generated
 */
public interface Return_type extends EObject {
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
	 * @see SpaceScheduling.SpaceSchedulingPackage#getReturn_type_Primitive_type()
	 * @model
	 * @generated
	 */
	Primitive_type getPrimitive_type();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Return_type#getPrimitive_type <em>Primitive type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive type</em>' reference.
	 * @see #getPrimitive_type()
	 * @generated
	 */
	void setPrimitive_type(Primitive_type value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference list.
	 * The list contents are of type {@link SpaceScheduling.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getReturn_type_Class()
	 * @model
	 * @generated
	 */
	EList<SpaceScheduling.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Void</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Void</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Void</em>' attribute.
	 * @see #setVoid(Boolean)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getReturn_type_Void()
	 * @model
	 * @generated
	 */
	Boolean getVoid();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Return_type#getVoid <em>Void</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Void</em>' attribute.
	 * @see #getVoid()
	 * @generated
	 */
	void setVoid(Boolean value);

	/**
	 * Returns the value of the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int</em>' attribute.
	 * @see #setInt(Integer)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getReturn_type_Int()
	 * @model
	 * @generated
	 */
	Integer getInt();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Return_type#getInt <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int</em>' attribute.
	 * @see #getInt()
	 * @generated
	 */
	void setInt(Integer value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getReturn_type_String()
	 * @model
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Return_type#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

} // Return_type
