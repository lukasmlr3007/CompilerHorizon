package syntax.structure;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.BaseType;
import syntax.statement.Block;
import syntax.common.AccessModifier;
import syntax.common.Type;

import java.util.HashMap;
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

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    public void generateBytecode(ClassWriter classWriter) { //parameter übergeben und klasse übergeben
        HashMap<Integer, String> parameterMap = new HashMap<Integer, String>();
        int index = 0;
        for (ParameterDecl parameter: parameters) {
            parameterMap.put(index, parameter.getIdentifier());
            index++;
        }

        int accessModifierOpcode = accessModifierToOpcode(this.accessModifier);
        String returnTypeDescriptor = returnTypeToDescriptor(this.returnType);
        MethodVisitor methodVisitor = classWriter.visitMethod(accessModifierOpcode, identifier, returnTypeDescriptor, null, null);
        methodVisitor.visitCode();
        block.generateBytecode(classWriter, methodVisitor);
        //in block.generateBytecode methodVisitor.visitInsn(RETURN);
        methodVisitor.visitMaxs(0, 1);
        methodVisitor.visitEnd();

        //map mit parametern löschen
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

    public String returnTypeToDescriptor(Type returnType) {
        if (returnType == BaseType.VOID) {
            return "V()";
        } else if (returnType == BaseType.INT) {
            return "I()";
        } else if (returnType == BaseType.CHAR) {
            return "C()";
        } else if (returnType == BaseType.BOOLEAN) {
            return "B()";
        } else {
            return returnType.getIdentifier();
        }
    }
}
