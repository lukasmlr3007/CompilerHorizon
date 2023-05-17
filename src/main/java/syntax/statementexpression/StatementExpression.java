package syntax.statementexpression;

import lombok.Data;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.PartExpression;

/**
 * Statement-Expression <br>
 * {@link MethodCall}, {@link Assign} oder {@link New}
 */
@Data
public abstract class StatementExpression extends PartExpression {
    public abstract void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor);
}
