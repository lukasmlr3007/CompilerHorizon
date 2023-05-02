package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.expression.Expression;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class IfElseStatement extends Statement {
    Expression condition;
    Block IfBlock;
    Block elseBlock;
}
