package syntax;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MethodCall extends StatementExpression{
    Expression expression;
    String name;
    List<Expression> expressionList;
}
