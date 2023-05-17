package syntax.expression;

import lombok.Data;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

/**
 * keine Ahnung
 */
@Data
public abstract class BinaryExpression extends Expression {

    public abstract void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor);
}
