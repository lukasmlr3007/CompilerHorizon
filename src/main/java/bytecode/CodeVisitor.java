package bytecode;

import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

public interface CodeVisitor {
    default void accept(ProgramBytecodeVisitor visitor) {
    }

    default void accept(ClassBytecodeVisitor visitor) {
    }

    default void accept(MethodBytecodeVisitor visitor) {
    }

    TypeCheckResult accept(ISemanticVisitor visitor);
}
