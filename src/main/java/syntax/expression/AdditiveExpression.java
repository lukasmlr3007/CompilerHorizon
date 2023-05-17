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
public class AdditiveExpression extends BinaryExpression {
    String operator;
    Expression expressionLeft;
    Expression expressionRight;
}
