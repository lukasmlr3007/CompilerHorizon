package syntax.expression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;

/**
 * TODO
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LocalOrFieldVar extends Expression {
    String identifier;
}
