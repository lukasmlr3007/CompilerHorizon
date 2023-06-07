package bytecode;

import syntax.structure.Program;

public interface ProgramBytecodeVisitor {
    void visit(Program program);
}
