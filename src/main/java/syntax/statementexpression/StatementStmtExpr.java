package syntax.statementexpression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.statement.Statement;

@Data
@RequiredArgsConstructor
public class StatementStmtExpr extends Statement implements CodeVisitor {
    private StatementExpression statementExpression;

    public StatementStmtExpr(StatementExpression se) {
        this.statementExpression = se;
    }

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
