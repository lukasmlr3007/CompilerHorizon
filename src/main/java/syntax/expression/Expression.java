package syntax.expression;

import bytecode.CodeVisitor;
import bytecode.MethodBytecodeVisitor;
import lombok.Data;
import semantic.ISemanticVisitor;
import semantic.TypeCheckResult;
import syntax.common.Type;
import syntax.statementexpression.Assign;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.statementexpression.StatementExpression;

/**
 * Expression <br>
 * Funktionen: {@link MethodCall}, {@link InstVar}, {@link LocalOrFieldVar}, {@link Assign}, {@link This},
 *  {@link New}, {@link Unary} <br>
 * Literale: {@link IntegerLiteral}, {@link CharLiteral}, {@link BoolLiteral}, {@link NullLiteral} <br>
 * Basic Expressions: {@link PartExpression}, {@link LogicalExpression}, {@link AdditiveExpression},
 *  {@link RelationalExpression} <br>
 * Advanced Expressions: {@link BinaryExpression}, {@link StatementExpression}, {@link StatementExpressionExpression}
 */
@Data
public abstract class Expression implements CodeVisitor {
    private Type type;

    public abstract TypeCheckResult accept(ISemanticVisitor visitor);

    public abstract void accept(MethodBytecodeVisitor visitor);

}
