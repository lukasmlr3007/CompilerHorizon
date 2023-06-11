package bytecode;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import syntax.structure.ClassDecl;
import syntax.structure.ConstructorDecl;
import syntax.structure.FieldDecl;

public class ClassBytecode implements ClassBytecodeVisitor {
    private ClassWriter classWriter;

    ClassBytecode() {
        this.classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
    }

    public byte[] getBytecode() {
        return classWriter.toByteArray();
    }

    @Override
    public void visit(ClassDecl myclass) {
        classWriter.visit(Opcodes.V1_5, Opcodes.ACC_PUBLIC, myclass.getIdentifier(), null, "java/lang/Object", null);

        if (myclass.getFieldDeclList() != null){
            myclass.getFieldDeclList().forEach(field -> field.accept(this));
        }

        if (myclass.getConstructorDeclList().isEmpty()) {
            new ConstructorDecl().accept(new MethodBytecode(myclass.getIdentifier(), classWriter));
        } else {
            myclass.getConstructorDeclList().forEach(constructor -> constructor.accept(new MethodBytecode(myclass.getIdentifier(), classWriter)));
        }

        if (myclass.getMethodDeclList() != null){
            myclass.getMethodDeclList().forEach(method -> method.accept(new MethodBytecode(myclass.getIdentifier(), classWriter)));
        }


        classWriter.visitEnd();
    }

    @Override
    public void visit(FieldDecl field) {
        classWriter.visitField(field.accessModifierToOpcode(field.getAccessModifier()), field.getIdentifier(), field.returnTypeToDescriptor(field.getType()), null, null).visitEnd();
    }
}
