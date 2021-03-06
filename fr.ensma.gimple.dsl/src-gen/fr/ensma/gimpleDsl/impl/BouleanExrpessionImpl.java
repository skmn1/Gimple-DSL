/**
 * generated by Xtext 2.25.0
 */
package fr.ensma.gimpleDsl.impl;

import fr.ensma.gimpleDsl.BouleanExrpession;
import fr.ensma.gimpleDsl.CodeBlock;
import fr.ensma.gimpleDsl.GimpleDslPackage;
import fr.ensma.gimpleDsl.Instruction;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boulean Exrpession</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.gimpleDsl.impl.BouleanExrpessionImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.impl.BouleanExrpessionImpl#getCodeBlock <em>Code Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BouleanExrpessionImpl extends IfImpl implements BouleanExrpession
{
  /**
   * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstruction()
   * @generated
   * @ordered
   */
  protected EList<Instruction> instruction;

  /**
   * The cached value of the '{@link #getCodeBlock() <em>Code Block</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeBlock()
   * @generated
   * @ordered
   */
  protected EList<CodeBlock> codeBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BouleanExrpessionImpl()
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
    return GimpleDslPackage.Literals.BOULEAN_EXRPESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Instruction> getInstruction()
  {
    if (instruction == null)
    {
      instruction = new EObjectContainmentEList<Instruction>(Instruction.class, this, GimpleDslPackage.BOULEAN_EXRPESSION__INSTRUCTION);
    }
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CodeBlock> getCodeBlock()
  {
    if (codeBlock == null)
    {
      codeBlock = new EObjectContainmentEList<CodeBlock>(CodeBlock.class, this, GimpleDslPackage.BOULEAN_EXRPESSION__CODE_BLOCK);
    }
    return codeBlock;
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
      case GimpleDslPackage.BOULEAN_EXRPESSION__INSTRUCTION:
        return ((InternalEList<?>)getInstruction()).basicRemove(otherEnd, msgs);
      case GimpleDslPackage.BOULEAN_EXRPESSION__CODE_BLOCK:
        return ((InternalEList<?>)getCodeBlock()).basicRemove(otherEnd, msgs);
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
      case GimpleDslPackage.BOULEAN_EXRPESSION__INSTRUCTION:
        return getInstruction();
      case GimpleDslPackage.BOULEAN_EXRPESSION__CODE_BLOCK:
        return getCodeBlock();
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
      case GimpleDslPackage.BOULEAN_EXRPESSION__INSTRUCTION:
        getInstruction().clear();
        getInstruction().addAll((Collection<? extends Instruction>)newValue);
        return;
      case GimpleDslPackage.BOULEAN_EXRPESSION__CODE_BLOCK:
        getCodeBlock().clear();
        getCodeBlock().addAll((Collection<? extends CodeBlock>)newValue);
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
      case GimpleDslPackage.BOULEAN_EXRPESSION__INSTRUCTION:
        getInstruction().clear();
        return;
      case GimpleDslPackage.BOULEAN_EXRPESSION__CODE_BLOCK:
        getCodeBlock().clear();
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
      case GimpleDslPackage.BOULEAN_EXRPESSION__INSTRUCTION:
        return instruction != null && !instruction.isEmpty();
      case GimpleDslPackage.BOULEAN_EXRPESSION__CODE_BLOCK:
        return codeBlock != null && !codeBlock.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BouleanExrpessionImpl
