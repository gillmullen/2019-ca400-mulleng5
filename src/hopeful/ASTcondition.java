/* Generated By:JJTree: Do not edit this line. ASTcondition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTcondition extends SimpleNode {
  public ASTcondition(int id) {
    super(id);
  }

  public ASTcondition(HOPEFUL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HOPEFULVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=cdc33be0f328973a72530633b47f6a7b (do not edit this line) */