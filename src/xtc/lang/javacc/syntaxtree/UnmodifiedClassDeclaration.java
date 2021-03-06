//
// Generated by JTB 1.2.2
//

package xtc.lang.javacc.syntaxtree;

/**
 * Grammar production.
 * <pre>
 * f0 -> "class"
 * f1 -> &lt;IDENTIFIER&gt;
 * f2 -> [ "extends" Name() ]
 * f3 -> [ "implements" NameList() ]
 * f4 -> ClassBody()
 * </pre>
 */
public class UnmodifiedClassDeclaration implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public NodeOptional f2;
   public NodeOptional f3;
   public ClassBody f4;

   public UnmodifiedClassDeclaration(NodeToken n0, NodeToken n1, NodeOptional n2, NodeOptional n3, ClassBody n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
   }

   public UnmodifiedClassDeclaration(NodeToken n0, NodeOptional n1, NodeOptional n2, ClassBody n3) {
      f0 = new NodeToken("class");
      f1 = n0;
      f2 = n1;
      f3 = n2;
      f4 = n3;
   }

   public void accept(xtc.lang.javacc.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(xtc.lang.javacc.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

