/**
 */
package SpaceScheduling;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.Primitive_type#getInt <em>Int</em>}</li>
 *   <li>{@link SpaceScheduling.Primitive_type#getString <em>String</em>}</li>
 *   <li>{@link SpaceScheduling.Primitive_type#getDatetime <em>Datetime</em>}</li>
 * </ul>
 *
 * @see SpaceScheduling.SpaceSchedulingPackage#getPrimitive_type()
 * @model
 * @generated
 */
public interface Primitive_type extends EObject {

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
	 * @see SpaceScheduling.SpaceSchedulingPackage#getPrimitive_type_Int()
	 * @model
	 * @generated
	 */
	Integer getInt();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Primitive_type#getInt <em>Int</em>}' attribute.
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
	 * @see SpaceScheduling.SpaceSchedulingPackage#getPrimitive_type_String()
	 * @model
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Primitive_type#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

	/**
	 * Returns the value of the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime</em>' attribute.
	 * @see #setDatetime(Date)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getPrimitive_type_Datetime()
	 * @model
	 * @generated
	 */
	Date getDatetime();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Primitive_type#getDatetime <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime</em>' attribute.
	 * @see #getDatetime()
	 * @generated
	 */
	void setDatetime(Date value);
} // Primitive_type
