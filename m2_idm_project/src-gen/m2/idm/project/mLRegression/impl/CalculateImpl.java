/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression.impl;

import m2.idm.project.mLRegression.Calculate;
import m2.idm.project.mLRegression.CalculateType;
import m2.idm.project.mLRegression.MLRegressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.impl.CalculateImpl#getCalculateType <em>Calculate Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculateImpl extends MinimalEObjectImpl.Container implements Calculate
{
  /**
   * The cached value of the '{@link #getCalculateType() <em>Calculate Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalculateType()
   * @generated
   * @ordered
   */
  protected CalculateType calculateType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CalculateImpl()
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
    return MLRegressionPackage.Literals.CALCULATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CalculateType getCalculateType()
  {
    return calculateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCalculateType(CalculateType newCalculateType, NotificationChain msgs)
  {
    CalculateType oldCalculateType = calculateType;
    calculateType = newCalculateType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLRegressionPackage.CALCULATE__CALCULATE_TYPE, oldCalculateType, newCalculateType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCalculateType(CalculateType newCalculateType)
  {
    if (newCalculateType != calculateType)
    {
      NotificationChain msgs = null;
      if (calculateType != null)
        msgs = ((InternalEObject)calculateType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLRegressionPackage.CALCULATE__CALCULATE_TYPE, null, msgs);
      if (newCalculateType != null)
        msgs = ((InternalEObject)newCalculateType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLRegressionPackage.CALCULATE__CALCULATE_TYPE, null, msgs);
      msgs = basicSetCalculateType(newCalculateType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegressionPackage.CALCULATE__CALCULATE_TYPE, newCalculateType, newCalculateType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MLRegressionPackage.CALCULATE__CALCULATE_TYPE:
        return basicSetCalculateType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MLRegressionPackage.CALCULATE__CALCULATE_TYPE:
        return getCalculateType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MLRegressionPackage.CALCULATE__CALCULATE_TYPE:
        setCalculateType((CalculateType)newValue);
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
      case MLRegressionPackage.CALCULATE__CALCULATE_TYPE:
        setCalculateType((CalculateType)null);
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
      case MLRegressionPackage.CALCULATE__CALCULATE_TYPE:
        return calculateType != null;
    }
    return super.eIsSet(featureID);
  }

} //CalculateImpl
