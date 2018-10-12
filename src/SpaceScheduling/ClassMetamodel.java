/**
 */
package SpaceScheduling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.ClassMetamodel#getClass_ <em>Class</em>}</li>
 *   <li>{@link SpaceScheduling.ClassMetamodel#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see SpaceScheduling.SpaceSchedulingPackage#getClassMetamodel()
 * @model
 * @generated
 */
public interface ClassMetamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link SpaceScheduling.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getClassMetamodel_Class()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpaceScheduling.Class> getClass_();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link SpaceScheduling.Relations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see SpaceScheduling.SpaceSchedulingPackage#getClassMetamodel_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relations> getRelations();

} // ClassMetamodel
