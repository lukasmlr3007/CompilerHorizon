package syntax.expression;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

/**
 * keine Ahnung
 */
public abstract class PartExpression extends Expression {

    public abstract void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor);
}
