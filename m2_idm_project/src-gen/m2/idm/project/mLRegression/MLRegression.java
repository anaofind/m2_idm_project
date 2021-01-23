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
 *   <li>{@link m2.idm.project.mLRegression.MLRegression#getVars <em>Vars</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.MLRegression#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.MLRegression#getAlgo <em>Algo</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.MLRegression#getCalculate <em>Calculate</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.MLRegression#getLoop <em>Loop</em>}</li>
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
   * Returns the value of the '<em><b>Evaluation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evaluation</em>' containment reference.
   * @see #setEvaluation(EvaluationType)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getMLRegression_Evaluation()
   * @model containment="true"
   * @generated
   */
  EvaluationType getEvaluation();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.MLRegression#getEvaluation <em>Evaluation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evaluation</em>' containment reference.
   * @see #getEvaluation()
   * @generated
   */
  void setEvaluation(EvaluationType value);

  /**
   * Returns the value of the '<em><b>Algo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algo</em>' containment reference.
   * @see #setAlgo(Algo)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getMLRegression_Algo()
   * @model containment="true"
   * @generated
   */
  Algo getAlgo();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.MLRegression#getAlgo <em>Algo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algo</em>' containment reference.
   * @see #getAlgo()
   * @generated
   */
  void setAlgo(Algo value);

  /**
   * Returns the value of the '<em><b>Calculate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calculate</em>' containment reference.
   * @see #setCalculate(Calculate)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getMLRegression_Calculate()
   * @model containment="true"
   * @generated
   */
  Calculate getCalculate();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.MLRegression#getCalculate <em>Calculate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Calculate</em>' containment reference.
   * @see #getCalculate()
   * @generated
   */
  void setCalculate(Calculate value);

  /**
   * Returns the value of the '<em><b>Loop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Loop</em>' containment reference.
   * @see #setLoop(Loop)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getMLRegression_Loop()
   * @model containment="true"
   * @generated
   */
  Loop getLoop();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.MLRegression#getLoop <em>Loop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Loop</em>' containment reference.
   * @see #getLoop()
   * @generated
   */
  void setLoop(Loop value);

} // MLRegression
