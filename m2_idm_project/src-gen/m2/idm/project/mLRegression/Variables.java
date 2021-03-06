/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.Variables#getPredictives <em>Predictives</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.Variables#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @see m2.idm.project.mLRegression.MLRegressionPackage#getVariables()
 * @model
 * @generated
 */
public interface Variables extends EObject
{
  /**
   * Returns the value of the '<em><b>Predictives</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predictives</em>' containment reference.
   * @see #setPredictives(PredictiveVars)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getVariables_Predictives()
   * @model containment="true"
   * @generated
   */
  PredictiveVars getPredictives();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.Variables#getPredictives <em>Predictives</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Predictives</em>' containment reference.
   * @see #getPredictives()
   * @generated
   */
  void setPredictives(PredictiveVars value);

  /**
   * Returns the value of the '<em><b>Targets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targets</em>' containment reference.
   * @see #setTargets(TargetVars)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getVariables_Targets()
   * @model containment="true"
   * @generated
   */
  TargetVars getTargets();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.Variables#getTargets <em>Targets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Targets</em>' containment reference.
   * @see #getTargets()
   * @generated
   */
  void setTargets(TargetVars value);

} // Variables
