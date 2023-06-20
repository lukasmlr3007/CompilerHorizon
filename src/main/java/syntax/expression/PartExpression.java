package syntax.expression;

import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

/**
 * abstrake übergeordnete Klasse
 */
@Data
public abstract class PartExpression extends Expression {

    public abstract TypeCheckResult accept(ISemanticVisitor visitor);

    public abstract void accept(MethodBytecodeVisitor visitor);
}
