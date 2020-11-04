/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.NumberValue#getValue <em>Value</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.NumberValue#getDecimal <em>Decimal</em>}</li>
 * </ul>
 *
 * @see m2.idm.project.mLRegression.MLRegressionPackage#getNumberValue()
 * @model
 * @generated
 */
public interface NumberValue extends TypeValue, PercentValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getNumberValue_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link m2.idm.project.mLRegression.NumberValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Decimal</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decimal</em>' attribute list.
   * @see m2.idm.project.mLRegression.MLRegressionPackage#getNumberValue_Decimal()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getDecimal();

} // NumberValue
