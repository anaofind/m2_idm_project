/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression.impl;

import m2.idm.project.mLRegression.Algo;
import m2.idm.project.mLRegression.AlgoType;
import m2.idm.project.mLRegression.MLRegressionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.impl.AlgoImpl#getAlgo <em>Algo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgoImpl extends MinimalEObjectImpl.Container implements Algo
{
  /**
   * The cached value of the '{@link #getAlgo() <em>Algo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlgo()
   * @generated
   * @ordered
   */
  protected AlgoType algo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlgoImpl()
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
    return MLRegressionPackage.Literals.ALGO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AlgoType getAlgo()
  {
    return algo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlgo(AlgoType newAlgo, NotificationChain msgs)
  {
    AlgoType oldAlgo = algo;
    algo = newAlgo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLRegressionPackage.ALGO__ALGO, oldAlgo, newAlgo);
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
  public void setAlgo(AlgoType newAlgo)
  {
    if (newAlgo != algo)
    {
      NotificationChain msgs = null;
      if (algo != null)
        msgs = ((InternalEObject)algo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLRegressionPackage.ALGO__ALGO, null, msgs);
      if (newAlgo != null)
        msgs = ((InternalEObject)newAlgo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLRegressionPackage.ALGO__ALGO, null, msgs);
      msgs = basicSetAlgo(newAlgo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegressionPackage.ALGO__ALGO, newAlgo, newAlgo));
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
      case MLRegressionPackage.ALGO__ALGO:
        return basicSetAlgo(null, msgs);
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
      case MLRegressionPackage.ALGO__ALGO:
        return getAlgo();
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
      case MLRegressionPackage.ALGO__ALGO:
        setAlgo((AlgoType)newValue);
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
      case MLRegressionPackage.ALGO__ALGO:
        setAlgo((AlgoType)null);
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
      case MLRegressionPackage.ALGO__ALGO:
        return algo != null;
    }
    return super.eIsSet(featureID);
  }

} //AlgoImpl
