package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.statement.Statement;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Block extends Statement {
    private List<Statement> statementList;
}
