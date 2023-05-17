package syntax.statement;

import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

/**
 * Statement <br>
 * {@link Block}, {@link LocalVarDecl}, {@link StatementExpressionStatement}, {@link ReturnStatement}, {@link WhileStatement} oder {@link IfElseStatement}
 */
@Data
public abstract class Statement {

    public abstract TypeCheckResult accept(ISemanticVisitor visitor);

    public abstract void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor);
}
