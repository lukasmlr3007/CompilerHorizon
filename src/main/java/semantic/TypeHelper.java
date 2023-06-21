package semantic;

import semantic.context.ClassContext;
import semantic.context.MethodContext;
import semantic.context.ProgramContext;
import syntax.common.BaseType;
import syntax.common.ReferenceType;
import syntax.common.Type;
import syntax.expression.PartExpression;
import syntax.statementexpression.MethodCall;
import syntax.statementexpression.New;
import syntax.structure.MethodDecl;
import syntax.structure.ParameterDecl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class TypeHelper {

    public static boolean doesTypeExist(Type type, ProgramContext context) {

        if (type instanceof BaseType) return true;
        else return context.hasClassContext(type.getIdentifier());
    }

    public static boolean doesConstructorExist(New newStmtExpr, ProgramContext context) {

        if (newStmtExpr.getType() instanceof BaseType || !doesTypeExist(newStmtExpr.getType(), context)) {
            return false;
        }

        ClassContext classContext = context.getClassContext(newStmtExpr.getType().getIdentifier());
        if (classContext != null) {
            return classContext.hasConstructor(newStmtExpr.getParameterList());
        }
        return false;
    }

    public static List<MethodContext> getMethodsInType(String identifier, Type type, ProgramContext context) {

        if (type instanceof ReferenceType && doesTypeExist(type, context)) {
            ClassContext classContext = context.getClassContext(type.getIdentifier());
            if (classContext != null && classContext.hasMethod(identifier)) {
                return classContext.getMethod(identifier);
            }
        }
        return Collections.emptyList();
    }

    public static MethodContext getMethodInType(MethodCall methodCall, Type type, ProgramContext context) {

        if (type instanceof ReferenceType && doesTypeExist(type, context)) {
            ClassContext classContext = context.getClassContext(type.getIdentifier());

            if (classContext != null && classContext.hasMethod(methodCall.getIdentifier())) {

                List<PartExpression> parameterDecls = methodCall.getParameterList();
                List<MethodContext> methodContexts = classContext.getMethod(methodCall.getIdentifier());

                for (MethodContext methodContext : methodContexts) {
                    if (methodContext.getParameters().size() == parameterDecls.size()) {
                        boolean found = true;

                        for (int i = 0; i < parameterDecls.size(); i++) {
                            if (!methodContext.getParameters().get(i).getType().equals(parameterDecls.get(i).getType())) {
                                found = false;
                                break;
                            }
                        }
                        if (found) return methodContext;
                    }
                }
            }
        }
        return null;
    }

    public static boolean hasTypeOfVariable(String identifier, Stack<HashMap<String, Type>> currentLocalScope) {

        for (HashMap<String, Type> localScope : currentLocalScope) {
            if (localScope.containsKey(identifier)) {
                return true;
            }
        }
        return false;
    }

    public static Type getTypeOfVariable(String identifier, Stack<HashMap<String, Type>> currentLocalScope) {

        for (HashMap<String, Type> localScope : currentLocalScope) {
            if (localScope.containsKey(identifier)) {
                return localScope.get(identifier);
            }
        }
        return null;
    }

    public static boolean isBoolean(Type type) {
        return type instanceof BaseType && type.getIdentifier().equals("boolean");
    }

    public static boolean isSameParameters(List<ParameterDecl> parameters, List<ParameterDecl> parameters1) {
        if (parameters.size() != parameters1.size()) return false;
        for (int i = 0; i < parameters.size(); i++) {
            if (!parameters.get(i).getType().equals(parameters1.get(i).getType())) return false;
        }
        return true;
    }
}
