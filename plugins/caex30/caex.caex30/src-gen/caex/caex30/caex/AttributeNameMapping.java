/**
 */
package caex.caex30.caex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.AttributeNameMapping#getRoleAttributeName <em>Role Attribute Name</em>}</li>
 *   <li>{@link caex.caex30.caex.AttributeNameMapping#getSystemUnitAttributeName <em>System Unit Attribute Name</em>}</li>
 *   <li>{@link caex.caex30.caex.AttributeNameMapping#getRoleAttribute <em>Role Attribute</em>}</li>
 *   <li>{@link caex.caex30.caex.AttributeNameMapping#getSystemUnitAttribute <em>System Unit Attribute</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getAttributeNameMapping()
 * @model
 * @generated
 */
public interface AttributeNameMapping extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Role Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Attribute Name</em>' attribute.
	 * @see #setRoleAttributeName(String)
	 * @see caex.caex30.caex.CAEXPackage#getAttributeNameMapping_RoleAttributeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getRoleAttributeName();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.AttributeNameMapping#getRoleAttributeName <em>Role Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Attribute Name</em>' attribute.
	 * @see #getRoleAttributeName()
	 * @generated
	 */
	void setRoleAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>System Unit Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Attribute Name</em>' attribute.
	 * @see #setSystemUnitAttributeName(String)
	 * @see caex.caex30.caex.CAEXPackage#getAttributeNameMapping_SystemUnitAttributeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getSystemUnitAttributeName();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.AttributeNameMapping#getSystemUnitAttributeName <em>System Unit Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Attribute Name</em>' attribute.
	 * @see #getSystemUnitAttributeName()
	 * @generated
	 */
	void setSystemUnitAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Role Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Attribute</em>' reference.
	 * @see #setRoleAttribute(Attribute)
	 * @see caex.caex30.caex.CAEXPackage#getAttributeNameMapping_RoleAttribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getRoleAttribute();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.AttributeNameMapping#getRoleAttribute <em>Role Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Attribute</em>' reference.
	 * @see #getRoleAttribute()
	 * @generated
	 */
	void setRoleAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>System Unit Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Attribute</em>' reference.
	 * @see #setSystemUnitAttribute(Attribute)
	 * @see caex.caex30.caex.CAEXPackage#getAttributeNameMapping_SystemUnitAttribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getSystemUnitAttribute();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.AttributeNameMapping#getSystemUnitAttribute <em>System Unit Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Attribute</em>' reference.
	 * @see #getSystemUnitAttribute()
	 * @generated
	 */
	void setSystemUnitAttribute(Attribute value);

} // AttributeNameMapping
