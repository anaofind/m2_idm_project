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
      public Adapter caseCalculate(Calculate object)
      {
        return createCalculateAdapter();
      }
      @Override
      public Adapter caseCalculateType(CalculateType object)
      {
        return createCalculateTypeAdapter();
      }
      @Override
      public Adapter caseDataset(Dataset object)
      {
        return createDatasetAdapter();
      }
      @Override
      public Adapter caseEvaluationType(EvaluationType object)
      {
        return createEvaluationTypeAdapter();
      }
      @Override
      public Adapter casePartition(Partition object)
      {
        return createPartitionAdapter();
      }
      @Override
      public Adapter caseCrossValidation(CrossValidation object)
      {
        return createCrossValidationAdapter();
      }
      @Override
      public Adapter caseVariables(Variables object)
      {
        return createVariablesAdapter();
      }
      @Override
      public Adapter caseListePredictiveVar(ListePredictiveVar object)
      {
        return createListePredictiveVarAdapter();
      }
      @Override
      public Adapter caseTargetVar(TargetVar object)
      {
        return createTargetVarAdapter();
      }
      @Override
      public Adapter caseAlgo(Algo object)
      {
        return createAlgoAdapter();
      }
      @Override
      public Adapter caseAlgoType(AlgoType object)
      {
        return createAlgoTypeAdapter();
      }
      @Override
      public Adapter caseLineRegress(LineRegress object)
      {
        return createLineRegressAdapter();
      }
      @Override
      public Adapter caseDecisionTreeRegressor(DecisionTreeRegressor object)
      {
        return createDecisionTreeRegressorAdapter();
      }
      @Override
      public Adapter caseSVR(SVR object)
      {
        return createSVRAdapter();
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
      public Adapter caseNumericValue(NumericValue object)
      {
        return createNumericValueAdapter();
      }
      @Override
      public Adapter caseNumberValue(NumberValue object)
      {
        return createNumberValueAdapter();
      }
      @Override
      public Adapter caseIntegerValue(IntegerValue object)
      {
        return createIntegerValueAdapter();
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
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.Calculate <em>Calculate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.Calculate
   * @generated
   */
  public Adapter createCalculateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.CalculateType <em>Calculate Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.CalculateType
   * @generated
   */
  public Adapter createCalculateTypeAdapter()
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
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.EvaluationType <em>Evaluation Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.EvaluationType
   * @generated
   */
  public Adapter createEvaluationTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.Partition <em>Partition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.Partition
   * @generated
   */
  public Adapter createPartitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.CrossValidation <em>Cross Validation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.CrossValidation
   * @generated
   */
  public Adapter createCrossValidationAdapter()
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
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.ListePredictiveVar <em>Liste Predictive Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.ListePredictiveVar
   * @generated
   */
  public Adapter createListePredictiveVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.TargetVar <em>Target Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.TargetVar
   * @generated
   */
  public Adapter createTargetVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.Algo <em>Algo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.Algo
   * @generated
   */
  public Adapter createAlgoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.AlgoType <em>Algo Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.AlgoType
   * @generated
   */
  public Adapter createAlgoTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.LineRegress <em>Line Regress</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.LineRegress
   * @generated
   */
  public Adapter createLineRegressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.DecisionTreeRegressor <em>Decision Tree Regressor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.DecisionTreeRegressor
   * @generated
   */
  public Adapter createDecisionTreeRegressorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.SVR <em>SVR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.SVR
   * @generated
   */
  public Adapter createSVRAdapter()
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
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.NumericValue <em>Numeric Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.NumericValue
   * @generated
   */
  public Adapter createNumericValueAdapter()
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
   * Creates a new adapter for an object of class '{@link m2.idm.project.mLRegression.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see m2.idm.project.mLRegression.IntegerValue
   * @generated
   */
  public Adapter createIntegerValueAdapter()
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
