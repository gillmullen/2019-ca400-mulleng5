/* Generated By:JavaCC: Do not edit this line. HOPE3Visitor.java Version 5.0 */
public interface HOPE3Visitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTprogram node, Object data);
  public Object visit(ASTstatement_block node, Object data);
  public Object visit(ASTstatement node, Object data);
  public Object visit(ASTexpression node, Object data);
  public Object visit(ASTinteger node, Object data);
  public Object visit(ASTstring node, Object data);
  public Object visit(ASTbool node, Object data);
  public Object visit(ASTassignment node, Object data);
  public Object visit(ASTdeclaration node, Object data);
  public Object visit(ASTprint node, Object data);
  public Object visit(ASTlhs_identifier node, Object data);
  public Object visit(ASTrhs_identifier node, Object data);
  public Object visit(ASTtype node, Object data);
  public Object visit(ASTbinary_arith_op node, Object data);
  public Object visit(ASTbinary_logic_op node, Object data);
}
/* JavaCC - OriginalChecksum=99a86e5a12acbcd846ff3bff65388c2f (do not edit this line) */