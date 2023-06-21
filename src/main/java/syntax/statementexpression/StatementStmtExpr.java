package syntax.statementexpression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.statement.Statement;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class StatementStmtExpr extends Statement implements CodeVisitor {

    private StatementExpression statementExpression;

    public void test() { setType(null); }

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
