/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cross Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.CrossValidation#getK <em>K</em>}</li>
 * </ul>
 *
 * @see m2.idm.project.mLRegression.MLRegressionPackage#getCrossValidation()
 * @model
 * @generated
 */
public interface CrossValidation extends EvaluationType
{
  /**
   * Returns the value of the '<em><b>K</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>K</em>' attribute.
   * @see #setK(int)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getCrossValidation_K()
   * @model
   * @generated
   */
  int getK();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.CrossValidation#getK <em>K</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>K</em>' attribute.
   * @see #getK()
   * @generated
   */
  void setK(int value);

} // CrossValidation
