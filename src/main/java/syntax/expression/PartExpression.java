package syntax.expression;

import bytecode.MethodBytecodeVisitor;

/**
 * abstrake übergeordnete Klasse
 */
public abstract class PartExpression extends Expression {

    public abstract void accept(MethodBytecodeVisitor visitor);
}
