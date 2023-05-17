package syntax.statementexpression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
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

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
