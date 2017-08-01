/**
 */
package caex.caex215.caex.util;

import caex.anytype.Element;
import caex.anytype.GenericElement;

import caex.caex215.caex.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see caex.caex215.caex.CAEXPackage
 * @generated
 */
public class CAEXAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CAEXPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAEXAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CAEXPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAEXSwitch<Adapter> modelSwitch =
		new CAEXSwitch<Adapter>() {
			@Override
			public Adapter caseAttributeNameMapping(AttributeNameMapping object) {
				return createAttributeNameMappingAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAttributeValueRequirement(AttributeValueRequirement object) {
				return createAttributeValueRequirementAdapter();
			}
			@Override
			public Adapter caseCAEXBasicObject(CAEXBasicObject object) {
				return createCAEXBasicObjectAdapter();
			}
			@Override
			public Adapter caseCAEXFile(CAEXFile object) {
				return createCAEXFileAdapter();
			}
			@Override
			public Adapter caseCAEXObject(CAEXObject object) {
				return createCAEXObjectAdapter();
			}
			@Override
			public Adapter caseCopyright(Copyright object) {
				return createCopyrightAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExternalInterface(ExternalInterface object) {
				return createExternalInterfaceAdapter();
			}
			@Override
			public Adapter caseExternalReference(ExternalReference object) {
				return createExternalReferenceAdapter();
			}
			@Override
			public Adapter caseInstanceHierarchy(InstanceHierarchy object) {
				return createInstanceHierarchyAdapter();
			}
			@Override
			public Adapter caseInterfaceClassLib(InterfaceClassLib object) {
				return createInterfaceClassLibAdapter();
			}
			@Override
			public Adapter caseInterfaceClass(InterfaceClass object) {
				return createInterfaceClassAdapter();
			}
			@Override
			public Adapter caseInterfaceFamily(InterfaceFamily object) {
				return createInterfaceFamilyAdapter();
			}
			@Override
			public Adapter caseInterfaceNameMapping(InterfaceNameMapping object) {
				return createInterfaceNameMappingAdapter();
			}
			@Override
			public Adapter caseInternalElement(InternalElement object) {
				return createInternalElementAdapter();
			}
			@Override
			public Adapter caseInternalLink(InternalLink object) {
				return createInternalLinkAdapter();
			}
			@Override
			public Adapter caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			@Override
			public Adapter caseNominalScaled(NominalScaled object) {
				return createNominalScaledAdapter();
			}
			@Override
			public Adapter caseOrdinalScaled(OrdinalScaled object) {
				return createOrdinalScaledAdapter();
			}
			@Override
			public Adapter caseRefSemantic(RefSemantic object) {
				return createRefSemanticAdapter();
			}
			@Override
			public Adapter caseRevision(Revision object) {
				return createRevisionAdapter();
			}
			@Override
			public Adapter caseRoleClassLib(RoleClassLib object) {
				return createRoleClassLibAdapter();
			}
			@Override
			public Adapter caseRoleClass(RoleClass object) {
				return createRoleClassAdapter();
			}
			@Override
			public Adapter caseRoleFamily(RoleFamily object) {
				return createRoleFamilyAdapter();
			}
			@Override
			public Adapter caseRoleRequirements(RoleRequirements object) {
				return createRoleRequirementsAdapter();
			}
			@Override
			public Adapter caseSupportedRoleClass(SupportedRoleClass object) {
				return createSupportedRoleClassAdapter();
			}
			@Override
			public Adapter caseSystemUnitClassLib(SystemUnitClassLib object) {
				return createSystemUnitClassLibAdapter();
			}
			@Override
			public Adapter caseSystemUnitClass(SystemUnitClass object) {
				return createSystemUnitClassAdapter();
			}
			@Override
			public Adapter caseSystemUnitFamily(SystemUnitFamily object) {
				return createSystemUnitFamilyAdapter();
			}
			@Override
			public Adapter caseUnknownType(UnknownType object) {
				return createUnknownTypeAdapter();
			}
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseAdditionalInformation(AdditionalInformation object) {
				return createAdditionalInformationAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseGenericElement(GenericElement object) {
				return createGenericElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.AttributeNameMapping <em>Attribute Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.AttributeNameMapping
	 * @generated
	 */
	public Adapter createAttributeNameMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.AttributeValueRequirement <em>Attribute Value Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.AttributeValueRequirement
	 * @generated
	 */
	public Adapter createAttributeValueRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.CAEXBasicObject <em>Basic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.CAEXBasicObject
	 * @generated
	 */
	public Adapter createCAEXBasicObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.CAEXFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.CAEXFile
	 * @generated
	 */
	public Adapter createCAEXFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.CAEXObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.CAEXObject
	 * @generated
	 */
	public Adapter createCAEXObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.Copyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.Copyright
	 * @generated
	 */
	public Adapter createCopyrightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.ExternalInterface <em>External Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.ExternalInterface
	 * @generated
	 */
	public Adapter createExternalInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.ExternalReference
	 * @generated
	 */
	public Adapter createExternalReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.InstanceHierarchy <em>Instance Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.InstanceHierarchy
	 * @generated
	 */
	public Adapter createInstanceHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.InterfaceClassLib <em>Interface Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.InterfaceClassLib
	 * @generated
	 */
	public Adapter createInterfaceClassLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.InterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.InterfaceClass
	 * @generated
	 */
	public Adapter createInterfaceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.InterfaceFamily <em>Interface Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.InterfaceFamily
	 * @generated
	 */
	public Adapter createInterfaceFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.InterfaceNameMapping <em>Interface Name Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.InterfaceNameMapping
	 * @generated
	 */
	public Adapter createInterfaceNameMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.InternalElement <em>Internal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.InternalElement
	 * @generated
	 */
	public Adapter createInternalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.InternalLink <em>Internal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.InternalLink
	 * @generated
	 */
	public Adapter createInternalLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.NominalScaled <em>Nominal Scaled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.NominalScaled
	 * @generated
	 */
	public Adapter createNominalScaledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.OrdinalScaled <em>Ordinal Scaled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.OrdinalScaled
	 * @generated
	 */
	public Adapter createOrdinalScaledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.RefSemantic <em>Ref Semantic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.RefSemantic
	 * @generated
	 */
	public Adapter createRefSemanticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.Revision
	 * @generated
	 */
	public Adapter createRevisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.RoleClassLib <em>Role Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.RoleClassLib
	 * @generated
	 */
	public Adapter createRoleClassLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.RoleClass <em>Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.RoleClass
	 * @generated
	 */
	public Adapter createRoleClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.RoleFamily <em>Role Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.RoleFamily
	 * @generated
	 */
	public Adapter createRoleFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.RoleRequirements <em>Role Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.RoleRequirements
	 * @generated
	 */
	public Adapter createRoleRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.SupportedRoleClass <em>Supported Role Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.SupportedRoleClass
	 * @generated
	 */
	public Adapter createSupportedRoleClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.SystemUnitClassLib <em>System Unit Class Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.SystemUnitClassLib
	 * @generated
	 */
	public Adapter createSystemUnitClassLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.SystemUnitClass <em>System Unit Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.SystemUnitClass
	 * @generated
	 */
	public Adapter createSystemUnitClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.SystemUnitFamily <em>System Unit Family</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.SystemUnitFamily
	 * @generated
	 */
	public Adapter createSystemUnitFamilyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.UnknownType <em>Unknown Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.UnknownType
	 * @generated
	 */
	public Adapter createUnknownTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.caex215.caex.AdditionalInformation <em>Additional Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.caex215.caex.AdditionalInformation
	 * @generated
	 */
	public Adapter createAdditionalInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.anytype.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.anytype.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link caex.anytype.GenericElement <em>Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see caex.anytype.GenericElement
	 * @generated
	 */
	public Adapter createGenericElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CAEXAdapterFactory
