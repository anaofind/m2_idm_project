/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.Algo#getAlgo <em>Algo</em>}</li>
 * </ul>
 *
 * @see m2.idm.project.mLRegression.MLRegressionPackage#getAlgo()
 * @model
 * @generated
 */
public interface Algo extends EObject
{
  /**
   * Returns the value of the '<em><b>Algo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Algo</em>' containment reference.
   * @see #setAlgo(AlgoML)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getAlgo_Algo()
   * @model containment="true"
   * @generated
   */
  AlgoML getAlgo();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.Algo#getAlgo <em>Algo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Algo</em>' containment reference.
   * @see #getAlgo()
   * @generated
   */
  void setAlgo(AlgoML value);

} // Algo
