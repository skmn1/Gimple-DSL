/**
 * generated by Xtext 2.25.0
 */
package fr.ensma.gimpleDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getVariableDeclaration <em>Variable Declaration</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getVaraibleCall <em>Varaible Call</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getConstantDelaration <em>Constant Delaration</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getTempVariable <em>Temp Variable</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getStruct <em>Struct</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getLabelDef <em>Label Def</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getSwitchLabelDef <em>Switch Label Def</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getGoto <em>Goto</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getIf <em>If</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getExpressionTemporarie <em>Expression Temporarie</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getSwitchStatement <em>Switch Statement</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getDebugTag <em>Debug Tag</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getFunctionCall <em>Function Call</em>}</li>
 *   <li>{@link fr.ensma.gimpleDsl.Instruction#getAssignOp <em>Assign Op</em>}</li>
 * </ul>
 *
 * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Declaration</em>' containment reference.
   * @see #setVariableDeclaration(VariableDeclaration)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_VariableDeclaration()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariableDeclaration();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getVariableDeclaration <em>Variable Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Declaration</em>' containment reference.
   * @see #getVariableDeclaration()
   * @generated
   */
  void setVariableDeclaration(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Varaible Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varaible Call</em>' containment reference.
   * @see #setVaraibleCall(VariableCall)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_VaraibleCall()
   * @model containment="true"
   * @generated
   */
  VariableCall getVaraibleCall();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getVaraibleCall <em>Varaible Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varaible Call</em>' containment reference.
   * @see #getVaraibleCall()
   * @generated
   */
  void setVaraibleCall(VariableCall value);

  /**
   * Returns the value of the '<em><b>Constant Delaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant Delaration</em>' containment reference.
   * @see #setConstantDelaration(Declaration)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_ConstantDelaration()
   * @model containment="true"
   * @generated
   */
  Declaration getConstantDelaration();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getConstantDelaration <em>Constant Delaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant Delaration</em>' containment reference.
   * @see #getConstantDelaration()
   * @generated
   */
  void setConstantDelaration(Declaration value);

  /**
   * Returns the value of the '<em><b>Temp Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temp Variable</em>' containment reference.
   * @see #setTempVariable(TempVariable)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_TempVariable()
   * @model containment="true"
   * @generated
   */
  TempVariable getTempVariable();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getTempVariable <em>Temp Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temp Variable</em>' containment reference.
   * @see #getTempVariable()
   * @generated
   */
  void setTempVariable(TempVariable value);

  /**
   * Returns the value of the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' containment reference.
   * @see #setStruct(Struct)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_Struct()
   * @model containment="true"
   * @generated
   */
  Struct getStruct();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getStruct <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' containment reference.
   * @see #getStruct()
   * @generated
   */
  void setStruct(Struct value);

  /**
   * Returns the value of the '<em><b>Label Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Def</em>' containment reference.
   * @see #setLabelDef(LabelDef)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_LabelDef()
   * @model containment="true"
   * @generated
   */
  LabelDef getLabelDef();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getLabelDef <em>Label Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Def</em>' containment reference.
   * @see #getLabelDef()
   * @generated
   */
  void setLabelDef(LabelDef value);

  /**
   * Returns the value of the '<em><b>Switch Label Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Label Def</em>' containment reference.
   * @see #setSwitchLabelDef(SwitchLabelDef)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_SwitchLabelDef()
   * @model containment="true"
   * @generated
   */
  SwitchLabelDef getSwitchLabelDef();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getSwitchLabelDef <em>Switch Label Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch Label Def</em>' containment reference.
   * @see #getSwitchLabelDef()
   * @generated
   */
  void setSwitchLabelDef(SwitchLabelDef value);

  /**
   * Returns the value of the '<em><b>Goto</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goto</em>' containment reference.
   * @see #setGoto(Goto)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_Goto()
   * @model containment="true"
   * @generated
   */
  Goto getGoto();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getGoto <em>Goto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goto</em>' containment reference.
   * @see #getGoto()
   * @generated
   */
  void setGoto(Goto value);

  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(If)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_If()
   * @model containment="true"
   * @generated
   */
  If getIf();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(If value);

  /**
   * Returns the value of the '<em><b>Expression Temporarie</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression Temporarie</em>' containment reference.
   * @see #setExpressionTemporarie(ExpressionTemporarie)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_ExpressionTemporarie()
   * @model containment="true"
   * @generated
   */
  ExpressionTemporarie getExpressionTemporarie();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getExpressionTemporarie <em>Expression Temporarie</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression Temporarie</em>' containment reference.
   * @see #getExpressionTemporarie()
   * @generated
   */
  void setExpressionTemporarie(ExpressionTemporarie value);

  /**
   * Returns the value of the '<em><b>Switch Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch Statement</em>' containment reference.
   * @see #setSwitchStatement(SwitchStatment)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_SwitchStatement()
   * @model containment="true"
   * @generated
   */
  SwitchStatment getSwitchStatement();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getSwitchStatement <em>Switch Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch Statement</em>' containment reference.
   * @see #getSwitchStatement()
   * @generated
   */
  void setSwitchStatement(SwitchStatment value);

  /**
   * Returns the value of the '<em><b>Debug Tag</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug Tag</em>' containment reference.
   * @see #setDebugTag(DebugTag)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_DebugTag()
   * @model containment="true"
   * @generated
   */
  DebugTag getDebugTag();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getDebugTag <em>Debug Tag</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug Tag</em>' containment reference.
   * @see #getDebugTag()
   * @generated
   */
  void setDebugTag(DebugTag value);

  /**
   * Returns the value of the '<em><b>Function Call</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Call</em>' containment reference.
   * @see #setFunctionCall(FunctionCall)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_FunctionCall()
   * @model containment="true"
   * @generated
   */
  FunctionCall getFunctionCall();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getFunctionCall <em>Function Call</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Call</em>' containment reference.
   * @see #getFunctionCall()
   * @generated
   */
  void setFunctionCall(FunctionCall value);

  /**
   * Returns the value of the '<em><b>Assign Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign Op</em>' containment reference.
   * @see #setAssignOp(AssignOperation)
   * @see fr.ensma.gimpleDsl.GimpleDslPackage#getInstruction_AssignOp()
   * @model containment="true"
   * @generated
   */
  AssignOperation getAssignOp();

  /**
   * Sets the value of the '{@link fr.ensma.gimpleDsl.Instruction#getAssignOp <em>Assign Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign Op</em>' containment reference.
   * @see #getAssignOp()
   * @generated
   */
  void setAssignOp(AssignOperation value);

} // Instruction
