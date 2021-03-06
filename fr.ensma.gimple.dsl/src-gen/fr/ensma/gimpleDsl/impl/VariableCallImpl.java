/**
 * generated by Xtext 2.25.0
 */
package fr.ensma.gimpleDsl.impl;

import fr.ensma.gimpleDsl.GimpleDslPackage;
import fr.ensma.gimpleDsl.LocalVariable;
import fr.ensma.gimpleDsl.VariableCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.gimpleDsl.impl.VariableCallImpl#getCalledVaraible <em>Called Varaible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableCallImpl extends MinimalEObjectImpl.Container implements VariableCall
{
  /**
   * The cached value of the '{@link #getCalledVaraible() <em>Called Varaible</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalledVaraible()
   * @generated
   * @ordered
   */
  protected LocalVariable calledVaraible;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableCallImpl()
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
    return GimpleDslPackage.Literals.VARIABLE_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocalVariable getCalledVaraible()
  {
    if (calledVaraible != null && calledVaraible.eIsProxy())
    {
      InternalEObject oldCalledVaraible = (InternalEObject)calledVaraible;
      calledVaraible = (LocalVariable)eResolveProxy(oldCalledVaraible);
      if (calledVaraible != oldCalledVaraible)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GimpleDslPackage.VARIABLE_CALL__CALLED_VARAIBLE, oldCalledVaraible, calledVaraible));
      }
    }
    return calledVaraible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariable basicGetCalledVaraible()
  {
    return calledVaraible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCalledVaraible(LocalVariable newCalledVaraible)
  {
    LocalVariable oldCalledVaraible = calledVaraible;
    calledVaraible = newCalledVaraible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GimpleDslPackage.VARIABLE_CALL__CALLED_VARAIBLE, oldCalledVaraible, calledVaraible));
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
      case GimpleDslPackage.VARIABLE_CALL__CALLED_VARAIBLE:
        if (resolve) return getCalledVaraible();
        return basicGetCalledVaraible();
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
      case GimpleDslPackage.VARIABLE_CALL__CALLED_VARAIBLE:
        setCalledVaraible((LocalVariable)newValue);
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
      case GimpleDslPackage.VARIABLE_CALL__CALLED_VARAIBLE:
        setCalledVaraible((LocalVariable)null);
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
      case GimpleDslPackage.VARIABLE_CALL__CALLED_VARAIBLE:
        return calledVaraible != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableCallImpl
