/**
 * generated by Xtext 2.23.0
 */
package m2.idm.project.mLRegression.impl;

import m2.idm.project.mLRegression.MLRegressionPackage;
import m2.idm.project.mLRegression.Predictives;
import m2.idm.project.mLRegression.Targets;
import m2.idm.project.mLRegression.Variables;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variables</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m2.idm.project.mLRegression.impl.VariablesImpl#getPredictives <em>Predictives</em>}</li>
 *   <li>{@link m2.idm.project.mLRegression.impl.VariablesImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariablesImpl extends MinimalEObjectImpl.Container implements Variables
{
  /**
   * The cached value of the '{@link #getPredictives() <em>Predictives</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredictives()
   * @generated
   * @ordered
   */
  protected Predictives predictives;

  /**
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected Targets targets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariablesImpl()
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
    return MLRegressionPackage.Literals.VARIABLES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Predictives getPredictives()
  {
    return predictives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredictives(Predictives newPredictives, NotificationChain msgs)
  {
    Predictives oldPredictives = predictives;
    predictives = newPredictives;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLRegressionPackage.VARIABLES__PREDICTIVES, oldPredictives, newPredictives);
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
  public void setPredictives(Predictives newPredictives)
  {
    if (newPredictives != predictives)
    {
      NotificationChain msgs = null;
      if (predictives != null)
        msgs = ((InternalEObject)predictives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLRegressionPackage.VARIABLES__PREDICTIVES, null, msgs);
      if (newPredictives != null)
        msgs = ((InternalEObject)newPredictives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLRegressionPackage.VARIABLES__PREDICTIVES, null, msgs);
      msgs = basicSetPredictives(newPredictives, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegressionPackage.VARIABLES__PREDICTIVES, newPredictives, newPredictives));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Targets getTargets()
  {
    return targets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargets(Targets newTargets, NotificationChain msgs)
  {
    Targets oldTargets = targets;
    targets = newTargets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MLRegressionPackage.VARIABLES__TARGETS, oldTargets, newTargets);
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
  public void setTargets(Targets newTargets)
  {
    if (newTargets != targets)
    {
      NotificationChain msgs = null;
      if (targets != null)
        msgs = ((InternalEObject)targets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MLRegressionPackage.VARIABLES__TARGETS, null, msgs);
      if (newTargets != null)
        msgs = ((InternalEObject)newTargets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MLRegressionPackage.VARIABLES__TARGETS, null, msgs);
      msgs = basicSetTargets(newTargets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MLRegressionPackage.VARIABLES__TARGETS, newTargets, newTargets));
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
      case MLRegressionPackage.VARIABLES__PREDICTIVES:
        return basicSetPredictives(null, msgs);
      case MLRegressionPackage.VARIABLES__TARGETS:
        return basicSetTargets(null, msgs);
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
      case MLRegressionPackage.VARIABLES__PREDICTIVES:
        return getPredictives();
      case MLRegressionPackage.VARIABLES__TARGETS:
        return getTargets();
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
      case MLRegressionPackage.VARIABLES__PREDICTIVES:
        setPredictives((Predictives)newValue);
        return;
      case MLRegressionPackage.VARIABLES__TARGETS:
        setTargets((Targets)newValue);
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
      case MLRegressionPackage.VARIABLES__PREDICTIVES:
        setPredictives((Predictives)null);
        return;
      case MLRegressionPackage.VARIABLES__TARGETS:
        setTargets((Targets)null);
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
      case MLRegressionPackage.VARIABLES__PREDICTIVES:
        return predictives != null;
      case MLRegressionPackage.VARIABLES__TARGETS:
        return targets != null;
    }
    return super.eIsSet(featureID);
  }

} //VariablesImpl
