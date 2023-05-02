package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class InstVar extends Expression {
    Expression expression;
    String identifier;
}
