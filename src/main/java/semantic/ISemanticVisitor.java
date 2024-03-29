package semantic;

import syntax.statement.Sysout;
import syntax.expression.*;
import syntax.statement.*;
import syntax.statementexpression.Assign;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.statementexpression.StatementStmtExpr;
import syntax.structure.*;

public interface ISemanticVisitor {

    // blockinit, blockvoid, blocklocalvardecl
    // for-Schleife?

    TypeCheckResult check(Program toCheck);

    // declarations
    TypeCheckResult check(ClassDecl toCheck);

    TypeCheckResult check(MethodDecl toCheck);

    TypeCheckResult check(ParameterDecl toCheck);

    TypeCheckResult check(ConstructorDecl toCheck);

    TypeCheckResult check(FieldDecl toCheck);

    // statements
    TypeCheckResult check(Block toCheck);

    TypeCheckResult check(StatementExpressionStatement toCheck);

    TypeCheckResult check(LocalVarDecl toCheck);

    TypeCheckResult check(ReturnStatement toCheck);

    TypeCheckResult check(IfElseStatement toCheck);

    TypeCheckResult check(WhileStatement toCheck);

    // statement expressions
    TypeCheckResult check(MethodCall toCheck);

    TypeCheckResult check(Assign toCheck);

    TypeCheckResult check(New toCheck);

    // expressions
    TypeCheckResult check(StatementExpressionExpression toCheck);

    TypeCheckResult check(LocalOrFieldVar toCheck);

    TypeCheckResult check(InstVar toCheck);

    TypeCheckResult check(This toCheck);

    TypeCheckResult check(NullLiteral toCheck);

    TypeCheckResult check(Unary toCheck);

    TypeCheckResult check(IntegerLiteral toCheck);

    TypeCheckResult check(CharLiteral toCheck);

    TypeCheckResult check(BoolLiteral toCheck);

    // TypeCheckResult check(BinaryExpression toCheck);

    TypeCheckResult check(AdditiveExpression toCheck);

    TypeCheckResult check(LogicalExpression toCheck);

    TypeCheckResult check(RelationalExpression toCheck);

    TypeCheckResult check(StatementStmtExpr toCheck);

    TypeCheckResult check(MyMain toCheck);

    TypeCheckResult check(Sysout toCheck);
}
