package bytecode;

import syntax.expression.*;
import syntax.statement.*;
import syntax.statementexpression.Assign;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.statementexpression.StatementStmtExpr;
import syntax.structure.ConstructorDecl;
import syntax.structure.MethodDecl;
import syntax.structure.ParameterDecl;

public interface MethodBytecodeVisitor {
    void visit(AdditiveExpression additiveExpression);

    void visit(BoolLiteral boolLiteral);

    void visit(CharLiteral charLiteral);

    void visit(InstVar instVar);

    void visit(IntegerLiteral integerLiteral);

    void visit(LocalOrFieldVar localOrFieldVar);

    void visit(LogicalExpression logicalExpression);

    void visit(NullLiteral nullLiteral);

    void visit(RelationalExpression relationalExpression);

    void visit(StatementExpressionExpression statementExpressionExpression);

    void visit(This aThis);

    void visit(Unary unary);

    void visit(Block block);

    void visit(IfElseStatement ifElseStatement);

    void visit(LocalVarDecl localVarDecl);

    void visit(ReturnStatement returnStatement);

    void visit(StatementExpressionStatement statementExpressionStatement);

    void visit(WhileStatement whileStatement);

    void visit(Assign assign);

    void visit(MethodCall methodCall);

    void visit(New aNew);

    void visit(StatementStmtExpr statementStmtExpr);

    void visit(ConstructorDecl constructorDecl);

    void visit(MethodDecl methodDecl);
}
