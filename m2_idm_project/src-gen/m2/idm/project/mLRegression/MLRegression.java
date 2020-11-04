/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ML Regression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.MLRegression#getDataset <em>Dataset</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.MLRegression#getLearningType <em>Learning Type</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.MLRegression#getVars <em>Vars</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.MLRegression#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see m2.idm.project.mLRegression.MLRegressionPackage#getMLRegression()
 * @model
 * @generated
 */
public interface MLRegression extends EObject
{
  /**
   * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataset</em>' containment reference.
   * @see #setDataset(Dataset)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getMLRegression_Dataset()
   * @model containment="true"
   * @generated
   */
  Dataset getDataset();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.MLRegression#getDataset <em>Dataset</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataset</em>' containment reference.
   * @see #getDataset()
   * @generated
   */
  void setDataset(Dataset value);

  /**
   * Returns the value of the '<em><b>Learning Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Learning Type</em>' containment reference.
   * @see #setLearningType(LearningType)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getMLRegression_LearningType()
   * @model containment="true"
   * @generated
   */
  LearningType getLearningType();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.MLRegression#getLearningType <em>Learning Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Learning Type</em>' containment reference.
   * @see #getLearningType()
   * @generated
   */
  void setLearningType(LearningType value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(Variables)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getMLRegression_Vars()
   * @model containment="true"
   * @generated
   */
  Variables getVars();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.MLRegression#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(Variables value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(ReturnType)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getMLRegression_ReturnType()
   * @model containment="true"
   * @generated
   */
  ReturnType getReturnType();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.MLRegression#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(ReturnType value);

} // MLRegression
