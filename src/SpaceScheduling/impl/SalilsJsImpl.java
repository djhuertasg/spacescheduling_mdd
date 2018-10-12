/**
 */
package SpaceScheduling.impl;

import SpaceScheduling.Controller;
import SpaceScheduling.Model;
import SpaceScheduling.SalilsJs;
import SpaceScheduling.SpaceSchedulingPackage;
import SpaceScheduling.View;

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
 * An implementation of the model object '<em><b>Salils Js</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.impl.SalilsJsImpl#getModel <em>Model</em>}</li>
 *   <li>{@link SpaceScheduling.impl.SalilsJsImpl#getController <em>Controller</em>}</li>
 *   <li>{@link SpaceScheduling.impl.SalilsJsImpl#getView <em>View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SalilsJsImpl extends MinimalEObjectImpl.Container implements SalilsJs {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> model;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controller;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected EList<View> view;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalilsJsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceSchedulingPackage.Literals.SALILS_JS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModel() {
		if (model == null) {
			model = new EObjectContainmentEList<Model>(Model.class, this, SpaceSchedulingPackage.SALILS_JS__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getController() {
		if (controller == null) {
			controller = new EObjectContainmentEList<Controller>(Controller.class, this, SpaceSchedulingPackage.SALILS_JS__CONTROLLER);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getView() {
		if (view == null) {
			view = new EObjectContainmentEList<View>(View.class, this, SpaceSchedulingPackage.SALILS_JS__VIEW);
		}
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpaceSchedulingPackage.SALILS_JS__MODEL:
				return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
			case SpaceSchedulingPackage.SALILS_JS__CONTROLLER:
				return ((InternalEList<?>)getController()).basicRemove(otherEnd, msgs);
			case SpaceSchedulingPackage.SALILS_JS__VIEW:
				return ((InternalEList<?>)getView()).basicRemove(otherEnd, msgs);
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
			case SpaceSchedulingPackage.SALILS_JS__MODEL:
				return getModel();
			case SpaceSchedulingPackage.SALILS_JS__CONTROLLER:
				return getController();
			case SpaceSchedulingPackage.SALILS_JS__VIEW:
				return getView();
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
			case SpaceSchedulingPackage.SALILS_JS__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends Model>)newValue);
				return;
			case SpaceSchedulingPackage.SALILS_JS__CONTROLLER:
				getController().clear();
				getController().addAll((Collection<? extends Controller>)newValue);
				return;
			case SpaceSchedulingPackage.SALILS_JS__VIEW:
				getView().clear();
				getView().addAll((Collection<? extends View>)newValue);
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
			case SpaceSchedulingPackage.SALILS_JS__MODEL:
				getModel().clear();
				return;
			case SpaceSchedulingPackage.SALILS_JS__CONTROLLER:
				getController().clear();
				return;
			case SpaceSchedulingPackage.SALILS_JS__VIEW:
				getView().clear();
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
			case SpaceSchedulingPackage.SALILS_JS__MODEL:
				return model != null && !model.isEmpty();
			case SpaceSchedulingPackage.SALILS_JS__CONTROLLER:
				return controller != null && !controller.isEmpty();
			case SpaceSchedulingPackage.SALILS_JS__VIEW:
				return view != null && !view.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SalilsJsImpl
