package syntax.expression;

import bytecode.MethodBytecodeVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

/**
 * keine Ahnung
 */
public abstract class PartExpression extends Expression {

    public abstract void accept(MethodBytecodeVisitor visitor);
}
