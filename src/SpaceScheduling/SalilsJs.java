/**
 */
package SpaceScheduling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salils Js</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.SalilsJs#getModel <em>Model</em>}</li>
 *   <li>{@link SpaceScheduling.SalilsJs#getController <em>Controller</em>}</li>
 *   <li>{@link SpaceScheduling.SalilsJs#getView <em>View</em>}</li>
 * </ul>
 *
 * @see SpaceScheduling.SpaceSchedulingPackage#getSalilsJs()
 * @model
 * @generated
 */
public interface SalilsJs extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link SpaceScheduling.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getSalilsJs_Model()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModel();

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
	 * The list contents are of type {@link SpaceScheduling.Controller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getSalilsJs_Controller()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getController();

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference list.
	 * The list contents are of type {@link SpaceScheduling.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getSalilsJs_View()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getView();

} // SalilsJs
