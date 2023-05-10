package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.*;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

import java.util.List;

import static org.objectweb.asm.Opcodes.*;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ClassDecl {
    private List<FieldDecl> fieldDeclList;
    private List<MethodDecl> methodDeclList;
    private List<ConstructorDecl> constructorDeclList;
    private String identifier;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    public byte[] generateBytecode() {

        ClassWriter classWriter = new ClassWriter(0);
        FieldVisitor fieldVisitor;
        RecordComponentVisitor recordComponentVisitor;
        MethodVisitor methodVisitor;
        AnnotationVisitor annotationVisitor0;

        classWriter.visit(V17, ACC_SUPER, identifier, null, "java/lang/Object", null);

        if (constructorDeclList.isEmpty()){
            methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
            methodVisitor.visitCode();
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMaxs(1, 1);
            methodVisitor.visitEnd();
        } else {
            //generate ConstructorDecl
        }
        for (FieldDecl fieldDecl : fieldDeclList){

            fieldDecl.generateBytecode(classWriter, fieldDecl);

        }
        classWriter.visitEnd();

        return classWriter.toByteArray();
    }
}