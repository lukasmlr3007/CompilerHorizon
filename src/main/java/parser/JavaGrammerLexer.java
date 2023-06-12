// Generated from C:/Users/fleck/Documents/CompilerHorizonCode/CompilerHorizon/src/main/java/parser\JavaGrammer.g4 by ANTLR 4.12.0
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaGrammerLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Class", "Static", "Assign", "Int", "Bool", "Char", "Void", 
			"While", "If", "Else", "New", "This", "AccessModifier", "OpenCurlyBracket", 
			"ClosedCurlyBracket", "OpenRoundBracket", "ClosedRoundBracket", "Semicolon", 
			"Comma", "Point", "Return", "LogicOperator", "RelationalOperator", "AdditiveOperator", 
			"IntValue", "BoolValue", "CharValue", "Identifier", "WS"
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


	public JavaGrammerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaGrammer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u0113\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00cc\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00e7\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00f2"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u00f7\b\u001a"+
		"\u000b\u001a\f\u001a\u00f8\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0104\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0004\u001d\u0109\b"+
		"\u001d\u000b\u001d\f\u001d\u010a\u0001\u001e\u0004\u001e\u010e\b\u001e"+
		"\u000b\u001e\f\u001e\u010f\u0001\u001e\u0001\u001e\u0000\u0000\u001f\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f\u0001\u0000\u0005"+
		"\u0002\u0000<<>>\u0003\u0000*+--//\u0001\u000009\u0002\u0000AZaz\u0003"+
		"\u0000\t\n\r\r  \u011d\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000"+
		"\u0000\u0003R\u0001\u0000\u0000\u0000\u0005y\u0001\u0000\u0000\u0000\u0007"+
		"\u007f\u0001\u0000\u0000\u0000\t\u0086\u0001\u0000\u0000\u0000\u000b\u0088"+
		"\u0001\u0000\u0000\u0000\r\u008c\u0001\u0000\u0000\u0000\u000f\u0094\u0001"+
		"\u0000\u0000\u0000\u0011\u0099\u0001\u0000\u0000\u0000\u0013\u009e\u0001"+
		"\u0000\u0000\u0000\u0015\u00a4\u0001\u0000\u0000\u0000\u0017\u00a7\u0001"+
		"\u0000\u0000\u0000\u0019\u00ac\u0001\u0000\u0000\u0000\u001b\u00b0\u0001"+
		"\u0000\u0000\u0000\u001d\u00cb\u0001\u0000\u0000\u0000\u001f\u00cd\u0001"+
		"\u0000\u0000\u0000!\u00cf\u0001\u0000\u0000\u0000#\u00d1\u0001\u0000\u0000"+
		"\u0000%\u00d3\u0001\u0000\u0000\u0000\'\u00d5\u0001\u0000\u0000\u0000"+
		")\u00d7\u0001\u0000\u0000\u0000+\u00d9\u0001\u0000\u0000\u0000-\u00db"+
		"\u0001\u0000\u0000\u0000/\u00e6\u0001\u0000\u0000\u00001\u00f1\u0001\u0000"+
		"\u0000\u00003\u00f3\u0001\u0000\u0000\u00005\u00f6\u0001\u0000\u0000\u0000"+
		"7\u0103\u0001\u0000\u0000\u00009\u0105\u0001\u0000\u0000\u0000;\u0108"+
		"\u0001\u0000\u0000\u0000=\u010d\u0001\u0000\u0000\u0000?@\u0005S\u0000"+
		"\u0000@A\u0005y\u0000\u0000AB\u0005s\u0000\u0000BC\u0005t\u0000\u0000"+
		"CD\u0005e\u0000\u0000DE\u0005m\u0000\u0000EF\u0005.\u0000\u0000FG\u0005"+
		"o\u0000\u0000GH\u0005u\u0000\u0000HI\u0005t\u0000\u0000IJ\u0005.\u0000"+
		"\u0000JK\u0005p\u0000\u0000KL\u0005r\u0000\u0000LM\u0005i\u0000\u0000"+
		"MN\u0005n\u0000\u0000NO\u0005t\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005"+
		"n\u0000\u0000Q\u0002\u0001\u0000\u0000\u0000RS\u0005p\u0000\u0000ST\u0005"+
		"u\u0000\u0000TU\u0005b\u0000\u0000UV\u0005l\u0000\u0000VW\u0005i\u0000"+
		"\u0000WX\u0005c\u0000\u0000XY\u0005 \u0000\u0000YZ\u0005s\u0000\u0000"+
		"Z[\u0005t\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005t\u0000\u0000]^\u0005"+
		"i\u0000\u0000^_\u0005c\u0000\u0000_`\u0005 \u0000\u0000`a\u0005v\u0000"+
		"\u0000ab\u0005o\u0000\u0000bc\u0005i\u0000\u0000cd\u0005d\u0000\u0000"+
		"de\u0005 \u0000\u0000ef\u0005m\u0000\u0000fg\u0005a\u0000\u0000gh\u0005"+
		"i\u0000\u0000hi\u0005n\u0000\u0000ij\u0005(\u0000\u0000jk\u0005S\u0000"+
		"\u0000kl\u0005t\u0000\u0000lm\u0005r\u0000\u0000mn\u0005i\u0000\u0000"+
		"no\u0005n\u0000\u0000op\u0005g\u0000\u0000pq\u0005[\u0000\u0000qr\u0005"+
		"]\u0000\u0000rs\u0005 \u0000\u0000st\u0005a\u0000\u0000tu\u0005r\u0000"+
		"\u0000uv\u0005g\u0000\u0000vw\u0005s\u0000\u0000wx\u0005)\u0000\u0000"+
		"x\u0004\u0001\u0000\u0000\u0000yz\u0005c\u0000\u0000z{\u0005l\u0000\u0000"+
		"{|\u0005a\u0000\u0000|}\u0005s\u0000\u0000}~\u0005s\u0000\u0000~\u0006"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005s\u0000\u0000\u0080\u0081\u0005"+
		"t\u0000\u0000\u0081\u0082\u0005a\u0000\u0000\u0082\u0083\u0005t\u0000"+
		"\u0000\u0083\u0084\u0005i\u0000\u0000\u0084\u0085\u0005c\u0000\u0000\u0085"+
		"\b\u0001\u0000\u0000\u0000\u0086\u0087\u0005=\u0000\u0000\u0087\n\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005i\u0000\u0000\u0089\u008a\u0005n\u0000"+
		"\u0000\u008a\u008b\u0005t\u0000\u0000\u008b\f\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005b\u0000\u0000\u008d\u008e\u0005o\u0000\u0000\u008e\u008f"+
		"\u0005o\u0000\u0000\u008f\u0090\u0005l\u0000\u0000\u0090\u0091\u0005e"+
		"\u0000\u0000\u0091\u0092\u0005a\u0000\u0000\u0092\u0093\u0005n\u0000\u0000"+
		"\u0093\u000e\u0001\u0000\u0000\u0000\u0094\u0095\u0005c\u0000\u0000\u0095"+
		"\u0096\u0005h\u0000\u0000\u0096\u0097\u0005a\u0000\u0000\u0097\u0098\u0005"+
		"r\u0000\u0000\u0098\u0010\u0001\u0000\u0000\u0000\u0099\u009a\u0005v\u0000"+
		"\u0000\u009a\u009b\u0005o\u0000\u0000\u009b\u009c\u0005i\u0000\u0000\u009c"+
		"\u009d\u0005d\u0000\u0000\u009d\u0012\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005w\u0000\u0000\u009f\u00a0\u0005h\u0000\u0000\u00a0\u00a1\u0005i"+
		"\u0000\u0000\u00a1\u00a2\u0005l\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000"+
		"\u00a3\u0014\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005i\u0000\u0000\u00a5"+
		"\u00a6\u0005f\u0000\u0000\u00a6\u0016\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005e\u0000\u0000\u00a8\u00a9\u0005l\u0000\u0000\u00a9\u00aa\u0005s"+
		"\u0000\u0000\u00aa\u00ab\u0005e\u0000\u0000\u00ab\u0018\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005n\u0000\u0000\u00ad\u00ae\u0005e\u0000\u0000\u00ae"+
		"\u00af\u0005w\u0000\u0000\u00af\u001a\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005t\u0000\u0000\u00b1\u00b2\u0005h\u0000\u0000\u00b2\u00b3\u0005i"+
		"\u0000\u0000\u00b3\u00b4\u0005s\u0000\u0000\u00b4\u001c\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005p\u0000\u0000\u00b6\u00b7\u0005u\u0000\u0000\u00b7"+
		"\u00b8\u0005b\u0000\u0000\u00b8\u00b9\u0005l\u0000\u0000\u00b9\u00ba\u0005"+
		"i\u0000\u0000\u00ba\u00cc\u0005c\u0000\u0000\u00bb\u00bc\u0005p\u0000"+
		"\u0000\u00bc\u00bd\u0005r\u0000\u0000\u00bd\u00be\u0005i\u0000\u0000\u00be"+
		"\u00bf\u0005v\u0000\u0000\u00bf\u00c0\u0005a\u0000\u0000\u00c0\u00c1\u0005"+
		"t\u0000\u0000\u00c1\u00cc\u0005e\u0000\u0000\u00c2\u00c3\u0005p\u0000"+
		"\u0000\u00c3\u00c4\u0005r\u0000\u0000\u00c4\u00c5\u0005o\u0000\u0000\u00c5"+
		"\u00c6\u0005t\u0000\u0000\u00c6\u00c7\u0005e\u0000\u0000\u00c7\u00c8\u0005"+
		"c\u0000\u0000\u00c8\u00c9\u0005t\u0000\u0000\u00c9\u00ca\u0005e\u0000"+
		"\u0000\u00ca\u00cc\u0005d\u0000\u0000\u00cb\u00b5\u0001\u0000\u0000\u0000"+
		"\u00cb\u00bb\u0001\u0000\u0000\u0000\u00cb\u00c2\u0001\u0000\u0000\u0000"+
		"\u00cc\u001e\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005{\u0000\u0000\u00ce"+
		" \u0001\u0000\u0000\u0000\u00cf\u00d0\u0005}\u0000\u0000\u00d0\"\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0005(\u0000\u0000\u00d2$\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0005)\u0000\u0000\u00d4&\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005;\u0000\u0000\u00d6(\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		",\u0000\u0000\u00d8*\u0001\u0000\u0000\u0000\u00d9\u00da\u0005.\u0000"+
		"\u0000\u00da,\u0001\u0000\u0000\u0000\u00db\u00dc\u0005r\u0000\u0000\u00dc"+
		"\u00dd\u0005e\u0000\u0000\u00dd\u00de\u0005t\u0000\u0000\u00de\u00df\u0005"+
		"u\u0000\u0000\u00df\u00e0\u0005r\u0000\u0000\u00e0\u00e1\u0005n\u0000"+
		"\u0000\u00e1.\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005&\u0000\u0000\u00e3"+
		"\u00e7\u0005&\u0000\u0000\u00e4\u00e5\u0005|\u0000\u0000\u00e5\u00e7\u0005"+
		"|\u0000\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e70\u0001\u0000\u0000\u0000\u00e8\u00f2\u0007\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005<\u0000\u0000\u00ea\u00f2\u0005=\u0000\u0000\u00eb"+
		"\u00ec\u0005>\u0000\u0000\u00ec\u00f2\u0005=\u0000\u0000\u00ed\u00ee\u0005"+
		"=\u0000\u0000\u00ee\u00f2\u0005=\u0000\u0000\u00ef\u00f0\u0005!\u0000"+
		"\u0000\u00f0\u00f2\u0005=\u0000\u0000\u00f1\u00e8\u0001\u0000\u0000\u0000"+
		"\u00f1\u00e9\u0001\u0000\u0000\u0000\u00f1\u00eb\u0001\u0000\u0000\u0000"+
		"\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f22\u0001\u0000\u0000\u0000\u00f3\u00f4\u0007\u0001\u0000\u0000\u00f4"+
		"4\u0001\u0000\u0000\u0000\u00f5\u00f7\u0007\u0002\u0000\u0000\u00f6\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f96\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0005t\u0000\u0000\u00fb\u00fc\u0005r\u0000"+
		"\u0000\u00fc\u00fd\u0005u\u0000\u0000\u00fd\u0104\u0005e\u0000\u0000\u00fe"+
		"\u00ff\u0005f\u0000\u0000\u00ff\u0100\u0005a\u0000\u0000\u0100\u0101\u0005"+
		"l\u0000\u0000\u0101\u0102\u0005s\u0000\u0000\u0102\u0104\u0005e\u0000"+
		"\u0000\u0103\u00fa\u0001\u0000\u0000\u0000\u0103\u00fe\u0001\u0000\u0000"+
		"\u0000\u01048\u0001\u0000\u0000\u0000\u0105\u0106\u0007\u0003\u0000\u0000"+
		"\u0106:\u0001\u0000\u0000\u0000\u0107\u0109\u0007\u0003\u0000\u0000\u0108"+
		"\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b"+
		"<\u0001\u0000\u0000\u0000\u010c\u010e\u0007\u0004\u0000\u0000\u010d\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0006\u001e\u0000\u0000\u0112>\u0001"+
		"\u0000\u0000\u0000\b\u0000\u00cb\u00e6\u00f1\u00f8\u0103\u010a\u010f\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}