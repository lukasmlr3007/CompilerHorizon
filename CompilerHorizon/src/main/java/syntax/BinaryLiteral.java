package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class BinaryLiteral extends Expression {
    String operator;
    Expression expressionLeft;
    Expression expressionRight;
}
