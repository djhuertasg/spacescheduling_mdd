/**
 */
package SpaceScheduling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.Attributes#getName <em>Name</em>}</li>
 *   <li>{@link SpaceScheduling.Attributes#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see SpaceScheduling.SpaceSchedulingPackage#getAttributes()
 * @model
 * @generated
 */
public interface Attributes extends EObject {
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
	 * @see SpaceScheduling.SpaceSchedulingPackage#getAttributes_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Attributes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link SpaceScheduling.EType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see SpaceScheduling.EType
	 * @see #setType(EType)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getAttributes_Type()
	 * @model
	 * @generated
	 */
	EType getType();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Attributes#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see SpaceScheduling.EType
	 * @see #getType()
	 * @generated
	 */
	void setType(EType value);

} // Attributes
