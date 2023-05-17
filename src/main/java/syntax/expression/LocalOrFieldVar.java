package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.Expression;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LocalOrFieldVar extends PartExpression {
    String identifier;

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
