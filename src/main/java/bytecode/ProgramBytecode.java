package bytecode;

import lombok.Getter;
import syntax.structure.ClassDecl;
import syntax.structure.Program;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Getter
public class ProgramBytecode implements ProgramBytecodeVisitor {

    private byte[] bytecode;

    @Override
    public void visit(Program program) {
        List<ClassDecl> classDeclarations = program.getClassDeclarations();
        for(ClassDecl myclass : classDeclarations){
            ClassBytecode classGen = new ClassBytecode();
            myclass.accept(classGen);
            //Write to class File
            bytecode = classGen.getBytecode();
            try (FileOutputStream fos = new FileOutputStream(myclass.getIdentifier() + ".class")) {
                fos.write(bytecode);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}
