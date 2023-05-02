package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Assign extends StatementExpression {
    Expression assignLeft;
    Expression assignRight;
}
