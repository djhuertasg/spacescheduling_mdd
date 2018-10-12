/**
 */
package SpaceScheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.Relations#getSource <em>Source</em>}</li>
 *   <li>{@link SpaceScheduling.Relations#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see SpaceScheduling.SpaceSchedulingPackage#getRelations()
 * @model
 * @generated
 */
public interface Relations extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link SpaceScheduling.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getRelations_Source()
	 * @model
	 * @generated
	 */
	EList<SpaceScheduling.Class> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link SpaceScheduling.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getRelations_Target()
	 * @model
	 * @generated
	 */
	EList<SpaceScheduling.Class> getTarget();

} // Relations
