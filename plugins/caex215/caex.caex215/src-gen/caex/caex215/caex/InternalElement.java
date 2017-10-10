/**
 */
package caex.caex215.caex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.InternalElement#getRoleRequirements <em>Role Requirements</em>}</li>
 *   <li>{@link caex.caex215.caex.InternalElement#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link caex.caex215.caex.InternalElement#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}</li>
 *   <li>{@link caex.caex215.caex.InternalElement#getBaseSystemUnit <em>Base System Unit</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getInternalElement()
 * @model extendedMetaData="name='InternalElementType' kind='elementOnly'"
 * @generated
 */
public interface InternalElement extends SystemUnitClass {
	/**
	 * Returns the value of the '<em><b>Role Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes role requirements of an InternalElement. It allows the definition of a reference to a RoleClass and the specification of role requirements like required attributes and required interfaces. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Requirements</em>' containment reference.
	 * @see #setRoleRequirements(RoleRequirements)
	 * @see caex.caex215.caex.CAEXPackage#getInternalElement_RoleRequirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleRequirements' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleRequirements getRoleRequirements();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.InternalElement#getRoleRequirements <em>Role Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Requirements</em>' containment reference.
	 * @see #getRoleRequirements()
	 * @generated
	 */
	void setRoleRequirements(RoleRequirements value);

	/**
	 * Returns the value of the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Host element for AttributeNameMapping and InterfaceNameMapping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping Object</em>' containment reference.
	 * @see #setMappingObject(Mapping)
	 * @see caex.caex215.caex.CAEXPackage#getInternalElement_MappingObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MappingObject' namespace='##targetNamespace'"
	 * @generated
	 */
	Mapping getMappingObject();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.InternalElement#getMappingObject <em>Mapping Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Object</em>' containment reference.
	 * @see #getMappingObject()
	 * @generated
	 */
	void setMappingObject(Mapping value);

	/**
	 * Returns the value of the '<em><b>Ref Base System Unit Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base System Unit Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the reference of an InternalElement to a class or instance definition. References contain the full path information. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Base System Unit Path</em>' attribute.
	 * @see #setRefBaseSystemUnitPath(String)
	 * @see caex.caex215.caex.CAEXPackage#getInternalElement_RefBaseSystemUnitPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RefBaseSystemUnitPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefBaseSystemUnitPath();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.InternalElement#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base System Unit Path</em>' attribute.
	 * @see #getRefBaseSystemUnitPath()
	 * @generated
	 */
	void setRefBaseSystemUnitPath(String value);

	/**
	 * Returns the value of the '<em><b>Base System Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base System Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base System Unit</em>' reference.
	 * @see #setBaseSystemUnit(SystemUnitClass)
	 * @see caex.caex215.caex.CAEXPackage#getInternalElement_BaseSystemUnit()
	 * @model
	 * @generated
	 */
	SystemUnitClass getBaseSystemUnit();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.InternalElement#getBaseSystemUnit <em>Base System Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base System Unit</em>' reference.
	 * @see #getBaseSystemUnit()
	 * @generated
	 */
	void setBaseSystemUnit(SystemUnitClass value);

} // InternalElement
