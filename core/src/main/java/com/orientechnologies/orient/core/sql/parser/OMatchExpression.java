/* Generated By:JJTree: Do not edit this line. OMatchExpression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OMatchExpression extends SimpleNode {
  protected OMatchFilter         origin;
  protected List<OMatchPathItem> items = new ArrayList<OMatchPathItem>();

  public OMatchExpression(int id) {
    super(id);
  }

  public OMatchExpression(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  public void toString(Map<Object, Object> params, StringBuilder builder) {
    origin.toString(params, builder);
    for (OMatchPathItem item : items) {
      item.toString(params, builder);
    }
  }
}
/* JavaCC - OriginalChecksum=73491fb653c32baf66997290db29f370 (do not edit this line) */
