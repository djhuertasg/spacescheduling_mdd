/**
 */
package SpaceScheduling.impl;

import SpaceScheduling.Actions;
import SpaceScheduling.Agregation;
import SpaceScheduling.Attribute;
import SpaceScheduling.Attributes;
import SpaceScheduling.ClassMetamodel;
import SpaceScheduling.Composition;
import SpaceScheduling.Configuration;
import SpaceScheduling.Controller;
import SpaceScheduling.DTO;
import SpaceScheduling.DataBaseConfig;
import SpaceScheduling.EType;
import SpaceScheduling.EmailConfig;
import SpaceScheduling.Enumeration;
import SpaceScheduling.Helpers;
import SpaceScheduling.Heritage;
import SpaceScheduling.Layout;
import SpaceScheduling.Method;
import SpaceScheduling.Model;
import SpaceScheduling.ModelConfig;
import SpaceScheduling.ORM;
import SpaceScheduling.Pages;
import SpaceScheduling.Primitive_type;
import SpaceScheduling.Relations;
import SpaceScheduling.Return_type;
import SpaceScheduling.Routes;
import SpaceScheduling.SalilsJs;
import SpaceScheduling.Simple;
import SpaceScheduling.SpaceSchedulingFactory;
import SpaceScheduling.SpaceSchedulingPackage;
import SpaceScheduling.Space_Scheduling;
import SpaceScheduling.View;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpaceSchedulingFactoryImpl extends EFactoryImpl implements SpaceSchedulingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpaceSchedulingFactory init() {
		try {
			SpaceSchedulingFactory theSpaceSchedulingFactory = (SpaceSchedulingFactory)EPackage.Registry.INSTANCE.getEFactory(SpaceSchedulingPackage.eNS_URI);
			if (theSpaceSchedulingFactory != null) {
				return theSpaceSchedulingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpaceSchedulingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceSchedulingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpaceSchedulingPackage.CLASS: return createClass();
			case SpaceSchedulingPackage.RELATIONS: return createRelations();
			case SpaceSchedulingPackage.CLASS_METAMODEL: return createClassMetamodel();
			case SpaceSchedulingPackage.COMPOSITION: return createComposition();
			case SpaceSchedulingPackage.SIMPLE: return createSimple();
			case SpaceSchedulingPackage.AGREGATION: return createAgregation();
			case SpaceSchedulingPackage.HERITAGE: return createHeritage();
			case SpaceSchedulingPackage.ATTRIBUTE: return createAttribute();
			case SpaceSchedulingPackage.METHOD: return createMethod();
			case SpaceSchedulingPackage.RETURN_TYPE: return createReturn_type();
			case SpaceSchedulingPackage.PRIMITIVE_TYPE: return createPrimitive_type();
			case SpaceSchedulingPackage.SPACE_SCHEDULING: return createSpace_Scheduling();
			case SpaceSchedulingPackage.SALILS_JS: return createSalilsJs();
			case SpaceSchedulingPackage.MODEL: return createModel();
			case SpaceSchedulingPackage.VIEW: return createView();
			case SpaceSchedulingPackage.CONTROLLER: return createController();
			case SpaceSchedulingPackage.ATTRIBUTES: return createAttributes();
			case SpaceSchedulingPackage.DTO: return createDTO();
			case SpaceSchedulingPackage.ORM: return createORM();
			case SpaceSchedulingPackage.HELPERS: return createHelpers();
			case SpaceSchedulingPackage.ACTIONS: return createActions();
			case SpaceSchedulingPackage.PAGES: return createPages();
			case SpaceSchedulingPackage.LAYOUT: return createLayout();
			case SpaceSchedulingPackage.CONFIGURATION: return createConfiguration();
			case SpaceSchedulingPackage.ROUTES: return createRoutes();
			case SpaceSchedulingPackage.MODEL_CONFIG: return createModelConfig();
			case SpaceSchedulingPackage.DATA_BASE_CONFIG: return createDataBaseConfig();
			case SpaceSchedulingPackage.EMAIL_CONFIG: return createEmailConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SpaceSchedulingPackage.ETYPE:
				return createETypeFromString(eDataType, initialValue);
			case SpaceSchedulingPackage.ENUMERATION:
				return createEnumerationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SpaceSchedulingPackage.ETYPE:
				return convertETypeToString(eDataType, instanceValue);
			case SpaceSchedulingPackage.ENUMERATION:
				return convertEnumerationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceScheduling.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relations createRelations() {
		RelationsImpl relations = new RelationsImpl();
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMetamodel createClassMetamodel() {
		ClassMetamodelImpl classMetamodel = new ClassMetamodelImpl();
		return classMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple createSimple() {
		SimpleImpl simple = new SimpleImpl();
		return simple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agregation createAgregation() {
		AgregationImpl agregation = new AgregationImpl();
		return agregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Heritage createHeritage() {
		HeritageImpl heritage = new HeritageImpl();
		return heritage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return_type createReturn_type() {
		Return_typeImpl return_type = new Return_typeImpl();
		return return_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive_type createPrimitive_type() {
		Primitive_typeImpl primitive_type = new Primitive_typeImpl();
		return primitive_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space_Scheduling createSpace_Scheduling() {
		Space_SchedulingImpl space_Scheduling = new Space_SchedulingImpl();
		return space_Scheduling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SalilsJs createSalilsJs() {
		SalilsJsImpl salilsJs = new SalilsJsImpl();
		return salilsJs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView() {
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributes createAttributes() {
		AttributesImpl attributes = new AttributesImpl();
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTO createDTO() {
		DTOImpl dto = new DTOImpl();
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORM createORM() {
		ORMImpl orm = new ORMImpl();
		return orm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Helpers createHelpers() {
		HelpersImpl helpers = new HelpersImpl();
		return helpers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions createActions() {
		ActionsImpl actions = new ActionsImpl();
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pages createPages() {
		PagesImpl pages = new PagesImpl();
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routes createRoutes() {
		RoutesImpl routes = new RoutesImpl();
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelConfig createModelConfig() {
		ModelConfigImpl modelConfig = new ModelConfigImpl();
		return modelConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBaseConfig createDataBaseConfig() {
		DataBaseConfigImpl dataBaseConfig = new DataBaseConfigImpl();
		return dataBaseConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailConfig createEmailConfig() {
		EmailConfigImpl emailConfig = new EmailConfigImpl();
		return emailConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EType createETypeFromString(EDataType eDataType, String initialValue) {
		EType result = EType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumerationFromString(EDataType eDataType, String initialValue) {
		Enumeration result = Enumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceSchedulingPackage getSpaceSchedulingPackage() {
		return (SpaceSchedulingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpaceSchedulingPackage getPackage() {
		return SpaceSchedulingPackage.eINSTANCE;
	}

} //SpaceSchedulingFactoryImpl
