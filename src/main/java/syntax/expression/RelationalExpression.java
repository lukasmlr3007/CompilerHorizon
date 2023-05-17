package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * keine Ahnung
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class RelationalExpression extends BinaryExpression {
    String operator;
    PartExpression expressionLeft;
    Expression expressionRight;
}
