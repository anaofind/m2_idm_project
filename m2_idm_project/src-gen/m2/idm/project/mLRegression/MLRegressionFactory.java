/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see m2.idm.project.mLRegression.MLRegressionPackage
 * @generated
 */
public interface MLRegressionFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MLRegressionFactory eINSTANCE = m2.idm.project.mLRegression.impl.MLRegressionFactoryImpl.init();

  /**
   * Returns a new object of class '<em>ML Regression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ML Regression</em>'.
   * @generated
   */
  MLRegression createMLRegression();

  /**
   * Returns a new object of class '<em>Dataset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dataset</em>'.
   * @generated
   */
  Dataset createDataset();

  /**
   * Returns a new object of class '<em>Learning Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Learning Type</em>'.
   * @generated
   */
  LearningType createLearningType();

  /**
   * Returns a new object of class '<em>Training</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Training</em>'.
   * @generated
   */
  Training createTraining();

  /**
   * Returns a new object of class '<em>Variables</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variables</em>'.
   * @generated
   */
  Variables createVariables();

  /**
   * Returns a new object of class '<em>Predictives</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predictives</em>'.
   * @generated
   */
  Predictives createPredictives();

  /**
   * Returns a new object of class '<em>Targets</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Targets</em>'.
   * @generated
   */
  Targets createTargets();

  /**
   * Returns a new object of class '<em>Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var</em>'.
   * @generated
   */
  Var createVar();

  /**
   * Returns a new object of class '<em>Return Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Type</em>'.
   * @generated
   */
  ReturnType createReturnType();

  /**
   * Returns a new object of class '<em>Type Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Value</em>'.
   * @generated
   */
  TypeValue createTypeValue();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Number Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Value</em>'.
   * @generated
   */
  NumberValue createNumberValue();

  /**
   * Returns a new object of class '<em>Percent Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Percent Value</em>'.
   * @generated
   */
  PercentValue createPercentValue();

  /**
   * Returns a new object of class '<em>Boolean Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Value</em>'.
   * @generated
   */
  BooleanValue createBooleanValue();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MLRegressionPackage getMLRegressionPackage();

} //MLRegressionFactory