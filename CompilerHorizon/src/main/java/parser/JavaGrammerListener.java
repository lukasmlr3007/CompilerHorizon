// Generated from java-escape by ANTLR 4.11.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaGrammerParser}.
 */
public interface JavaGrammerListener extends ParseTreeListener {
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
}