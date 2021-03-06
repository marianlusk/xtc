//
// Generated by JTB 1.2.2
//

package xtc.lang.javacc.syntaxtree;

/**
 * Grammar production.
 * <pre>
 * f0 -> Initializer()
 *       | NestedClassDeclaration()
 *       | NestedInterfaceDeclaration()
 *       | ConstructorDeclaration()
 *       | MethodDeclaration()
 *       | FieldDeclaration()
 *       | ";"
 * </pre>
 */
public class ClassBodyDeclaration implements Node {
   public NodeChoice f0;

   public ClassBodyDeclaration(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(xtc.lang.javacc.visitor.Visitor v) {
      v.visit(this);
   }
   public Object accept(xtc.lang.javacc.visitor.ObjectVisitor v, Object argu) {
      return v.visit(this,argu);
   }
}

