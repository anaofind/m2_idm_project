/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.Model#getLanguageTarget <em>Language Target</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.Model#getMl <em>Ml</em>}</li>
 * </ul>
 *
 * @see m2.idm.project.mLRegression.MLRegressionPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Language Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language Target</em>' containment reference.
   * @see #setLanguageTarget(LanguageTarget)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getModel_LanguageTarget()
   * @model containment="true"
   * @generated
   */
  LanguageTarget getLanguageTarget();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.Model#getLanguageTarget <em>Language Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language Target</em>' containment reference.
   * @see #getLanguageTarget()
   * @generated
   */
  void setLanguageTarget(LanguageTarget value);

  /**
   * Returns the value of the '<em><b>Ml</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ml</em>' containment reference.
   * @see #setMl(MLRegression)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getModel_Ml()
   * @model containment="true"
   * @generated
   */
  MLRegression getMl();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.Model#getMl <em>Ml</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ml</em>' containment reference.
   * @see #getMl()
   * @generated
   */
  void setMl(MLRegression value);

} // Model
