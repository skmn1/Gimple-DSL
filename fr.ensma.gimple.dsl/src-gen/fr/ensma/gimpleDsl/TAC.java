/**
 * generated by Xtext 2.25.0
 */
package fr.ensma.gimpleDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.gimpleDsl.TAC#getFunctionDef <em>Function Def</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.TAC#getCommentLine <em>Comment Line</em>}</li>
 * </ul>
 *
 * @see fr.ensma.gimpleDsl.GimpleDslPackage#getTAC()
 * @model
 * @generated
 */
public interface TAC extends EObject
{
  /**
   * Returns the value of the '<em><b>Function Def</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.gimpleDsl.FunctionDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Def</em>' containment reference list.
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getTAC_FunctionDef()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDef> getFunctionDef();

  /**
   * Returns the value of the '<em><b>Comment Line</b></em>' containment reference list.
   * The list contents are of type {@link fr.ensma.gimpleDsl.CommentLine}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment Line</em>' containment reference list.
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getTAC_CommentLine()
   * @model containment="true"
   * @generated
   */
  EList<CommentLine> getCommentLine();

} // TAC
