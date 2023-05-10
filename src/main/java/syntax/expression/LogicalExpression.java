package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LogicalExpression extends Expression {
    String operator;
    Expression expressionLeft;
    Expression expressionRight;
}
