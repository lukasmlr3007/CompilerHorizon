package semantic;

import semantic.context.Context;
import syntax.common.ReferenceType;
import syntax.expression.*;
import syntax.statement.*;
import syntax.statementexpression.Assign;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.structure.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SemanticChecker implements ISemanticVisitor {

    private Stack<Context> context = new Stack<>();

    private ClassDecl currentClass;

    private List<String> currentFields = new ArrayList<>();

    private List<String> currentMethods = new ArrayList<>();

    private List<String> currentConstructors = new ArrayList<>();

    @Override
    public TypeCheckResult check(Program program) {

        boolean isValid = true;

        // TODO initialize context
        context.push(new Context());

        for (ClassDecl classDecl : program.getClassDeclarations()) {
            isValid = isValid && classDecl.accept(this).isValid();
        }
        return new TypeCheckResult(isValid, null);
    }

    @Override
    public TypeCheckResult check(ClassDecl classDecl) {

        boolean isValid = true;

        // TODO initialize context
        currentClass = classDecl;

        // check field declarations
        currentFields.clear();
        if (classDecl.getFieldDeclList() != null) { // TODO rm nullcheck
            for (FieldDecl fieldDecl : classDecl.getFieldDeclList()) {
                boolean isFieldValid = fieldDecl.accept(this).isValid();
                if (isFieldValid) currentFields.add(fieldDecl.getIdentifier());
                isValid = isValid && isFieldValid;
            }
        }

        // check method declarations
        if (classDecl.getMethodDeclList() != null) { // TODO rm nullcheck
            for (MethodDecl methodDecl : classDecl.getMethodDeclList()) {
                boolean isMethodValid = methodDecl.accept(this).isValid();
                if (isMethodValid) currentMethods.add(methodDecl.getIdentifier());
                isValid = isValid && isMethodValid;
            }
        }

        // check method declarations
        if (classDecl.getConstructorDeclList() != null) { // TODO rm nullcheck
            for (ConstructorDecl constructorDecl : classDecl.getConstructorDeclList()) {
                boolean isConstructorValid = constructorDecl.accept(this).isValid();
                //if (isConstructorValid) currentMethods.add(constructorDecl.getIdentifier());
                isValid = isValid && isConstructorValid;
            }
        }
        return new TypeCheckResult(isValid, new ReferenceType(classDecl.getIdentifier()));
    }

    @Override
    public TypeCheckResult check(MethodDecl methodDecl) {
        return null;
    }

    @Override
    public TypeCheckResult check(ParameterDecl paramterDecl) {
        return null;
    }

    @Override
    public TypeCheckResult check(ConstructorDecl constructorDecl) {
        return null;
    }

    @Override
    public TypeCheckResult check(FieldDecl fieldDecl) {
        return null;
    }

    @Override
    public TypeCheckResult check(Block block) {
        return null;
    }

    @Override
    public TypeCheckResult check(StatementExpressionStatement stmtExprStmt) {
        return null;
    }

    @Override
    public TypeCheckResult check(LocalVarDecl localVarDecl) {
        return null;
    }

    @Override
    public TypeCheckResult check(ReturnStatement returnStmt) {
        return null;
    }

    @Override
    public TypeCheckResult check(IfElseStatement ifElseStmt) {
        return null;
    }

    @Override
    public TypeCheckResult check(WhileStatement whileStmt) {
        return null;
    }

    @Override
    public TypeCheckResult check(MethodCall methodCallStmtExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(Assign assignStmtExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(New newStmtExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(StatementExpressionExpression stmtExprExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(LocalOrFieldVar localOrFieldVar) {
        return null;
    }

    @Override
    public TypeCheckResult check(InstVar instVar) {
        return null;
    }

    @Override
    public TypeCheckResult check(This thisExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(NullLiteral nullExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(BinaryLiteral binaryExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(Unary unaryExpr) {
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
}
