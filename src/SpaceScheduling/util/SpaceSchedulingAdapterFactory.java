/**
 */
package SpaceScheduling.util;

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
import SpaceScheduling.EmailConfig;
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
import SpaceScheduling.SpaceSchedulingPackage;
import SpaceScheduling.Space_Scheduling;
import SpaceScheduling.View;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SpaceScheduling.SpaceSchedulingPackage
 * @generated
 */
public class SpaceSchedulingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpaceSchedulingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceSchedulingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpaceSchedulingPackage.eINSTANCE;
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
	protected SpaceSchedulingSwitch<Adapter> modelSwitch =
		new SpaceSchedulingSwitch<Adapter>() {
			@Override
			public Adapter caseClass(SpaceScheduling.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseRelations(Relations object) {
				return createRelationsAdapter();
			}
			@Override
			public Adapter caseClassMetamodel(ClassMetamodel object) {
				return createClassMetamodelAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseSimple(Simple object) {
				return createSimpleAdapter();
			}
			@Override
			public Adapter caseAgregation(Agregation object) {
				return createAgregationAdapter();
			}
			@Override
			public Adapter caseHeritage(Heritage object) {
				return createHeritageAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseReturn_type(Return_type object) {
				return createReturn_typeAdapter();
			}
			@Override
			public Adapter casePrimitive_type(Primitive_type object) {
				return createPrimitive_typeAdapter();
			}
			@Override
			public Adapter caseSpace_Scheduling(Space_Scheduling object) {
				return createSpace_SchedulingAdapter();
			}
			@Override
			public Adapter caseSalilsJs(SalilsJs object) {
				return createSalilsJsAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseView(View object) {
				return createViewAdapter();
			}
			@Override
			public Adapter caseController(Controller object) {
				return createControllerAdapter();
			}
			@Override
			public Adapter caseAttributes(Attributes object) {
				return createAttributesAdapter();
			}
			@Override
			public Adapter caseDTO(DTO object) {
				return createDTOAdapter();
			}
			@Override
			public Adapter caseORM(ORM object) {
				return createORMAdapter();
			}
			@Override
			public Adapter caseHelpers(Helpers object) {
				return createHelpersAdapter();
			}
			@Override
			public Adapter caseActions(Actions object) {
				return createActionsAdapter();
			}
			@Override
			public Adapter casePages(Pages object) {
				return createPagesAdapter();
			}
			@Override
			public Adapter caseLayout(Layout object) {
				return createLayoutAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseRoutes(Routes object) {
				return createRoutesAdapter();
			}
			@Override
			public Adapter caseModelConfig(ModelConfig object) {
				return createModelConfigAdapter();
			}
			@Override
			public Adapter caseDataBaseConfig(DataBaseConfig object) {
				return createDataBaseConfigAdapter();
			}
			@Override
			public Adapter caseEmailConfig(EmailConfig object) {
				return createEmailConfigAdapter();
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
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Relations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Relations
	 * @generated
	 */
	public Adapter createRelationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.ClassMetamodel <em>Class Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.ClassMetamodel
	 * @generated
	 */
	public Adapter createClassMetamodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Simple
	 * @generated
	 */
	public Adapter createSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Agregation <em>Agregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Agregation
	 * @generated
	 */
	public Adapter createAgregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Heritage <em>Heritage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Heritage
	 * @generated
	 */
	public Adapter createHeritageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Return_type <em>Return type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Return_type
	 * @generated
	 */
	public Adapter createReturn_typeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Primitive_type <em>Primitive type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Primitive_type
	 * @generated
	 */
	public Adapter createPrimitive_typeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Space_Scheduling <em>Space Scheduling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Space_Scheduling
	 * @generated
	 */
	public Adapter createSpace_SchedulingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.SalilsJs <em>Salils Js</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.SalilsJs
	 * @generated
	 */
	public Adapter createSalilsJsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.View
	 * @generated
	 */
	public Adapter createViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Attributes
	 * @generated
	 */
	public Adapter createAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.DTO <em>DTO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.DTO
	 * @generated
	 */
	public Adapter createDTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.ORM <em>ORM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.ORM
	 * @generated
	 */
	public Adapter createORMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Helpers <em>Helpers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Helpers
	 * @generated
	 */
	public Adapter createHelpersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Actions
	 * @generated
	 */
	public Adapter createActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Pages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Pages
	 * @generated
	 */
	public Adapter createPagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Layout
	 * @generated
	 */
	public Adapter createLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.Routes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.Routes
	 * @generated
	 */
	public Adapter createRoutesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.ModelConfig <em>Model Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.ModelConfig
	 * @generated
	 */
	public Adapter createModelConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.DataBaseConfig <em>Data Base Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.DataBaseConfig
	 * @generated
	 */
	public Adapter createDataBaseConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SpaceScheduling.EmailConfig <em>Email Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SpaceScheduling.EmailConfig
	 * @generated
	 */
	public Adapter createEmailConfigAdapter() {
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

} //SpaceSchedulingAdapterFactory
