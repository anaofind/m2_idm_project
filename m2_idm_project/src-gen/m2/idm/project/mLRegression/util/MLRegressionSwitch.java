/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression.util;

import m2.idm.project.mLRegression.*;

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
 * @see m2.idm.project.mLRegression.MLRegressionPackage
 * @generated
 */
public class MLRegressionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MLRegressionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MLRegressionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MLRegressionPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MLRegressionPackage.ML_REGRESSION:
      {
        MLRegression mlRegression = (MLRegression)theEObject;
        T result = caseMLRegression(mlRegression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.DATASET:
      {
        Dataset dataset = (Dataset)theEObject;
        T result = caseDataset(dataset);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.EVALUATION_TYPE:
      {
        EvaluationType evaluationType = (EvaluationType)theEObject;
        T result = caseEvaluationType(evaluationType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.PARTITION:
      {
        Partition partition = (Partition)theEObject;
        T result = casePartition(partition);
        if (result == null) result = caseEvaluationType(partition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.CROSS_VALIDATION:
      {
        CrossValidation crossValidation = (CrossValidation)theEObject;
        T result = caseCrossValidation(crossValidation);
        if (result == null) result = caseEvaluationType(crossValidation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.VARIABLES:
      {
        Variables variables = (Variables)theEObject;
        T result = caseVariables(variables);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.LISTE_PREDICTIVE_VAR:
      {
        ListePredictiveVar listePredictiveVar = (ListePredictiveVar)theEObject;
        T result = caseListePredictiveVar(listePredictiveVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.TARGET_VAR:
      {
        TargetVar targetVar = (TargetVar)theEObject;
        T result = caseTargetVar(targetVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.CALCULATE:
      {
        Calculate calculate = (Calculate)theEObject;
        T result = caseCalculate(calculate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.ALGO:
      {
        Algo algo = (Algo)theEObject;
        T result = caseAlgo(algo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.ALGO_TYPE:
      {
        AlgoType algoType = (AlgoType)theEObject;
        T result = caseAlgoType(algoType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.LINE_REGRESS:
      {
        LineRegress lineRegress = (LineRegress)theEObject;
        T result = caseLineRegress(lineRegress);
        if (result == null) result = caseAlgoType(lineRegress);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.DECISION_TREE_REGRESSOR:
      {
        DecisionTreeRegressor decisionTreeRegressor = (DecisionTreeRegressor)theEObject;
        T result = caseDecisionTreeRegressor(decisionTreeRegressor);
        if (result == null) result = caseAlgoType(decisionTreeRegressor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.SVR:
      {
        SVR svr = (SVR)theEObject;
        T result = caseSVR(svr);
        if (result == null) result = caseAlgoType(svr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.NUMERIC_VALUE:
      {
        NumericValue numericValue = (NumericValue)theEObject;
        T result = caseNumericValue(numericValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.FLOAT:
      {
        FLOAT float_ = (FLOAT)theEObject;
        T result = caseFLOAT(float_);
        if (result == null) result = caseNumericValue(float_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.PERCENT:
      {
        PERCENT percent = (PERCENT)theEObject;
        T result = casePERCENT(percent);
        if (result == null) result = caseNumericValue(percent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MLRegressionPackage.BOOLEAN_VALUE:
      {
        BooleanValue booleanValue = (BooleanValue)theEObject;
        T result = caseBooleanValue(booleanValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ML Regression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ML Regression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMLRegression(MLRegression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataset(Dataset object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Evaluation Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Evaluation Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvaluationType(EvaluationType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Partition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Partition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePartition(Partition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cross Validation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cross Validation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCrossValidation(CrossValidation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variables</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variables</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariables(Variables object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Liste Predictive Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Liste Predictive Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListePredictiveVar(ListePredictiveVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetVar(TargetVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Calculate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Calculate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCalculate(Calculate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Algo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Algo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlgo(Algo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Algo Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Algo Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlgoType(AlgoType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Line Regress</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Line Regress</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineRegress(LineRegress object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decision Tree Regressor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decision Tree Regressor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecisionTreeRegressor(DecisionTreeRegressor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SVR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SVR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSVR(SVR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumericValue(NumericValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FLOAT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FLOAT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFLOAT(FLOAT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PERCENT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PERCENT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePERCENT(PERCENT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanValue(BooleanValue object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MLRegressionSwitch
