/**
 */
package SpaceScheduling.impl;

import SpaceScheduling.ClassMetamodel;
import SpaceScheduling.Relations;
import SpaceScheduling.SpaceSchedulingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.impl.ClassMetamodelImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link SpaceScheduling.impl.ClassMetamodelImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassMetamodelImpl extends MinimalEObjectImpl.Container implements ClassMetamodel {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<SpaceScheduling.Class> class_;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relations> relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassMetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceSchedulingPackage.Literals.CLASS_METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpaceScheduling.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectContainmentEList<SpaceScheduling.Class>(SpaceScheduling.Class.class, this, SpaceSchedulingPackage.CLASS_METAMODEL__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relations> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relations>(Relations.class, this, SpaceSchedulingPackage.CLASS_METAMODEL__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpaceSchedulingPackage.CLASS_METAMODEL__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case SpaceSchedulingPackage.CLASS_METAMODEL__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpaceSchedulingPackage.CLASS_METAMODEL__CLASS:
				return getClass_();
			case SpaceSchedulingPackage.CLASS_METAMODEL__RELATIONS:
				return getRelations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpaceSchedulingPackage.CLASS_METAMODEL__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends SpaceScheduling.Class>)newValue);
				return;
			case SpaceSchedulingPackage.CLASS_METAMODEL__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relations>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpaceSchedulingPackage.CLASS_METAMODEL__CLASS:
				getClass_().clear();
				return;
			case SpaceSchedulingPackage.CLASS_METAMODEL__RELATIONS:
				getRelations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpaceSchedulingPackage.CLASS_METAMODEL__CLASS:
				return class_ != null && !class_.isEmpty();
			case SpaceSchedulingPackage.CLASS_METAMODEL__RELATIONS:
				return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassMetamodelImpl
