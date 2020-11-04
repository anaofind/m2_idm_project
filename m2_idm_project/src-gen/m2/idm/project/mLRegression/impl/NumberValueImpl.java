/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression.impl;

import java.util.Collection;

import m2.idm.project.mLRegression.MLRegressionPackage;
import m2.idm.project.mLRegression.NumberValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.impl.NumberValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.impl.NumberValueImpl#getDecimal <em>Decimal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberValueImpl extends TypeValueImpl implements NumberValue
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final int VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected int value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDecimal() <em>Decimal</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimal()
   * @generated
   * @ordered
   */
  protected EList<Integer> decimal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberValueImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MLRegressionPackage.Literals.NUMBER_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(int newValue)
  {
    int oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegressionPackage.NUMBER_VALUE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Integer> getDecimal()
  {
    if (decimal == null)
    {
      decimal = new EDataTypeEList<Integer>(Integer.class, this, MLRegressionPackage.NUMBER_VALUE__DECIMAL);
    }
    return decimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MLRegressionPackage.NUMBER_VALUE__VALUE:
        return getValue();
      case MLRegressionPackage.NUMBER_VALUE__DECIMAL:
        return getDecimal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MLRegressionPackage.NUMBER_VALUE__VALUE:
        setValue((Integer)newValue);
        return;
      case MLRegressionPackage.NUMBER_VALUE__DECIMAL:
        getDecimal().clear();
        getDecimal().addAll((Collection<? extends Integer>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MLRegressionPackage.NUMBER_VALUE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case MLRegressionPackage.NUMBER_VALUE__DECIMAL:
        getDecimal().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MLRegressionPackage.NUMBER_VALUE__VALUE:
        return value != VALUE_EDEFAULT;
      case MLRegressionPackage.NUMBER_VALUE__DECIMAL:
        return decimal != null && !decimal.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (value: ");
    result.append(value);
    result.append(", decimal: ");
    result.append(decimal);
    result.append(')');
    return result.toString();
  }

} //NumberValueImpl
