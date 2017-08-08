/**
 */
package caex.caex215.caex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.InterfaceNameMapping#getRoleInterfaceName <em>Role Interface Name</em>}</li>
 *   <li>{@link caex.caex215.caex.InterfaceNameMapping#getSystemUnitInterfaceName <em>System Unit Interface Name</em>}</li>
 *   <li>{@link caex.caex215.caex.InterfaceNameMapping#getRoleInterface <em>Role Interface</em>}</li>
 *   <li>{@link caex.caex215.caex.InterfaceNameMapping#getSystemUnitInterface <em>System Unit Interface</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getInterfaceNameMapping()
 * @model
 * @generated
 */
public interface InterfaceNameMapping extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Role Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Interface Name</em>' attribute.
	 * @see #setRoleInterfaceName(String)
	 * @see caex.caex215.caex.CAEXPackage#getInterfaceNameMapping_RoleInterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getRoleInterfaceName();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.InterfaceNameMapping#getRoleInterfaceName <em>Role Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Interface Name</em>' attribute.
	 * @see #getRoleInterfaceName()
	 * @generated
	 */
	void setRoleInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>System Unit Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Interface Name</em>' attribute.
	 * @see #setSystemUnitInterfaceName(String)
	 * @see caex.caex215.caex.CAEXPackage#getInterfaceNameMapping_SystemUnitInterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getSystemUnitInterfaceName();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.InterfaceNameMapping#getSystemUnitInterfaceName <em>System Unit Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Interface Name</em>' attribute.
	 * @see #getSystemUnitInterfaceName()
	 * @generated
	 */
	void setSystemUnitInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>Role Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Interface</em>' reference.
	 * @see #setRoleInterface(ExternalInterface)
	 * @see caex.caex215.caex.CAEXPackage#getInterfaceNameMapping_RoleInterface()
	 * @model required="true"
	 * @generated
	 */
	ExternalInterface getRoleInterface();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.InterfaceNameMapping#getRoleInterface <em>Role Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Interface</em>' reference.
	 * @see #getRoleInterface()
	 * @generated
	 */
	void setRoleInterface(ExternalInterface value);

	/**
	 * Returns the value of the '<em><b>System Unit Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Interface</em>' reference.
	 * @see #setSystemUnitInterface(ExternalInterface)
	 * @see caex.caex215.caex.CAEXPackage#getInterfaceNameMapping_SystemUnitInterface()
	 * @model required="true"
	 * @generated
	 */
	ExternalInterface getSystemUnitInterface();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.InterfaceNameMapping#getSystemUnitInterface <em>System Unit Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Unit Interface</em>' reference.
	 * @see #getSystemUnitInterface()
	 * @generated
	 */
	void setSystemUnitInterface(ExternalInterface value);

} // InterfaceNameMapping
