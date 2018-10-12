/**
 */
package SpaceScheduling.impl;

import SpaceScheduling.Attribute;
import SpaceScheduling.Enumeration;
import SpaceScheduling.Primitive_type;
import SpaceScheduling.SpaceSchedulingPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SpaceScheduling.impl.AttributeImpl#getPrimitive_type <em>Primitive type</em>}</li>
 *   <li>{@link SpaceScheduling.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link SpaceScheduling.impl.AttributeImpl#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
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
	 * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeration()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumeration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpaceSchedulingPackage.Literals.ATTRIBUTE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpaceSchedulingPackage.ATTRIBUTE__PRIMITIVE_TYPE, oldPrimitive_type, primitive_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.ATTRIBUTE__PRIMITIVE_TYPE, oldPrimitive_type, primitive_type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpaceSchedulingPackage.ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getEnumeration() {
		if (enumeration == null) {
			enumeration = new EDataTypeUniqueEList<Enumeration>(Enumeration.class, this, SpaceSchedulingPackage.ATTRIBUTE__ENUMERATION);
		}
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpaceSchedulingPackage.ATTRIBUTE__PRIMITIVE_TYPE:
				if (resolve) return getPrimitive_type();
				return basicGetPrimitive_type();
			case SpaceSchedulingPackage.ATTRIBUTE__NAME:
				return getName();
			case SpaceSchedulingPackage.ATTRIBUTE__ENUMERATION:
				return getEnumeration();
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
			case SpaceSchedulingPackage.ATTRIBUTE__PRIMITIVE_TYPE:
				setPrimitive_type((Primitive_type)newValue);
				return;
			case SpaceSchedulingPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case SpaceSchedulingPackage.ATTRIBUTE__ENUMERATION:
				getEnumeration().clear();
				getEnumeration().addAll((Collection<? extends Enumeration>)newValue);
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
			case SpaceSchedulingPackage.ATTRIBUTE__PRIMITIVE_TYPE:
				setPrimitive_type((Primitive_type)null);
				return;
			case SpaceSchedulingPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpaceSchedulingPackage.ATTRIBUTE__ENUMERATION:
				getEnumeration().clear();
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
			case SpaceSchedulingPackage.ATTRIBUTE__PRIMITIVE_TYPE:
				return primitive_type != null;
			case SpaceSchedulingPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpaceSchedulingPackage.ATTRIBUTE__ENUMERATION:
				return enumeration != null && !enumeration.isEmpty();
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
		result.append(", enumeration: ");
		result.append(enumeration);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
