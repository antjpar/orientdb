/* Generated By:JJTree: Do not edit this line. OUpdateItem.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public class OUpdateItem extends SimpleNode {
  public static final int OPERATOR_EQ          = 0;
  public static final int OPERATOR_PLUSASSIGN  = 1;
  public static final int OPERATOR_MINUSASSIGN = 2;
  public static final int OPERATOR_STARASSIGN  = 3;
  public static final int OPERATOR_SLASHASSIGN = 4;

  protected OIdentifier   left;
  protected OModifier     leftModifier;
  protected int           operator;
  protected OExpression   right;

  public OUpdateItem(int id) {
    super(id);
  }

  public OUpdateItem(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }


  public void toString(Map<Object, Object> params, StringBuilder builder) {
    left.toString(params, builder);
    if (leftModifier != null) {
      leftModifier.toString(params, builder);
    }
    switch (operator) {
    case OPERATOR_EQ:
      builder.append(" = ");
      break;
    case OPERATOR_PLUSASSIGN:
      builder.append(" += ");
      break;
    case OPERATOR_MINUSASSIGN:
      builder.append(" -= ");
      break;
    case OPERATOR_STARASSIGN:
      builder.append(" *= ");
      break;
    case OPERATOR_SLASHASSIGN:
      builder.append(" /= ");
      break;

    }
    right.toString(params, builder);
  }
}
/* JavaCC - OriginalChecksum=df7444be87bba741316df8df0d653600 (do not edit this line) */
