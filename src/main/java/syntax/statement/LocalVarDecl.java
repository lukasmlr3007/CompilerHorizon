package syntax.statement;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.Type;

/**
 * TODO
 */
@Data
public class LocalVarDecl extends Statement implements CodeVisitor {

    private String identifier;

    public LocalVarDecl(String identifier, Type type) {
        this.identifier = identifier;
        setType(type);
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
