package syntax.expression;

import lombok.Data;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.common.Type;

@Data
public abstract class Expression {
    private Type type;

    public abstract void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor);
}
