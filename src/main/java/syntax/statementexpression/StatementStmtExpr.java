package syntax.statementexpression;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.statement.Statement;

@Data
@RequiredArgsConstructor
public class StatementStmtExpr extends Statement {
    private StatementExpression statementExpression;

    public StatementStmtExpr(StatementExpression se) {
        this.statementExpression = se;
    }

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return null;
    }

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
