/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression;

import org.eclipse.emf.ecore.EObject;

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
public interface CrossValidation extends EObject
{
  /**
   * Returns the value of the '<em><b>K</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>K</em>' containment reference.
   * @see #setK(IntegerValue)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getCrossValidation_K()
   * @model containment="true"
   * @generated
   */
  IntegerValue getK();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.CrossValidation#getK <em>K</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>K</em>' containment reference.
   * @see #getK()
   * @generated
   */
  void setK(IntegerValue value);

} // CrossValidation
