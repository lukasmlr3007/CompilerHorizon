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

    public Block(List<Statement> statements){
        this.statementList = statements;
    }

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }
}
