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
 * @see SpaceScheduling.SpaceSchedulingPackage
 * @generated
 */
public class SpaceSchedulingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpaceSchedulingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceSchedulingSwitch() {
		if (modelPackage == null) {
			modelPackage = SpaceSchedulingPackage.eINSTANCE;
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
			case SpaceSchedulingPackage.CLASS: {
				SpaceScheduling.Class class_ = (SpaceScheduling.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.RELATIONS: {
				Relations relations = (Relations)theEObject;
				T result = caseRelations(relations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.CLASS_METAMODEL: {
				ClassMetamodel classMetamodel = (ClassMetamodel)theEObject;
				T result = caseClassMetamodel(classMetamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseRelations(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.SIMPLE: {
				Simple simple = (Simple)theEObject;
				T result = caseSimple(simple);
				if (result == null) result = caseRelations(simple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.AGREGATION: {
				Agregation agregation = (Agregation)theEObject;
				T result = caseAgregation(agregation);
				if (result == null) result = caseRelations(agregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.HERITAGE: {
				Heritage heritage = (Heritage)theEObject;
				T result = caseHeritage(heritage);
				if (result == null) result = caseRelations(heritage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.RETURN_TYPE: {
				Return_type return_type = (Return_type)theEObject;
				T result = caseReturn_type(return_type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.PRIMITIVE_TYPE: {
				Primitive_type primitive_type = (Primitive_type)theEObject;
				T result = casePrimitive_type(primitive_type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.SPACE_SCHEDULING: {
				Space_Scheduling space_Scheduling = (Space_Scheduling)theEObject;
				T result = caseSpace_Scheduling(space_Scheduling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.SALILS_JS: {
				SalilsJs salilsJs = (SalilsJs)theEObject;
				T result = caseSalilsJs(salilsJs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.VIEW: {
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.ATTRIBUTES: {
				Attributes attributes = (Attributes)theEObject;
				T result = caseAttributes(attributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.DTO: {
				DTO dto = (DTO)theEObject;
				T result = caseDTO(dto);
				if (result == null) result = caseModel(dto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.ORM: {
				ORM orm = (ORM)theEObject;
				T result = caseORM(orm);
				if (result == null) result = caseModel(orm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.HELPERS: {
				Helpers helpers = (Helpers)theEObject;
				T result = caseHelpers(helpers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.ACTIONS: {
				Actions actions = (Actions)theEObject;
				T result = caseActions(actions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.PAGES: {
				Pages pages = (Pages)theEObject;
				T result = casePages(pages);
				if (result == null) result = caseView(pages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.LAYOUT: {
				Layout layout = (Layout)theEObject;
				T result = caseLayout(layout);
				if (result == null) result = caseView(layout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.ROUTES: {
				Routes routes = (Routes)theEObject;
				T result = caseRoutes(routes);
				if (result == null) result = caseConfiguration(routes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.MODEL_CONFIG: {
				ModelConfig modelConfig = (ModelConfig)theEObject;
				T result = caseModelConfig(modelConfig);
				if (result == null) result = caseConfiguration(modelConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.DATA_BASE_CONFIG: {
				DataBaseConfig dataBaseConfig = (DataBaseConfig)theEObject;
				T result = caseDataBaseConfig(dataBaseConfig);
				if (result == null) result = caseConfiguration(dataBaseConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpaceSchedulingPackage.EMAIL_CONFIG: {
				EmailConfig emailConfig = (EmailConfig)theEObject;
				T result = caseEmailConfig(emailConfig);
				if (result == null) result = caseConfiguration(emailConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(SpaceScheduling.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelations(Relations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMetamodel(ClassMetamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimple(Simple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgregation(Agregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heritage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heritage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeritage(Heritage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn_type(Return_type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitive_type(Primitive_type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Space Scheduling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Space Scheduling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpace_Scheduling(Space_Scheduling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salils Js</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salils Js</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalilsJs(SalilsJs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributes(Attributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTO(DTO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ORM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ORM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORM(ORM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helpers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helpers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelpers(Helpers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActions(Actions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pages</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePages(Pages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayout(Layout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Routes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Routes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoutes(Routes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelConfig(ModelConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Base Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Base Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBaseConfig(DataBaseConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmailConfig(EmailConfig object) {
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

} //SpaceSchedulingSwitch
