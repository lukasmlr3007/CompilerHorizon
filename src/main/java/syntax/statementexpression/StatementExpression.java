package syntax.statementexpression;

import lombok.Data;
import syntax.expression.Expression;

/**
 * Statement-Expression <br>
 * {@link MethodCall}, {@link Assign} oder {@link New}
 */
@Data
public abstract class StatementExpression extends Expression { // TODO extends Statement ?
}
