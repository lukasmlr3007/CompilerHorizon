package syntax.statement;

import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.Type;

/**
 * Statement <br>
 * {@link Block}, {@link LocalVarDecl}, {@link StatementExpressionStatement}, {@link ReturnStatement}, {@link WhileStatement} oder {@link IfElseStatement}
 */
@Data
public abstract class Statement {

    private Type type;

    public abstract TypeCheckResult accept(ISemanticVisitor visitor);

    public abstract void accept(MethodBytecodeVisitor visitor);

}
