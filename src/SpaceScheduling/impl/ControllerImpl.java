/**
 */
package SpaceScheduling.impl;

import SpaceScheduling.Actions;
import SpaceScheduling.Controller;
import SpaceScheduling.Helpers;
import SpaceScheduling.Model;
import SpaceScheduling.SpaceSchedulingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.impl.ControllerImpl#getHelpers <em>Helpers</em>}</li>
 *   <li>{@link SpaceScheduling.impl.ControllerImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link SpaceScheduling.impl.ControllerImpl#getUse <em>Use</em>}</li>
 *   <li>{@link SpaceScheduling.impl.ControllerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends MinimalEObjectImpl.Container implements Controller {
	/**
	 * The cached value of the '{@link #getHelpers() <em>Helpers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpers()
	 * @generated
	 * @ordered
	 */
	protected EList<Helpers> helpers;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Actions> actions;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> use;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceSchedulingPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Helpers> getHelpers() {
		if (helpers == null) {
			helpers = new EObjectContainmentEList<Helpers>(Helpers.class, this, SpaceSchedulingPackage.CONTROLLER__HELPERS);
		}
		return helpers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actions> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Actions>(Actions.class, this, SpaceSchedulingPackage.CONTROLLER__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getUse() {
		if (use == null) {
			use = new EObjectResolvingEList<Model>(Model.class, this, SpaceSchedulingPackage.CONTROLLER__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpaceSchedulingPackage.CONTROLLER__HELPERS:
				return ((InternalEList<?>)getHelpers()).basicRemove(otherEnd, msgs);
			case SpaceSchedulingPackage.CONTROLLER__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case SpaceSchedulingPackage.CONTROLLER__HELPERS:
				return getHelpers();
			case SpaceSchedulingPackage.CONTROLLER__ACTIONS:
				return getActions();
			case SpaceSchedulingPackage.CONTROLLER__USE:
				return getUse();
			case SpaceSchedulingPackage.CONTROLLER__NAME:
				return getName();
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
			case SpaceSchedulingPackage.CONTROLLER__HELPERS:
				getHelpers().clear();
				getHelpers().addAll((Collection<? extends Helpers>)newValue);
				return;
			case SpaceSchedulingPackage.CONTROLLER__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Actions>)newValue);
				return;
			case SpaceSchedulingPackage.CONTROLLER__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends Model>)newValue);
				return;
			case SpaceSchedulingPackage.CONTROLLER__NAME:
				setName((String)newValue);
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
			case SpaceSchedulingPackage.CONTROLLER__HELPERS:
				getHelpers().clear();
				return;
			case SpaceSchedulingPackage.CONTROLLER__ACTIONS:
				getActions().clear();
				return;
			case SpaceSchedulingPackage.CONTROLLER__USE:
				getUse().clear();
				return;
			case SpaceSchedulingPackage.CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
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
			case SpaceSchedulingPackage.CONTROLLER__HELPERS:
				return helpers != null && !helpers.isEmpty();
			case SpaceSchedulingPackage.CONTROLLER__ACTIONS:
				return actions != null && !actions.isEmpty();
			case SpaceSchedulingPackage.CONTROLLER__USE:
				return use != null && !use.isEmpty();
			case SpaceSchedulingPackage.CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
