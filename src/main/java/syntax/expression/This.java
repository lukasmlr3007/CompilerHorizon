package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

/**
 * This <br>
 * Schlüsselwort um die aktuelle Klassen-Instanz zu referenzieren.
 */
@Data
@AllArgsConstructor
public class This extends PartExpression implements CodeVisitor {

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
