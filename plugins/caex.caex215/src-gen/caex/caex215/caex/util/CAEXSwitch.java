/**
 */
package caex.caex215.caex.util;

import caex.anytype.Element;
import caex.anytype.GenericElement;

import caex.caex215.caex.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see caex.caex215.caex.CAEXPackage
 * @generated
 */
public class CAEXSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CAEXPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXSwitch() {
		if (modelPackage == null) {
			modelPackage = CAEXPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING: {
				AttributeNameMapping attributeNameMapping = (AttributeNameMapping)theEObject;
				T result = caseAttributeNameMapping(attributeNameMapping);
				if (result == null) result = caseCAEXBasicObject(attributeNameMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseCAEXObject(attribute);
				if (result == null) result = caseCAEXBasicObject(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.ATTRIBUTE_VALUE_REQUIREMENT: {
				AttributeValueRequirement attributeValueRequirement = (AttributeValueRequirement)theEObject;
				T result = caseAttributeValueRequirement(attributeValueRequirement);
				if (result == null) result = caseCAEXBasicObject(attributeValueRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.CAEX_BASIC_OBJECT: {
				CAEXBasicObject caexBasicObject = (CAEXBasicObject)theEObject;
				T result = caseCAEXBasicObject(caexBasicObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.CAEX_FILE: {
				CAEXFile caexFile = (CAEXFile)theEObject;
				T result = caseCAEXFile(caexFile);
				if (result == null) result = caseCAEXBasicObject(caexFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.CAEX_OBJECT: {
				CAEXObject caexObject = (CAEXObject)theEObject;
				T result = caseCAEXObject(caexObject);
				if (result == null) result = caseCAEXBasicObject(caexObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.COPYRIGHT: {
				Copyright copyright = (Copyright)theEObject;
				T result = caseCopyright(copyright);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.EXTERNAL_INTERFACE: {
				ExternalInterface externalInterface = (ExternalInterface)theEObject;
				T result = caseExternalInterface(externalInterface);
				if (result == null) result = caseInterfaceClass(externalInterface);
				if (result == null) result = caseCAEXObject(externalInterface);
				if (result == null) result = caseCAEXBasicObject(externalInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.EXTERNAL_REFERENCE: {
				ExternalReference externalReference = (ExternalReference)theEObject;
				T result = caseExternalReference(externalReference);
				if (result == null) result = caseCAEXBasicObject(externalReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.INSTANCE_HIERARCHY: {
				InstanceHierarchy instanceHierarchy = (InstanceHierarchy)theEObject;
				T result = caseInstanceHierarchy(instanceHierarchy);
				if (result == null) result = caseCAEXObject(instanceHierarchy);
				if (result == null) result = caseCAEXBasicObject(instanceHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.INTERFACE_CLASS_LIB: {
				InterfaceClassLib interfaceClassLib = (InterfaceClassLib)theEObject;
				T result = caseInterfaceClassLib(interfaceClassLib);
				if (result == null) result = caseCAEXObject(interfaceClassLib);
				if (result == null) result = caseCAEXBasicObject(interfaceClassLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.INTERFACE_CLASS: {
				InterfaceClass interfaceClass = (InterfaceClass)theEObject;
				T result = caseInterfaceClass(interfaceClass);
				if (result == null) result = caseCAEXObject(interfaceClass);
				if (result == null) result = caseCAEXBasicObject(interfaceClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.INTERFACE_FAMILY: {
				InterfaceFamily interfaceFamily = (InterfaceFamily)theEObject;
				T result = caseInterfaceFamily(interfaceFamily);
				if (result == null) result = caseInterfaceClass(interfaceFamily);
				if (result == null) result = caseCAEXObject(interfaceFamily);
				if (result == null) result = caseCAEXBasicObject(interfaceFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.INTERFACE_NAME_MAPPING: {
				InterfaceNameMapping interfaceNameMapping = (InterfaceNameMapping)theEObject;
				T result = caseInterfaceNameMapping(interfaceNameMapping);
				if (result == null) result = caseCAEXBasicObject(interfaceNameMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.INTERNAL_ELEMENT: {
				InternalElement internalElement = (InternalElement)theEObject;
				T result = caseInternalElement(internalElement);
				if (result == null) result = caseSystemUnitClass(internalElement);
				if (result == null) result = caseCAEXObject(internalElement);
				if (result == null) result = caseCAEXBasicObject(internalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.INTERNAL_LINK: {
				InternalLink internalLink = (InternalLink)theEObject;
				T result = caseInternalLink(internalLink);
				if (result == null) result = caseCAEXObject(internalLink);
				if (result == null) result = caseCAEXBasicObject(internalLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = caseCAEXBasicObject(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.NOMINAL_SCALED: {
				NominalScaled nominalScaled = (NominalScaled)theEObject;
				T result = caseNominalScaled(nominalScaled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.ORDINAL_SCALED: {
				OrdinalScaled ordinalScaled = (OrdinalScaled)theEObject;
				T result = caseOrdinalScaled(ordinalScaled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.REF_SEMANTIC: {
				RefSemantic refSemantic = (RefSemantic)theEObject;
				T result = caseRefSemantic(refSemantic);
				if (result == null) result = caseCAEXBasicObject(refSemantic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.REVISION: {
				Revision revision = (Revision)theEObject;
				T result = caseRevision(revision);
				if (result == null) result = caseCAEXBasicObject(revision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.ROLE_CLASS_LIB: {
				RoleClassLib roleClassLib = (RoleClassLib)theEObject;
				T result = caseRoleClassLib(roleClassLib);
				if (result == null) result = caseCAEXObject(roleClassLib);
				if (result == null) result = caseCAEXBasicObject(roleClassLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.ROLE_CLASS: {
				RoleClass roleClass = (RoleClass)theEObject;
				T result = caseRoleClass(roleClass);
				if (result == null) result = caseCAEXObject(roleClass);
				if (result == null) result = caseCAEXBasicObject(roleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.ROLE_FAMILY: {
				RoleFamily roleFamily = (RoleFamily)theEObject;
				T result = caseRoleFamily(roleFamily);
				if (result == null) result = caseRoleClass(roleFamily);
				if (result == null) result = caseCAEXObject(roleFamily);
				if (result == null) result = caseCAEXBasicObject(roleFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.ROLE_REQUIREMENTS: {
				RoleRequirements roleRequirements = (RoleRequirements)theEObject;
				T result = caseRoleRequirements(roleRequirements);
				if (result == null) result = caseCAEXBasicObject(roleRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.SUPPORTED_ROLE_CLASS: {
				SupportedRoleClass supportedRoleClass = (SupportedRoleClass)theEObject;
				T result = caseSupportedRoleClass(supportedRoleClass);
				if (result == null) result = caseCAEXBasicObject(supportedRoleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB: {
				SystemUnitClassLib systemUnitClassLib = (SystemUnitClassLib)theEObject;
				T result = caseSystemUnitClassLib(systemUnitClassLib);
				if (result == null) result = caseCAEXObject(systemUnitClassLib);
				if (result == null) result = caseCAEXBasicObject(systemUnitClassLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.SYSTEM_UNIT_CLASS: {
				SystemUnitClass systemUnitClass = (SystemUnitClass)theEObject;
				T result = caseSystemUnitClass(systemUnitClass);
				if (result == null) result = caseCAEXObject(systemUnitClass);
				if (result == null) result = caseCAEXBasicObject(systemUnitClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.SYSTEM_UNIT_FAMILY: {
				SystemUnitFamily systemUnitFamily = (SystemUnitFamily)theEObject;
				T result = caseSystemUnitFamily(systemUnitFamily);
				if (result == null) result = caseSystemUnitClass(systemUnitFamily);
				if (result == null) result = caseCAEXObject(systemUnitFamily);
				if (result == null) result = caseCAEXBasicObject(systemUnitFamily);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.UNKNOWN_TYPE: {
				UnknownType unknownType = (UnknownType)theEObject;
				T result = caseUnknownType(unknownType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CAEXPackage.ADDITIONAL_INFORMATION: {
				AdditionalInformation additionalInformation = (AdditionalInformation)theEObject;
				T result = caseAdditionalInformation(additionalInformation);
				if (result == null) result = caseGenericElement(additionalInformation);
				if (result == null) result = caseElement(additionalInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Name Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Name Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeNameMapping(AttributeNameMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueRequirement(AttributeValueRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXBasicObject(CAEXBasicObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXFile(CAEXFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAEXObject(CAEXObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyright(Copyright object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalInterface(ExternalInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReference(ExternalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceHierarchy(InstanceHierarchy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Class Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClassLib(InterfaceClassLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClass(InterfaceClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceFamily(InterfaceFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Name Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Name Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceNameMapping(InterfaceNameMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalElement(InternalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalLink(InternalLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nominal Scaled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nominal Scaled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNominalScaled(NominalScaled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordinal Scaled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordinal Scaled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrdinalScaled(OrdinalScaled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Semantic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Semantic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefSemantic(RefSemantic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevision(Revision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Class Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleClassLib(RoleClassLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleClass(RoleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleFamily(RoleFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRequirements(RoleRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supported Role Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supported Role Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportedRoleClass(SupportedRoleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Class Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Class Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitClassLib(SystemUnitClassLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitClass(SystemUnitClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Unit Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Unit Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemUnitFamily(SystemUnitFamily object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownType(UnknownType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalInformation(AdditionalInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericElement(GenericElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CAEXSwitch
