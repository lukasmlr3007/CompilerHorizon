package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class RelationalExpression extends BinaryExpression {
    String operator;
    PartExpression expressionLeft;
    Expression expressionRight;
}
