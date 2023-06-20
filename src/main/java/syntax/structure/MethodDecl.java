package syntax.structure;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.BaseType;
import syntax.statement.Block;
import syntax.common.AccessModifier;
import syntax.common.Type;

import java.util.List;

import static org.objectweb.asm.Opcodes.*;

/**
 * Methoden-Deklaration <br>
 * Deklariert eine neue Methode vom Namen identifier mit dem Rückgabetyp returnType.
 * <pre>
 *     z.B.: accessModifier staticModifier returnType identifier(paramters) {
 *         block
 *     }
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class MethodDecl implements CodeVisitor {

    private Type returnType;
    private String identifier;
    private List<ParameterDecl> parameters;
    private Block block;
    private AccessModifier accessModifier;
    private boolean staticModifier;

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }

    public int accessModifierToOpcode(AccessModifier accessModifier) {
        if (accessModifier == AccessModifier.PUBLIC) {
            return ACC_PUBLIC;
        } else if (accessModifier == AccessModifier.PRIVATE) {
            return ACC_PRIVATE;
        } else if (accessModifier == AccessModifier.PROTECTED) {
            return ACC_PROTECTED;
        } else {
            return 0;
        }
    }

    public String returnAndParameterTypeToDescriptor(List<ParameterDecl> parameters, Type returnType) {
        String descriptor = "(";
        if (parameters.size() > 0){
            for (ParameterDecl parameter : parameters){
                descriptor = descriptor + typeToString(parameter.getType());
            }
        }
        descriptor = descriptor + ")";

        descriptor = descriptor + typeToString(returnType);

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
