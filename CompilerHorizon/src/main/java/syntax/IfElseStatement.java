package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class IfElseStatement extends Statement{
    Expression condition;
    Block IfBlock;
    Block elseBlock;
}
