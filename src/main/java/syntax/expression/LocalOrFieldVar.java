package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.BaseType;
import syntax.common.Type;

/**
 * TODO
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LocalOrFieldVar extends PartExpression implements CodeVisitor {
    String identifier;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
    public String fieldTypeToDescriptor(Type fieldType){
        if (fieldType == BaseType.INT){
            return "I";
        } else if (fieldType == BaseType.CHAR){
            return "C";
        } else if (fieldType == BaseType.BOOLEAN){
            return "Z";
        } else {
            return "L" + fieldType.getIdentifier();
        }
    }

}
