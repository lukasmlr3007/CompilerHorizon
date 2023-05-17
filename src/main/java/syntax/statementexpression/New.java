package syntax.statementexpression;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.common.Type;
import syntax.expression.Expression;
import syntax.statementexpression.StatementExpression;

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
public class New extends StatementExpression {
    private List<Expression> paramterList;
    private String identifier;

    @Override
    public void generateBytecode(ClassWriter classWriter, MethodVisitor methodVisitor) {

    }
}
