package syntax.structure;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.BaseType;
import syntax.common.Type;
import syntax.statement.Block;

import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ConstructorDecl implements CodeVisitor {

    private List<ParameterDecl> parameters;
    private Block block;
    private Type type;

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }

    public String returnAndParameterTypeToDescriptor(List<ParameterDecl> parameters) {
        String descriptor = "(";
        if (parameters != null && parameters.size() > 0){
            for (ParameterDecl parameter : parameters){
                descriptor = descriptor + typeToString(parameter.getType());
            }
        }
        descriptor = descriptor + ")V";
        return descriptor;
    }

    public String typeToString(Type type){
        if (type == BaseType.VOID) {
            return "V";
        } else if (type == BaseType.INT) {
            return "I";
        } else if (type == BaseType.CHAR) {
            return "C";
        } else if (type == BaseType.BOOLEAN) {
            return "Z";
        } else {
            return "L" + type.getIdentifier();
        }
    }
}
