package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

/**
 * Null-Literal <br>
 * Datentyp für Null-Werte & -Objekte
 */
@Data
public class NullLiteral extends PartExpression implements CodeVisitor {

    public NullLiteral() {
        setType(null);
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
