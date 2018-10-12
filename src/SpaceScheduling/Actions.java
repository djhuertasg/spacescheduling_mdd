/**
 */
package SpaceScheduling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import SpaceScheduling.Attributes;
/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.Actions#getFriendlyName <em>Friendly Name</em>}</li>
 *   <li>{@link SpaceScheduling.Actions#getDescription <em>Description</em>}</li>
 *   <li>{@link SpaceScheduling.Actions#getInputs <em>Inputs</em>}</li>
 *   <li>{@link SpaceScheduling.Actions#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link SpaceScheduling.Actions#getFunction <em>Function</em>}</li>
 *   <li>{@link SpaceScheduling.Actions#getRedirect <em>Redirect</em>}</li>
 * </ul>
 *
 * @see SpaceScheduling.SpaceSchedulingPackage#getActions()
 * @model
 * @generated
 */
public interface Actions extends EObject {
	/**
	 * Returns the value of the '<em><b>Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friendly Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friendly Name</em>' attribute.
	 * @see #setFriendlyName(String)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getActions_FriendlyName()
	 * @model
	 * @generated
	 */
	String getFriendlyName();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Actions#getFriendlyName <em>Friendly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friendly Name</em>' attribute.
	 * @see #getFriendlyName()
	 * @generated
	 */
	void setFriendlyName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getActions_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Actions#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' attribute.
	 * @see #setInputs(String)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getActions_Inputs()
	 * @model
	 * @generated
	 */
	Attributes getInputs();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Actions#getInputs <em>Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' attribute.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(Attributes value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' attribute.
	 * @see #setOutputs(String)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getActions_Outputs()
	 * @model
	 * @generated
	 */
	Attributes getOutputs();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Actions#getOutputs <em>Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' attribute.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(Attributes value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getActions_Function()
	 * @model
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Actions#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>Redirect</b></em>' containment reference list.
	 * The list contents are of type {@link SpaceScheduling.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redirect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirect</em>' containment reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getActions_Redirect()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getRedirect();

} // Actions
