/**
 */
package SpaceScheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.Controller#getHelpers <em>Helpers</em>}</li>
 *   <li>{@link SpaceScheduling.Controller#getActions <em>Actions</em>}</li>
 *   <li>{@link SpaceScheduling.Controller#getUse <em>Use</em>}</li>
 *   <li>{@link SpaceScheduling.Controller#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see SpaceScheduling.SpaceSchedulingPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Helpers</b></em>' containment reference list.
	 * The list contents are of type {@link SpaceScheduling.Helpers}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helpers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helpers</em>' containment reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getController_Helpers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Helpers> getHelpers();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link SpaceScheduling.Actions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getController_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actions> getActions();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link SpaceScheduling.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getController_Use()
	 * @model
	 * @generated
	 */
	EList<Model> getUse();

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
	 * @see SpaceScheduling.SpaceSchedulingPackage#getController_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Controller#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Controller
