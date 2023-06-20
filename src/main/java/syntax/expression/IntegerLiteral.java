package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.BaseType;

@Data
@RequiredArgsConstructor
public class IntegerLiteral extends PartExpression implements CodeVisitor {
    int value;

    public IntegerLiteral(int value) {
        this.value = value;
        setType(BaseType.INT);
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
