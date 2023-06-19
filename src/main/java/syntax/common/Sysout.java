package syntax.common;

import bytecode.MethodBytecodeVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.expression.Expression;
import syntax.statement.Statement;

public class Sysout extends Statement {
    Expression expr;

    public Sysout(Expression expr) {
        this.expr = expr;
    }

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return null;
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {

    }
}
