package syntax.statement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.statement.Statement;
import syntax.structure.FieldDecl;

import java.util.List;

/**
 * Block <br>
 * Code-Block, der eine Liste von Statements enthält.
 * <pre>
 *     { statementList }
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Block extends Statement {
    private List<Statement> statementList;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor){
        for (Statement statement : statementList){
            statement.generateBytecode(classWriter, methodVisitor);
        }
        //TODO tabelle mit local vars wieder löschen
    }
}
