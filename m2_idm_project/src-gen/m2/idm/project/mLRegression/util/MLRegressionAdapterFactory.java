/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression.util;

import m2.idm.project.mLRegression.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see m2.idm.project.mLRegression.MLRegressionPackage
 * @generated
 */
public class MLRegressionAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MLRegressionPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MLRegressionAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MLRegressionPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected MLRegressionSwitch<Adapter> modelSwitch =
    new MLRegressionSwitch<Adapter>()
    {
      @Override
      public Adapter caseMLRegression(MLRegression object)
      {
        return createMLRegressionAdapter();
      }
      @Override
      public Adapter caseDataset(Dataset object)
      {
        return createDatasetAdapter();
      }
      @Override
      public Adapter caseLearningType(LearningType object)
      {
        return createLearningTypeAdapter();
      }
      @Override
      public Adapter caseTraining(Training object)
      {
        return createTrainingAdapter();
      }
      @Override
      public Adapter caseVariables(Variables object)
      {
        return createVariablesAdapter();
      }
      @Override
      public Adapter casePredictives(Predictives object)
      {
        return createPredictivesAdapter();
      }
      @Override
      public Adapter caseTargets(Targets object)
      {
        return createTargetsAdapter();
      }
      @Override
      public Adapter caseVar(Var object)
      {
        return createVarAdapter();
      }
      @Override
      public Adapter caseReturnType(ReturnType object)
      {
        return createReturnTypeAdapter();
      }
      @Override
      public Adapter caseTypeValue(TypeValue object)
      {
        return createTypeValueAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseNumberValue(NumberValue object)
      {
        return createNumberValueAdapter();
      }
      @Override
      public Adapter casePercentValue(PercentValue object)
      {
        return createPercentValueAdapter();
      }
      @Override
      public Adapter caseBooleanValue(BooleanValue object)
      {
        return createBooleanValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.MLRegression <em>ML Regression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.MLRegression
   * @generated
   */
  public Adapter createMLRegressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.Dataset <em>Dataset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.Dataset
   * @generated
   */
  public Adapter createDatasetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.LearningType <em>Learning Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.LearningType
   * @generated
   */
  public Adapter createLearningTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.Training <em>Training</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.Training
   * @generated
   */
  public Adapter createTrainingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.Variables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.Variables
   * @generated
   */
  public Adapter createVariablesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.Predictives <em>Predictives</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.Predictives
   * @generated
   */
  public Adapter createPredictivesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.Targets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.Targets
   * @generated
   */
  public Adapter createTargetsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.Var
   * @generated
   */
  public Adapter createVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.ReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.ReturnType
   * @generated
   */
  public Adapter createReturnTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.TypeValue <em>Type Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.TypeValue
   * @generated
   */
  public Adapter createTypeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.NumberValue <em>Number Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.NumberValue
   * @generated
   */
  public Adapter createNumberValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.PercentValue <em>Percent Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.PercentValue
   * @generated
   */
  public Adapter createPercentValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.BooleanValue
   * @generated
   */
  public Adapter createBooleanValueAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MLRegressionAdapterFactory
