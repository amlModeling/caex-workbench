/**
 */
package caex.anytype.impl;

import caex.anytype.AnytypeFactory;
import caex.anytype.AnytypePackage;
import caex.anytype.Element;
import caex.anytype.GenericAttribute;
import caex.anytype.GenericElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnytypePackageImpl extends EPackageImpl implements AnytypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericAttributeEClass = null;

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
	 * @see caex.anytype.AnytypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnytypePackageImpl() {
		super(eNS_URI, AnytypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AnytypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnytypePackage init() {
		if (isInited)
			return (AnytypePackage) EPackage.Registry.INSTANCE.getEPackage(AnytypePackage.eNS_URI);

		// Obtain or create and register package
		AnytypePackageImpl theAnytypePackage = (AnytypePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof AnytypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new AnytypePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAnytypePackage.createPackageContents();

		// Initialize created meta-data
		theAnytypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnytypePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnytypePackage.eNS_URI, theAnytypePackage);
		return theAnytypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Name() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Value() {
		return (EAttribute) elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericElement() {
		return genericElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericElement_NestedElements() {
		return (EReference) genericElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericElement_Attributes() {
		return (EReference) genericElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericElement_ElementFeatureMap() {
		return (EAttribute) genericElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericElement_AttributeFeatureMap() {
		return (EAttribute) genericElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericAttribute() {
		return genericAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnytypeFactory getAnytypeFactory() {
		return (AnytypeFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__VALUE);

		genericElementEClass = createEClass(GENERIC_ELEMENT);
		createEReference(genericElementEClass, GENERIC_ELEMENT__NESTED_ELEMENTS);
		createEReference(genericElementEClass, GENERIC_ELEMENT__ATTRIBUTES);
		createEAttribute(genericElementEClass, GENERIC_ELEMENT__ELEMENT_FEATURE_MAP);
		createEAttribute(genericElementEClass, GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP);

		genericAttributeEClass = createEClass(GENERIC_ATTRIBUTE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		genericElementEClass.getESuperTypes().add(this.getElement());
		genericAttributeEClass.getESuperTypes().add(this.getElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, Element.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericElementEClass, GenericElement.class, "GenericElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericElement_NestedElements(), this.getGenericElement(), null, "nestedElements", null, 0,
				-1, GenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericElement_Attributes(), this.getGenericAttribute(), null, "attributes", null, 0, -1,
				GenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericElement_ElementFeatureMap(), ecorePackage.getEFeatureMapEntry(), "elementFeatureMap",
				null, 0, -1, GenericElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericElement_AttributeFeatureMap(), ecorePackage.getEFeatureMapEntry(),
				"attributeFeatureMap", null, 0, -1, GenericElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericAttributeEClass, GenericAttribute.class, "GenericAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(getElement_Name(), source, new String[] { "kind", "attribute" });
		addAnnotation(getElement_Value(), source, new String[] { "kind", "elementOnly" });
		addAnnotation(genericElementEClass, source, new String[] { "kind", "empty" });
		addAnnotation(getGenericElement_NestedElements(), source, new String[] { "kind", "empty" });
		addAnnotation(getGenericElement_Attributes(), source, new String[] { "kind", "empty" });
		addAnnotation(getGenericElement_ElementFeatureMap(), source,
				new String[] { "kind", "elementWildcard", "name", ":0", "wildcards", "##any", "processing", "lax" });
		addAnnotation(getGenericElement_AttributeFeatureMap(), source,
				new String[] { "kind", "attributeWildcard", "name", ":1", "wildcards", "##any", "processing", "lax" });
		addAnnotation(genericAttributeEClass, source, new String[] { "kind", "empty" });
	}

} //AnytypePackageImpl
