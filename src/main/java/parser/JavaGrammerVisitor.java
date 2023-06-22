// Generated from C:/Users/fleck/Documents/CompilerHorizonCode/CompilerHorizon/src/main/java/parser\JavaGrammer.g4 by ANTLR 4.12.0
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaGrammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaGrammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(JavaGrammerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#classdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdecl(JavaGrammerParser.ClassdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(JavaGrammerParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#myconstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyconstructor(JavaGrammerParser.MyconstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#fielddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFielddecl(JavaGrammerParser.FielddeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(JavaGrammerParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#parameterdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdecl(JavaGrammerParser.ParameterdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#parameterValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterValues(JavaGrammerParser.ParameterValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#methoddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethoddecl(JavaGrammerParser.MethoddeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaGrammerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaGrammerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#localVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVarDecl(JavaGrammerParser.LocalVarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(JavaGrammerParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#ifElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(JavaGrammerParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(JavaGrammerParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(JavaGrammerParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JavaGrammerParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#reciever}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReciever(JavaGrammerParser.RecieverContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#extraMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtraMethod(JavaGrammerParser.ExtraMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#myNew}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyNew(JavaGrammerParser.MyNewContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(JavaGrammerParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaGrammerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#partExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartExpression(JavaGrammerParser.PartExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#binaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(JavaGrammerParser.BinaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(JavaGrammerParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(JavaGrammerParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(JavaGrammerParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(JavaGrammerParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#instanceVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceVariable(JavaGrammerParser.InstanceVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaGrammerParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaGrammerParser#sysout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSysout(JavaGrammerParser.SysoutContext ctx);
}