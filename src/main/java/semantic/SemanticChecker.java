package semantic;

import lombok.Getter;
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
import syntax.statementexpression.StatementStmtExpr;
import syntax.structure.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

@Getter
public class SemanticChecker implements ISemanticVisitor {

    private ProgramContext context;

    private Stack<HashMap<String, Type>> currentLocalScope;

    private ClassDecl currentClass;

    private MethodDecl currentMethod;

    private final List<Exception> errors = new ArrayList<>();

    // expressions

    @Override
    public TypeCheckResult check(AdditiveExpression additiveExpr) {
        return new TypeCheckResult(true, BaseType.BOOLEAN); // TODO add additive expression
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
        return new TypeCheckResult(true, null); // TODO implement instvar
    }

    @Override
    public TypeCheckResult check(IntegerLiteral integerLiteral) {
        return new TypeCheckResult(true, integerLiteral.getType());
    }

    @Override
    public TypeCheckResult check(LocalOrFieldVar localOrFieldVar) {
        return new TypeCheckResult(true, null); // TODO implement localorfieldvar
    }

    @Override
    public TypeCheckResult check(LogicalExpression logicalExpr) {
        return new TypeCheckResult(true, BaseType.BOOLEAN); // TODO add logical expression
    }

    @Override
    public TypeCheckResult check(NullLiteral nullExpr) {
        return new TypeCheckResult(true, null);
    }

    @Override
    public TypeCheckResult check(RelationalExpression relationalExpr) {
        return new TypeCheckResult(true, BaseType.BOOLEAN); // TODO add relational expression
    }

    @Override
    public TypeCheckResult check(StatementExpressionExpression stmtExprExpr) {
        return null; // ignore
    }

    @Override
    public TypeCheckResult check(This thisExpr) {
        thisExpr.setType(currentClass.getType());
        return new TypeCheckResult(true, thisExpr.getType());
    }

    @Override
    public TypeCheckResult check(Unary unaryExpr) {
        return null; // ignore
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
        Type returnType = null;

        if (block.getStatementList() == null) return new TypeCheckResult(true, BaseType.VOID);

        currentLocalScope.push(new HashMap<>());

        for (Statement statement : block.getStatementList()) {
            TypeCheckResult result = statement.accept(this);
            isValid = isValid && result.isValid();

            if (statement instanceof ReturnStatement) {
                if (returnType == null) returnType = result.getType();
                else if (!returnType.equals(result.getType())) {
                    errors.add(new TypeMismatchException("Return types mismatch! " + returnType + " != " + result.getType()));
                    isValid = false;
                }
            }
        }

        if (returnType == null) returnType = BaseType.VOID;
        currentLocalScope.pop();

        return new TypeCheckResult(isValid, returnType);
    }

    @Override
    public TypeCheckResult check(IfElseStatement ifElseStmt) {

        boolean isValid = true;
        TypeCheckResult result = ifElseStmt.getCondition().accept(this);
        isValid = ifElseStmt.getCondition().accept(this).isValid();

        if (!TypeHelper.isBoolean(result.getType())) {
            errors.add(new TypeMismatchException("If-Statement expected condition of type " + BaseType.BOOLEAN + " but got " + result.getType()));
            isValid = false;
        }

        isValid = isValid && ifElseStmt.getIfBlock().accept(this).isValid()
                && ifElseStmt.getElseBlock().accept(this).isValid();

        return new TypeCheckResult(isValid, ifElseStmt.getType());
    }

    @Override
    public TypeCheckResult check(LocalVarDecl localVarDecl) {

        boolean isValid = true;

        if (TypeHelper.doesTypeExist(localVarDecl.getType(), context)) {
            errors.add(new TypeUnknownException("Type " + localVarDecl.getType() + " not found"));
            isValid = false;
        }

        return new TypeCheckResult(isValid, localVarDecl.getType());
    }

    @Override
    public TypeCheckResult check(ReturnStatement returnStmt) {

        boolean isValid = true;

        TypeCheckResult result = returnStmt.getExpression().accept(this);
        returnStmt.setType(result.getType());
        isValid = isValid && result.isValid();

        if (!currentMethod.getReturnType().equals(result.getType())) {
            errors.add(new TypeMismatchException("Return types mismatch! Expected " + currentMethod.getReturnType() + " but got " + result.getType() + "!"));
            isValid = false;
        }

        return new TypeCheckResult(isValid, returnStmt.getType());
    }

    @Override
    public TypeCheckResult check(StatementExpressionStatement stmtExprStmt) {
        return null; // ignore
    }

    @Override
    public TypeCheckResult check(Sysout sysout) {

        boolean isValid = true;
        if (sysout.getExpression() != null) {
            TypeCheckResult result = sysout.getExpression().accept(this);
            isValid = isValid && result.isValid();
        }

        return new TypeCheckResult(isValid, BaseType.VOID);
    }

    @Override
    public TypeCheckResult check(WhileStatement whileStmt) {

        boolean isValid = true;

        TypeCheckResult resultExpr = whileStmt.getCondition().accept(this);

        if (!resultExpr.getType().equals(BaseType.BOOLEAN)) {
            errors.add(new TypeMismatchException("While-Statement expected condition of type " + BaseType.BOOLEAN + " but got " + resultExpr.getType()));
            isValid = false;
        }
        else {
            TypeCheckResult resultBlock = whileStmt.getBlock().accept(this);
            whileStmt.setType(resultBlock.getType());
            isValid = isValid && resultExpr.isValid() && resultBlock.isValid();
        }

        return new TypeCheckResult(isValid, whileStmt.getType());
    }

    // statement expressions

    @Override
    public TypeCheckResult check(Assign assign) {

        boolean isValid = true;
        TypeCheckResult resultLeft = assign.getAssignLeft().accept(this);
        TypeCheckResult resultRight = assign.getAssignRight().accept(this);
        isValid = isValid && resultLeft.isValid() && resultRight.isValid();

        if (!resultLeft.getType().equals(resultRight.getType())) {
            errors.add(new TypeMismatchException("Assign expected type " + resultLeft.getType() + " but got " + resultRight.getType()));
            isValid = false;
        }

        return new TypeCheckResult(isValid, BaseType.VOID);
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

        if (classContext != null) {
            if (!classContext.hasConstructor(newStmtExpr.getParameterList())) {
                errors.add(new TypeUnknownException("Constructor for class " + newClassType.toString() + " with parameters " + newStmtExpr.getParameterList() + " not found"));
                isValid = false;
            }
        }
        else {
            errors.add(new TypeUnknownException("Type " + newClassType.toString() + " is unknown!"));
            isValid = false;
        }

        return new TypeCheckResult(isValid, newClassType);
    }

    public TypeCheckResult check(StatementStmtExpr statementStmtExpr) {
        //return new TypeCheckResult(true, null);
        return statementStmtExpr.getStatementExpression().accept(this);
    }

    // structures

    /**
     *
     * @param classDecl
     * @return
     */
    @Override
    public TypeCheckResult check(ClassDecl classDecl) {

        boolean isValid = true;

        // TODO implement class context check
        classDecl.setType(new ReferenceType(classDecl.getIdentifier()));
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
        classDecl.setType(new ReferenceType(classDecl.getIdentifier()));
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

        // TODO implement context check

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

        // TODO implement check if field is already declared in class

        isValid = isValid && TypeHelper.doesTypeExist(fieldDecl.getType(), context);

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
        currentMethod = methodDecl;

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

    @Override
    public TypeCheckResult check(MyMain myMain) {

        boolean isValid = true;
        isValid = isValid && myMain.getBlock().accept(this).isValid();

        return new TypeCheckResult(true, BaseType.VOID);
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

        // initialize program variables
        context = new ProgramContext();
        context.setProgram(program);
        currentLocalScope = new Stack<>();

        for (ClassDecl classDecl : program.getClassDeclarations()) {
            isValid = isValid && classDecl.accept(this).isValid();
        }

        // TODO hier fehlt noch was
        return new TypeCheckResult(isValid, BaseType.VOID);
    }
}
