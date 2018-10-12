/**
 */
package SpaceScheduling.impl;

import SpaceScheduling.ClassMetamodel;
import SpaceScheduling.Configuration;
import SpaceScheduling.SalilsJs;
import SpaceScheduling.SpaceSchedulingPackage;
import SpaceScheduling.Space_Scheduling;

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
 * An implementation of the model object '<em><b>Space Scheduling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.impl.Space_SchedulingImpl#getClassmetamodel <em>Classmetamodel</em>}</li>
 *   <li>{@link SpaceScheduling.impl.Space_SchedulingImpl#getSalilsjs <em>Salilsjs</em>}</li>
 *   <li>{@link SpaceScheduling.impl.Space_SchedulingImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Space_SchedulingImpl extends MinimalEObjectImpl.Container implements Space_Scheduling {
	/**
	 * The cached value of the '{@link #getClassmetamodel() <em>Classmetamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassmetamodel()
	 * @generated
	 * @ordered
	 */
	protected ClassMetamodel classmetamodel;

	/**
	 * The cached value of the '{@link #getSalilsjs() <em>Salilsjs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalilsjs()
	 * @generated
	 * @ordered
	 */
	protected SalilsJs salilsjs;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Space_SchedulingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceSchedulingPackage.Literals.SPACE_SCHEDULING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMetamodel getClassmetamodel() {
		return classmetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassmetamodel(ClassMetamodel newClassmetamodel, NotificationChain msgs) {
		ClassMetamodel oldClassmetamodel = classmetamodel;
		classmetamodel = newClassmetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.SPACE_SCHEDULING__CLASSMETAMODEL, oldClassmetamodel, newClassmetamodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassmetamodel(ClassMetamodel newClassmetamodel) {
		if (newClassmetamodel != classmetamodel) {
			NotificationChain msgs = null;
			if (classmetamodel != null)
				msgs = ((InternalEObject)classmetamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpaceSchedulingPackage.SPACE_SCHEDULING__CLASSMETAMODEL, null, msgs);
			if (newClassmetamodel != null)
				msgs = ((InternalEObject)newClassmetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpaceSchedulingPackage.SPACE_SCHEDULING__CLASSMETAMODEL, null, msgs);
			msgs = basicSetClassmetamodel(newClassmetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.SPACE_SCHEDULING__CLASSMETAMODEL, newClassmetamodel, newClassmetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalilsJs getSalilsjs() {
		return salilsjs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSalilsjs(SalilsJs newSalilsjs, NotificationChain msgs) {
		SalilsJs oldSalilsjs = salilsjs;
		salilsjs = newSalilsjs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.SPACE_SCHEDULING__SALILSJS, oldSalilsjs, newSalilsjs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalilsjs(SalilsJs newSalilsjs) {
		if (newSalilsjs != salilsjs) {
			NotificationChain msgs = null;
			if (salilsjs != null)
				msgs = ((InternalEObject)salilsjs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpaceSchedulingPackage.SPACE_SCHEDULING__SALILSJS, null, msgs);
			if (newSalilsjs != null)
				msgs = ((InternalEObject)newSalilsjs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpaceSchedulingPackage.SPACE_SCHEDULING__SALILSJS, null, msgs);
			msgs = basicSetSalilsjs(newSalilsjs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.SPACE_SCHEDULING__SALILSJS, newSalilsjs, newSalilsjs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Configuration> getConfiguration() {
		if (configuration == null) {
			configuration = new EObjectContainmentEList<Configuration>(Configuration.class, this, SpaceSchedulingPackage.SPACE_SCHEDULING__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpaceSchedulingPackage.SPACE_SCHEDULING__CLASSMETAMODEL:
				return basicSetClassmetamodel(null, msgs);
			case SpaceSchedulingPackage.SPACE_SCHEDULING__SALILSJS:
				return basicSetSalilsjs(null, msgs);
			case SpaceSchedulingPackage.SPACE_SCHEDULING__CONFIGURATION:
				return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
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
			case SpaceSchedulingPackage.SPACE_SCHEDULING__CLASSMETAMODEL:
				return getClassmetamodel();
			case SpaceSchedulingPackage.SPACE_SCHEDULING__SALILSJS:
				return getSalilsjs();
			case SpaceSchedulingPackage.SPACE_SCHEDULING__CONFIGURATION:
				return getConfiguration();
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
			case SpaceSchedulingPackage.SPACE_SCHEDULING__CLASSMETAMODEL:
				setClassmetamodel((ClassMetamodel)newValue);
				return;
			case SpaceSchedulingPackage.SPACE_SCHEDULING__SALILSJS:
				setSalilsjs((SalilsJs)newValue);
				return;
			case SpaceSchedulingPackage.SPACE_SCHEDULING__CONFIGURATION:
				getConfiguration().clear();
				getConfiguration().addAll((Collection<? extends Configuration>)newValue);
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
			case SpaceSchedulingPackage.SPACE_SCHEDULING__CLASSMETAMODEL:
				setClassmetamodel((ClassMetamodel)null);
				return;
			case SpaceSchedulingPackage.SPACE_SCHEDULING__SALILSJS:
				setSalilsjs((SalilsJs)null);
				return;
			case SpaceSchedulingPackage.SPACE_SCHEDULING__CONFIGURATION:
				getConfiguration().clear();
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
			case SpaceSchedulingPackage.SPACE_SCHEDULING__CLASSMETAMODEL:
				return classmetamodel != null;
			case SpaceSchedulingPackage.SPACE_SCHEDULING__SALILSJS:
				return salilsjs != null;
			case SpaceSchedulingPackage.SPACE_SCHEDULING__CONFIGURATION:
				return configuration != null && !configuration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Space_SchedulingImpl
