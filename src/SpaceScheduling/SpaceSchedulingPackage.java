/**
 */
package SpaceScheduling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see SpaceScheduling.SpaceSchedulingFactory
 * @model kind="package"
 * @generated
 */
public interface SpaceSchedulingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SpaceScheduling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://co/edu/unal/mdd/SpaceScheduling";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co.edu.unal.mdd.SpaceScheduling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpaceSchedulingPackage eINSTANCE = SpaceScheduling.impl.SpaceSchedulingPackageImpl.init();

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.ClassImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.RelationsImpl <em>Relations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.RelationsImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getRelations()
	 * @generated
	 */
	int RELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.ClassMetamodelImpl <em>Class Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.ClassMetamodelImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getClassMetamodel()
	 * @generated
	 */
	int CLASS_METAMODEL = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METAMODEL__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METAMODEL__RELATIONS = 1;

	/**
	 * The number of structural features of the '<em>Class Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METAMODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METAMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.CompositionImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOURCE = RELATIONS__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET = RELATIONS__TARGET;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = RELATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.SimpleImpl <em>Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.SimpleImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getSimple()
	 * @generated
	 */
	int SIMPLE = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__SOURCE = RELATIONS__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE__TARGET = RELATIONS__TARGET;

	/**
	 * The number of structural features of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_COUNT = RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_OPERATION_COUNT = RELATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.AgregationImpl <em>Agregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.AgregationImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getAgregation()
	 * @generated
	 */
	int AGREGATION = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION__SOURCE = RELATIONS__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION__TARGET = RELATIONS__TARGET;

	/**
	 * The number of structural features of the '<em>Agregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_FEATURE_COUNT = RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGATION_OPERATION_COUNT = RELATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.HeritageImpl <em>Heritage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.HeritageImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getHeritage()
	 * @generated
	 */
	int HERITAGE = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERITAGE__SOURCE = RELATIONS__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERITAGE__TARGET = RELATIONS__TARGET;

	/**
	 * The number of structural features of the '<em>Heritage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERITAGE_FEATURE_COUNT = RELATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Heritage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERITAGE_OPERATION_COUNT = RELATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.AttributeImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Primitive type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__PRIMITIVE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Enumeration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ENUMERATION = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.MethodImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 8;

	/**
	 * The feature id for the '<em><b>Return type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__RETURN_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = 2;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>New Operation1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD___NEW_OPERATION1 = 0;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.Return_typeImpl <em>Return type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.Return_typeImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getReturn_type()
	 * @generated
	 */
	int RETURN_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Primitive type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__PRIMITIVE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Void</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__VOID = 2;

	/**
	 * The feature id for the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__INT = 3;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE__STRING = 4;

	/**
	 * The number of structural features of the '<em>Return type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Return type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.Primitive_typeImpl <em>Primitive type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.Primitive_typeImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getPrimitive_type()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__INT = 0;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__STRING = 1;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__DATETIME = 2;

	/**
	 * The number of structural features of the '<em>Primitive type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Primitive type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.Space_SchedulingImpl <em>Space Scheduling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.Space_SchedulingImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getSpace_Scheduling()
	 * @generated
	 */
	int SPACE_SCHEDULING = 11;

	/**
	 * The feature id for the '<em><b>Classmetamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SCHEDULING__CLASSMETAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Salilsjs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SCHEDULING__SALILSJS = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SCHEDULING__CONFIGURATION = 2;

	/**
	 * The number of structural features of the '<em>Space Scheduling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SCHEDULING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Space Scheduling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_SCHEDULING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.SalilsJsImpl <em>Salils Js</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.SalilsJsImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getSalilsJs()
	 * @generated
	 */
	int SALILS_JS = 12;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALILS_JS__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALILS_JS__CONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALILS_JS__VIEW = 2;

	/**
	 * The number of structural features of the '<em>Salils Js</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALILS_JS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Salils Js</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALILS_JS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.ModelImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.ViewImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.ControllerImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 15;

	/**
	 * The feature id for the '<em><b>Helpers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__HELPERS = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__USE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.AttributesImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.DTOImpl <em>DTO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.DTOImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getDTO()
	 * @generated
	 */
	int DTO = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__ATTRIBUTES = MODEL__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DTO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.ORMImpl <em>ORM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.ORMImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getORM()
	 * @generated
	 */
	int ORM = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM__ATTRIBUTES = MODEL__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>ORM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ORM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.HelpersImpl <em>Helpers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.HelpersImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getHelpers()
	 * @generated
	 */
	int HELPERS = 19;

	/**
	 * The number of structural features of the '<em>Helpers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPERS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Helpers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.ActionsImpl <em>Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.ActionsImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getActions()
	 * @generated
	 */
	int ACTIONS = 20;

	/**
	 * The feature id for the '<em><b>Friendly Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__FRIENDLY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__OUTPUTS = 3;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__FUNCTION = 4;

	/**
	 * The feature id for the '<em><b>Redirect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__REDIRECT = 5;

	/**
	 * The number of structural features of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.PagesImpl <em>Pages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.PagesImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getPages()
	 * @generated
	 */
	int PAGES = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES__NAME = VIEW__NAME;

	/**
	 * The number of structural features of the '<em>Pages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGES_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.LayoutImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NAME = VIEW__NAME;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PAGES = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.ConfigurationImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.RoutesImpl <em>Routes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.RoutesImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getRoutes()
	 * @generated
	 */
	int ROUTES = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES__NAME = CONFIGURATION__NAME;

	/**
	 * The number of structural features of the '<em>Routes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Routes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTES_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.ModelConfigImpl <em>Model Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.ModelConfigImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getModelConfig()
	 * @generated
	 */
	int MODEL_CONFIG = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONFIG__NAME = CONFIGURATION__NAME;

	/**
	 * The number of structural features of the '<em>Model Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONFIG_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_CONFIG_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.DataBaseConfigImpl <em>Data Base Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.DataBaseConfigImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getDataBaseConfig()
	 * @generated
	 */
	int DATA_BASE_CONFIG = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_CONFIG__NAME = CONFIGURATION__NAME;

	/**
	 * The number of structural features of the '<em>Data Base Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_CONFIG_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Base Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BASE_CONFIG_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.impl.EmailConfigImpl <em>Email Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.impl.EmailConfigImpl
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getEmailConfig()
	 * @generated
	 */
	int EMAIL_CONFIG = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CONFIG__NAME = CONFIGURATION__NAME;

	/**
	 * The number of structural features of the '<em>Email Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CONFIG_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Email Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_CONFIG_OPERATION_COUNT = CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SpaceScheduling.EType <em>EType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.EType
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getEType()
	 * @generated
	 */
	int ETYPE = 28;


	/**
	 * The meta object id for the '{@link SpaceScheduling.Enumeration <em>Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SpaceScheduling.Enumeration
	 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 29;


	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see SpaceScheduling.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.Class#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see SpaceScheduling.Class#getMethod()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.Class#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see SpaceScheduling.Class#getAttribute()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SpaceScheduling.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Relations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relations</em>'.
	 * @see SpaceScheduling.Relations
	 * @generated
	 */
	EClass getRelations();

	/**
	 * Returns the meta object for the reference list '{@link SpaceScheduling.Relations#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see SpaceScheduling.Relations#getSource()
	 * @see #getRelations()
	 * @generated
	 */
	EReference getRelations_Source();

	/**
	 * Returns the meta object for the reference list '{@link SpaceScheduling.Relations#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see SpaceScheduling.Relations#getTarget()
	 * @see #getRelations()
	 * @generated
	 */
	EReference getRelations_Target();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.ClassMetamodel <em>Class Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Metamodel</em>'.
	 * @see SpaceScheduling.ClassMetamodel
	 * @generated
	 */
	EClass getClassMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.ClassMetamodel#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see SpaceScheduling.ClassMetamodel#getClass_()
	 * @see #getClassMetamodel()
	 * @generated
	 */
	EReference getClassMetamodel_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.ClassMetamodel#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see SpaceScheduling.ClassMetamodel#getRelations()
	 * @see #getClassMetamodel()
	 * @generated
	 */
	EReference getClassMetamodel_Relations();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see SpaceScheduling.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple</em>'.
	 * @see SpaceScheduling.Simple
	 * @generated
	 */
	EClass getSimple();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Agregation <em>Agregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agregation</em>'.
	 * @see SpaceScheduling.Agregation
	 * @generated
	 */
	EClass getAgregation();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Heritage <em>Heritage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heritage</em>'.
	 * @see SpaceScheduling.Heritage
	 * @generated
	 */
	EClass getHeritage();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see SpaceScheduling.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link SpaceScheduling.Attribute#getPrimitive_type <em>Primitive type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive type</em>'.
	 * @see SpaceScheduling.Attribute#getPrimitive_type()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Primitive_type();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SpaceScheduling.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute list '{@link SpaceScheduling.Attribute#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enumeration</em>'.
	 * @see SpaceScheduling.Attribute#getEnumeration()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Enumeration();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see SpaceScheduling.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the reference '{@link SpaceScheduling.Method#getReturn_type <em>Return type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return type</em>'.
	 * @see SpaceScheduling.Method#getReturn_type()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Return_type();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SpaceScheduling.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Method#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see SpaceScheduling.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Visibility();

	/**
	 * Returns the meta object for the '{@link SpaceScheduling.Method#newOperation1() <em>New Operation1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New Operation1</em>' operation.
	 * @see SpaceScheduling.Method#newOperation1()
	 * @generated
	 */
	EOperation getMethod__NewOperation1();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Return_type <em>Return type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return type</em>'.
	 * @see SpaceScheduling.Return_type
	 * @generated
	 */
	EClass getReturn_type();

	/**
	 * Returns the meta object for the reference '{@link SpaceScheduling.Return_type#getPrimitive_type <em>Primitive type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive type</em>'.
	 * @see SpaceScheduling.Return_type#getPrimitive_type()
	 * @see #getReturn_type()
	 * @generated
	 */
	EReference getReturn_type_Primitive_type();

	/**
	 * Returns the meta object for the reference list '{@link SpaceScheduling.Return_type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Class</em>'.
	 * @see SpaceScheduling.Return_type#getClass_()
	 * @see #getReturn_type()
	 * @generated
	 */
	EReference getReturn_type_Class();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Return_type#getVoid <em>Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Void</em>'.
	 * @see SpaceScheduling.Return_type#getVoid()
	 * @see #getReturn_type()
	 * @generated
	 */
	EAttribute getReturn_type_Void();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Return_type#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int</em>'.
	 * @see SpaceScheduling.Return_type#getInt()
	 * @see #getReturn_type()
	 * @generated
	 */
	EAttribute getReturn_type_Int();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Return_type#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see SpaceScheduling.Return_type#getString()
	 * @see #getReturn_type()
	 * @generated
	 */
	EAttribute getReturn_type_String();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Primitive_type <em>Primitive type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive type</em>'.
	 * @see SpaceScheduling.Primitive_type
	 * @generated
	 */
	EClass getPrimitive_type();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Primitive_type#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int</em>'.
	 * @see SpaceScheduling.Primitive_type#getInt()
	 * @see #getPrimitive_type()
	 * @generated
	 */
	EAttribute getPrimitive_type_Int();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Primitive_type#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see SpaceScheduling.Primitive_type#getString()
	 * @see #getPrimitive_type()
	 * @generated
	 */
	EAttribute getPrimitive_type_String();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Primitive_type#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime</em>'.
	 * @see SpaceScheduling.Primitive_type#getDatetime()
	 * @see #getPrimitive_type()
	 * @generated
	 */
	EAttribute getPrimitive_type_Datetime();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Space_Scheduling <em>Space Scheduling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space Scheduling</em>'.
	 * @see SpaceScheduling.Space_Scheduling
	 * @generated
	 */
	EClass getSpace_Scheduling();

	/**
	 * Returns the meta object for the containment reference '{@link SpaceScheduling.Space_Scheduling#getClassmetamodel <em>Classmetamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classmetamodel</em>'.
	 * @see SpaceScheduling.Space_Scheduling#getClassmetamodel()
	 * @see #getSpace_Scheduling()
	 * @generated
	 */
	EReference getSpace_Scheduling_Classmetamodel();

	/**
	 * Returns the meta object for the containment reference '{@link SpaceScheduling.Space_Scheduling#getSalilsjs <em>Salilsjs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Salilsjs</em>'.
	 * @see SpaceScheduling.Space_Scheduling#getSalilsjs()
	 * @see #getSpace_Scheduling()
	 * @generated
	 */
	EReference getSpace_Scheduling_Salilsjs();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.Space_Scheduling#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configuration</em>'.
	 * @see SpaceScheduling.Space_Scheduling#getConfiguration()
	 * @see #getSpace_Scheduling()
	 * @generated
	 */
	EReference getSpace_Scheduling_Configuration();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.SalilsJs <em>Salils Js</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salils Js</em>'.
	 * @see SpaceScheduling.SalilsJs
	 * @generated
	 */
	EClass getSalilsJs();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.SalilsJs#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see SpaceScheduling.SalilsJs#getModel()
	 * @see #getSalilsJs()
	 * @generated
	 */
	EReference getSalilsJs_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.SalilsJs#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller</em>'.
	 * @see SpaceScheduling.SalilsJs#getController()
	 * @see #getSalilsJs()
	 * @generated
	 */
	EReference getSalilsJs_Controller();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.SalilsJs#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see SpaceScheduling.SalilsJs#getView()
	 * @see #getSalilsJs()
	 * @generated
	 */
	EReference getSalilsJs_View();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see SpaceScheduling.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SpaceScheduling.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.Model#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see SpaceScheduling.Model#getAttributes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Attributes();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see SpaceScheduling.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SpaceScheduling.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see SpaceScheduling.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.Controller#getHelpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helpers</em>'.
	 * @see SpaceScheduling.Controller#getHelpers()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Helpers();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.Controller#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see SpaceScheduling.Controller#getActions()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Actions();

	/**
	 * Returns the meta object for the reference list '{@link SpaceScheduling.Controller#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see SpaceScheduling.Controller#getUse()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Use();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Controller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SpaceScheduling.Controller#getName()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Name();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see SpaceScheduling.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Attributes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SpaceScheduling.Attributes#getName()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Name();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Attributes#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see SpaceScheduling.Attributes#getType()
	 * @see #getAttributes()
	 * @generated
	 */
	EAttribute getAttributes_Type();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO</em>'.
	 * @see SpaceScheduling.DTO
	 * @generated
	 */
	EClass getDTO();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.ORM <em>ORM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ORM</em>'.
	 * @see SpaceScheduling.ORM
	 * @generated
	 */
	EClass getORM();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Helpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helpers</em>'.
	 * @see SpaceScheduling.Helpers
	 * @generated
	 */
	EClass getHelpers();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actions</em>'.
	 * @see SpaceScheduling.Actions
	 * @generated
	 */
	EClass getActions();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Actions#getFriendlyName <em>Friendly Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friendly Name</em>'.
	 * @see SpaceScheduling.Actions#getFriendlyName()
	 * @see #getActions()
	 * @generated
	 */
	EAttribute getActions_FriendlyName();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Actions#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SpaceScheduling.Actions#getDescription()
	 * @see #getActions()
	 * @generated
	 */
	EAttribute getActions_Description();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Actions#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inputs</em>'.
	 * @see SpaceScheduling.Actions#getInputs()
	 * @see #getActions()
	 * @generated
	 */
	EAttribute getActions_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Actions#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outputs</em>'.
	 * @see SpaceScheduling.Actions#getOutputs()
	 * @see #getActions()
	 * @generated
	 */
	EAttribute getActions_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Actions#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see SpaceScheduling.Actions#getFunction()
	 * @see #getActions()
	 * @generated
	 */
	EAttribute getActions_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.Actions#getRedirect <em>Redirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Redirect</em>'.
	 * @see SpaceScheduling.Actions#getRedirect()
	 * @see #getActions()
	 * @generated
	 */
	EReference getActions_Redirect();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Pages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pages</em>'.
	 * @see SpaceScheduling.Pages
	 * @generated
	 */
	EClass getPages();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see SpaceScheduling.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link SpaceScheduling.Layout#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see SpaceScheduling.Layout#getPages()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Pages();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see SpaceScheduling.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link SpaceScheduling.Configuration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SpaceScheduling.Configuration#getName()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Name();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.Routes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routes</em>'.
	 * @see SpaceScheduling.Routes
	 * @generated
	 */
	EClass getRoutes();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.ModelConfig <em>Model Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Config</em>'.
	 * @see SpaceScheduling.ModelConfig
	 * @generated
	 */
	EClass getModelConfig();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.DataBaseConfig <em>Data Base Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Base Config</em>'.
	 * @see SpaceScheduling.DataBaseConfig
	 * @generated
	 */
	EClass getDataBaseConfig();

	/**
	 * Returns the meta object for class '{@link SpaceScheduling.EmailConfig <em>Email Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Config</em>'.
	 * @see SpaceScheduling.EmailConfig
	 * @generated
	 */
	EClass getEmailConfig();

	/**
	 * Returns the meta object for enum '{@link SpaceScheduling.EType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EType</em>'.
	 * @see SpaceScheduling.EType
	 * @generated
	 */
	EEnum getEType();

	/**
	 * Returns the meta object for enum '{@link SpaceScheduling.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enumeration</em>'.
	 * @see SpaceScheduling.Enumeration
	 * @generated
	 */
	EEnum getEnumeration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpaceSchedulingFactory getSpaceSchedulingFactory();

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
		 * The meta object literal for the '{@link SpaceScheduling.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.ClassImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__METHOD = eINSTANCE.getClass_Method();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTE = eINSTANCE.getClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.RelationsImpl <em>Relations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.RelationsImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getRelations()
		 * @generated
		 */
		EClass RELATIONS = eINSTANCE.getRelations();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS__SOURCE = eINSTANCE.getRelations_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS__TARGET = eINSTANCE.getRelations_Target();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.ClassMetamodelImpl <em>Class Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.ClassMetamodelImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getClassMetamodel()
		 * @generated
		 */
		EClass CLASS_METAMODEL = eINSTANCE.getClassMetamodel();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_METAMODEL__CLASS = eINSTANCE.getClassMetamodel_Class();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_METAMODEL__RELATIONS = eINSTANCE.getClassMetamodel_Relations();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.CompositionImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.SimpleImpl <em>Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.SimpleImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getSimple()
		 * @generated
		 */
		EClass SIMPLE = eINSTANCE.getSimple();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.AgregationImpl <em>Agregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.AgregationImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getAgregation()
		 * @generated
		 */
		EClass AGREGATION = eINSTANCE.getAgregation();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.HeritageImpl <em>Heritage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.HeritageImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getHeritage()
		 * @generated
		 */
		EClass HERITAGE = eINSTANCE.getHeritage();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.AttributeImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Primitive type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__PRIMITIVE_TYPE = eINSTANCE.getAttribute_Primitive_type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Enumeration</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ENUMERATION = eINSTANCE.getAttribute_Enumeration();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.MethodImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Return type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__RETURN_TYPE = eINSTANCE.getMethod_Return_type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '<em><b>New Operation1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation METHOD___NEW_OPERATION1 = eINSTANCE.getMethod__NewOperation1();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.Return_typeImpl <em>Return type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.Return_typeImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getReturn_type()
		 * @generated
		 */
		EClass RETURN_TYPE = eINSTANCE.getReturn_type();

		/**
		 * The meta object literal for the '<em><b>Primitive type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_TYPE__PRIMITIVE_TYPE = eINSTANCE.getReturn_type_Primitive_type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_TYPE__CLASS = eINSTANCE.getReturn_type_Class();

		/**
		 * The meta object literal for the '<em><b>Void</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__VOID = eINSTANCE.getReturn_type_Void();

		/**
		 * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__INT = eINSTANCE.getReturn_type_Int();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_TYPE__STRING = eINSTANCE.getReturn_type_String();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.Primitive_typeImpl <em>Primitive type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.Primitive_typeImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getPrimitive_type()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitive_type();

		/**
		 * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__INT = eINSTANCE.getPrimitive_type_Int();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__STRING = eINSTANCE.getPrimitive_type_String();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__DATETIME = eINSTANCE.getPrimitive_type_Datetime();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.Space_SchedulingImpl <em>Space Scheduling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.Space_SchedulingImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getSpace_Scheduling()
		 * @generated
		 */
		EClass SPACE_SCHEDULING = eINSTANCE.getSpace_Scheduling();

		/**
		 * The meta object literal for the '<em><b>Classmetamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_SCHEDULING__CLASSMETAMODEL = eINSTANCE.getSpace_Scheduling_Classmetamodel();

		/**
		 * The meta object literal for the '<em><b>Salilsjs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_SCHEDULING__SALILSJS = eINSTANCE.getSpace_Scheduling_Salilsjs();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE_SCHEDULING__CONFIGURATION = eINSTANCE.getSpace_Scheduling_Configuration();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.SalilsJsImpl <em>Salils Js</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.SalilsJsImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getSalilsJs()
		 * @generated
		 */
		EClass SALILS_JS = eINSTANCE.getSalilsJs();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALILS_JS__MODEL = eINSTANCE.getSalilsJs_Model();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALILS_JS__CONTROLLER = eINSTANCE.getSalilsJs_Controller();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALILS_JS__VIEW = eINSTANCE.getSalilsJs_View();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.ModelImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ATTRIBUTES = eINSTANCE.getModel_Attributes();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.ViewImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW__NAME = eINSTANCE.getView_Name();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.ControllerImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Helpers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__HELPERS = eINSTANCE.getController_Helpers();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__ACTIONS = eINSTANCE.getController_Actions();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__USE = eINSTANCE.getController_Use();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__NAME = eINSTANCE.getController_Name();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.AttributesImpl <em>Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.AttributesImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getAttributes()
		 * @generated
		 */
		EClass ATTRIBUTES = eINSTANCE.getAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__NAME = eINSTANCE.getAttributes_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__TYPE = eINSTANCE.getAttributes_Type();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.DTOImpl <em>DTO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.DTOImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getDTO()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDTO();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.ORMImpl <em>ORM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.ORMImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getORM()
		 * @generated
		 */
		EClass ORM = eINSTANCE.getORM();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.HelpersImpl <em>Helpers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.HelpersImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getHelpers()
		 * @generated
		 */
		EClass HELPERS = eINSTANCE.getHelpers();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.ActionsImpl <em>Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.ActionsImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getActions()
		 * @generated
		 */
		EClass ACTIONS = eINSTANCE.getActions();

		/**
		 * The meta object literal for the '<em><b>Friendly Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS__FRIENDLY_NAME = eINSTANCE.getActions_FriendlyName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS__DESCRIPTION = eINSTANCE.getActions_Description();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS__INPUTS = eINSTANCE.getActions_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS__OUTPUTS = eINSTANCE.getActions_Outputs();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIONS__FUNCTION = eINSTANCE.getActions_Function();

		/**
		 * The meta object literal for the '<em><b>Redirect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS__REDIRECT = eINSTANCE.getActions_Redirect();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.PagesImpl <em>Pages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.PagesImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getPages()
		 * @generated
		 */
		EClass PAGES = eINSTANCE.getPages();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.LayoutImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__PAGES = eINSTANCE.getLayout_Pages();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.ConfigurationImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__NAME = eINSTANCE.getConfiguration_Name();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.RoutesImpl <em>Routes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.RoutesImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getRoutes()
		 * @generated
		 */
		EClass ROUTES = eINSTANCE.getRoutes();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.ModelConfigImpl <em>Model Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.ModelConfigImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getModelConfig()
		 * @generated
		 */
		EClass MODEL_CONFIG = eINSTANCE.getModelConfig();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.DataBaseConfigImpl <em>Data Base Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.DataBaseConfigImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getDataBaseConfig()
		 * @generated
		 */
		EClass DATA_BASE_CONFIG = eINSTANCE.getDataBaseConfig();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.impl.EmailConfigImpl <em>Email Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.impl.EmailConfigImpl
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getEmailConfig()
		 * @generated
		 */
		EClass EMAIL_CONFIG = eINSTANCE.getEmailConfig();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.EType <em>EType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.EType
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getEType()
		 * @generated
		 */
		EEnum ETYPE = eINSTANCE.getEType();

		/**
		 * The meta object literal for the '{@link SpaceScheduling.Enumeration <em>Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SpaceScheduling.Enumeration
		 * @see SpaceScheduling.impl.SpaceSchedulingPackageImpl#getEnumeration()
		 * @generated
		 */
		EEnum ENUMERATION = eINSTANCE.getEnumeration();

	}

} //SpaceSchedulingPackage
