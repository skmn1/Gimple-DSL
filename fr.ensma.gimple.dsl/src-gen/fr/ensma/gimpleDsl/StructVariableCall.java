/**
 * generated by Xtext 2.25.0
 */
package fr.ensma.gimpleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Variable Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.gimpleDsl.StructVariableCall#getCalledStructVariable <em>Called Struct Variable</em>}</li>
 * </ul>
 *
 * @see fr.ensma.gimpleDsl.GimpleDslPackage#getStructVariableCall()
 * @model
 * @generated
 */
public interface StructVariableCall extends EObject
{
  /**
   * Returns the value of the '<em><b>Called Struct Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Called Struct Variable</em>' reference.
   * @see #setCalledStructVariable(Struct)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getStructVariableCall_CalledStructVariable()
   * @model
   * @generated
   */
  Struct getCalledStructVariable();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.StructVariableCall#getCalledStructVariable <em>Called Struct Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Called Struct Variable</em>' reference.
   * @see #getCalledStructVariable()
   * @generated
   */
  void setCalledStructVariable(Struct value);

} // StructVariableCall