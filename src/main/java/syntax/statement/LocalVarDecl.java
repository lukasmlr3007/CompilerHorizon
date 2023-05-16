package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import syntax.common.Type;
import syntax.statement.Statement;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LocalVarDecl extends Statement {
    private Type type;
    private String identifier;
}
