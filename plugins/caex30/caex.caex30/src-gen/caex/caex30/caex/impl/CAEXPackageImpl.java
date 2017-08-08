/**
 */
package caex.caex30.caex.impl;

import caex.anytype.AnytypePackage;

import caex.caex30.caex.AdditionalInformation;
import caex.caex30.caex.Attribute;
import caex.caex30.caex.AttributeFamily;
import caex.caex30.caex.AttributeLib;
import caex.caex30.caex.AttributeNameMapping;
import caex.caex30.caex.AttributeValueRequirement;
import caex.caex30.caex.CAEXBasicObject;
import caex.caex30.caex.CAEXFactory;
import caex.caex30.caex.CAEXFile;
import caex.caex30.caex.CAEXObject;
import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.ChangeMode;
import caex.caex30.caex.Copyright;
import caex.caex30.caex.Description;
import caex.caex30.caex.DocumentRoot;
import caex.caex30.caex.ExternalInterface;
import caex.caex30.caex.ExternalReference;
import caex.caex30.caex.InstanceHierarchy;
import caex.caex30.caex.InterfaceClass;
import caex.caex30.caex.InterfaceClassLib;
import caex.caex30.caex.InterfaceFamily;
import caex.caex30.caex.InterfaceIDMapping;
import caex.caex30.caex.InternalElement;
import caex.caex30.caex.InternalLink;
import caex.caex30.caex.Mapping;
import caex.caex30.caex.NominalScaled;
import caex.caex30.caex.OrdinalScaled;
import caex.caex30.caex.RefSemantic;
import caex.caex30.caex.Revision;
import caex.caex30.caex.RoleClass;
import caex.caex30.caex.RoleClassLib;
import caex.caex30.caex.RoleFamily;
import caex.caex30.caex.RoleRequirements;
import caex.caex30.caex.SourceDocumentInformation;
import caex.caex30.caex.SupportedRoleClass;
import caex.caex30.caex.SystemUnitClass;
import caex.caex30.caex.SystemUnitClassLib;
import caex.caex30.caex.SystemUnitFamily;
import caex.caex30.caex.UnknownType;
import caex.caex30.caex.Version;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CAEXPackageImpl extends EPackageImpl implements CAEXPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeNameMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexBasicObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caexObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClassLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceIDMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nominalScaledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ordinalScaledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refSemanticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleClassLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRequirementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceDocumentInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedRoleClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitClassLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUnitFamilyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyrightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType attributeDataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType changeModeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see caex.caex30.caex.CAEXPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CAEXPackageImpl() {
		super(eNS_URI, CAEXFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CAEXPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CAEXPackage init() {
		if (isInited) return (CAEXPackage)EPackage.Registry.INSTANCE.getEPackage(CAEXPackage.eNS_URI);

		// Obtain or create and register package
		CAEXPackageImpl theCAEXPackage = (CAEXPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CAEXPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CAEXPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AnytypePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCAEXPackage.createPackageContents();

		// Initialize created meta-data
		theCAEXPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCAEXPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CAEXPackage.eNS_URI, theCAEXPackage);
		return theCAEXPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeFamily() {
		return attributeFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeNameMapping() {
		return attributeNameMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeNameMapping_RoleAttributeName() {
		return (EAttribute)attributeNameMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeNameMapping_SystemUnitAttributeName() {
		return (EAttribute)attributeNameMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeNameMapping_RoleAttribute() {
		return (EReference)attributeNameMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeNameMapping_SystemUnitAttribute() {
		return (EReference)attributeNameMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_DefaultValue() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_RefSemantic() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Constraint() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Attribute() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_AttributeDataType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_RefAttributeType() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Unit() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeLib() {
		return attributeLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeLib_AttributeType() {
		return (EReference)attributeLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueRequirement() {
		return attributeValueRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueRequirement_OrdinalScaledType() {
		return (EReference)attributeValueRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueRequirement_NominalScaledType() {
		return (EReference)attributeValueRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueRequirement_UnknownType() {
		return (EReference)attributeValueRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueRequirement_Name() {
		return (EAttribute)attributeValueRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXBasicObject() {
		return caexBasicObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCAEXBasicObject_ChangeMode() {
		return (EAttribute)caexBasicObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_Description() {
		return (EReference)caexBasicObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_Version() {
		return (EReference)caexBasicObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_Revision() {
		return (EReference)caexBasicObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_Copyright() {
		return (EReference)caexBasicObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXBasicObject_AdditionalInformation() {
		return (EReference)caexBasicObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXFile() {
		return caexFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCAEXFile_SuperiorStandardVersion() {
		return (EAttribute)caexFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_SourceDocumentInformation() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_ExternalReference() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_InstanceHierarchy() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_InterfaceClassLib() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_RoleClassLib() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_SystemUnitClassLib() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCAEXFile_AttributeTypeLib() {
		return (EReference)caexFileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCAEXFile_FileName() {
		return (EAttribute)caexFileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCAEXFile_SchemaVersion() {
		return (EAttribute)caexFileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCAEXObject() {
		return caexObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCAEXObject_ID() {
		return (EAttribute)caexObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCAEXObject_Name() {
		return (EAttribute)caexObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CAEXFile() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalInterface() {
		return externalInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalReference() {
		return externalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalReference_Alias() {
		return (EAttribute)externalReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalReference_Path() {
		return (EAttribute)externalReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceHierarchy() {
		return instanceHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceHierarchy_InternalElement() {
		return (EReference)instanceHierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceClassLib() {
		return interfaceClassLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClassLib_InterfaceClass() {
		return (EReference)interfaceClassLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceClass() {
		return interfaceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClass_Attribute() {
		return (EReference)interfaceClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceClass_RefBaseClassPath() {
		return (EAttribute)interfaceClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClass_BaseClass() {
		return (EReference)interfaceClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClass_InterfaceClass() {
		return (EReference)interfaceClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceClass_ExternalInterface() {
		return (EReference)interfaceClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceFamily() {
		return interfaceFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceIDMapping() {
		return interfaceIDMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceIDMapping_RoleInterfaceID() {
		return (EAttribute)interfaceIDMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceIDMapping_SystemUnitInterfaceID() {
		return (EAttribute)interfaceIDMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceIDMapping_RoleInterface() {
		return (EReference)interfaceIDMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceIDMapping_SystemUnitInterface() {
		return (EReference)interfaceIDMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalElement() {
		return internalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalElement_RoleRequirements() {
		return (EReference)internalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalElement_RefBaseSystemUnitPath() {
		return (EAttribute)internalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalElement_BaseSystemUnit() {
		return (EReference)internalElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalLink() {
		return internalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalLink_RefPartnerSideA() {
		return (EAttribute)internalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalLink_RefPartnerSideB() {
		return (EAttribute)internalLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLink_PartnerSideA() {
		return (EReference)internalLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalLink_PartnerSideB() {
		return (EReference)internalLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_AttributeNameMapping() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapping_InterfaceIDMapping() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNominalScaled() {
		return nominalScaledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNominalScaled_RequiredValue() {
		return (EAttribute)nominalScaledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrdinalScaled() {
		return ordinalScaledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrdinalScaled_RequiredMaxValue() {
		return (EAttribute)ordinalScaledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrdinalScaled_RequiredValue() {
		return (EAttribute)ordinalScaledEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrdinalScaled_RequiredMinValue() {
		return (EAttribute)ordinalScaledEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefSemantic() {
		return refSemanticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefSemantic_CorrespondingAttributePath() {
		return (EAttribute)refSemanticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleClassLib() {
		return roleClassLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClassLib_RoleClass() {
		return (EReference)roleClassLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleClass() {
		return roleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClass_Attribute() {
		return (EReference)roleClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClass_ExternalInterface() {
		return (EReference)roleClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleClass_RefBaseClassPath() {
		return (EAttribute)roleClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClass_BaseClass() {
		return (EReference)roleClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleClass_RoleClass() {
		return (EReference)roleClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleFamily() {
		return roleFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRequirements() {
		return roleRequirementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleRequirements_Attribute() {
		return (EReference)roleRequirementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleRequirements_ExternalInterface() {
		return (EReference)roleRequirementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleRequirements_MappingObject() {
		return (EReference)roleRequirementsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleRequirements_RoleClass() {
		return (EReference)roleRequirementsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleRequirements_RefBaseRoleClassPath() {
		return (EAttribute)roleRequirementsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceDocumentInformation() {
		return sourceDocumentInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentInformation_LastWritingDateTime() {
		return (EAttribute)sourceDocumentInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentInformation_OriginID() {
		return (EAttribute)sourceDocumentInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentInformation_OriginName() {
		return (EAttribute)sourceDocumentInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentInformation_OriginProjectID() {
		return (EAttribute)sourceDocumentInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentInformation_OriginProjectTitle() {
		return (EAttribute)sourceDocumentInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentInformation_OriginRelease() {
		return (EAttribute)sourceDocumentInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentInformation_OriginVendor() {
		return (EAttribute)sourceDocumentInformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentInformation_OriginVendorURL() {
		return (EAttribute)sourceDocumentInformationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceDocumentInformation_OriginVersion() {
		return (EAttribute)sourceDocumentInformationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupportedRoleClass() {
		return supportedRoleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedRoleClass_MappingObject() {
		return (EReference)supportedRoleClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupportedRoleClass_RefRoleClassPath() {
		return (EAttribute)supportedRoleClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupportedRoleClass_RoleClass() {
		return (EReference)supportedRoleClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnitClassLib() {
		return systemUnitClassLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClassLib_SystemUnitClass() {
		return (EReference)systemUnitClassLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnitClass() {
		return systemUnitClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_Attribute() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_ExternalInterface() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_InternalElement() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_SupportedRoleClass() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_InternalLink() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_BaseClass() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemUnitClass_SystemUnitClass() {
		return (EReference)systemUnitClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemUnitClass_RefBaseClassPath() {
		return (EAttribute)systemUnitClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUnitFamily() {
		return systemUnitFamilyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnknownType() {
		return unknownTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnknownType_Requirements() {
		return (EAttribute)unknownTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyright() {
		return copyrightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyright_Value() {
		return (EAttribute)copyrightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyright_ChangeMode() {
		return (EAttribute)copyrightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Value() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_ChangeMode() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision() {
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_RevisionDate() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_OldVersion() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_NewVersion() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_AuthorName() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Comment() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Value() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_ChangeMode() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalInformation() {
		return additionalInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeMode() {
		return changeModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAttributeDataType() {
		return attributeDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChangeModeObject() {
		return changeModeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXFactory getCAEXFactory() {
		return (CAEXFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributeFamilyEClass = createEClass(ATTRIBUTE_FAMILY);

		attributeNameMappingEClass = createEClass(ATTRIBUTE_NAME_MAPPING);
		createEAttribute(attributeNameMappingEClass, ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME);
		createEAttribute(attributeNameMappingEClass, ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME);
		createEReference(attributeNameMappingEClass, ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE);
		createEReference(attributeNameMappingEClass, ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT_VALUE);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
		createEReference(attributeEClass, ATTRIBUTE__REF_SEMANTIC);
		createEReference(attributeEClass, ATTRIBUTE__CONSTRAINT);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_DATA_TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__REF_ATTRIBUTE_TYPE);
		createEAttribute(attributeEClass, ATTRIBUTE__UNIT);

		attributeLibEClass = createEClass(ATTRIBUTE_LIB);
		createEReference(attributeLibEClass, ATTRIBUTE_LIB__ATTRIBUTE_TYPE);

		attributeValueRequirementEClass = createEClass(ATTRIBUTE_VALUE_REQUIREMENT);
		createEReference(attributeValueRequirementEClass, ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE);
		createEReference(attributeValueRequirementEClass, ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE);
		createEReference(attributeValueRequirementEClass, ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE);
		createEAttribute(attributeValueRequirementEClass, ATTRIBUTE_VALUE_REQUIREMENT__NAME);

		caexBasicObjectEClass = createEClass(CAEX_BASIC_OBJECT);
		createEAttribute(caexBasicObjectEClass, CAEX_BASIC_OBJECT__CHANGE_MODE);
		createEReference(caexBasicObjectEClass, CAEX_BASIC_OBJECT__DESCRIPTION);
		createEReference(caexBasicObjectEClass, CAEX_BASIC_OBJECT__VERSION);
		createEReference(caexBasicObjectEClass, CAEX_BASIC_OBJECT__REVISION);
		createEReference(caexBasicObjectEClass, CAEX_BASIC_OBJECT__COPYRIGHT);
		createEReference(caexBasicObjectEClass, CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION);

		caexFileEClass = createEClass(CAEX_FILE);
		createEAttribute(caexFileEClass, CAEX_FILE__SUPERIOR_STANDARD_VERSION);
		createEReference(caexFileEClass, CAEX_FILE__SOURCE_DOCUMENT_INFORMATION);
		createEReference(caexFileEClass, CAEX_FILE__EXTERNAL_REFERENCE);
		createEReference(caexFileEClass, CAEX_FILE__INSTANCE_HIERARCHY);
		createEReference(caexFileEClass, CAEX_FILE__INTERFACE_CLASS_LIB);
		createEReference(caexFileEClass, CAEX_FILE__ROLE_CLASS_LIB);
		createEReference(caexFileEClass, CAEX_FILE__SYSTEM_UNIT_CLASS_LIB);
		createEReference(caexFileEClass, CAEX_FILE__ATTRIBUTE_TYPE_LIB);
		createEAttribute(caexFileEClass, CAEX_FILE__FILE_NAME);
		createEAttribute(caexFileEClass, CAEX_FILE__SCHEMA_VERSION);

		caexObjectEClass = createEClass(CAEX_OBJECT);
		createEAttribute(caexObjectEClass, CAEX_OBJECT__ID);
		createEAttribute(caexObjectEClass, CAEX_OBJECT__NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CAEX_FILE);

		externalInterfaceEClass = createEClass(EXTERNAL_INTERFACE);

		externalReferenceEClass = createEClass(EXTERNAL_REFERENCE);
		createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__ALIAS);
		createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__PATH);

		instanceHierarchyEClass = createEClass(INSTANCE_HIERARCHY);
		createEReference(instanceHierarchyEClass, INSTANCE_HIERARCHY__INTERNAL_ELEMENT);

		interfaceClassLibEClass = createEClass(INTERFACE_CLASS_LIB);
		createEReference(interfaceClassLibEClass, INTERFACE_CLASS_LIB__INTERFACE_CLASS);

		interfaceClassEClass = createEClass(INTERFACE_CLASS);
		createEReference(interfaceClassEClass, INTERFACE_CLASS__ATTRIBUTE);
		createEAttribute(interfaceClassEClass, INTERFACE_CLASS__REF_BASE_CLASS_PATH);
		createEReference(interfaceClassEClass, INTERFACE_CLASS__BASE_CLASS);
		createEReference(interfaceClassEClass, INTERFACE_CLASS__INTERFACE_CLASS);
		createEReference(interfaceClassEClass, INTERFACE_CLASS__EXTERNAL_INTERFACE);

		interfaceFamilyEClass = createEClass(INTERFACE_FAMILY);

		interfaceIDMappingEClass = createEClass(INTERFACE_ID_MAPPING);
		createEAttribute(interfaceIDMappingEClass, INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID);
		createEAttribute(interfaceIDMappingEClass, INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID);
		createEReference(interfaceIDMappingEClass, INTERFACE_ID_MAPPING__ROLE_INTERFACE);
		createEReference(interfaceIDMappingEClass, INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE);

		internalElementEClass = createEClass(INTERNAL_ELEMENT);
		createEReference(internalElementEClass, INTERNAL_ELEMENT__ROLE_REQUIREMENTS);
		createEAttribute(internalElementEClass, INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH);
		createEReference(internalElementEClass, INTERNAL_ELEMENT__BASE_SYSTEM_UNIT);

		internalLinkEClass = createEClass(INTERNAL_LINK);
		createEAttribute(internalLinkEClass, INTERNAL_LINK__REF_PARTNER_SIDE_A);
		createEAttribute(internalLinkEClass, INTERNAL_LINK__REF_PARTNER_SIDE_B);
		createEReference(internalLinkEClass, INTERNAL_LINK__PARTNER_SIDE_A);
		createEReference(internalLinkEClass, INTERNAL_LINK__PARTNER_SIDE_B);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__ATTRIBUTE_NAME_MAPPING);
		createEReference(mappingEClass, MAPPING__INTERFACE_ID_MAPPING);

		nominalScaledEClass = createEClass(NOMINAL_SCALED);
		createEAttribute(nominalScaledEClass, NOMINAL_SCALED__REQUIRED_VALUE);

		ordinalScaledEClass = createEClass(ORDINAL_SCALED);
		createEAttribute(ordinalScaledEClass, ORDINAL_SCALED__REQUIRED_MAX_VALUE);
		createEAttribute(ordinalScaledEClass, ORDINAL_SCALED__REQUIRED_VALUE);
		createEAttribute(ordinalScaledEClass, ORDINAL_SCALED__REQUIRED_MIN_VALUE);

		refSemanticEClass = createEClass(REF_SEMANTIC);
		createEAttribute(refSemanticEClass, REF_SEMANTIC__CORRESPONDING_ATTRIBUTE_PATH);

		roleClassLibEClass = createEClass(ROLE_CLASS_LIB);
		createEReference(roleClassLibEClass, ROLE_CLASS_LIB__ROLE_CLASS);

		roleClassEClass = createEClass(ROLE_CLASS);
		createEReference(roleClassEClass, ROLE_CLASS__ATTRIBUTE);
		createEReference(roleClassEClass, ROLE_CLASS__EXTERNAL_INTERFACE);
		createEAttribute(roleClassEClass, ROLE_CLASS__REF_BASE_CLASS_PATH);
		createEReference(roleClassEClass, ROLE_CLASS__BASE_CLASS);
		createEReference(roleClassEClass, ROLE_CLASS__ROLE_CLASS);

		roleFamilyEClass = createEClass(ROLE_FAMILY);

		roleRequirementsEClass = createEClass(ROLE_REQUIREMENTS);
		createEReference(roleRequirementsEClass, ROLE_REQUIREMENTS__ATTRIBUTE);
		createEReference(roleRequirementsEClass, ROLE_REQUIREMENTS__EXTERNAL_INTERFACE);
		createEReference(roleRequirementsEClass, ROLE_REQUIREMENTS__MAPPING_OBJECT);
		createEReference(roleRequirementsEClass, ROLE_REQUIREMENTS__ROLE_CLASS);
		createEAttribute(roleRequirementsEClass, ROLE_REQUIREMENTS__REF_BASE_ROLE_CLASS_PATH);

		sourceDocumentInformationEClass = createEClass(SOURCE_DOCUMENT_INFORMATION);
		createEAttribute(sourceDocumentInformationEClass, SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME);
		createEAttribute(sourceDocumentInformationEClass, SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID);
		createEAttribute(sourceDocumentInformationEClass, SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME);
		createEAttribute(sourceDocumentInformationEClass, SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID);
		createEAttribute(sourceDocumentInformationEClass, SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE);
		createEAttribute(sourceDocumentInformationEClass, SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE);
		createEAttribute(sourceDocumentInformationEClass, SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR);
		createEAttribute(sourceDocumentInformationEClass, SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL);
		createEAttribute(sourceDocumentInformationEClass, SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION);

		supportedRoleClassEClass = createEClass(SUPPORTED_ROLE_CLASS);
		createEReference(supportedRoleClassEClass, SUPPORTED_ROLE_CLASS__MAPPING_OBJECT);
		createEAttribute(supportedRoleClassEClass, SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH);
		createEReference(supportedRoleClassEClass, SUPPORTED_ROLE_CLASS__ROLE_CLASS);

		systemUnitClassLibEClass = createEClass(SYSTEM_UNIT_CLASS_LIB);
		createEReference(systemUnitClassLibEClass, SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS);

		systemUnitClassEClass = createEClass(SYSTEM_UNIT_CLASS);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__ATTRIBUTE);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__EXTERNAL_INTERFACE);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__INTERNAL_ELEMENT);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__SUPPORTED_ROLE_CLASS);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__INTERNAL_LINK);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__BASE_CLASS);
		createEReference(systemUnitClassEClass, SYSTEM_UNIT_CLASS__SYSTEM_UNIT_CLASS);
		createEAttribute(systemUnitClassEClass, SYSTEM_UNIT_CLASS__REF_BASE_CLASS_PATH);

		systemUnitFamilyEClass = createEClass(SYSTEM_UNIT_FAMILY);

		unknownTypeEClass = createEClass(UNKNOWN_TYPE);
		createEAttribute(unknownTypeEClass, UNKNOWN_TYPE__REQUIREMENTS);

		copyrightEClass = createEClass(COPYRIGHT);
		createEAttribute(copyrightEClass, COPYRIGHT__VALUE);
		createEAttribute(copyrightEClass, COPYRIGHT__CHANGE_MODE);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__VALUE);
		createEAttribute(descriptionEClass, DESCRIPTION__CHANGE_MODE);

		revisionEClass = createEClass(REVISION);
		createEAttribute(revisionEClass, REVISION__REVISION_DATE);
		createEAttribute(revisionEClass, REVISION__OLD_VERSION);
		createEAttribute(revisionEClass, REVISION__NEW_VERSION);
		createEAttribute(revisionEClass, REVISION__AUTHOR_NAME);
		createEAttribute(revisionEClass, REVISION__COMMENT);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__VALUE);
		createEAttribute(versionEClass, VERSION__CHANGE_MODE);

		additionalInformationEClass = createEClass(ADDITIONAL_INFORMATION);

		// Create enums
		changeModeEEnum = createEEnum(CHANGE_MODE);

		// Create data types
		attributeDataTypeEDataType = createEDataType(ATTRIBUTE_DATA_TYPE);
		changeModeObjectEDataType = createEDataType(CHANGE_MODE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		AnytypePackage theAnytypePackage = (AnytypePackage)EPackage.Registry.INSTANCE.getEPackage(AnytypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeFamilyEClass.getESuperTypes().add(this.getAttribute());
		attributeNameMappingEClass.getESuperTypes().add(this.getCAEXBasicObject());
		attributeEClass.getESuperTypes().add(this.getCAEXObject());
		attributeLibEClass.getESuperTypes().add(this.getCAEXObject());
		attributeValueRequirementEClass.getESuperTypes().add(this.getCAEXBasicObject());
		caexFileEClass.getESuperTypes().add(this.getCAEXBasicObject());
		caexObjectEClass.getESuperTypes().add(this.getCAEXBasicObject());
		externalInterfaceEClass.getESuperTypes().add(this.getInterfaceClass());
		externalReferenceEClass.getESuperTypes().add(this.getCAEXBasicObject());
		instanceHierarchyEClass.getESuperTypes().add(this.getCAEXObject());
		interfaceClassLibEClass.getESuperTypes().add(this.getCAEXObject());
		interfaceClassEClass.getESuperTypes().add(this.getCAEXObject());
		interfaceFamilyEClass.getESuperTypes().add(this.getInterfaceClass());
		interfaceIDMappingEClass.getESuperTypes().add(this.getCAEXBasicObject());
		internalElementEClass.getESuperTypes().add(this.getSystemUnitClass());
		internalLinkEClass.getESuperTypes().add(this.getCAEXObject());
		mappingEClass.getESuperTypes().add(this.getCAEXBasicObject());
		refSemanticEClass.getESuperTypes().add(this.getCAEXBasicObject());
		roleClassLibEClass.getESuperTypes().add(this.getCAEXObject());
		roleClassEClass.getESuperTypes().add(this.getCAEXObject());
		roleFamilyEClass.getESuperTypes().add(this.getRoleClass());
		roleRequirementsEClass.getESuperTypes().add(this.getCAEXBasicObject());
		supportedRoleClassEClass.getESuperTypes().add(this.getCAEXBasicObject());
		systemUnitClassLibEClass.getESuperTypes().add(this.getCAEXObject());
		systemUnitClassEClass.getESuperTypes().add(this.getCAEXObject());
		systemUnitFamilyEClass.getESuperTypes().add(this.getSystemUnitClass());
		revisionEClass.getESuperTypes().add(this.getCAEXBasicObject());
		additionalInformationEClass.getESuperTypes().add(theAnytypePackage.getGenericElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeFamilyEClass, AttributeFamily.class, "AttributeFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeNameMappingEClass, AttributeNameMapping.class, "AttributeNameMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeNameMapping_RoleAttributeName(), theXMLTypePackage.getString(), "roleAttributeName", null, 1, 1, AttributeNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeNameMapping_SystemUnitAttributeName(), theXMLTypePackage.getString(), "systemUnitAttributeName", null, 1, 1, AttributeNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeNameMapping_RoleAttribute(), this.getAttribute(), null, "roleAttribute", null, 1, 1, AttributeNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeNameMapping_SystemUnitAttribute(), this.getAttribute(), null, "systemUnitAttribute", null, 1, 1, AttributeNameMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_DefaultValue(), theXMLTypePackage.getString(), "defaultValue", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_RefSemantic(), this.getRefSemantic(), null, "refSemantic", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Constraint(), this.getAttributeValueRequirement(), null, "constraint", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_AttributeDataType(), this.getAttributeDataType(), "attributeDataType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_RefAttributeType(), theXMLTypePackage.getString(), "refAttributeType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Unit(), theXMLTypePackage.getString(), "unit", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeLibEClass, AttributeLib.class, "AttributeLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeLib_AttributeType(), this.getAttribute(), null, "attributeType", null, 0, -1, AttributeLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueRequirementEClass, AttributeValueRequirement.class, "AttributeValueRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueRequirement_OrdinalScaledType(), this.getOrdinalScaled(), null, "ordinalScaledType", null, 0, 1, AttributeValueRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeValueRequirement_NominalScaledType(), this.getNominalScaled(), null, "nominalScaledType", null, 0, 1, AttributeValueRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeValueRequirement_UnknownType(), this.getUnknownType(), null, "unknownType", null, 0, 1, AttributeValueRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeValueRequirement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AttributeValueRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caexBasicObjectEClass, CAEXBasicObject.class, "CAEXBasicObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCAEXBasicObject_ChangeMode(), this.getChangeMode(), "changeMode", "state", 0, 1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXBasicObject_Description(), this.getDescription(), null, "description", null, 0, 1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXBasicObject_Version(), this.getVersion(), null, "version", null, 0, 1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXBasicObject_Revision(), this.getRevision(), null, "revision", null, 0, -1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXBasicObject_Copyright(), this.getCopyright(), null, "copyright", null, 0, 1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXBasicObject_AdditionalInformation(), this.getAdditionalInformation(), null, "additionalInformation", null, 0, -1, CAEXBasicObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caexFileEClass, CAEXFile.class, "CAEXFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCAEXFile_SuperiorStandardVersion(), theXMLTypePackage.getString(), "superiorStandardVersion", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_SourceDocumentInformation(), this.getSourceDocumentInformation(), null, "sourceDocumentInformation", null, 1, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_ExternalReference(), this.getExternalReference(), null, "externalReference", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_InstanceHierarchy(), this.getInstanceHierarchy(), null, "instanceHierarchy", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_InterfaceClassLib(), this.getInterfaceClassLib(), null, "interfaceClassLib", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_RoleClassLib(), this.getRoleClassLib(), null, "roleClassLib", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_SystemUnitClassLib(), this.getSystemUnitClassLib(), null, "systemUnitClassLib", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAEXFile_AttributeTypeLib(), this.getAttributeLib(), null, "attributeTypeLib", null, 0, -1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCAEXFile_FileName(), theXMLTypePackage.getString(), "fileName", null, 1, 1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCAEXFile_SchemaVersion(), theXMLTypePackage.getString(), "schemaVersion", "3.00", 1, 1, CAEXFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caexObjectEClass, CAEXObject.class, "CAEXObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCAEXObject_ID(), theXMLTypePackage.getString(), "iD", null, 0, 1, CAEXObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCAEXObject_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, CAEXObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, DocumentRoot.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, DocumentRoot.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CAEXFile(), this.getCAEXFile(), null, "cAEXFile", null, 0, -2, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(externalInterfaceEClass, ExternalInterface.class, "ExternalInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalReferenceEClass, ExternalReference.class, "ExternalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalReference_Alias(), theXMLTypePackage.getString(), "alias", null, 1, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalReference_Path(), theXMLTypePackage.getString(), "path", null, 1, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceHierarchyEClass, InstanceHierarchy.class, "InstanceHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceHierarchy_InternalElement(), this.getInternalElement(), null, "internalElement", null, 0, -1, InstanceHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceClassLibEClass, InterfaceClassLib.class, "InterfaceClassLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceClassLib_InterfaceClass(), this.getInterfaceClass(), null, "interfaceClass", null, 0, -1, InterfaceClassLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceClassEClass, InterfaceClass.class, "InterfaceClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceClass_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, InterfaceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceClass_RefBaseClassPath(), theXMLTypePackage.getString(), "refBaseClassPath", null, 0, 1, InterfaceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceClass_BaseClass(), this.getInterfaceClass(), null, "baseClass", null, 0, 1, InterfaceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceClass_InterfaceClass(), this.getInterfaceClass(), null, "interfaceClass", null, 0, -1, InterfaceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceClass_ExternalInterface(), this.getInterfaceClass(), null, "externalInterface", null, 0, -1, InterfaceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceFamilyEClass, InterfaceFamily.class, "InterfaceFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceIDMappingEClass, InterfaceIDMapping.class, "InterfaceIDMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceIDMapping_RoleInterfaceID(), theXMLTypePackage.getString(), "roleInterfaceID", null, 1, 1, InterfaceIDMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceIDMapping_SystemUnitInterfaceID(), theXMLTypePackage.getString(), "systemUnitInterfaceID", null, 1, 1, InterfaceIDMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceIDMapping_RoleInterface(), this.getExternalInterface(), null, "roleInterface", null, 1, 1, InterfaceIDMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterfaceIDMapping_SystemUnitInterface(), this.getExternalInterface(), null, "systemUnitInterface", null, 1, 1, InterfaceIDMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalElementEClass, InternalElement.class, "InternalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalElement_RoleRequirements(), this.getRoleRequirements(), null, "roleRequirements", null, 0, -1, InternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalElement_RefBaseSystemUnitPath(), theXMLTypePackage.getString(), "refBaseSystemUnitPath", null, 0, 1, InternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalElement_BaseSystemUnit(), this.getSystemUnitClass(), null, "baseSystemUnit", null, 0, 1, InternalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalLinkEClass, InternalLink.class, "InternalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalLink_RefPartnerSideA(), theXMLTypePackage.getString(), "refPartnerSideA", null, 1, 1, InternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalLink_RefPartnerSideB(), theXMLTypePackage.getString(), "refPartnerSideB", null, 1, 1, InternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalLink_PartnerSideA(), this.getInterfaceClass(), null, "partnerSideA", null, 1, 1, InternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalLink_PartnerSideB(), this.getInterfaceClass(), null, "partnerSideB", null, 1, 1, InternalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_AttributeNameMapping(), this.getAttributeNameMapping(), null, "attributeNameMapping", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_InterfaceIDMapping(), this.getInterfaceIDMapping(), null, "interfaceIDMapping", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nominalScaledEClass, NominalScaled.class, "NominalScaled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNominalScaled_RequiredValue(), theXMLTypePackage.getString(), "requiredValue", null, 0, -1, NominalScaled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ordinalScaledEClass, OrdinalScaled.class, "OrdinalScaled", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrdinalScaled_RequiredMaxValue(), theXMLTypePackage.getString(), "requiredMaxValue", null, 0, 1, OrdinalScaled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrdinalScaled_RequiredValue(), theXMLTypePackage.getString(), "requiredValue", null, 0, 1, OrdinalScaled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrdinalScaled_RequiredMinValue(), theXMLTypePackage.getString(), "requiredMinValue", null, 0, 1, OrdinalScaled.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refSemanticEClass, RefSemantic.class, "RefSemantic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefSemantic_CorrespondingAttributePath(), theXMLTypePackage.getString(), "correspondingAttributePath", null, 1, 1, RefSemantic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleClassLibEClass, RoleClassLib.class, "RoleClassLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleClassLib_RoleClass(), this.getRoleClass(), null, "roleClass", null, 0, -1, RoleClassLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleClassEClass, RoleClass.class, "RoleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleClass_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, RoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleClass_ExternalInterface(), this.getExternalInterface(), null, "externalInterface", null, 0, -1, RoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleClass_RefBaseClassPath(), theXMLTypePackage.getString(), "refBaseClassPath", null, 0, 1, RoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleClass_BaseClass(), this.getRoleClass(), null, "baseClass", null, 0, 1, RoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleClass_RoleClass(), this.getRoleClass(), null, "roleClass", null, 0, -1, RoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleFamilyEClass, RoleFamily.class, "RoleFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleRequirementsEClass, RoleRequirements.class, "RoleRequirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleRequirements_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, RoleRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleRequirements_ExternalInterface(), this.getInterfaceClass(), null, "externalInterface", null, 0, -1, RoleRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleRequirements_MappingObject(), this.getMapping(), null, "mappingObject", null, 0, 1, RoleRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleRequirements_RoleClass(), this.getRoleClass(), null, "roleClass", null, 1, 1, RoleRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleRequirements_RefBaseRoleClassPath(), theXMLTypePackage.getString(), "refBaseRoleClassPath", null, 1, 1, RoleRequirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceDocumentInformationEClass, SourceDocumentInformation.class, "SourceDocumentInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceDocumentInformation_LastWritingDateTime(), theXMLTypePackage.getDateTime(), "lastWritingDateTime", null, 1, 1, SourceDocumentInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceDocumentInformation_OriginID(), theXMLTypePackage.getString(), "originID", null, 1, 1, SourceDocumentInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceDocumentInformation_OriginName(), theXMLTypePackage.getString(), "originName", null, 1, 1, SourceDocumentInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceDocumentInformation_OriginProjectID(), theXMLTypePackage.getString(), "originProjectID", null, 0, 1, SourceDocumentInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceDocumentInformation_OriginProjectTitle(), theXMLTypePackage.getString(), "originProjectTitle", null, 0, 1, SourceDocumentInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceDocumentInformation_OriginRelease(), theXMLTypePackage.getString(), "originRelease", null, 0, 1, SourceDocumentInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceDocumentInformation_OriginVendor(), theXMLTypePackage.getString(), "originVendor", null, 0, 1, SourceDocumentInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceDocumentInformation_OriginVendorURL(), theXMLTypePackage.getString(), "originVendorURL", null, 0, 1, SourceDocumentInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceDocumentInformation_OriginVersion(), theXMLTypePackage.getString(), "originVersion", null, 1, 1, SourceDocumentInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supportedRoleClassEClass, SupportedRoleClass.class, "SupportedRoleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportedRoleClass_MappingObject(), this.getMapping(), null, "mappingObject", null, 0, 1, SupportedRoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupportedRoleClass_RefRoleClassPath(), theXMLTypePackage.getString(), "refRoleClassPath", null, 1, 1, SupportedRoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupportedRoleClass_RoleClass(), this.getRoleClass(), null, "roleClass", null, 1, 1, SupportedRoleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemUnitClassLibEClass, SystemUnitClassLib.class, "SystemUnitClassLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemUnitClassLib_SystemUnitClass(), this.getSystemUnitClass(), null, "systemUnitClass", null, 0, -1, SystemUnitClassLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemUnitClassEClass, SystemUnitClass.class, "SystemUnitClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemUnitClass_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_ExternalInterface(), this.getInterfaceClass(), null, "externalInterface", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_InternalElement(), this.getInternalElement(), null, "internalElement", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_SupportedRoleClass(), this.getSupportedRoleClass(), null, "supportedRoleClass", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_InternalLink(), this.getInternalLink(), null, "internalLink", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_BaseClass(), this.getSystemUnitClass(), null, "baseClass", null, 0, 1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemUnitClass_SystemUnitClass(), this.getSystemUnitClass(), null, "systemUnitClass", null, 0, -1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemUnitClass_RefBaseClassPath(), theXMLTypePackage.getString(), "refBaseClassPath", null, 0, 1, SystemUnitClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemUnitFamilyEClass, SystemUnitFamily.class, "SystemUnitFamily", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unknownTypeEClass, UnknownType.class, "UnknownType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknownType_Requirements(), theXMLTypePackage.getString(), "requirements", null, 0, 1, UnknownType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyrightEClass, Copyright.class, "Copyright", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyright_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Copyright.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyright_ChangeMode(), this.getChangeMode(), "changeMode", null, 0, 1, Copyright.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_ChangeMode(), this.getChangeMode(), "changeMode", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionEClass, Revision.class, "Revision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevision_RevisionDate(), theXMLTypePackage.getDateTime(), "revisionDate", null, 1, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_OldVersion(), theXMLTypePackage.getString(), "oldVersion", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_NewVersion(), theXMLTypePackage.getString(), "newVersion", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_AuthorName(), theXMLTypePackage.getString(), "authorName", null, 1, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_ChangeMode(), this.getChangeMode(), "changeMode", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionalInformationEClass, AdditionalInformation.class, "AdditionalInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(changeModeEEnum, ChangeMode.class, "ChangeMode");
		addEEnumLiteral(changeModeEEnum, ChangeMode.STATE);
		addEEnumLiteral(changeModeEEnum, ChangeMode.CREATE);
		addEEnumLiteral(changeModeEEnum, ChangeMode.DELETE);
		addEEnumLiteral(changeModeEEnum, ChangeMode.CHANGE);

		// Initialize data types
		initEDataType(attributeDataTypeEDataType, String.class, "AttributeDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(changeModeObjectEDataType, Enumerator.class, "ChangeModeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CAEXPackageImpl
