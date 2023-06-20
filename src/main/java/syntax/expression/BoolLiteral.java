package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.BaseType;

/**
 * Boolean-Literal <br>
 * Datentyp für true, false
 */
@Data
@RequiredArgsConstructor
public class BoolLiteral extends PartExpression implements CodeVisitor {
    boolean value;

    public BoolLiteral(boolean value) {
        this.value = value;
        setType(BaseType.BOOLEAN);
    }

    public boolean getValue(){
        return value;
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
