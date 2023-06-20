package syntax.structure;

import bytecode.CodeVisitor;
import bytecode.ProgramBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;

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

    @Override
    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(ProgramBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}