package syntax.statementexpression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.expression.Expression;
import syntax.statementexpression.StatementExpression;

import java.util.List;

/**
 * Methodenaufruf <br>
 * Ruft eine Methode mit dem Namen identifier und den Parametern der parameterList auf und gibt das
 * Ergebnis der Methode an den receiver zurück.
 * <pre>
 *     identifier(parameterList)
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MethodCall extends StatementExpression {
    String identifier;
    Expression receiver;
    List<Expression> parameterList;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }
}
