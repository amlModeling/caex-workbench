/**
 */
package caex.caex30.caex.impl;

import caex.caex30.caex.AttributeNameMapping;
import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.InterfaceIDMapping;
import caex.caex30.caex.Mapping;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.impl.MappingImpl#getAttributeNameMapping <em>Attribute Name Mapping</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.MappingImpl#getInterfaceIDMapping <em>Interface ID Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends CAEXBasicObjectImpl implements Mapping {
	/**
	 * The cached value of the '{@link #getAttributeNameMapping() <em>Attribute Name Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeNameMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeNameMapping> attributeNameMapping;

	/**
	 * The cached value of the '{@link #getInterfaceIDMapping() <em>Interface ID Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceIDMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceIDMapping> interfaceIDMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeNameMapping> getAttributeNameMapping() {
		if (attributeNameMapping == null) {
			attributeNameMapping = new EObjectContainmentEList<AttributeNameMapping>(AttributeNameMapping.class, this, CAEXPackage.MAPPING__ATTRIBUTE_NAME_MAPPING);
		}
		return attributeNameMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceIDMapping> getInterfaceIDMapping() {
		if (interfaceIDMapping == null) {
			interfaceIDMapping = new EObjectContainmentEList<InterfaceIDMapping>(InterfaceIDMapping.class, this, CAEXPackage.MAPPING__INTERFACE_ID_MAPPING);
		}
		return interfaceIDMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				return ((InternalEList<?>)getAttributeNameMapping()).basicRemove(otherEnd, msgs);
			case CAEXPackage.MAPPING__INTERFACE_ID_MAPPING:
				return ((InternalEList<?>)getInterfaceIDMapping()).basicRemove(otherEnd, msgs);
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
			case CAEXPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				return getAttributeNameMapping();
			case CAEXPackage.MAPPING__INTERFACE_ID_MAPPING:
				return getInterfaceIDMapping();
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
			case CAEXPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				getAttributeNameMapping().clear();
				getAttributeNameMapping().addAll((Collection<? extends AttributeNameMapping>)newValue);
				return;
			case CAEXPackage.MAPPING__INTERFACE_ID_MAPPING:
				getInterfaceIDMapping().clear();
				getInterfaceIDMapping().addAll((Collection<? extends InterfaceIDMapping>)newValue);
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
			case CAEXPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				getAttributeNameMapping().clear();
				return;
			case CAEXPackage.MAPPING__INTERFACE_ID_MAPPING:
				getInterfaceIDMapping().clear();
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
			case CAEXPackage.MAPPING__ATTRIBUTE_NAME_MAPPING:
				return attributeNameMapping != null && !attributeNameMapping.isEmpty();
			case CAEXPackage.MAPPING__INTERFACE_ID_MAPPING:
				return interfaceIDMapping != null && !interfaceIDMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingImpl
