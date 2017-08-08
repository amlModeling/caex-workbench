/**
 */
package caex.anytype.impl;

import caex.anytype.AnytypePackage;
import caex.anytype.GenericAttribute;
import caex.anytype.GenericElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.anytype.impl.GenericElementImpl#getNestedElements <em>Nested Elements</em>}</li>
 *   <li>{@link caex.anytype.impl.GenericElementImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link caex.anytype.impl.GenericElementImpl#getElementFeatureMap <em>Element Feature Map</em>}</li>
 *   <li>{@link caex.anytype.impl.GenericElementImpl#getAttributeFeatureMap <em>Attribute Feature Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericElementImpl extends ElementImpl implements GenericElement {
	/**
	 * The cached value of the '{@link #getNestedElements() <em>Nested Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericElement> nestedElements;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericAttribute> attributes;

	/**
	 * The cached value of the '{@link #getElementFeatureMap() <em>Element Feature Map</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementFeatureMap()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap elementFeatureMap;

	/**
	 * The cached value of the '{@link #getAttributeFeatureMap() <em>Attribute Feature Map</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeFeatureMap()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap attributeFeatureMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnytypePackage.Literals.GENERIC_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericElement> getNestedElements() {
		if (nestedElements == null) {
			nestedElements = new EObjectContainmentEList<GenericElement>(GenericElement.class, this,
					AnytypePackage.GENERIC_ELEMENT__NESTED_ELEMENTS);
		}
		return nestedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<GenericAttribute>(GenericAttribute.class, this,
					AnytypePackage.GENERIC_ELEMENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getElementFeatureMap() {
		if (elementFeatureMap == null) {
			elementFeatureMap = new BasicFeatureMap(this, AnytypePackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP);
		}
		return elementFeatureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAttributeFeatureMap() {
		if (attributeFeatureMap == null) {
			attributeFeatureMap = new BasicFeatureMap(this, AnytypePackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP);
		}
		return attributeFeatureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AnytypePackage.GENERIC_ELEMENT__NESTED_ELEMENTS:
			return ((InternalEList<?>) getNestedElements()).basicRemove(otherEnd, msgs);
		case AnytypePackage.GENERIC_ELEMENT__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		case AnytypePackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP:
			return ((InternalEList<?>) getElementFeatureMap()).basicRemove(otherEnd, msgs);
		case AnytypePackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP:
			return ((InternalEList<?>) getAttributeFeatureMap()).basicRemove(otherEnd, msgs);
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
		case AnytypePackage.GENERIC_ELEMENT__NESTED_ELEMENTS:
			return getNestedElements();
		case AnytypePackage.GENERIC_ELEMENT__ATTRIBUTES:
			return getAttributes();
		case AnytypePackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP:
			if (coreType)
				return getElementFeatureMap();
			return ((FeatureMap.Internal) getElementFeatureMap()).getWrapper();
		case AnytypePackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP:
			if (coreType)
				return getAttributeFeatureMap();
			return ((FeatureMap.Internal) getAttributeFeatureMap()).getWrapper();
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
		case AnytypePackage.GENERIC_ELEMENT__NESTED_ELEMENTS:
			getNestedElements().clear();
			getNestedElements().addAll((Collection<? extends GenericElement>) newValue);
			return;
		case AnytypePackage.GENERIC_ELEMENT__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends GenericAttribute>) newValue);
			return;
		case AnytypePackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP:
			((FeatureMap.Internal) getElementFeatureMap()).set(newValue);
			return;
		case AnytypePackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP:
			((FeatureMap.Internal) getAttributeFeatureMap()).set(newValue);
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
		case AnytypePackage.GENERIC_ELEMENT__NESTED_ELEMENTS:
			getNestedElements().clear();
			return;
		case AnytypePackage.GENERIC_ELEMENT__ATTRIBUTES:
			getAttributes().clear();
			return;
		case AnytypePackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP:
			getElementFeatureMap().clear();
			return;
		case AnytypePackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP:
			getAttributeFeatureMap().clear();
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
		case AnytypePackage.GENERIC_ELEMENT__NESTED_ELEMENTS:
			return nestedElements != null && !nestedElements.isEmpty();
		case AnytypePackage.GENERIC_ELEMENT__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case AnytypePackage.GENERIC_ELEMENT__ELEMENT_FEATURE_MAP:
			return elementFeatureMap != null && !elementFeatureMap.isEmpty();
		case AnytypePackage.GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP:
			return attributeFeatureMap != null && !attributeFeatureMap.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (elementFeatureMap: ");
		result.append(elementFeatureMap);
		result.append(", attributeFeatureMap: ");
		result.append(attributeFeatureMap);
		result.append(')');
		return result.toString();
	}

} //GenericElementImpl
