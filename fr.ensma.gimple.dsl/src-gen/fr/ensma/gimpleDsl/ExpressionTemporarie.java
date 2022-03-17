/**
 * generated by Xtext 2.25.0
 */
package fr.ensma.gimpleDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Temporarie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.gimpleDsl.ExpressionTemporarie#getTempVariableL <em>Temp Variable L</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.ExpressionTemporarie#getTempVariableR1 <em>Temp Variable R1</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.ExpressionTemporarie#getArithmeticOperation <em>Arithmetic Operation</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.ExpressionTemporarie#getTempVariableR2 <em>Temp Variable R2</em>}</li>
 * </ul>
 *
 * @see fr.ensma.gimpleDsl.GimpleDslPackage#getExpressionTemporarie()
 * @model
 * @generated
 */
public interface ExpressionTemporarie extends EObject
{
  /**
   * Returns the value of the '<em><b>Temp Variable L</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.gimpleDsl.TempVariable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temp Variable L</em>' containment reference list.
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getExpressionTemporarie_TempVariableL()
   * @model containment="true"
   * @generated
   */
  EList<TempVariable> getTempVariableL();

  /**
   * Returns the value of the '<em><b>Temp Variable R1</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.gimpleDsl.TempVariable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temp Variable R1</em>' containment reference list.
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getExpressionTemporarie_TempVariableR1()
   * @model containment="true"
   * @generated
   */
  EList<TempVariable> getTempVariableR1();

  /**
   * Returns the value of the '<em><b>Arithmetic Operation</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.gimpleDsl.ArithmeticOperation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arithmetic Operation</em>' containment reference list.
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getExpressionTemporarie_ArithmeticOperation()
   * @model containment="true"
   * @generated
   */
  EList<ArithmeticOperation> getArithmeticOperation();

  /**
   * Returns the value of the '<em><b>Temp Variable R2</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.gimpleDsl.TempVariable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temp Variable R2</em>' containment reference list.
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getExpressionTemporarie_TempVariableR2()
   * @model containment="true"
   * @generated
   */
  EList<TempVariable> getTempVariableR2();

} // ExpressionTemporarie