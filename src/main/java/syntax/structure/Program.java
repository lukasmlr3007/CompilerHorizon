package syntax.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.context.Context;

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
public class Program {

    private List<ClassDecl> classDeclarations;

    public Program(List<ClassDecl> classes) {
        this.classDeclarations = classes;
    }

    //genratebytecode für jede klasse in classDeclarations aufrufen und in datei schreiben (fileoutput)

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
}