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
		AdditiveOperator=26, IntValue=27, BoolValue=28, CharValue=29, Identifier=30, 
		WS=31;
	public static final int
		RULE_program = 0, RULE_classdecl = 1, RULE_main = 2, RULE_myconstructor = 3, 
		RULE_fielddecl = 4, RULE_parameters = 5, RULE_parameterdecl = 6, RULE_parameterValues = 7, 
		RULE_methoddecl = 8, RULE_block = 9, RULE_statement = 10, RULE_localVarDecl = 11, 
		RULE_whileStatement = 12, RULE_ifElseStatement = 13, RULE_statementExpression = 14, 
		RULE_assign = 15, RULE_methodCall = 16, RULE_reciever = 17, RULE_extraMethod = 18, 
		RULE_myNew = 19, RULE_returnStatement = 20, RULE_expression = 21, RULE_partExpression = 22, 
		RULE_binaryExpression = 23, RULE_additiveExpression = 24, RULE_relationalExpression = 25, 
		RULE_logicalExpression = 26, RULE_literals = 27, RULE_instanceVariable = 28, 
		RULE_type = 29, RULE_sysout = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classdecl", "main", "myconstructor", "fielddecl", "parameters", 
			"parameterdecl", "parameterValues", "methoddecl", "block", "statement", 
			"localVarDecl", "whileStatement", "ifElseStatement", "statementExpression", 
			"assign", "methodCall", "reciever", "extraMethod", "myNew", "returnStatement", 
			"expression", "partExpression", "binaryExpression", "additiveExpression", 
			"relationalExpression", "logicalExpression", "literals", "instanceVariable", 
			"type", "sysout"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public static void main(String[] args)'", "'System.out.println'", 
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
			"IntValue", "BoolValue", "CharValue", "Identifier", "WS"
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
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				classdecl();
				}
				}
				setState(65); 
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<MyconstructorContext> myconstructor() {
			return getRuleContexts(MyconstructorContext.class);
		}
		public MyconstructorContext myconstructor(int i) {
			return getRuleContext(MyconstructorContext.class,i);
		}
		public List<FielddeclContext> fielddecl() {
			return getRuleContexts(FielddeclContext.class);
		}
		public FielddeclContext fielddecl(int i) {
			return getRuleContext(FielddeclContext.class,i);
		}
		public List<MethoddeclContext> methoddecl() {
			return getRuleContexts(MethoddeclContext.class);
		}
		public MethoddeclContext methoddecl(int i) {
			return getRuleContext(MethoddeclContext.class,i);
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
			setState(67);
			match(Class);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(68);
				main();
				}
			}

			setState(71);
			match(Identifier);
			setState(72);
			match(OpenCurlyBracket);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AccessModifier) {
				{
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(73);
					myconstructor();
					}
					break;
				case 2:
					{
					setState(74);
					fielddecl();
					}
					break;
				case 3:
					{
					setState(75);
					methoddecl();
					}
					break;
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__0);
			setState(84);
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
	public static class MyconstructorContext extends ParserRuleContext {
		public TerminalNode AccessModifier() { return getToken(JavaGrammerParser.AccessModifier, 0); }
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaGrammerParser.OpenRoundBracket, 0); }
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MyconstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myconstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterMyconstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitMyconstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitMyconstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyconstructorContext myconstructor() throws RecognitionException {
		MyconstructorContext _localctx = new MyconstructorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_myconstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(AccessModifier);
			setState(87);
			match(Identifier);
			setState(88);
			match(OpenRoundBracket);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073742784L) != 0)) {
				{
				setState(89);
				parameters();
				}
			}

			setState(92);
			match(ClosedRoundBracket);
			setState(93);
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
		enterRule(_localctx, 8, RULE_fielddecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(AccessModifier);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(96);
				match(Static);
				}
			}

			setState(99);
			type();
			setState(100);
			match(Identifier);
			setState(101);
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
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			parameterdecl();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(104);
				match(Comma);
				setState(105);
				parameterdecl();
				}
				}
				setState(110);
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
		enterRule(_localctx, 12, RULE_parameterdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			type();
			setState(112);
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
		enterRule(_localctx, 14, RULE_parameterValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			partExpression();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(115);
				match(Comma);
				setState(116);
				partExpression();
				}
				}
				setState(121);
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
	public static class MethoddeclContext extends ParserRuleContext {
		public TerminalNode AccessModifier() { return getToken(JavaGrammerParser.AccessModifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaGrammerParser.OpenRoundBracket, 0); }
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Static() { return getToken(JavaGrammerParser.Static, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethoddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methoddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).enterMethoddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaGrammerListener ) ((JavaGrammerListener)listener).exitMethoddecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaGrammerVisitor ) return ((JavaGrammerVisitor<? extends T>)visitor).visitMethoddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethoddeclContext methoddecl() throws RecognitionException {
		MethoddeclContext _localctx = new MethoddeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methoddecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(AccessModifier);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Static) {
				{
				setState(123);
				match(Static);
				}
			}

			setState(126);
			type();
			setState(127);
			match(Identifier);
			setState(128);
			match(OpenRoundBracket);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073742784L) != 0)) {
				{
				setState(129);
				parameters();
				}
			}

			setState(132);
			match(ClosedRoundBracket);
			setState(133);
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
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(OpenCurlyBracket);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1082224580L) != 0)) {
				{
				{
				setState(136);
				statement();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
		public SysoutContext sysout() {
			return getRuleContext(SysoutContext.class,0);
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
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				localVarDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				ifElseStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				statementExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				sysout();
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
		enterRule(_localctx, 22, RULE_localVarDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			type();
			setState(154);
			match(Identifier);
			setState(155);
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
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(While);
			setState(158);
			match(OpenRoundBracket);
			setState(159);
			expression();
			setState(160);
			match(ClosedRoundBracket);
			setState(161);
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
		enterRule(_localctx, 26, RULE_ifElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(If);
			setState(164);
			match(OpenRoundBracket);
			setState(165);
			expression();
			setState(166);
			match(ClosedRoundBracket);
			setState(167);
			block();
			setState(168);
			match(Else);
			setState(169);
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
		enterRule(_localctx, 28, RULE_statementExpression);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
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
		enterRule(_localctx, 30, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			instanceVariable();
			setState(177);
			match(Assign);
			setState(178);
			expression();
			setState(179);
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
		enterRule(_localctx, 32, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			reciever();
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				extraMethod();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Point );
			setState(187);
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
		enterRule(_localctx, 34, RULE_reciever);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(This);
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
				instanceVariable();
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
	public static class ExtraMethodContext extends ParserRuleContext {
		public TerminalNode Point() { return getToken(JavaGrammerParser.Point, 0); }
		public TerminalNode Identifier() { return getToken(JavaGrammerParser.Identifier, 0); }
		public TerminalNode OpenRoundBracket() { return getToken(JavaGrammerParser.OpenRoundBracket, 0); }
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_extraMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(Point);
			setState(195);
			match(Identifier);
			setState(196);
			match(OpenRoundBracket);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013552640L) != 0)) {
				{
				setState(197);
				parameterValues();
				}
			}

			setState(200);
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
		public TerminalNode ClosedRoundBracket() { return getToken(JavaGrammerParser.ClosedRoundBracket, 0); }
		public TerminalNode Semicolon() { return getToken(JavaGrammerParser.Semicolon, 0); }
		public ParameterValuesContext parameterValues() {
			return getRuleContext(ParameterValuesContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_myNew);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(New);
			setState(203);
			match(Identifier);
			setState(204);
			match(OpenRoundBracket);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013552640L) != 0)) {
				{
				setState(205);
				parameterValues();
				}
			}

			setState(208);
			match(ClosedRoundBracket);
			setState(209);
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
		enterRule(_localctx, 40, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(Return);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013552640L) != 0)) {
				{
				setState(212);
				expression();
				}
			}

			setState(215);
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
		enterRule(_localctx, 42, RULE_expression);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				partExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
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
		enterRule(_localctx, 44, RULE_partExpression);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				literals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(This);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				statementExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				instanceVariable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(OpenRoundBracket);
				setState(227);
				expression();
				setState(228);
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
		enterRule(_localctx, 46, RULE_binaryExpression);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				additiveExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				logicalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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
		enterRule(_localctx, 48, RULE_additiveExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			partExpression();
			setState(238);
			match(AdditiveOperator);
			setState(239);
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
		enterRule(_localctx, 50, RULE_relationalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			partExpression();
			setState(242);
			match(RelationalOperator);
			setState(243);
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
		enterRule(_localctx, 52, RULE_logicalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			partExpression();
			setState(246);
			match(LogicOperator);
			setState(247);
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
		enterRule(_localctx, 54, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_instanceVariable);
		int _la;
		try {
			int _alt;
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(This);
				setState(252);
				match(Point);
				setState(253);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==This) {
					{
					setState(254);
					match(This);
					setState(255);
					match(Point);
					}
				}

				setState(260); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(258);
						match(Identifier);
						setState(259);
						match(Point);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(262); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(264);
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
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1073742784L) != 0)) ) {
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
		enterRule(_localctx, 60, RULE_sysout);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__1);
			setState(270);
			match(OpenRoundBracket);
			setState(271);
			expression();
			setState(272);
			match(ClosedRoundBracket);
			setState(273);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0114\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0001\u0000\u0004\u0000@\b\u0000\u000b\u0000\f\u0000A\u0001\u0001"+
		"\u0001\u0001\u0003\u0001F\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001M\b\u0001\n\u0001\f\u0001P\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004b\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005k\b\u0005\n\u0005\f\u0005n\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"v\b\u0007\n\u0007\f\u0007y\t\u0007\u0001\b\u0001\b\u0003\b}\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0083\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\t\u008a\b\t\n\t\f\t\u008d\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0098\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00af\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u00b8\b\u0010\u000b\u0010\f\u0010\u00b9\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c1"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c7"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00cf\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00d6\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00dc\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00e7\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00ec\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0101\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0004\u001c\u0105\b\u001c\u000b\u001c\f\u001c\u0106\u0001\u001c"+
		"\u0003\u001c\u010a\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0000\u0000"+
		"\u001f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<\u0000\u0002\u0001\u0000\u001b\u001d"+
		"\u0002\u0000\u0006\t\u001e\u001e\u0119\u0000?\u0001\u0000\u0000\u0000"+
		"\u0002C\u0001\u0000\u0000\u0000\u0004S\u0001\u0000\u0000\u0000\u0006V"+
		"\u0001\u0000\u0000\u0000\b_\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000"+
		"\u0000\fo\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010"+
		"z\u0001\u0000\u0000\u0000\u0012\u0087\u0001\u0000\u0000\u0000\u0014\u0097"+
		"\u0001\u0000\u0000\u0000\u0016\u0099\u0001\u0000\u0000\u0000\u0018\u009d"+
		"\u0001\u0000\u0000\u0000\u001a\u00a3\u0001\u0000\u0000\u0000\u001c\u00ae"+
		"\u0001\u0000\u0000\u0000\u001e\u00b0\u0001\u0000\u0000\u0000 \u00b5\u0001"+
		"\u0000\u0000\u0000\"\u00c0\u0001\u0000\u0000\u0000$\u00c2\u0001\u0000"+
		"\u0000\u0000&\u00ca\u0001\u0000\u0000\u0000(\u00d3\u0001\u0000\u0000\u0000"+
		"*\u00db\u0001\u0000\u0000\u0000,\u00e6\u0001\u0000\u0000\u0000.\u00eb"+
		"\u0001\u0000\u0000\u00000\u00ed\u0001\u0000\u0000\u00002\u00f1\u0001\u0000"+
		"\u0000\u00004\u00f5\u0001\u0000\u0000\u00006\u00f9\u0001\u0000\u0000\u0000"+
		"8\u0109\u0001\u0000\u0000\u0000:\u010b\u0001\u0000\u0000\u0000<\u010d"+
		"\u0001\u0000\u0000\u0000>@\u0003\u0002\u0001\u0000?>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B\u0001\u0001\u0000\u0000\u0000CE\u0005\u0003\u0000\u0000"+
		"DF\u0003\u0004\u0002\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u001e\u0000\u0000HN\u0005\u0010"+
		"\u0000\u0000IM\u0003\u0006\u0003\u0000JM\u0003\b\u0004\u0000KM\u0003\u0010"+
		"\b\u0000LI\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000"+
		"\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001"+
		"\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"+
		"QR\u0005\u0011\u0000\u0000R\u0003\u0001\u0000\u0000\u0000ST\u0005\u0001"+
		"\u0000\u0000TU\u0003\u0012\t\u0000U\u0005\u0001\u0000\u0000\u0000VW\u0005"+
		"\u000f\u0000\u0000WX\u0005\u001e\u0000\u0000XZ\u0005\u0012\u0000\u0000"+
		"Y[\u0003\n\u0005\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\]\u0005\u0013\u0000\u0000]^\u0003\u0012\t"+
		"\u0000^\u0007\u0001\u0000\u0000\u0000_a\u0005\u000f\u0000\u0000`b\u0005"+
		"\u0004\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000cd\u0003:\u001d\u0000de\u0005\u001e\u0000\u0000"+
		"ef\u0005\u0014\u0000\u0000f\t\u0001\u0000\u0000\u0000gl\u0003\f\u0006"+
		"\u0000hi\u0005\u0015\u0000\u0000ik\u0003\f\u0006\u0000jh\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000m\u000b\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"op\u0003:\u001d\u0000pq\u0005\u001e\u0000\u0000q\r\u0001\u0000\u0000\u0000"+
		"rw\u0003,\u0016\u0000st\u0005\u0015\u0000\u0000tv\u0003,\u0016\u0000u"+
		"s\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u000f\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000z|\u0005\u000f\u0000\u0000{}\u0005\u0004\u0000\u0000"+
		"|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u007f\u0003:\u001d\u0000\u007f\u0080\u0005\u001e\u0000\u0000\u0080"+
		"\u0082\u0005\u0012\u0000\u0000\u0081\u0083\u0003\n\u0005\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0013\u0000\u0000\u0085\u0086"+
		"\u0003\u0012\t\u0000\u0086\u0011\u0001\u0000\u0000\u0000\u0087\u008b\u0005"+
		"\u0010\u0000\u0000\u0088\u008a\u0003\u0014\n\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000"+
		"\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0011"+
		"\u0000\u0000\u008f\u0013\u0001\u0000\u0000\u0000\u0090\u0098\u0003\u0012"+
		"\t\u0000\u0091\u0098\u0003\u0016\u000b\u0000\u0092\u0098\u0003\u0018\f"+
		"\u0000\u0093\u0098\u0003\u001a\r\u0000\u0094\u0098\u0003\u001c\u000e\u0000"+
		"\u0095\u0098\u0003(\u0014\u0000\u0096\u0098\u0003<\u001e\u0000\u0097\u0090"+
		"\u0001\u0000\u0000\u0000\u0097\u0091\u0001\u0000\u0000\u0000\u0097\u0092"+
		"\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0094"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096"+
		"\u0001\u0000\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0003:\u001d\u0000\u009a\u009b\u0005\u001e\u0000\u0000\u009b\u009c\u0005"+
		"\u0014\u0000\u0000\u009c\u0017\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\n\u0000\u0000\u009e\u009f\u0005\u0012\u0000\u0000\u009f\u00a0\u0003*"+
		"\u0015\u0000\u00a0\u00a1\u0005\u0013\u0000\u0000\u00a1\u00a2\u0003\u0012"+
		"\t\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u000b\u0000"+
		"\u0000\u00a4\u00a5\u0005\u0012\u0000\u0000\u00a5\u00a6\u0003*\u0015\u0000"+
		"\u00a6\u00a7\u0005\u0013\u0000\u0000\u00a7\u00a8\u0003\u0012\t\u0000\u00a8"+
		"\u00a9\u0005\f\u0000\u0000\u00a9\u00aa\u0003\u0012\t\u0000\u00aa\u001b"+
		"\u0001\u0000\u0000\u0000\u00ab\u00af\u0003\u001e\u000f\u0000\u00ac\u00af"+
		"\u0003 \u0010\u0000\u00ad\u00af\u0003&\u0013\u0000\u00ae\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u001d\u0001\u0000\u0000\u0000\u00b0\u00b1\u00038\u001c"+
		"\u0000\u00b1\u00b2\u0005\u0005\u0000\u0000\u00b2\u00b3\u0003*\u0015\u0000"+
		"\u00b3\u00b4\u0005\u0014\u0000\u0000\u00b4\u001f\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b7\u0003\"\u0011\u0000\u00b6\u00b8\u0003$\u0012\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0014\u0000\u0000\u00bc"+
		"!\u0001\u0000\u0000\u0000\u00bd\u00c1\u0005\u000e\u0000\u0000\u00be\u00c1"+
		"\u0005\u001e\u0000\u0000\u00bf\u00c1\u00038\u001c\u0000\u00c0\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1#\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0016"+
		"\u0000\u0000\u00c3\u00c4\u0005\u001e\u0000\u0000\u00c4\u00c6\u0005\u0012"+
		"\u0000\u0000\u00c5\u00c7\u0003\u000e\u0007\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005\u0013\u0000\u0000\u00c9%\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005\r\u0000\u0000\u00cb\u00cc\u0005\u001e\u0000\u0000"+
		"\u00cc\u00ce\u0005\u0012\u0000\u0000\u00cd\u00cf\u0003\u000e\u0007\u0000"+
		"\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0013\u0000\u0000"+
		"\u00d1\u00d2\u0005\u0014\u0000\u0000\u00d2\'\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d5\u0005\u0017\u0000\u0000\u00d4\u00d6\u0003*\u0015\u0000\u00d5\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0014\u0000\u0000\u00d8)\u0001"+
		"\u0000\u0000\u0000\u00d9\u00dc\u0003,\u0016\u0000\u00da\u00dc\u0003.\u0017"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc+\u0001\u0000\u0000\u0000\u00dd\u00e7\u00036\u001b\u0000\u00de"+
		"\u00e7\u0005\u001e\u0000\u0000\u00df\u00e7\u0005\u000e\u0000\u0000\u00e0"+
		"\u00e7\u0003\u001c\u000e\u0000\u00e1\u00e7\u00038\u001c\u0000\u00e2\u00e3"+
		"\u0005\u0012\u0000\u0000\u00e3\u00e4\u0003*\u0015\u0000\u00e4\u00e5\u0005"+
		"\u0013\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e6\u00de\u0001\u0000\u0000\u0000\u00e6\u00df\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e0\u0001\u0000\u0000\u0000\u00e6\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e7-\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ec\u00030\u0018\u0000\u00e9\u00ec\u00034\u001a\u0000"+
		"\u00ea\u00ec\u00032\u0019\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"/\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003,\u0016\u0000\u00ee\u00ef\u0005"+
		"\u001a\u0000\u0000\u00ef\u00f0\u0003*\u0015\u0000\u00f01\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0003,\u0016\u0000\u00f2\u00f3\u0005\u0019\u0000\u0000"+
		"\u00f3\u00f4\u0003*\u0015\u0000\u00f43\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0003,\u0016\u0000\u00f6\u00f7\u0005\u0018\u0000\u0000\u00f7\u00f8\u0003"+
		"*\u0015\u0000\u00f85\u0001\u0000\u0000\u0000\u00f9\u00fa\u0007\u0000\u0000"+
		"\u0000\u00fa7\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u000e\u0000\u0000"+
		"\u00fc\u00fd\u0005\u0016\u0000\u0000\u00fd\u010a\u0005\u001e\u0000\u0000"+
		"\u00fe\u00ff\u0005\u000e\u0000\u0000\u00ff\u0101\u0005\u0016\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u001e\u0000\u0000"+
		"\u0103\u0105\u0005\u0016\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u010a\u0005\u001e\u0000\u0000\u0109\u00fb\u0001\u0000\u0000\u0000"+
		"\u0109\u0100\u0001\u0000\u0000\u0000\u010a9\u0001\u0000\u0000\u0000\u010b"+
		"\u010c\u0007\u0001\u0000\u0000\u010c;\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005\u0002\u0000\u0000\u010e\u010f\u0005\u0012\u0000\u0000\u010f\u0110"+
		"\u0003*\u0015\u0000\u0110\u0111\u0005\u0013\u0000\u0000\u0111\u0112\u0005"+
		"\u0014\u0000\u0000\u0112=\u0001\u0000\u0000\u0000\u0018AELNZalw|\u0082"+
		"\u008b\u0097\u00ae\u00b9\u00c0\u00c6\u00ce\u00d5\u00db\u00e6\u00eb\u0100"+
		"\u0106\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}