package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.AccessModifier;
import syntax.common.BaseType;
import syntax.common.Type;
import syntax.statement.Block;

import java.util.List;

import static org.objectweb.asm.Opcodes.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ConstructorDecl {

    // private AccessModifier accessModifier; TODO add public/private constructor
    private List<ParameterDecl> parameters;
    //private Type type;
    private Block block;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    public void generateBytecode(ClassWriter classWriter, String ownerClassName) {
        String descriptor = "(" + allParametersToString() + ")V";
        System.out.println(descriptor);

        MethodVisitor methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", descriptor, null, null);
        methodVisitor.visitCode();
        methodVisitor.visitVarInsn(ALOAD, 0);
        methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        block.generateBytecode(classWriter, methodVisitor);
        //methodVisitor.visitVarInsn(ALOAD, 0);
        //methodVisitor.visitInsn(ICONST_2);
        //methodVisitor.visitFieldInsn(PUTFIELD, "TestClass", "number", "I");
        methodVisitor.visitInsn(RETURN);
        methodVisitor.visitMaxs(2, 1);
        methodVisitor.visitEnd();


    }

    public String allParametersToString(){
        String params = "";
        for (ParameterDecl parameter : parameters){
            params = params + parameterTypeToDescriptor(parameter.getType());
        }
        return params;
    }

    public String parameterTypeToDescriptor(Type parameterType){
        if (parameterType == BaseType.VOID){
            return "V";
        } else if (parameterType == BaseType.INT){
            return "I";
        } else if (parameterType == BaseType.CHAR){
            return "C";
        } else if (parameterType == BaseType.BOOLEAN){
            return "B";
        } else {
            return parameterType.getIdentifier();
        }
    }
}
