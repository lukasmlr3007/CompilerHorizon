package semantic;

import semantic.context.ProgramContext;
import semantic.context.ScopeContext;
import semantic.exception.AlreadyDefinedException;
import semantic.exception.TypeUnknownException;
import syntax.common.BaseType;
import syntax.common.ReferenceType;
import syntax.common.Type;
import syntax.expression.*;
import syntax.statement.*;
import syntax.statementexpression.Assign;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.structure.*;

import java.util.ArrayList;
import java.util.List;

public class SemanticChecker implements ISemanticVisitor {

    private ProgramContext context;
    // private ClassDecl currentClass;
    //private List<String> currentFields = new ArrayList<>();
    //private List<String> currentMethods = new ArrayList<>();
    //
    //
    // ÄLK;private Type currentReturnType;
    private ScopeContext currentLocalScope;
    private List<Exception> errors = new ArrayList<>();

    /**
     *
     * @param program
     * @return
     */
    @Override
    public TypeCheckResult check(Program program) {

        boolean isValid = true;

        // set program context
        context = new ProgramContext();
        context.setProgram(program);

        for (ClassDecl classDecl : program.getClassDeclarations()) {
            isValid = isValid && classDecl.accept(this).isValid();
        }
        return new TypeCheckResult(isValid, null);
    }

    /**
     *
     * @param classDecl
     * @return
     */
    @Override
    public TypeCheckResult check(ClassDecl classDecl) {

        boolean isValid = true;

        // TODO initialize context
        // currentClass = classDecl;

        // check field declarations
        // currentFields.clear();
        if (classDecl.getFieldDeclList() != null) { // nullcheck
            for (FieldDecl fieldDecl : classDecl.getFieldDeclList()) {
                boolean isFieldValid = fieldDecl.accept(this).isValid();
                // if (isFieldValid) currentFields.add(fieldDecl.getIdentifier());
                isValid = isValid && isFieldValid;
            }
        }

        // check method declarations
        if (classDecl.getMethodDeclList() != null) { // nullcheck
            for (MethodDecl methodDecl : classDecl.getMethodDeclList()) {
                boolean isMethodValid = methodDecl.accept(this).isValid();
                // if (isMethodValid) currentMethods.add(methodDecl.getIdentifier());
                isValid = isValid && isMethodValid;
            }
        }

        // check constructor declarations
        if (classDecl.getConstructorDeclList() != null) { // nullcheck
            if (classDecl.getConstructorDeclList().isEmpty()) {
                // add new constructor if not set
                ConstructorDecl newConstructorDecl = new ConstructorDecl();
                isValid = isValid && newConstructorDecl.accept(this).isValid();
                classDecl.getConstructorDeclList().add(newConstructorDecl);
            }
            else for (ConstructorDecl constructorDecl : classDecl.getConstructorDeclList()) {
                boolean isConstructorValid = constructorDecl.accept(this).isValid();
                isValid = isValid && isConstructorValid;
            }
        }
        return new TypeCheckResult(isValid, new ReferenceType(classDecl.getIdentifier()));
    }

    @Override
    public TypeCheckResult check(MethodDecl methodDecl) {
        return null;
    }

    /**
     *
     * @param constructorDecl
     * @return
     */
    @Override
    public TypeCheckResult check(ConstructorDecl constructorDecl) {

        boolean isValid = true;
        // create constructor scope
        currentLocalScope.push();
        // check constructor parameters
        for (ParameterDecl parameter : constructorDecl.getParameters()) {
            isValid = isValid && parameter.accept(this).isValid();
            currentLocalScope.addVariable(parameter);
        }
        // check block
        // currentReturnType = BaseType.VOID;
        TypeCheckResult result = constructorDecl.getBlock().accept(this);
        currentLocalScope.pop();

        isValid = isValid && result.isValid();
        // return new TypeCheckResult(isValid, constructorDecl.getType());
        return null;
    }

    /**
     *
     * @param paramterDecl
     * @return
     */
    @Override
    public TypeCheckResult check(ParameterDecl paramterDecl) {
        if (TypeHelper.doesTypeExist(paramterDecl.getType(), context)) {
            return new TypeCheckResult(true, paramterDecl.getType());
        }
        else {
            errors.add(new TypeUnknownException("Type " + paramterDecl.getType() + " is unknown!"));
            return new TypeCheckResult(false, paramterDecl.getType());
        }
    }

    /**
     *
     * @param fieldDecl
     * @return
     */
    @Override
    public TypeCheckResult check(FieldDecl fieldDecl) {

        boolean isValid = true;
        /*
        if (currentFields.contains(fieldDecl.getIdentifier())) {
            errors.add(new AlreadyDefinedException(
                "Variable " + fieldDecl.getIdentifier() + " is already defined!"
            ));
            isValid = false;
        }
        else {
            currentFields.add(fieldDecl.getIdentifier());
        }
        isValid = isValid && TypeHelper.doesTypeExist(fieldDecl.getType(), context);
        */

        return new TypeCheckResult(isValid, fieldDecl.getType());
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
    public TypeCheckResult check(BinaryExpression binaryExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(Unary unaryExpr) {
        return null;
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
