//
// Generated by JTB 1.2.2
//

package xtc.lang.javacc.syntaxtree;

/**
 * Grammar production.
 * <pre>
 * f0 -> StatementExpression()
 * f1 -> ( "," StatementExpression() )*
 * </pre>
 */
public class StatementExpressionList implements Node {
   public StatementExpression f0;
   public NodeListOptional f1;

   public StatementExpressionList(StatementExpression n0, NodeListOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(xtc.lang.javacc.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(xtc.lang.javacc.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

