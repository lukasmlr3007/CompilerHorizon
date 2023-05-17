package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.Expression;
import syntax.statementexpression.StatementExpression;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class StatementExpressionExpression extends Expression {
    private StatementExpression statementExpression;

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
