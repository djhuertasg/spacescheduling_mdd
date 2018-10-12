/**
 */
package SpaceScheduling.impl;

import SpaceScheduling.Actions;
import SpaceScheduling.Attributes;
import SpaceScheduling.SpaceSchedulingPackage;
import SpaceScheduling.View;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.impl.ActionsImpl#getFriendlyName <em>Friendly Name</em>}</li>
 *   <li>{@link SpaceScheduling.impl.ActionsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link SpaceScheduling.impl.ActionsImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link SpaceScheduling.impl.ActionsImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link SpaceScheduling.impl.ActionsImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link SpaceScheduling.impl.ActionsImpl#getRedirect <em>Redirect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionsImpl extends MinimalEObjectImpl.Container implements Actions {
	/**
	 * The default value of the '{@link #getFriendlyName() <em>Friendly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendlyName()
	 * @generated
	 * @ordered
	 */
	protected static final String FRIENDLY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFriendlyName() <em>Friendly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendlyName()
	 * @generated
	 * @ordered
	 */
	protected String friendlyName = FRIENDLY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputs() <em>Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final Attributes INPUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected Attributes inputs = INPUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputs() <em>Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final Attributes OUTPUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected Attributes outputs = OUTPUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected String function = FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedirect() <em>Redirect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirect()
	 * @generated
	 * @ordered
	 */
	protected EList<View> redirect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceSchedulingPackage.Literals.ACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFriendlyName() {
		return friendlyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriendlyName(String newFriendlyName) {
		String oldFriendlyName = friendlyName;
		friendlyName = newFriendlyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.ACTIONS__FRIENDLY_NAME, oldFriendlyName, friendlyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.ACTIONS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(Attributes newInputs) {
		Attributes oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.ACTIONS__INPUTS, oldInputs, inputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputs(Attributes newOutputs) {
		Attributes oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.ACTIONS__OUTPUTS, oldOutputs, outputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		String oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.ACTIONS__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getRedirect() {
		if (redirect == null) {
			redirect = new EObjectContainmentEList<View>(View.class, this, SpaceSchedulingPackage.ACTIONS__REDIRECT);
		}
		return redirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpaceSchedulingPackage.ACTIONS__REDIRECT:
				return ((InternalEList<?>)getRedirect()).basicRemove(otherEnd, msgs);
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
			case SpaceSchedulingPackage.ACTIONS__FRIENDLY_NAME:
				return getFriendlyName();
			case SpaceSchedulingPackage.ACTIONS__DESCRIPTION:
				return getDescription();
			case SpaceSchedulingPackage.ACTIONS__INPUTS:
				return getInputs();
			case SpaceSchedulingPackage.ACTIONS__OUTPUTS:
				return getOutputs();
			case SpaceSchedulingPackage.ACTIONS__FUNCTION:
				return getFunction();
			case SpaceSchedulingPackage.ACTIONS__REDIRECT:
				return getRedirect();
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
			case SpaceSchedulingPackage.ACTIONS__FRIENDLY_NAME:
				setFriendlyName((String)newValue);
				return;
			case SpaceSchedulingPackage.ACTIONS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SpaceSchedulingPackage.ACTIONS__INPUTS:
				setInputs((Attributes)newValue);
				return;
			case SpaceSchedulingPackage.ACTIONS__OUTPUTS:
				setOutputs((Attributes)newValue);
				return;
			case SpaceSchedulingPackage.ACTIONS__FUNCTION:
				setFunction((String)newValue);
				return;
			case SpaceSchedulingPackage.ACTIONS__REDIRECT:
				getRedirect().clear();
				getRedirect().addAll((Collection<? extends View>)newValue);
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
			case SpaceSchedulingPackage.ACTIONS__FRIENDLY_NAME:
				setFriendlyName(FRIENDLY_NAME_EDEFAULT);
				return;
			case SpaceSchedulingPackage.ACTIONS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SpaceSchedulingPackage.ACTIONS__INPUTS:
				setInputs(INPUTS_EDEFAULT);
				return;
			case SpaceSchedulingPackage.ACTIONS__OUTPUTS:
				setOutputs(OUTPUTS_EDEFAULT);
				return;
			case SpaceSchedulingPackage.ACTIONS__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case SpaceSchedulingPackage.ACTIONS__REDIRECT:
				getRedirect().clear();
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
			case SpaceSchedulingPackage.ACTIONS__FRIENDLY_NAME:
				return FRIENDLY_NAME_EDEFAULT == null ? friendlyName != null : !FRIENDLY_NAME_EDEFAULT.equals(friendlyName);
			case SpaceSchedulingPackage.ACTIONS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SpaceSchedulingPackage.ACTIONS__INPUTS:
				return INPUTS_EDEFAULT == null ? inputs != null : !INPUTS_EDEFAULT.equals(inputs);
			case SpaceSchedulingPackage.ACTIONS__OUTPUTS:
				return OUTPUTS_EDEFAULT == null ? outputs != null : !OUTPUTS_EDEFAULT.equals(outputs);
			case SpaceSchedulingPackage.ACTIONS__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case SpaceSchedulingPackage.ACTIONS__REDIRECT:
				return redirect != null && !redirect.isEmpty();
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
		result.append(" (FriendlyName: ");
		result.append(friendlyName);
		result.append(", Description: ");
		result.append(description);
		result.append(", Inputs: ");
		result.append(inputs);
		result.append(", Outputs: ");
		result.append(outputs);
		result.append(", Function: ");
		result.append(function);
		result.append(')');
		return result.toString();
	}

} //ActionsImpl
