package syntax.statementexpression;

import lombok.Data;
import syntax.expression.Expression;
import syntax.expression.PartExpression;

/**
 * Statement-Expression <br>
 * {@link MethodCall}, {@link Assign} oder {@link New}
 */
@Data
public abstract class StatementExpression extends PartExpression { // TODO extends Statement ?
}
