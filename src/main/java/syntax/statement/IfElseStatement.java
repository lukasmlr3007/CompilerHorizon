package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;

/**
 * If-Else-Block <br>
 * Ist die condition wahr, so wird der ifBlock ausgeführt, ansonsten der elseBlock.
 * <pre>
 *     if (condition) ifBlock else elseBlock
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class IfElseStatement extends Statement {
    Expression condition;
    Block ifBlock;
    Block elseBlock;
}
