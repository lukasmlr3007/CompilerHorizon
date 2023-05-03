package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;

/**
 * While-Schleife <br>
 * While-Funktion, die je nach der expression den Code des block's ausführt.
 * <pre>
 *     while (expression) block
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class WhileStatement extends Statement {
    Expression expression;
    Block block;
}
