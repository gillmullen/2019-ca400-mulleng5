/* Generated By:JJTree: Do not edit this line. ASTif_statement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTif_statement extends SimpleNode {
  public ASTif_statement(int id) {
    super(id);
  }

  public ASTif_statement(HOPE4 p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(HOPE4Visitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=26520d6d0622654bbbec22b4a12e61d5 (do not edit this line) */
