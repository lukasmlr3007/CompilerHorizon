package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class WhileStatement extends Statement {
    Expression expression;
    Block block;
}
