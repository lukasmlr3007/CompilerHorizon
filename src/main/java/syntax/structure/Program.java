package syntax.structure;

import bytecode.CodeVisitor;
import bytecode.ProgramBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Programm <br>
 * Alleinstehendes Java-Programm, das alle Klassen-Deklarationen enthält.
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Program implements CodeVisitor {

    private List<ClassDecl> classDeclarations;

    public void generateBytecode() {
        for (ClassDecl oneClass : classDeclarations) {
            byte[] bytecode = oneClass.generateBytecode();
            try (FileOutputStream fos = new FileOutputStream("./src/main/java/output/" + oneClass.getIdentifier() + ".class")) {
                fos.write(bytecode);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void accept(ProgramBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}