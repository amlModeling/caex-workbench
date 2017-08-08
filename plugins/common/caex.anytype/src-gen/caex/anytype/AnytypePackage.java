/**
 */
package caex.anytype;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see caex.anytype.AnytypeFactory
 * @model kind="package"
 * @generated
 */
public interface AnytypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "anytype";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://caex/anytype";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "anytype";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnytypePackage eINSTANCE = caex.anytype.impl.AnytypePackageImpl.init();

	/**
	 * The meta object id for the '{@link caex.anytype.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.anytype.impl.ElementImpl
	 * @see caex.anytype.impl.AnytypePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link caex.anytype.impl.GenericElementImpl <em>Generic Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.anytype.impl.GenericElementImpl
	 * @see caex.anytype.impl.AnytypePackageImpl#getGenericElement()
	 * @generated
	 */
	int GENERIC_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__VALUE = ELEMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Nested Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__NESTED_ELEMENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__ATTRIBUTES = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element Feature Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__ELEMENT_FEATURE_MAP = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attribute Feature Map</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Generic Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link caex.anytype.impl.GenericAttributeImpl <em>Generic Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see caex.anytype.impl.GenericAttributeImpl
	 * @see caex.anytype.impl.AnytypePackageImpl#getGenericAttribute()
	 * @generated
	 */
	int GENERIC_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ATTRIBUTE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ATTRIBUTE__VALUE = ELEMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Generic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ATTRIBUTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_ATTRIBUTE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link caex.anytype.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see caex.anytype.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link caex.anytype.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see caex.anytype.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link caex.anytype.Element#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see caex.anytype.Element#getValue()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Value();

	/**
	 * Returns the meta object for class '{@link caex.anytype.GenericElement <em>Generic Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Element</em>'.
	 * @see caex.anytype.GenericElement
	 * @generated
	 */
	EClass getGenericElement();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.anytype.GenericElement#getNestedElements <em>Nested Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Elements</em>'.
	 * @see caex.anytype.GenericElement#getNestedElements()
	 * @see #getGenericElement()
	 * @generated
	 */
	EReference getGenericElement_NestedElements();

	/**
	 * Returns the meta object for the containment reference list '{@link caex.anytype.GenericElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see caex.anytype.GenericElement#getAttributes()
	 * @see #getGenericElement()
	 * @generated
	 */
	EReference getGenericElement_Attributes();

	/**
	 * Returns the meta object for the attribute list '{@link caex.anytype.GenericElement#getElementFeatureMap <em>Element Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Element Feature Map</em>'.
	 * @see caex.anytype.GenericElement#getElementFeatureMap()
	 * @see #getGenericElement()
	 * @generated
	 */
	EAttribute getGenericElement_ElementFeatureMap();

	/**
	 * Returns the meta object for the attribute list '{@link caex.anytype.GenericElement#getAttributeFeatureMap <em>Attribute Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attribute Feature Map</em>'.
	 * @see caex.anytype.GenericElement#getAttributeFeatureMap()
	 * @see #getGenericElement()
	 * @generated
	 */
	EAttribute getGenericElement_AttributeFeatureMap();

	/**
	 * Returns the meta object for class '{@link caex.anytype.GenericAttribute <em>Generic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Attribute</em>'.
	 * @see caex.anytype.GenericAttribute
	 * @generated
	 */
	EClass getGenericAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnytypeFactory getAnytypeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link caex.anytype.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.anytype.impl.ElementImpl
		 * @see caex.anytype.impl.AnytypePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__VALUE = eINSTANCE.getElement_Value();

		/**
		 * The meta object literal for the '{@link caex.anytype.impl.GenericElementImpl <em>Generic Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.anytype.impl.GenericElementImpl
		 * @see caex.anytype.impl.AnytypePackageImpl#getGenericElement()
		 * @generated
		 */
		EClass GENERIC_ELEMENT = eINSTANCE.getGenericElement();

		/**
		 * The meta object literal for the '<em><b>Nested Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_ELEMENT__NESTED_ELEMENTS = eINSTANCE.getGenericElement_NestedElements();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_ELEMENT__ATTRIBUTES = eINSTANCE.getGenericElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Element Feature Map</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_ELEMENT__ELEMENT_FEATURE_MAP = eINSTANCE.getGenericElement_ElementFeatureMap();

		/**
		 * The meta object literal for the '<em><b>Attribute Feature Map</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_ELEMENT__ATTRIBUTE_FEATURE_MAP = eINSTANCE.getGenericElement_AttributeFeatureMap();

		/**
		 * The meta object literal for the '{@link caex.anytype.impl.GenericAttributeImpl <em>Generic Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see caex.anytype.impl.GenericAttributeImpl
		 * @see caex.anytype.impl.AnytypePackageImpl#getGenericAttribute()
		 * @generated
		 */
		EClass GENERIC_ATTRIBUTE = eINSTANCE.getGenericAttribute();

	}

} //AnytypePackage
