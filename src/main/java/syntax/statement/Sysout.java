package syntax.statement;

import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.expression.Expression;
import syntax.statement.Statement;

@Data
public class Sysout extends Statement {

    Expression expression;

    public Sysout(Expression expr) {
        this.expression = expression;
    }

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
