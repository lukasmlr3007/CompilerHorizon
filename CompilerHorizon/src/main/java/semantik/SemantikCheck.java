package semantik;

import syntax.expression.*;
import syntax.statement.*;
import syntax.statementexpression.Assign;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.structure.*;

import java.util.List;

public class SemantikCheck implements ISemantikCheck {

    //private Conext context;

    private ClassDecl currentClass;

    private List<String> currentFields;

    @Override
    public TypeCheckResult check(Programm toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(ClassDecl toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(MethodDecl toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(ParameterDecl toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(ConstructorDecl toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(FieldDecl toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(Block toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(StatementExpressionStatement toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(LocalVarDecl toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(ReturnStatement toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(IfElseStatement toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(WhileStatement toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(MethodCall toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(Assign toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(New toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(StatementExpressionExpression toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(LocalOrFieldVar toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(InstVar toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(This toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(NullLiteral toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(Unary toCheck) {
        return null;
    }

    @Override
    public TypeCheckResult check(StringLiteral stringLiteral) {
        return new TypeCheckResult(true, stringLiteral.getType());
    }

    @Override
    public TypeCheckResult check(IntegerLiteral integerLiteral) {
        return new TypeCheckResult(true, integerLiteral.getType());
    }

    @Override
    public TypeCheckResult check(CharLiteral charLiteral) {
        return new TypeCheckResult(true, charLiteral.getType());
    }

    @Override
    public TypeCheckResult check(BoolLiteral boolLiteral) {
        return new TypeCheckResult(true, boolLiteral.getType());
    }

    @Override
    public TypeCheckResult check(BinaryLiteral toCheck) {
        return null;
    }
}
