package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

@Data
@AllArgsConstructor
public class NullLiteral extends PartExpression {

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
