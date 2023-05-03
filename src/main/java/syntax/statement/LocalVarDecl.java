package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.statement.Statement;

// TODO
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LocalVarDecl extends Statement {
    private String identifier;
}
