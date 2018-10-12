/**
 */
package SpaceScheduling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Space Scheduling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.Space_Scheduling#getClassmetamodel <em>Classmetamodel</em>}</li>
 *   <li>{@link SpaceScheduling.Space_Scheduling#getSalilsjs <em>Salilsjs</em>}</li>
 *   <li>{@link SpaceScheduling.Space_Scheduling#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see SpaceScheduling.SpaceSchedulingPackage#getSpace_Scheduling()
 * @model
 * @generated
 */
public interface Space_Scheduling extends EObject {
	/**
	 * Returns the value of the '<em><b>Classmetamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classmetamodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classmetamodel</em>' containment reference.
	 * @see #setClassmetamodel(ClassMetamodel)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getSpace_Scheduling_Classmetamodel()
	 * @model containment="true"
	 * @generated
	 */
	ClassMetamodel getClassmetamodel();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Space_Scheduling#getClassmetamodel <em>Classmetamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classmetamodel</em>' containment reference.
	 * @see #getClassmetamodel()
	 * @generated
	 */
	void setClassmetamodel(ClassMetamodel value);

	/**
	 * Returns the value of the '<em><b>Salilsjs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salilsjs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salilsjs</em>' containment reference.
	 * @see #setSalilsjs(SalilsJs)
	 * @see SpaceScheduling.SpaceSchedulingPackage#getSpace_Scheduling_Salilsjs()
	 * @model containment="true"
	 * @generated
	 */
	SalilsJs getSalilsjs();

	/**
	 * Sets the value of the '{@link SpaceScheduling.Space_Scheduling#getSalilsjs <em>Salilsjs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salilsjs</em>' containment reference.
	 * @see #getSalilsjs()
	 * @generated
	 */
	void setSalilsjs(SalilsJs value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link SpaceScheduling.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getSpace_Scheduling_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Configuration> getConfiguration();

} // Space_Scheduling
