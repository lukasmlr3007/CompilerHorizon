// Generated from C:/Users/bauma/IdeaProjects/CompilerHorizon/src/main/java/parser\JavaGrammer.g4 by ANTLR 4.12.0
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammerParser}.
 */
public interface JavaGrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(JavaGrammerParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(JavaGrammerParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavaGrammerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavaGrammerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void enterClassdecl(JavaGrammerParser.ClassdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#classdecl}.
	 * @param ctx the parse tree
	 */
	void exitClassdecl(JavaGrammerParser.ClassdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#fielddecl}.
	 * @param ctx the parse tree
	 */
	void enterFielddecl(JavaGrammerParser.FielddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#fielddecl}.
	 * @param ctx the parse tree
	 */
	void exitFielddecl(JavaGrammerParser.FielddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(JavaGrammerParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(JavaGrammerParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#parameterdecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterdecl(JavaGrammerParser.ParameterdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#parameterdecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterdecl(JavaGrammerParser.ParameterdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#parameterValues}.
	 * @param ctx the parse tree
	 */
	void enterParameterValues(JavaGrammerParser.ParameterValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#parameterValues}.
	 * @param ctx the parse tree
	 */
	void exitParameterValues(JavaGrammerParser.ParameterValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void enterMethoddecl(JavaGrammerParser.MethoddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#methoddecl}.
	 * @param ctx the parse tree
	 */
	void exitMethoddecl(JavaGrammerParser.MethoddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaGrammerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaGrammerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaGrammerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaGrammerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#localVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterLocalVarDecl(JavaGrammerParser.LocalVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#localVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitLocalVarDecl(JavaGrammerParser.LocalVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavaGrammerParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavaGrammerParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStatement(JavaGrammerParser.IfElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#ifElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStatement(JavaGrammerParser.IfElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(JavaGrammerParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(JavaGrammerParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JavaGrammerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JavaGrammerParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JavaGrammerParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JavaGrammerParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#reciever}.
	 * @param ctx the parse tree
	 */
	void enterReciever(JavaGrammerParser.RecieverContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#reciever}.
	 * @param ctx the parse tree
	 */
	void exitReciever(JavaGrammerParser.RecieverContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#extraMethod}.
	 * @param ctx the parse tree
	 */
	void enterExtraMethod(JavaGrammerParser.ExtraMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#extraMethod}.
	 * @param ctx the parse tree
	 */
	void exitExtraMethod(JavaGrammerParser.ExtraMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#myNew}.
	 * @param ctx the parse tree
	 */
	void enterMyNew(JavaGrammerParser.MyNewContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#myNew}.
	 * @param ctx the parse tree
	 */
	void exitMyNew(JavaGrammerParser.MyNewContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(JavaGrammerParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(JavaGrammerParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaGrammerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaGrammerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#partExpression}.
	 * @param ctx the parse tree
	 */
	void enterPartExpression(JavaGrammerParser.PartExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#partExpression}.
	 * @param ctx the parse tree
	 */
	void exitPartExpression(JavaGrammerParser.PartExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(JavaGrammerParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(JavaGrammerParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(JavaGrammerParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(JavaGrammerParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(JavaGrammerParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(JavaGrammerParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(JavaGrammerParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(JavaGrammerParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(JavaGrammerParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(JavaGrammerParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#instanceVariable}.
	 * @param ctx the parse tree
	 */
	void enterInstanceVariable(JavaGrammerParser.InstanceVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#instanceVariable}.
	 * @param ctx the parse tree
	 */
	void exitInstanceVariable(JavaGrammerParser.InstanceVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaGrammerParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaGrammerParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#sysout}.
	 * @param ctx the parse tree
	 */
	void enterSysout(JavaGrammerParser.SysoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#sysout}.
	 * @param ctx the parse tree
	 */
	void exitSysout(JavaGrammerParser.SysoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaGrammerParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(JavaGrammerParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaGrammerParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(JavaGrammerParser.MainContext ctx);
}