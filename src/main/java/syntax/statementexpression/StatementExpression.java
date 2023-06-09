package syntax.statementexpression;

import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.PartExpression;
import syntax.statement.Statement;

/**
 * Statement-Expression <br>
 * {@link MethodCall}, {@link Assign} oder {@link New}
 */
@Data
public abstract class StatementExpression extends PartExpression {

    public abstract void accept(MethodBytecodeVisitor visitor);
    public abstract void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor);
}
