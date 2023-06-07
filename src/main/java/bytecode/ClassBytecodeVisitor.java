package bytecode;

import syntax.structure.ClassDecl;
import syntax.structure.FieldDecl;

public interface ClassBytecodeVisitor {
    void visit(ClassDecl myclass);
    void visit(FieldDecl field);
}
