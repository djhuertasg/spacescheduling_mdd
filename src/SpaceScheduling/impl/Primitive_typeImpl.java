/**
 */
package SpaceScheduling.impl;

import SpaceScheduling.Primitive_type;
import SpaceScheduling.SpaceSchedulingPackage;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.impl.Primitive_typeImpl#getInt <em>Int</em>}</li>
 *   <li>{@link SpaceScheduling.impl.Primitive_typeImpl#getString <em>String</em>}</li>
 *   <li>{@link SpaceScheduling.impl.Primitive_typeImpl#getDatetime <em>Datetime</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Primitive_typeImpl extends MinimalEObjectImpl.Container implements Primitive_type {
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
	 * The default value of the '{@link #getDatetime() <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATETIME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDatetime() <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatetime()
	 * @generated
	 * @ordered
	 */
	protected Date datetime = DATETIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Primitive_typeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceSchedulingPackage.Literals.PRIMITIVE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.PRIMITIVE_TYPE__INT, oldInt, int_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.PRIMITIVE_TYPE__STRING, oldString, string));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDatetime() {
		return datetime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatetime(Date newDatetime) {
		Date oldDatetime = datetime;
		datetime = newDatetime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.PRIMITIVE_TYPE__DATETIME, oldDatetime, datetime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__INT:
				return getInt();
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__STRING:
				return getString();
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__DATETIME:
				return getDatetime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__INT:
				setInt((Integer)newValue);
				return;
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__STRING:
				setString((String)newValue);
				return;
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__DATETIME:
				setDatetime((Date)newValue);
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
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__INT:
				setInt(INT_EDEFAULT);
				return;
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__STRING:
				setString(STRING_EDEFAULT);
				return;
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__DATETIME:
				setDatetime(DATETIME_EDEFAULT);
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
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__INT:
				return INT_EDEFAULT == null ? int_ != null : !INT_EDEFAULT.equals(int_);
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__STRING:
				return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
			case SpaceSchedulingPackage.PRIMITIVE_TYPE__DATETIME:
				return DATETIME_EDEFAULT == null ? datetime != null : !DATETIME_EDEFAULT.equals(datetime);
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
		result.append(" (int: ");
		result.append(int_);
		result.append(", string: ");
		result.append(string);
		result.append(", datetime: ");
		result.append(datetime);
		result.append(')');
		return result.toString();
	}

} //Primitive_typeImpl
