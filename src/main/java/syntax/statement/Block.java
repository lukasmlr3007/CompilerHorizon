package syntax.statement;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.statement.Statement;
import syntax.structure.FieldDecl;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

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
public class Block extends Statement implements CodeVisitor {
    private List<Statement> statementList;
    public HashMap<Integer, String> localVarsInBlock;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor){
        //localVarsInBlock = parameterMap;
        for (Statement statement : statementList){
            if (statement.getClass() == LocalVarDecl.class){
                //localVarsInBlock.put()
            }
            System.out.println("Stack Lokale Variablen:");
            System.out.println(localVarsInBlock);
            statement.generateBytecode(classWriter, methodVisitor);
        }
        //Lokale Variablen aus dem Block wieder löschen, da man sie wo anders ja nicht verwenden kann
        localVarsInBlock.clear();
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
