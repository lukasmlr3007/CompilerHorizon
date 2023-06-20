package syntax.expression;

import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

/**
 * keine Ahnung
 */
@Data
public abstract class BinaryExpression extends Expression {

    public abstract TypeCheckResult accept(ISemanticVisitor visitor);

    public abstract void accept(MethodBytecodeVisitor visitor);
}
