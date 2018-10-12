/**
 */
package SpaceScheduling.impl;

import SpaceScheduling.Relations;
import SpaceScheduling.SpaceSchedulingPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.impl.RelationsImpl#getSource <em>Source</em>}</li>
 *   <li>{@link SpaceScheduling.impl.RelationsImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationsImpl extends MinimalEObjectImpl.Container implements Relations {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<SpaceScheduling.Class> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<SpaceScheduling.Class> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceSchedulingPackage.Literals.RELATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpaceScheduling.Class> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<SpaceScheduling.Class>(SpaceScheduling.Class.class, this, SpaceSchedulingPackage.RELATIONS__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpaceScheduling.Class> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<SpaceScheduling.Class>(SpaceScheduling.Class.class, this, SpaceSchedulingPackage.RELATIONS__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpaceSchedulingPackage.RELATIONS__SOURCE:
				return getSource();
			case SpaceSchedulingPackage.RELATIONS__TARGET:
				return getTarget();
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
			case SpaceSchedulingPackage.RELATIONS__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends SpaceScheduling.Class>)newValue);
				return;
			case SpaceSchedulingPackage.RELATIONS__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends SpaceScheduling.Class>)newValue);
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
			case SpaceSchedulingPackage.RELATIONS__SOURCE:
				getSource().clear();
				return;
			case SpaceSchedulingPackage.RELATIONS__TARGET:
				getTarget().clear();
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
			case SpaceSchedulingPackage.RELATIONS__SOURCE:
				return source != null && !source.isEmpty();
			case SpaceSchedulingPackage.RELATIONS__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationsImpl
