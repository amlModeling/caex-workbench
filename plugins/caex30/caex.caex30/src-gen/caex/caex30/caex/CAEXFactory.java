/**
 */
package caex.caex30.caex;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see caex.caex30.caex.CAEXPackage
 * @generated
 */
public interface CAEXFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CAEXFactory eINSTANCE = caex.caex30.caex.impl.CAEXFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Family</em>'.
	 * @generated
	 */
	AttributeFamily createAttributeFamily();

	/**
	 * Returns a new object of class '<em>Attribute Name Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Name Mapping</em>'.
	 * @generated
	 */
	AttributeNameMapping createAttributeNameMapping();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Attribute Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Lib</em>'.
	 * @generated
	 */
	AttributeLib createAttributeLib();

	/**
	 * Returns a new object of class '<em>Attribute Value Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Requirement</em>'.
	 * @generated
	 */
	AttributeValueRequirement createAttributeValueRequirement();

	/**
	 * Returns a new object of class '<em>Basic Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Object</em>'.
	 * @generated
	 */
	CAEXBasicObject createCAEXBasicObject();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	CAEXFile createCAEXFile();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	CAEXObject createCAEXObject();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>External Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Interface</em>'.
	 * @generated
	 */
	ExternalInterface createExternalInterface();

	/**
	 * Returns a new object of class '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference</em>'.
	 * @generated
	 */
	ExternalReference createExternalReference();

	/**
	 * Returns a new object of class '<em>Instance Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Hierarchy</em>'.
	 * @generated
	 */
	InstanceHierarchy createInstanceHierarchy();

	/**
	 * Returns a new object of class '<em>Interface Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Class Lib</em>'.
	 * @generated
	 */
	InterfaceClassLib createInterfaceClassLib();

	/**
	 * Returns a new object of class '<em>Interface Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Class</em>'.
	 * @generated
	 */
	InterfaceClass createInterfaceClass();

	/**
	 * Returns a new object of class '<em>Interface Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Family</em>'.
	 * @generated
	 */
	InterfaceFamily createInterfaceFamily();

	/**
	 * Returns a new object of class '<em>Interface ID Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface ID Mapping</em>'.
	 * @generated
	 */
	InterfaceIDMapping createInterfaceIDMapping();

	/**
	 * Returns a new object of class '<em>Internal Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Element</em>'.
	 * @generated
	 */
	InternalElement createInternalElement();

	/**
	 * Returns a new object of class '<em>Internal Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Link</em>'.
	 * @generated
	 */
	InternalLink createInternalLink();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Nominal Scaled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nominal Scaled</em>'.
	 * @generated
	 */
	NominalScaled createNominalScaled();

	/**
	 * Returns a new object of class '<em>Ordinal Scaled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordinal Scaled</em>'.
	 * @generated
	 */
	OrdinalScaled createOrdinalScaled();

	/**
	 * Returns a new object of class '<em>Ref Semantic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ref Semantic</em>'.
	 * @generated
	 */
	RefSemantic createRefSemantic();

	/**
	 * Returns a new object of class '<em>Role Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Class Lib</em>'.
	 * @generated
	 */
	RoleClassLib createRoleClassLib();

	/**
	 * Returns a new object of class '<em>Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Class</em>'.
	 * @generated
	 */
	RoleClass createRoleClass();

	/**
	 * Returns a new object of class '<em>Role Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Family</em>'.
	 * @generated
	 */
	RoleFamily createRoleFamily();

	/**
	 * Returns a new object of class '<em>Role Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Requirements</em>'.
	 * @generated
	 */
	RoleRequirements createRoleRequirements();

	/**
	 * Returns a new object of class '<em>Source Document Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Document Information</em>'.
	 * @generated
	 */
	SourceDocumentInformation createSourceDocumentInformation();

	/**
	 * Returns a new object of class '<em>Supported Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supported Role Class</em>'.
	 * @generated
	 */
	SupportedRoleClass createSupportedRoleClass();

	/**
	 * Returns a new object of class '<em>System Unit Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Class Lib</em>'.
	 * @generated
	 */
	SystemUnitClassLib createSystemUnitClassLib();

	/**
	 * Returns a new object of class '<em>System Unit Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Class</em>'.
	 * @generated
	 */
	SystemUnitClass createSystemUnitClass();

	/**
	 * Returns a new object of class '<em>System Unit Family</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Unit Family</em>'.
	 * @generated
	 */
	SystemUnitFamily createSystemUnitFamily();

	/**
	 * Returns a new object of class '<em>Unknown Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unknown Type</em>'.
	 * @generated
	 */
	UnknownType createUnknownType();

	/**
	 * Returns a new object of class '<em>Copyright</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copyright</em>'.
	 * @generated
	 */
	Copyright createCopyright();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns a new object of class '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision</em>'.
	 * @generated
	 */
	Revision createRevision();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Additional Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Information</em>'.
	 * @generated
	 */
	AdditionalInformation createAdditionalInformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CAEXPackage getCAEXPackage();

} //CAEXFactory
