/* Generated By:JJTree: Do not edit this line. OArrayNumberSelector.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.command.OCommandContext;
import com.orientechnologies.orient.core.db.record.OIdentifiable;

import java.util.Map;

public class OArrayNumberSelector extends SimpleNode {
  private static final Object UNSET           = new Object();
  private Object              inputFinalValue = UNSET;

  OInputParameter             inputValue;

  OMathExpression             expressionValue;

  Integer                     integer;

  public OArrayNumberSelector(int id) {
    super(id);
  }

  public OArrayNumberSelector(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public void toString(Map<Object, Object> params, StringBuilder builder) {
    if (inputValue != null) {
      inputValue.toString(params, builder);
    } else if (expressionValue != null) {
      expressionValue.toString(params, builder);
    } else if (integer != null) {
      builder.append(integer);
    }
  }

  public Integer getValue(OIdentifiable iCurrentRecord, Object iResult, OCommandContext ctx) {
    Object result = null;
    if (inputValue != null) {
      result = inputValue.bindFromInputParams(ctx.getInputParameters());
    } else if (expressionValue != null) {
      result = expressionValue.execute(iCurrentRecord, ctx);
    } else if (integer != null) {
      result = integer;
    }

    if (result == null) {
      return null;
    }
    if (result instanceof Number) {
      return ((Number) result).intValue();
    }
    return null;
  }

}
/* JavaCC - OriginalChecksum=5b2e495391ede3ccdc6c25aa63c8e591 (do not edit this line) */
