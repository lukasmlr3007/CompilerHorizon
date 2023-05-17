package syntax.statementexpression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.Expression;
import syntax.statementexpression.StatementExpression;

/**
 * Assign / Wertzuweisung <br>
 * Überschreibt die assignLeft-Expression mit dem Wert der assignRight
 * <pre>
 *     assignLeft = assignRight
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Assign extends StatementExpression {
    Expression assignLeft;
    Expression assignRight;

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
