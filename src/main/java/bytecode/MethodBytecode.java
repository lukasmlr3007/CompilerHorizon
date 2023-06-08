package bytecode;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import syntax.expression.*;
import syntax.statement.*;
import syntax.statementexpression.Assign;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.statementexpression.StatementStmtExpr;
import syntax.structure.ConstructorDecl;
import syntax.structure.MethodDecl;
import syntax.structure.ParameterDecl;

public class MethodBytecode implements MethodBytecodeVisitor {

    private final String className;
    private final ClassWriter classWriter;
    private MethodVisitor methodVisitor;

    public MethodBytecode(String className, ClassWriter classWriter) {
        this.className = className;
        this.classWriter = classWriter;

        //localVars = new LocalVarStack();
    }

    @Override
    public void visit(AdditiveExpression additiveExpression) {

    }

    @Override
    public void visit(BoolLiteral boolLiteral) {

    }

    @Override
    public void visit(CharLiteral charLiteral) {

    }

    @Override
    public void visit(InstVar instVar) {

    }

    @Override
    public void visit(IntegerLiteral integerLiteral) {

    }

    @Override
    public void visit(LocalOrFieldVar localOrFieldVar) {

    }

    @Override
    public void visit(LogicalExpression logicalExpression) {

    }

    @Override
    public void visit(NullLiteral nullLiteral) {

    }

    @Override
    public void visit(RelationalExpression relationalExpression) {

    }

    @Override
    public void visit(StatementExpressionExpression statementExpressionExpression) {

    }

    @Override
    public void visit(This aThis) {

    }

    @Override
    public void visit(Unary unary) {

    }

    @Override
    public void visit(Block block) {

    }

    @Override
    public void visit(IfElseStatement ifElseStatement) {

    }

    @Override
    public void visit(LocalVarDecl localVarDecl) {

    }

    @Override
    public void visit(ReturnStatement returnStatement) {

    }

    @Override
    public void visit(StatementExpressionStatement statementExpressionStatement) {

    }

    @Override
    public void visit(WhileStatement whileStatement) {

    }

    @Override
    public void visit(Assign assign) {

    }

    @Override
    public void visit(MethodCall methodCall) {

    }

    @Override
    public void visit(New aNew) {

    }

    @Override
    public void visit(StatementStmtExpr statementStmtExpr) {

    }

    @Override
    public void visit(ConstructorDecl constructorDecl) {

    }

    @Override
    public void visit(MethodDecl methodDecl) {

    }

    @Override
    public void visit(ParameterDecl parameterDecl) {

    }
}
