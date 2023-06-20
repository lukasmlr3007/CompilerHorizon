package syntax.statementexpression;

import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.expression.PartExpression;

/**
 * Statement-Expression <br>
 * {@link MethodCall}, {@link Assign} oder {@link New}
 */
@Data
public abstract class StatementExpression extends PartExpression {

    public abstract TypeCheckResult accept(ISemanticVisitor visitor);

    public abstract void accept(MethodBytecodeVisitor visitor);
}
