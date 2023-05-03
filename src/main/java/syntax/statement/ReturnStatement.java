package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;

/**
 * Return <br>
 * Return-Funktion, die die expression zurückgibt.
 * <pre>
 *     return expression
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ReturnStatement extends Statement {
    Expression expression;
}
