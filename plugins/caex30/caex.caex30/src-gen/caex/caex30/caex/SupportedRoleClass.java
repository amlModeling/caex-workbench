/**
 */
package caex.caex30.caex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Role Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.SupportedRoleClass#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link caex.caex30.caex.SupportedRoleClass#getRefRoleClassPath <em>Ref Role Class Path</em>}</li>
 *   <li>{@link caex.caex30.caex.SupportedRoleClass#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getSupportedRoleClass()
 * @model
 * @generated
 */
public interface SupportedRoleClass extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Object</em>' containment reference.
	 * @see #setMappingObject(Mapping)
	 * @see caex.caex30.caex.CAEXPackage#getSupportedRoleClass_MappingObject()
	 * @model containment="true"
	 * @generated
	 */
	Mapping getMappingObject();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SupportedRoleClass#getMappingObject <em>Mapping Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Object</em>' containment reference.
	 * @see #getMappingObject()
	 * @generated
	 */
	void setMappingObject(Mapping value);

	/**
	 * Returns the value of the '<em><b>Ref Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Role Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Role Class Path</em>' attribute.
	 * @see #setRefRoleClassPath(String)
	 * @see caex.caex30.caex.CAEXPackage#getSupportedRoleClass_RefRoleClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getRefRoleClassPath();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SupportedRoleClass#getRefRoleClassPath <em>Ref Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Role Class Path</em>' attribute.
	 * @see #getRefRoleClassPath()
	 * @generated
	 */
	void setRefRoleClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Class</em>' reference.
	 * @see #setRoleClass(RoleClass)
	 * @see caex.caex30.caex.CAEXPackage#getSupportedRoleClass_RoleClass()
	 * @model required="true"
	 * @generated
	 */
	RoleClass getRoleClass();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SupportedRoleClass#getRoleClass <em>Role Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Class</em>' reference.
	 * @see #getRoleClass()
	 * @generated
	 */
	void setRoleClass(RoleClass value);

} // SupportedRoleClass
