package syntax.structure;

import bytecode.ClassBytecodeVisitor;
import bytecode.CodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.AccessModifier;
import syntax.common.BaseType;
import syntax.common.Type;

import static org.objectweb.asm.Opcodes.*;

/**
 * Feld-Deklaration <br>
 * Deklariert ein neues Feld mit dem Namen identifier vom Typ type.
 * <pre>
 *     z.B.: accessModifier type identifier;
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class FieldDecl implements CodeVisitor {

    private String identifier;
    private AccessModifier accessModifier;
    private Type type;
    private boolean isStatic;

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(ClassBytecodeVisitor visitor) {
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

    public String fieldTypeToDescriptor(Type fieldType) {
        if (fieldType == BaseType.INT) {
            return "I";
        } else if (fieldType == BaseType.CHAR) {
            return "C";
        } else if (fieldType == BaseType.BOOLEAN) {
            return "Z";
        } else {
            return "L" + fieldType.getIdentifier();
        }
    }
}
