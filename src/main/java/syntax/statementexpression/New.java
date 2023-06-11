package syntax.statementexpression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.Expression;
import syntax.expression.PartExpression;

import java.util.List;

/**
 * Objekt-Erstellung / New <br>
 * Erstellt ein neues Objekt vom Typ identifier mit den Parametern der parameterList
 * <pre>
 *     z.B.: new identifier(paramterList)
 * </pre>
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class New extends StatementExpression implements CodeVisitor {
    private List<Expression> parameterList;
    private String identifier;

    public TypeCheckResult accept(ISemanticVisitor visitor) {
        return visitor.check(this);
    }

    @Override
    public void accept(MethodBytecodeVisitor visitor) {
        visitor.visit(this);
    }

    public String allParametersToString(){
        String params = "";
        for (Expression parameter : parameterList){
            params = params + "V()";
        }
        return params;
    }
}
