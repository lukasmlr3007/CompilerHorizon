package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

@Data
public abstract class BinaryExpression extends Expression{
    public abstract void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor);
}
