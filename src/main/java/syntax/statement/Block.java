package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.statement.Statement;

import java.util.List;

/**
 * Block <br>
 * Code-Block, der eine Liste von Statements enthält.
 * <pre>
 *     { statementList }
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Block extends Statement {
    private List<Statement> statementList;
}
