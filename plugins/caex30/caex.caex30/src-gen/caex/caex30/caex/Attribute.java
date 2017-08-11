/**
 */
package caex.caex30.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.Attribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link caex.caex30.caex.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link caex.caex30.caex.Attribute#getRefSemantic <em>Ref Semantic</em>}</li>
 *   <li>{@link caex.caex30.caex.Attribute#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link caex.caex30.caex.Attribute#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.caex30.caex.Attribute#getAttributeDataType <em>Attribute Data Type</em>}</li>
 *   <li>{@link caex.caex30.caex.Attribute#getRefAttributeType <em>Ref Attribute Type</em>}</li>
 *   <li>{@link caex.caex30.caex.Attribute#getUnit <em>Unit</em>}</li>
 *   <li>{@link caex.caex30.caex.Attribute#getReferenceAttribute <em>Reference Attribute</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see caex.caex30.caex.CAEXPackage#getAttribute_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.Attribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see caex.caex30.caex.CAEXPackage#getAttribute_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.Attribute#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Ref Semantic</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex30.caex.RefSemantic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Semantic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Semantic</em>' containment reference list.
	 * @see caex.caex30.caex.CAEXPackage#getAttribute_RefSemantic()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefSemantic> getRefSemantic();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex30.caex.AttributeValueRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see caex.caex30.caex.CAEXPackage#getAttribute_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeValueRequirement> getConstraint();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex30.caex.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see caex.caex30.caex.CAEXPackage#getAttribute_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Attribute Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Data Type</em>' attribute.
	 * @see #setAttributeDataType(String)
	 * @see caex.caex30.caex.CAEXPackage#getAttribute_AttributeDataType()
	 * @model dataType="caex.caex30.caex.AttributeDataType"
	 * @generated
	 */
	String getAttributeDataType();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.Attribute#getAttributeDataType <em>Attribute Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Data Type</em>' attribute.
	 * @see #getAttributeDataType()
	 * @generated
	 */
	void setAttributeDataType(String value);

	/**
	 * Returns the value of the '<em><b>Ref Attribute Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Attribute Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Attribute Type</em>' attribute.
	 * @see #setRefAttributeType(String)
	 * @see caex.caex30.caex.CAEXPackage#getAttribute_RefAttributeType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefAttributeType();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.Attribute#getRefAttributeType <em>Ref Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Attribute Type</em>' attribute.
	 * @see #getRefAttributeType()
	 * @generated
	 */
	void setRefAttributeType(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see caex.caex30.caex.CAEXPackage#getAttribute_Unit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.Attribute#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Reference Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Attribute</em>' reference.
	 * @see #setReferenceAttribute(Attribute)
	 * @see caex.caex30.caex.CAEXPackage#getAttribute_ReferenceAttribute()
	 * @model
	 * @generated
	 */
	Attribute getReferenceAttribute();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.Attribute#getReferenceAttribute <em>Reference Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Attribute</em>' reference.
	 * @see #getReferenceAttribute()
	 * @generated
	 */
	void setReferenceAttribute(Attribute value);

} // Attribute
