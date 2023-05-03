package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.Operator;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Unary extends Expression {
    Operator operator;
    Expression expression;
}