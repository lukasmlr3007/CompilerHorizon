package bytecode;

public interface CodeVisitor {
    default void accept(ProgramBytecodeVisitor visitor) {
    }

    default void accept(ClassBytecodeVisitor visitor) {
    }

    default void accept(MethodBytecodeVisitor visitor) {
    }
}
