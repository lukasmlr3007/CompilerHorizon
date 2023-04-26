// Generated from java-escape by ANTLR 4.11.1
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
}