/**
 */
package SpaceScheduling.impl;

import SpaceScheduling.Primitive_type;
import SpaceScheduling.Return_type;
import SpaceScheduling.SpaceSchedulingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.impl.Return_typeImpl#getPrimitive_type <em>Primitive type</em>}</li>
 *   <li>{@link SpaceScheduling.impl.Return_typeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link SpaceScheduling.impl.Return_typeImpl#getVoid <em>Void</em>}</li>
 *   <li>{@link SpaceScheduling.impl.Return_typeImpl#getInt <em>Int</em>}</li>
 *   <li>{@link SpaceScheduling.impl.Return_typeImpl#getString <em>String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Return_typeImpl extends MinimalEObjectImpl.Container implements Return_type {
	/**
	 * The cached value of the '{@link #getPrimitive_type() <em>Primitive type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitive_type()
	 * @generated
	 * @ordered
	 */
	protected Primitive_type primitive_type;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected EList<SpaceScheduling.Class> class_;

	/**
	 * The default value of the '{@link #getVoid() <em>Void</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoid()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VOID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoid() <em>Void</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoid()
	 * @generated
	 * @ordered
	 */
	protected Boolean void_ = VOID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInt() <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInt() <em>Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt()
	 * @generated
	 * @ordered
	 */
	protected Integer int_ = INT_EDEFAULT;

	/**
	 * The default value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected String string = STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Return_typeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceSchedulingPackage.Literals.RETURN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive_type getPrimitive_type() {
		if (primitive_type != null && primitive_type.eIsProxy()) {
			InternalEObject oldPrimitive_type = (InternalEObject)primitive_type;
			primitive_type = (Primitive_type)eResolveProxy(oldPrimitive_type);
			if (primitive_type != oldPrimitive_type) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpaceSchedulingPackage.RETURN_TYPE__PRIMITIVE_TYPE, oldPrimitive_type, primitive_type));
			}
		}
		return primitive_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive_type basicGetPrimitive_type() {
		return primitive_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitive_type(Primitive_type newPrimitive_type) {
		Primitive_type oldPrimitive_type = primitive_type;
		primitive_type = newPrimitive_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.RETURN_TYPE__PRIMITIVE_TYPE, oldPrimitive_type, primitive_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpaceScheduling.Class> getClass_() {
		if (class_ == null) {
			class_ = new EObjectResolvingEList<SpaceScheduling.Class>(SpaceScheduling.Class.class, this, SpaceSchedulingPackage.RETURN_TYPE__CLASS);
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVoid() {
		return void_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoid(Boolean newVoid) {
		Boolean oldVoid = void_;
		void_ = newVoid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.RETURN_TYPE__VOID, oldVoid, void_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInt() {
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt(Integer newInt) {
		Integer oldInt = int_;
		int_ = newInt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.RETURN_TYPE__INT, oldInt, int_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(String newString) {
		String oldString = string;
		string = newString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.RETURN_TYPE__STRING, oldString, string));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpaceSchedulingPackage.RETURN_TYPE__PRIMITIVE_TYPE:
				if (resolve) return getPrimitive_type();
				return basicGetPrimitive_type();
			case SpaceSchedulingPackage.RETURN_TYPE__CLASS:
				return getClass_();
			case SpaceSchedulingPackage.RETURN_TYPE__VOID:
				return getVoid();
			case SpaceSchedulingPackage.RETURN_TYPE__INT:
				return getInt();
			case SpaceSchedulingPackage.RETURN_TYPE__STRING:
				return getString();
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
			case SpaceSchedulingPackage.RETURN_TYPE__PRIMITIVE_TYPE:
				setPrimitive_type((Primitive_type)newValue);
				return;
			case SpaceSchedulingPackage.RETURN_TYPE__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends SpaceScheduling.Class>)newValue);
				return;
			case SpaceSchedulingPackage.RETURN_TYPE__VOID:
				setVoid((Boolean)newValue);
				return;
			case SpaceSchedulingPackage.RETURN_TYPE__INT:
				setInt((Integer)newValue);
				return;
			case SpaceSchedulingPackage.RETURN_TYPE__STRING:
				setString((String)newValue);
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
			case SpaceSchedulingPackage.RETURN_TYPE__PRIMITIVE_TYPE:
				setPrimitive_type((Primitive_type)null);
				return;
			case SpaceSchedulingPackage.RETURN_TYPE__CLASS:
				getClass_().clear();
				return;
			case SpaceSchedulingPackage.RETURN_TYPE__VOID:
				setVoid(VOID_EDEFAULT);
				return;
			case SpaceSchedulingPackage.RETURN_TYPE__INT:
				setInt(INT_EDEFAULT);
				return;
			case SpaceSchedulingPackage.RETURN_TYPE__STRING:
				setString(STRING_EDEFAULT);
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
			case SpaceSchedulingPackage.RETURN_TYPE__PRIMITIVE_TYPE:
				return primitive_type != null;
			case SpaceSchedulingPackage.RETURN_TYPE__CLASS:
				return class_ != null && !class_.isEmpty();
			case SpaceSchedulingPackage.RETURN_TYPE__VOID:
				return VOID_EDEFAULT == null ? void_ != null : !VOID_EDEFAULT.equals(void_);
			case SpaceSchedulingPackage.RETURN_TYPE__INT:
				return INT_EDEFAULT == null ? int_ != null : !INT_EDEFAULT.equals(int_);
			case SpaceSchedulingPackage.RETURN_TYPE__STRING:
				return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
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
		result.append(" (void: ");
		result.append(void_);
		result.append(", int: ");
		result.append(int_);
		result.append(", string: ");
		result.append(string);
		result.append(')');
		return result.toString();
	}

} //Return_typeImpl
