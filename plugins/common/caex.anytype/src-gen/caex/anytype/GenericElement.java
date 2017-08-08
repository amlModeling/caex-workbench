/**
 */
package caex.anytype;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.anytype.GenericElement#getNestedElements <em>Nested Elements</em>}</li>
 *   <li>{@link caex.anytype.GenericElement#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link caex.anytype.GenericElement#getElementFeatureMap <em>Element Feature Map</em>}</li>
 *   <li>{@link caex.anytype.GenericElement#getAttributeFeatureMap <em>Attribute Feature Map</em>}</li>
 * </ul>
 *
 * @see caex.anytype.AnytypePackage#getGenericElement()
 * @model extendedMetaData="kind='empty'"
 * @generated
 */
public interface GenericElement extends Element {
	/**
	 * Returns the value of the '<em><b>Nested Elements</b></em>' containment reference list.
	 * The list contents are of type {@link caex.anytype.GenericElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Elements</em>' containment reference list.
	 * @see caex.anytype.AnytypePackage#getGenericElement_NestedElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='empty'"
	 * @generated
	 */
	EList<GenericElement> getNestedElements();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link caex.anytype.GenericAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see caex.anytype.AnytypePackage#getGenericElement_Attributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='empty'"
	 * @generated
	 */
	EList<GenericAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Element Feature Map</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Feature Map</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Feature Map</em>' attribute list.
	 * @see caex.anytype.AnytypePackage#getGenericElement_ElementFeatureMap()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true"
	 *        extendedMetaData="kind='elementWildcard' name=':0' wildcards='##any' processing='lax'"
	 * @generated
	 */
	FeatureMap getElementFeatureMap();

	/**
	 * Returns the value of the '<em><b>Attribute Feature Map</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Feature Map</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Feature Map</em>' attribute list.
	 * @see caex.anytype.AnytypePackage#getGenericElement_AttributeFeatureMap()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' name=':1' wildcards='##any' processing='lax'"
	 * @generated
	 */
	FeatureMap getAttributeFeatureMap();

} // GenericElement
