// Generated from C:/Users/max20/Documents/Materialien_DHBW/4_Semester/Compilerbau/CompilerHorizon/src/main/java/parser\JavaGrammer.g4 by ANTLR 4.12.0
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaGrammerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Class=3, Static=4, Assign=5, Int=6, Bool=7, Char=8, Void=9, 
		While=10, If=11, Else=12, New=13, This=14, AccessModifier=15, OpenCurlyBracket=16, 
		ClosedCurlyBracket=17, OpenRoundBracket=18, ClosedRoundBracket=19, Semicolon=20, 
		Comma=21, Point=22, Return=23, LogicOperator=24, RelationalOperator=25, 
		AdditiveOperator=26, Identifier=27, IntValue=28, BoolValue=29, CharValue=30, 
		WS=31;
	public static final int
		RULE_program = 0, RULE_classdecl = 1, RULE_fielddecl = 2, RULE_parameters = 3, 
		RULE_parameterdecl = 4, RULE_parameterValues = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_localVarDecl = 8, RULE_whileStatement = 9, RULE_ifElseStatement = 10, 
		RULE_statementExpression = 11, RULE_assign = 12, RULE_methodCall = 13, 
		RULE_reciever = 14, RULE_extraMethod = 15, RULE_myNew = 16, RULE_returnStatement = 17, 
		RULE_expression = 18, RULE_partExpression = 19, RULE_binaryExpression = 20, 
		RULE_additiveExpression = 21, RULE_relationalExpression = 22, RULE_logicalExpression = 23, 
		RULE_literals = 24, RULE_instanceVariable = 25, RULE_constructor = 26, 
		RULE_type = 27, RULE_sysout = 28, RULE_main = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classdecl", "fielddecl", "parameters", "parameterdecl", "parameterValues", 
			"block", "statement", "localVarDecl", "whileStatement", "ifElseStatement", 
			"statementExpression", "assign", "methodCall", "reciever", "extraMethod", 
			"myNew", "returnStatement", "expression", "partExpression", "binaryExpression", 
			"additiveExpression", "relationalExpression", "logicalExpression", "literals", 
			"instanceVariable", "constructor", "type", "sysout", "main"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'System.out.println'", "'public static void main(String[] args)'", 
			"'class'", "'static'", "'='", "'int'", "'boolean'", "'char'", "'void'", 
			"'while'", "'if'", "'else'", "'new'", "'this'", null, "'{'", "'}'", "'('", 
			"')'", "';'", "','", "'.'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Class", "Static", "Assign", "Int", "Bool", "Char", 
			"Void", "While", "If", "Else", "New", "This", "AccessModifier", "OpenCurlyBracket", 
			"ClosedCurlyBracket", "OpenRoundBracket", "ClosedRoundBracket", "Semicolon", 
			"Comma", "Point", "Return", "LogicOperator", "RelationalOperator", "AdditiveOperator", 
			"Identifier", "IntValue", "BoolValue", "CharValue", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JavaGrammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaGrammerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<ClassdeclContext> classdecl() {
			return getRuleContexts(ClassdeclContext.class);
		}
		public ClassdeclContext classdecl(int i) {
			return getRuleContext(ClassdeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				classdecl();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Class );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassdeclContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(JavaGrammerParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TerminalNode OpenCurlyBracket() { return getToken(JavaGrammerParser.OpenCurlyBracket, 0); }
		public TerminalNode ClosedCurlyBracket() { return getToken(JavaGrammerParser.ClosedCurlyBracket, 0); }
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<FielddeclContext> fielddecl() {
			return getRuleContexts(FielddeclContext.class);
		}
		public FielddeclContext fielddecl(int i) {
			return getRuleContext(FielddeclContext.class,i);
		}
		public ClassdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterClassdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitClassdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitClassdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdeclContext classdecl() throws RecognitionException {
		ClassdeclContext _localctx = new ClassdeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(Class);
			setState(66);
			match(Identifier);
			setState(67);
			match(OpenCurlyBracket);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(68);
				constructor();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Static || _la==AccessModifier) {
				{
				{
				setState(74);
				fielddecl();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(ClosedCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FielddeclContext extends ParserRuleContext {
		public TerminalNode AccessModifier() { return getToken(JavaGrammerParser.AccessModifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TerminalNode Semicolon() { return getToken(JavaGrammerParser.Semicolon, 0); }
		public TerminalNode Static() { return getToken(JavaGrammerParser.Static, 0); }
		public FielddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fielddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterFielddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitFielddecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitFielddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FielddeclContext fielddecl() throws RecognitionException {
		FielddeclContext _localctx = new FielddeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fielddecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(82);
				match(Static);
				}
			}

			setState(85);
			match(AccessModifier);
			setState(86);
			type();
			setState(87);
			match(Identifier);
			setState(88);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterdeclContext> parameterdecl() {
			return getRuleContexts(ParameterdeclContext.class);
		}
		public ParameterdeclContext parameterdecl(int i) {
			return getRuleContext(ParameterdeclContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaGrammerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaGrammerParser.Comma, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			parameterdecl();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(91);
				match(Comma);
				setState(92);
				parameterdecl();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterdeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public ParameterdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterParameterdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitParameterdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitParameterdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclContext parameterdecl() throws RecognitionException {
		ParameterdeclContext _localctx = new ParameterdeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			type();
			setState(99);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterValuesContext extends ParserRuleContext {
		public List<PartExpressionContext> partExpression() {
			return getRuleContexts(PartExpressionContext.class);
		}
		public PartExpressionContext partExpression(int i) {
			return getRuleContext(PartExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(JavaGrammerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(JavaGrammerParser.Comma, i);
		}
		public ParameterValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterParameterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitParameterValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitParameterValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterValuesContext parameterValues() throws RecognitionException {
		ParameterValuesContext _localctx = new ParameterValuesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			partExpression();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(102);
				match(Comma);
				setState(103);
				partExpression();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenCurlyBracket() { return getToken(JavaGrammerParser.OpenCurlyBracket, 0); }
		public TerminalNode ClosedCurlyBracket() { return getToken(JavaGrammerParser.ClosedCurlyBracket, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(OpenCurlyBracket);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 142700480L) != 0)) {
				{
				{
				setState(110);
				statement();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(ClosedCurlyBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LocalVarDeclContext localVarDecl() {
			return getRuleContext(LocalVarDeclContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfElseStatementContext ifElseStatement() {
			return getRuleContext(IfElseStatementContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				localVarDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				ifElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				statementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TerminalNode Semicolon() { return getToken(JavaGrammerParser.Semicolon, 0); }
		public LocalVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterLocalVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitLocalVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitLocalVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVarDeclContext localVarDecl() throws RecognitionException {
		LocalVarDeclContext _localctx = new LocalVarDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_localVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			type();
			setState(127);
			match(Identifier);
			setState(128);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(JavaGrammerParser.While, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaGrammerParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(While);
			setState(131);
			match(OpenRoundBracket);
			setState(132);
			expression();
			setState(133);
			match(ClosedRoundBracket);
			setState(134);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JavaGrammerParser.If, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaGrammerParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(JavaGrammerParser.Else, 0); }
		public IfElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatementContext ifElseStatement() throws RecognitionException {
		IfElseStatementContext _localctx = new IfElseStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(If);
			setState(137);
			match(OpenRoundBracket);
			setState(138);
			expression();
			setState(139);
			match(ClosedRoundBracket);
			setState(140);
			block();
			setState(141);
			match(Else);
			setState(142);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public MyNewContext myNew() {
			return getRuleContext(MyNewContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitStatementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementExpression);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				myNew();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public InstanceVariableContext instanceVariable() {
			return getRuleContext(InstanceVariableContext.class,0);
		}
		public TerminalNode Assign() { return getToken(JavaGrammerParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(JavaGrammerParser.Semicolon, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			instanceVariable();
			setState(150);
			match(Assign);
			setState(151);
			expression();
			setState(152);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public RecieverContext reciever() {
			return getRuleContext(RecieverContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(JavaGrammerParser.Semicolon, 0); }
		public List<ExtraMethodContext> extraMethod() {
			return getRuleContexts(ExtraMethodContext.class);
		}
		public ExtraMethodContext extraMethod(int i) {
			return getRuleContext(ExtraMethodContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			reciever();
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				extraMethod();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Point );
			setState(160);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecieverContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(JavaGrammerParser.This, 0); }
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public InstanceVariableContext instanceVariable() {
			return getRuleContext(InstanceVariableContext.class,0);
		}
		public RecieverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reciever; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterReciever(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitReciever(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitReciever(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecieverContext reciever() throws RecognitionException {
		RecieverContext _localctx = new RecieverContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_reciever);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(162);
				match(This);
				}
				break;
			case 2:
				{
				setState(163);
				match(Identifier);
				}
				break;
			case 3:
				{
				setState(164);
				instanceVariable();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtraMethodContext extends ParserRuleContext {
		public TerminalNode Point() { return getToken(JavaGrammerParser.Point, 0); }
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaGrammerParser.OpenRoundBracket, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public ExtraMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extraMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterExtraMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitExtraMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitExtraMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtraMethodContext extraMethod() throws RecognitionException {
		ExtraMethodContext _localctx = new ExtraMethodContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_extraMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(Point);
			setState(168);
			match(Identifier);
			setState(169);
			match(OpenRoundBracket);
			setState(170);
			parameterValues();
			setState(171);
			match(ClosedRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MyNewContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(JavaGrammerParser.New, 0); }
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaGrammerParser.OpenRoundBracket, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public MyNewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myNew; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterMyNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitMyNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitMyNew(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyNewContext myNew() throws RecognitionException {
		MyNewContext _localctx = new MyNewContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_myNew);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(New);
			setState(174);
			match(Identifier);
			setState(175);
			match(OpenRoundBracket);
			setState(176);
			parameterValues();
			setState(177);
			match(ClosedRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(JavaGrammerParser.Return, 0); }
		public TerminalNode Semicolon() { return getToken(JavaGrammerParser.Semicolon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(Return);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013552640L) != 0)) {
				{
				setState(180);
				expression();
				}
			}

			setState(183);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public PartExpressionContext partExpression() {
			return getRuleContext(PartExpressionContext.class,0);
		}
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				partExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				binaryExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartExpressionContext extends ParserRuleContext {
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TerminalNode This() { return getToken(JavaGrammerParser.This, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public InstanceVariableContext instanceVariable() {
			return getRuleContext(InstanceVariableContext.class,0);
		}
		public TerminalNode OpenRoundBracket() { return getToken(JavaGrammerParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public PartExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterPartExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitPartExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitPartExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartExpressionContext partExpression() throws RecognitionException {
		PartExpressionContext _localctx = new PartExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partExpression);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				literals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(This);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				statementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				instanceVariable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(OpenRoundBracket);
				setState(195);
				expression();
				setState(196);
				match(ClosedRoundBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_binaryExpression);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				additiveExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				logicalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				relationalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public PartExpressionContext partExpression() {
			return getRuleContext(PartExpressionContext.class,0);
		}
		public TerminalNode AdditiveOperator() { return getToken(JavaGrammerParser.AdditiveOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_additiveExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			partExpression();
			setState(206);
			match(AdditiveOperator);
			setState(207);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public PartExpressionContext partExpression() {
			return getRuleContext(PartExpressionContext.class,0);
		}
		public TerminalNode RelationalOperator() { return getToken(JavaGrammerParser.RelationalOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relationalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			partExpression();
			setState(210);
			match(RelationalOperator);
			setState(211);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public PartExpressionContext partExpression() {
			return getRuleContext(PartExpressionContext.class,0);
		}
		public TerminalNode LogicOperator() { return getToken(JavaGrammerParser.LogicOperator, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logicalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			partExpression();
			setState(214);
			match(LogicOperator);
			setState(215);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralsContext extends ParserRuleContext {
		public TerminalNode IntValue() { return getToken(JavaGrammerParser.IntValue, 0); }
		public TerminalNode BoolValue() { return getToken(JavaGrammerParser.BoolValue, 0); }
		public TerminalNode CharValue() { return getToken(JavaGrammerParser.CharValue, 0); }
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceVariableContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(JavaGrammerParser.This, 0); }
		public List<TerminalNode> Point() { return getTokens(JavaGrammerParser.Point); }
		public TerminalNode Point(int i) {
			return getToken(JavaGrammerParser.Point, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaGrammerParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaGrammerParser.Identifier, i);
		}
		public InstanceVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterInstanceVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitInstanceVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitInstanceVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceVariableContext instanceVariable() throws RecognitionException {
		InstanceVariableContext _localctx = new InstanceVariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_instanceVariable);
		int _la;
		try {
			int _alt;
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(This);
				setState(220);
				match(Point);
				setState(221);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(222);
					match(This);
					setState(223);
					match(Point);
					}
				}

				setState(228); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(226);
						match(Identifier);
						setState(227);
						match(Point);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(230); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(232);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaGrammerParser.OpenRoundBracket, 0); }
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(Identifier);
			setState(236);
			match(OpenRoundBracket);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 134218688L) != 0)) {
				{
				setState(237);
				parameters();
				}
			}

			setState(240);
			match(ClosedRoundBracket);
			setState(241);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(JavaGrammerParser.Int, 0); }
		public TerminalNode Bool() { return getToken(JavaGrammerParser.Bool, 0); }
		public TerminalNode Char() { return getToken(JavaGrammerParser.Char, 0); }
		public TerminalNode Void() { return getToken(JavaGrammerParser.Void, 0); }
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 134218688L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SysoutContext extends ParserRuleContext {
		public TerminalNode OpenRoundBracket() { return getToken(JavaGrammerParser.OpenRoundBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public TerminalNode Semicolon() { return getToken(JavaGrammerParser.Semicolon, 0); }
		public SysoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sysout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterSysout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitSysout(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitSysout(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SysoutContext sysout() throws RecognitionException {
		SysoutContext _localctx = new SysoutContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sysout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__0);
			setState(246);
			match(OpenRoundBracket);
			setState(247);
			expression();
			setState(248);
			match(ClosedRoundBracket);
			setState(249);
			match(Semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__1);
			setState(252);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0004"+
		"\u0000>\b\u0000\u000b\u0000\f\u0000?\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0001\u0001"+
		"\u0005\u0001L\b\u0001\n\u0001\f\u0001O\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0003\u0002T\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"^\b\u0003\n\u0003\f\u0003a\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005i\b\u0005\n\u0005\f\u0005"+
		"l\t\u0005\u0001\u0006\u0001\u0006\u0005\u0006p\b\u0006\n\u0006\f\u0006"+
		"s\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007}\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0094\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r\u009d\b\r\u000b\r\f\r\u009e"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a6"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00b6\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00bc\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00c7\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00cc\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00e1\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0004\u0019\u00e5\b\u0019\u000b\u0019\f\u0019\u00e6"+
		"\u0001\u0019\u0003\u0019\u00ea\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u00ef\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0000"+
		"\u001e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:\u0000\u0002\u0001\u0000\u001c\u001e"+
		"\u0002\u0000\u0006\t\u001b\u001b\u00fe\u0000=\u0001\u0000\u0000\u0000"+
		"\u0002A\u0001\u0000\u0000\u0000\u0004S\u0001\u0000\u0000\u0000\u0006Z"+
		"\u0001\u0000\u0000\u0000\bb\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000"+
		"\u0000\fm\u0001\u0000\u0000\u0000\u000e|\u0001\u0000\u0000\u0000\u0010"+
		"~\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000\u0000\u0000\u0014\u0088"+
		"\u0001\u0000\u0000\u0000\u0016\u0093\u0001\u0000\u0000\u0000\u0018\u0095"+
		"\u0001\u0000\u0000\u0000\u001a\u009a\u0001\u0000\u0000\u0000\u001c\u00a5"+
		"\u0001\u0000\u0000\u0000\u001e\u00a7\u0001\u0000\u0000\u0000 \u00ad\u0001"+
		"\u0000\u0000\u0000\"\u00b3\u0001\u0000\u0000\u0000$\u00bb\u0001\u0000"+
		"\u0000\u0000&\u00c6\u0001\u0000\u0000\u0000(\u00cb\u0001\u0000\u0000\u0000"+
		"*\u00cd\u0001\u0000\u0000\u0000,\u00d1\u0001\u0000\u0000\u0000.\u00d5"+
		"\u0001\u0000\u0000\u00000\u00d9\u0001\u0000\u0000\u00002\u00e9\u0001\u0000"+
		"\u0000\u00004\u00eb\u0001\u0000\u0000\u00006\u00f3\u0001\u0000\u0000\u0000"+
		"8\u00f5\u0001\u0000\u0000\u0000:\u00fb\u0001\u0000\u0000\u0000<>\u0003"+
		"\u0002\u0001\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0001\u0001\u0000"+
		"\u0000\u0000AB\u0005\u0003\u0000\u0000BC\u0005\u001b\u0000\u0000CG\u0005"+
		"\u0010\u0000\u0000DF\u00034\u001a\u0000ED\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HM\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0003\u0004\u0002"+
		"\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0011\u0000\u0000Q\u0003\u0001\u0000\u0000"+
		"\u0000RT\u0005\u0004\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005\u000f\u0000\u0000VW\u0003"+
		"6\u001b\u0000WX\u0005\u001b\u0000\u0000XY\u0005\u0014\u0000\u0000Y\u0005"+
		"\u0001\u0000\u0000\u0000Z_\u0003\b\u0004\u0000[\\\u0005\u0015\u0000\u0000"+
		"\\^\u0003\b\u0004\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0007\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u00036\u001b\u0000cd\u0005"+
		"\u001b\u0000\u0000d\t\u0001\u0000\u0000\u0000ej\u0003&\u0013\u0000fg\u0005"+
		"\u0015\u0000\u0000gi\u0003&\u0013\u0000hf\u0001\u0000\u0000\u0000il\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"k\u000b\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mq\u0005\u0010"+
		"\u0000\u0000np\u0003\u000e\u0007\u0000on\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u0011\u0000"+
		"\u0000u\r\u0001\u0000\u0000\u0000v}\u0003\f\u0006\u0000w}\u0003\u0010"+
		"\b\u0000x}\u0003\u0012\t\u0000y}\u0003\u0014\n\u0000z}\u0003\u0016\u000b"+
		"\u0000{}\u0003\"\u0011\u0000|v\u0001\u0000\u0000\u0000|w\u0001\u0000\u0000"+
		"\u0000|x\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000}\u000f\u0001\u0000\u0000\u0000"+
		"~\u007f\u00036\u001b\u0000\u007f\u0080\u0005\u001b\u0000\u0000\u0080\u0081"+
		"\u0005\u0014\u0000\u0000\u0081\u0011\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0005\n\u0000\u0000\u0083\u0084\u0005\u0012\u0000\u0000\u0084\u0085\u0003"+
		"$\u0012\u0000\u0085\u0086\u0005\u0013\u0000\u0000\u0086\u0087\u0003\f"+
		"\u0006\u0000\u0087\u0013\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u000b"+
		"\u0000\u0000\u0089\u008a\u0005\u0012\u0000\u0000\u008a\u008b\u0003$\u0012"+
		"\u0000\u008b\u008c\u0005\u0013\u0000\u0000\u008c\u008d\u0003\f\u0006\u0000"+
		"\u008d\u008e\u0005\f\u0000\u0000\u008e\u008f\u0003\f\u0006\u0000\u008f"+
		"\u0015\u0001\u0000\u0000\u0000\u0090\u0094\u0003\u0018\f\u0000\u0091\u0094"+
		"\u0003\u001a\r\u0000\u0092\u0094\u0003 \u0010\u0000\u0093\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0003"+
		"2\u0019\u0000\u0096\u0097\u0005\u0005\u0000\u0000\u0097\u0098\u0003$\u0012"+
		"\u0000\u0098\u0099\u0005\u0014\u0000\u0000\u0099\u0019\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0003\u001c\u000e\u0000\u009b\u009d\u0003\u001e\u000f"+
		"\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0014\u0000"+
		"\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2\u00a6\u0005\u000e\u0000"+
		"\u0000\u00a3\u00a6\u0005\u001b\u0000\u0000\u00a4\u00a6\u00032\u0019\u0000"+
		"\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u001d\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005\u0016\u0000\u0000\u00a8\u00a9\u0005\u001b\u0000\u0000"+
		"\u00a9\u00aa\u0005\u0012\u0000\u0000\u00aa\u00ab\u0003\n\u0005\u0000\u00ab"+
		"\u00ac\u0005\u0013\u0000\u0000\u00ac\u001f\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005\r\u0000\u0000\u00ae\u00af\u0005\u001b\u0000\u0000\u00af\u00b0"+
		"\u0005\u0012\u0000\u0000\u00b0\u00b1\u0003\n\u0005\u0000\u00b1\u00b2\u0005"+
		"\u0013\u0000\u0000\u00b2!\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005\u0017"+
		"\u0000\u0000\u00b4\u00b6\u0003$\u0012\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b8\u0005\u0014\u0000\u0000\u00b8#\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bc\u0003&\u0013\u0000\u00ba\u00bc\u0003(\u0014\u0000\u00bb\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc%\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c7\u00030\u0018\u0000\u00be\u00c7\u0005\u001b"+
		"\u0000\u0000\u00bf\u00c7\u0005\u000e\u0000\u0000\u00c0\u00c7\u0003\u0016"+
		"\u000b\u0000\u00c1\u00c7\u00032\u0019\u0000\u00c2\u00c3\u0005\u0012\u0000"+
		"\u0000\u00c3\u00c4\u0003$\u0012\u0000\u00c4\u00c5\u0005\u0013\u0000\u0000"+
		"\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c6\u00be\u0001\u0000\u0000\u0000\u00c6\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c7\'\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cc\u0003*\u0015\u0000\u00c9\u00cc\u0003.\u0017\u0000\u00ca\u00cc\u0003"+
		",\u0016\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc)\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0003&\u0013\u0000\u00ce\u00cf\u0005\u001a\u0000\u0000"+
		"\u00cf\u00d0\u0003$\u0012\u0000\u00d0+\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0003&\u0013\u0000\u00d2\u00d3\u0005\u0019\u0000\u0000\u00d3\u00d4\u0003"+
		"$\u0012\u0000\u00d4-\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003&\u0013"+
		"\u0000\u00d6\u00d7\u0005\u0018\u0000\u0000\u00d7\u00d8\u0003$\u0012\u0000"+
		"\u00d8/\u0001\u0000\u0000\u0000\u00d9\u00da\u0007\u0000\u0000\u0000\u00da"+
		"1\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u000e\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0016\u0000\u0000\u00dd\u00ea\u0005\u001b\u0000\u0000\u00de\u00df"+
		"\u0005\u000e\u0000\u0000\u00df\u00e1\u0005\u0016\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u001b\u0000\u0000\u00e3\u00e5"+
		"\u0005\u0016\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea"+
		"\u0005\u001b\u0000\u0000\u00e9\u00db\u0001\u0000\u0000\u0000\u00e9\u00e0"+
		"\u0001\u0000\u0000\u0000\u00ea3\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		"\u001b\u0000\u0000\u00ec\u00ee\u0005\u0012\u0000\u0000\u00ed\u00ef\u0003"+
		"\u0006\u0003\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005"+
		"\u0013\u0000\u0000\u00f1\u00f2\u0003\f\u0006\u0000\u00f25\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0007\u0001\u0000\u0000\u00f47\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0005\u0001\u0000\u0000\u00f6\u00f7\u0005\u0012\u0000"+
		"\u0000\u00f7\u00f8\u0003$\u0012\u0000\u00f8\u00f9\u0005\u0013\u0000\u0000"+
		"\u00f9\u00fa\u0005\u0014\u0000\u0000\u00fa9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0005\u0002\u0000\u0000\u00fc\u00fd\u0003\f\u0006\u0000\u00fd;"+
		"\u0001\u0000\u0000\u0000\u0013?GMS_jq|\u0093\u009e\u00a5\u00b5\u00bb\u00c6"+
		"\u00cb\u00e0\u00e6\u00e9\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}