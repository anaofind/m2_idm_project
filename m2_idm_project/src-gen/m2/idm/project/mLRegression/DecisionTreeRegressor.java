/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decision Tree Regressor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.DecisionTreeRegressor#getRand <em>Rand</em>}</li>
 * </ul>
 *
 * @see m2.idm.project.mLRegression.MLRegressionPackage#getDecisionTreeRegressor()
 * @model
 * @generated
 */
public interface DecisionTreeRegressor extends AlgoML
{
  /**
   * Returns the value of the '<em><b>Rand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rand</em>' attribute.
   * @see #setRand(int)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getDecisionTreeRegressor_Rand()
   * @model
   * @generated
   */
  int getRand();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.DecisionTreeRegressor#getRand <em>Rand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rand</em>' attribute.
   * @see #getRand()
   * @generated
   */
  void setRand(int value);

} // DecisionTreeRegressor
