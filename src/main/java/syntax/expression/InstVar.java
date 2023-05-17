package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;

/**
 * Instanz-Variable <br>
 * Aufruf einer Variable oder Methode aus einer Variable heraus.
 * <pre>
 *     this.x;
 *     this.x.print();
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class InstVar extends PartExpression {
    Expression expression;
    String identifier;
}
