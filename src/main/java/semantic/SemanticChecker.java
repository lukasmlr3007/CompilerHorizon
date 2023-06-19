package semantic;

import semantic.context.ClassContext;
import semantic.context.MethodContext;
import semantic.context.ProgramContext;
import semantic.exception.AlreadyDefinedException;
import semantic.exception.TypeMismatchException;
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

    private ClassDecl currentClass;

    private List<Exception> errors = new ArrayList<>();

    // expressions

    @Override
    public TypeCheckResult check(AdditiveExpression additiveExpr) {
        return null; // TODO add additive expression
    }

    @Override
    public TypeCheckResult check(BoolLiteral boolLiteral) {
        return new TypeCheckResult(true, boolLiteral.getType());
    }

    @Override
    public TypeCheckResult check(CharLiteral charLiteral) {
        return new TypeCheckResult(true, charLiteral.getType());
    }

    @Override
    public TypeCheckResult check(InstVar instVar) {
        return null;
    }

    @Override
    public TypeCheckResult check(IntegerLiteral integerLiteral) {
        return new TypeCheckResult(true, integerLiteral.getType());
    }

    @Override
    public TypeCheckResult check(LocalOrFieldVar localOrFieldVar) {
        return null;
    }

    @Override
    public TypeCheckResult check(LogicalExpression logicalExpr) {
        return null; // TODO add logical expression
    }

    @Override
    public TypeCheckResult check(NullLiteral nullExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(RelationalExpression relationalExpr) {
        return null; // TODO add relational expression
    }

    @Override
    public TypeCheckResult check(StatementExpressionExpression stmtExprExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(This thisExpr) {
        return null;
    }

    @Override
    public TypeCheckResult check(Unary unaryExpr) {

        boolean isValid = true;

        return new TypeCheckResult(isValid, null);
    }

    // statements

    /**
     *
     * @param block
     * @return
     */
    @Override
    public TypeCheckResult check(Block block) {

        boolean isValid = true;

        if (block.getStatementList() == null) return new TypeCheckResult(true, BaseType.VOID);

        for (Statement statement : block.getStatementList()) {
            isValid = isValid && statement.accept(this).isValid();
        }
        // TODO hier fehlt noch was
        return new TypeCheckResult(isValid, BaseType.VOID);
    }

    @Override
    public TypeCheckResult check(IfElseStatement ifElseStmt) {
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
    public TypeCheckResult check(StatementExpressionStatement stmtExprStmt) {
        return null;
    }

    @Override
    public TypeCheckResult check(WhileStatement whileStmt) {
        return null;
    }

    // statement expressions

    @Override
    public TypeCheckResult check(Assign assign) {
        return null; // TODO implement assign
    }

    /**
     *
     * @param methodCall
     * @return
     */
    @Override
    public TypeCheckResult check(MethodCall methodCall) {

        Type returnType = null;
        Expression receiver = methodCall.getReceiver();
        boolean isValid = receiver.accept(this).isValid();

        for (PartExpression methodParameter : methodCall.getParameterList()) {
            isValid = isValid && methodParameter.accept(this).isValid();
        }

        // check if method exists in class context
        MethodContext methodContext = TypeHelper.getMethodInType(methodCall, receiver.getType(), context);
        if (methodContext == null) {
            errors.add(new TypeUnknownException("Method " + methodCall.getIdentifier() + " not found in type " + receiver.getType().toString()));
            isValid = false;
        }
        else {
            returnType = methodContext.getReturnType();
        }
        methodCall.setType(returnType);
        return new TypeCheckResult(isValid, returnType);
    }

    @Override
    public TypeCheckResult check(New newStmtExpr) {

        boolean isValid = true;
        Type newClassType = newStmtExpr.getType();

        // check if class exists in program context
        if (!TypeHelper.doesTypeExist(newClassType, context)) {
            errors.add(new TypeUnknownException("Class " + newClassType.toString() + " not found in program context"));
            isValid = false;
        }

        for (Expression parameter : newStmtExpr.getParameterList()) {
            isValid = isValid && parameter.accept(this).isValid();
        }

        ClassContext classContext = context.getClassContext(newClassType.getIdentifier());



        return new TypeCheckResult(isValid, newClassType);
    }

    // TODO add statement stmt expr?

    // structures

    /**
     *
     * @param classDecl
     * @return
     */
    @Override
    public TypeCheckResult check(ClassDecl classDecl) {

        boolean isValid = true;

        // TODO add class context
        currentClass = classDecl;

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
                // TODO if (isMethodValid) currentMethods.add(methodDecl.getIdentifier());
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

    /**
     *
     * @param constructorDecl
     * @return
     */
    @Override
    public TypeCheckResult check(ConstructorDecl constructorDecl) {

        boolean isValid = true;

        // TODO add constructor context

        // check constructor parameters
        if (constructorDecl.getParameters() != null) {
            for (ParameterDecl parameter : constructorDecl.getParameters()) {
                isValid = isValid && parameter.accept(this).isValid();
            }
        }
        // check block
        if (constructorDecl.getBlock() != null) {
            TypeCheckResult result = constructorDecl.getBlock().accept(this);
            isValid = isValid && result.isValid();
        }
        return new TypeCheckResult(isValid, BaseType.VOID);
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

    /**
     *
     * @param methodDecl
     * @return
     */
    @Override
    public TypeCheckResult check(MethodDecl methodDecl) {

        boolean isValid = true;

        // checks, if two methods with same name & parameter length are identical
        for (MethodDecl classMethod : currentClass.getMethodDeclList()) {
            if (methodDecl.equals(classMethod)) continue;
            else if (methodDecl.getIdentifier().equals(classMethod.getIdentifier()) &&
                    methodDecl.getParameters().size() == classMethod.getParameters().size()) {

                boolean hasSameParameters = true;
                for (int i = 0; i < methodDecl.getParameters().size(); i++) {
                    if (!methodDecl.getParameters().get(i).getType().equals(classMethod.getParameters().get(i).getType())) {
                        hasSameParameters = false;
                        break;
                    }
                }
                if (hasSameParameters) {
                    errors.add(new AlreadyDefinedException("Method " + methodDecl.getIdentifier() + " is already defined!"));
                    isValid = false;
                }
            }
        }

        for (ParameterDecl methodParameter : methodDecl.getParameters()) {
            isValid = isValid && methodParameter.accept(this).isValid();
            // TODO add to method context
        }

        TypeCheckResult blockResult = methodDecl.getBlock().accept(this);
        isValid = isValid && blockResult.isValid();

        // check if return type is correct
        Type returnType = null;
        if (blockResult.getType() == null) returnType = BaseType.VOID;
        else returnType = blockResult.getType();

        if (methodDecl.getReturnType() != returnType) {
            errors.add(new TypeMismatchException("Method " + methodDecl.getIdentifier() + " returns the incorrect type!"));
            isValid = false;
        }
        return new TypeCheckResult(isValid, returnType);
    }

    /**
     *
     * @param parameterDecl
     * @return
     */
    @Override
    public TypeCheckResult check(ParameterDecl parameterDecl) {
        if (TypeHelper.doesTypeExist(parameterDecl.getType(), context)) {
            return new TypeCheckResult(true, parameterDecl.getType());
        }
        else {
            errors.add(new TypeUnknownException("Type " + parameterDecl.getType() + " is unknown!"));
            return new TypeCheckResult(false, parameterDecl.getType());
        }
    }

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
}
