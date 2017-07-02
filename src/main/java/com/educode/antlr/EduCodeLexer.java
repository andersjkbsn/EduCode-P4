// Generated from C:/Users/User/Desktop/EduCode-P4/src\EduCode.g4 by ANTLR 4.6
package com.educode.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EduCodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, NUMBER_LITERAL=58, STRING_LITERAL=59, 
		UNTERMINATED_STRING_LITERAL=60, BOOL_LITERAL=61, NULL_LITERAL=62, IDENTIFIER=63, 
		NEWLINE=64, LPAREN=65, RPAREN=66, WHITESPACE=67, LINECOMMENT=68;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"LowerChar", "UpperChar", "Digit", "NewLine", "USym", "NUMBER_LITERAL", 
		"STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", "BOOL_LITERAL", "NULL_LITERAL", 
		"IDENTIFIER", "NEWLINE", "LPAREN", "RPAREN", "WHITESPACE", "LINECOMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'using'", "'program'", "'end'", "'on'", "'event'", "'call'", "'method'", 
		"'returns'", "','", "'break'", "'continue'", "'return'", "'repeat'", "'while'", 
		"'if'", "'then'", "'else'", "'foreach'", "'in'", "'='", "'+='", "'-='", 
		"'*='", "'/='", "'or'", "'and'", "'equals'", "'not equals'", "'>'", "'<'", 
		"'>='", "'<='", "'+'", "'-'", "'/'", "'*'", "'modulo'", "'not'", "'.'", 
		"'['", "']'", "'new'", "'robotDeath'", "'robotAttacked'", "'entityDeath'", 
		"'chatMessage'", "'stringMessageReceived'", "'entityMessageReceived'", 
		"'number'", "'bool'", "'coordinates'", "'string'", "'Collection'", "'Entity'", 
		"'Item'", "'range'", "'to'", null, null, null, null, "'null'", null, null, 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "NUMBER_LITERAL", 
		"STRING_LITERAL", "UNTERMINATED_STRING_LITERAL", "BOOL_LITERAL", "NULL_LITERAL", 
		"IDENTIFIER", "NEWLINE", "LPAREN", "RPAREN", "WHITESPACE", "LINECOMMENT"
	};
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


	public EduCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EduCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2F\u0248\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'"+
		"\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\6@\u01f7\n@\r@\16@\u01f8\3@\3@\7@\u01fd"+
		"\n@\f@\16@\u0200\13@\5@\u0202\n@\3A\3A\3A\3B\3B\3B\3B\3B\5B\u020c\nB\7"+
		"B\u020e\nB\fB\16B\u0211\13B\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u021c\nC\3D"+
		"\3D\3D\3D\3D\3E\3E\3E\5E\u0226\nE\3E\3E\3E\3E\7E\u022c\nE\fE\16E\u022f"+
		"\13E\3F\3F\3G\3G\3H\3H\3I\6I\u0238\nI\rI\16I\u0239\3I\3I\3J\3J\3J\3J\7"+
		"J\u0242\nJ\fJ\16J\u0245\13J\3J\3J\2\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u\2w\2y\2{\2}\2\177<\u0081=\u0083"+
		">\u0085?\u0087@\u0089A\u008bB\u008dC\u008fD\u0091E\u0093F\3\2\b\3\2c|"+
		"\3\2C\\\3\2\62;\6\2\f\f\17\17$$^^\5\2\13\13\17\17\"\"\4\2\f\f\17\17\u0251"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095"+
		"\3\2\2\2\5\u009b\3\2\2\2\7\u00a3\3\2\2\2\t\u00a7\3\2\2\2\13\u00aa\3\2"+
		"\2\2\r\u00b0\3\2\2\2\17\u00b5\3\2\2\2\21\u00bc\3\2\2\2\23\u00c4\3\2\2"+
		"\2\25\u00c6\3\2\2\2\27\u00cc\3\2\2\2\31\u00d5\3\2\2\2\33\u00dc\3\2\2\2"+
		"\35\u00e3\3\2\2\2\37\u00e9\3\2\2\2!\u00ec\3\2\2\2#\u00f1\3\2\2\2%\u00f6"+
		"\3\2\2\2\'\u00fe\3\2\2\2)\u0101\3\2\2\2+\u0103\3\2\2\2-\u0106\3\2\2\2"+
		"/\u0109\3\2\2\2\61\u010c\3\2\2\2\63\u010f\3\2\2\2\65\u0112\3\2\2\2\67"+
		"\u0116\3\2\2\29\u011d\3\2\2\2;\u0128\3\2\2\2=\u012a\3\2\2\2?\u012c\3\2"+
		"\2\2A\u012f\3\2\2\2C\u0132\3\2\2\2E\u0134\3\2\2\2G\u0136\3\2\2\2I\u0138"+
		"\3\2\2\2K\u013a\3\2\2\2M\u0141\3\2\2\2O\u0145\3\2\2\2Q\u0147\3\2\2\2S"+
		"\u0149\3\2\2\2U\u014b\3\2\2\2W\u014f\3\2\2\2Y\u015a\3\2\2\2[\u0168\3\2"+
		"\2\2]\u0174\3\2\2\2_\u0180\3\2\2\2a\u0196\3\2\2\2c\u01ac\3\2\2\2e\u01b3"+
		"\3\2\2\2g\u01b8\3\2\2\2i\u01c4\3\2\2\2k\u01cb\3\2\2\2m\u01d6\3\2\2\2o"+
		"\u01dd\3\2\2\2q\u01e2\3\2\2\2s\u01e8\3\2\2\2u\u01eb\3\2\2\2w\u01ed\3\2"+
		"\2\2y\u01ef\3\2\2\2{\u01f1\3\2\2\2}\u01f3\3\2\2\2\177\u01f6\3\2\2\2\u0081"+
		"\u0203\3\2\2\2\u0083\u0206\3\2\2\2\u0085\u021b\3\2\2\2\u0087\u021d\3\2"+
		"\2\2\u0089\u0225\3\2\2\2\u008b\u0230\3\2\2\2\u008d\u0232\3\2\2\2\u008f"+
		"\u0234\3\2\2\2\u0091\u0237\3\2\2\2\u0093\u023d\3\2\2\2\u0095\u0096\7w"+
		"\2\2\u0096\u0097\7u\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a"+
		"\7i\2\2\u009a\4\3\2\2\2\u009b\u009c\7r\2\2\u009c\u009d\7t\2\2\u009d\u009e"+
		"\7q\2\2\u009e\u009f\7i\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7o\2\2\u00a2\6\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		"\u00a6\7f\2\2\u00a6\b\3\2\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\n\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af\f\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7n\2\2\u00b4\16\3\2\2\2\u00b5"+
		"\u00b6\7o\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7j\2\2"+
		"\u00b9\u00ba\7q\2\2\u00ba\u00bb\7f\2\2\u00bb\20\3\2\2\2\u00bc\u00bd\7"+
		"t\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1"+
		"\7t\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7u\2\2\u00c3\22\3\2\2\2\u00c4\u00c5"+
		"\7.\2\2\u00c5\24\3\2\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7m\2\2\u00cb\26\3\2\2\2\u00cc\u00cd"+
		"\7e\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7g\2\2"+
		"\u00d4\30\3\2\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7"+
		"v\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7p\2\2\u00db\32"+
		"\3\2\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7r\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7v\2\2\u00e2\34\3\2\2\2\u00e3"+
		"\u00e4\7y\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7n\2\2"+
		"\u00e7\u00e8\7g\2\2\u00e8\36\3\2\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7"+
		"h\2\2\u00eb \3\2\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7j\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\"\3\2\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3"+
		"\7n\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7g\2\2\u00f5$\3\2\2\2\u00f6\u00f7"+
		"\7h\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7g\2\2\u00fa"+
		"\u00fb\7c\2\2\u00fb\u00fc\7e\2\2\u00fc\u00fd\7j\2\2\u00fd&\3\2\2\2\u00fe"+
		"\u00ff\7k\2\2\u00ff\u0100\7p\2\2\u0100(\3\2\2\2\u0101\u0102\7?\2\2\u0102"+
		"*\3\2\2\2\u0103\u0104\7-\2\2\u0104\u0105\7?\2\2\u0105,\3\2\2\2\u0106\u0107"+
		"\7/\2\2\u0107\u0108\7?\2\2\u0108.\3\2\2\2\u0109\u010a\7,\2\2\u010a\u010b"+
		"\7?\2\2\u010b\60\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\7?\2\2\u010e"+
		"\62\3\2\2\2\u010f\u0110\7q\2\2\u0110\u0111\7t\2\2\u0111\64\3\2\2\2\u0112"+
		"\u0113\7c\2\2\u0113\u0114\7p\2\2\u0114\u0115\7f\2\2\u0115\66\3\2\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7s\2\2\u0118\u0119\7w\2\2\u0119\u011a\7c\2\2"+
		"\u011a\u011b\7n\2\2\u011b\u011c\7u\2\2\u011c8\3\2\2\2\u011d\u011e\7p\2"+
		"\2\u011e\u011f\7q\2\2\u011f\u0120\7v\2\2\u0120\u0121\7\"\2\2\u0121\u0122"+
		"\7g\2\2\u0122\u0123\7s\2\2\u0123\u0124\7w\2\2\u0124\u0125\7c\2\2\u0125"+
		"\u0126\7n\2\2\u0126\u0127\7u\2\2\u0127:\3\2\2\2\u0128\u0129\7@\2\2\u0129"+
		"<\3\2\2\2\u012a\u012b\7>\2\2\u012b>\3\2\2\2\u012c\u012d\7@\2\2\u012d\u012e"+
		"\7?\2\2\u012e@\3\2\2\2\u012f\u0130\7>\2\2\u0130\u0131\7?\2\2\u0131B\3"+
		"\2\2\2\u0132\u0133\7-\2\2\u0133D\3\2\2\2\u0134\u0135\7/\2\2\u0135F\3\2"+
		"\2\2\u0136\u0137\7\61\2\2\u0137H\3\2\2\2\u0138\u0139\7,\2\2\u0139J\3\2"+
		"\2\2\u013a\u013b\7o\2\2\u013b\u013c\7q\2\2\u013c\u013d\7f\2\2\u013d\u013e"+
		"\7w\2\2\u013e\u013f\7n\2\2\u013f\u0140\7q\2\2\u0140L\3\2\2\2\u0141\u0142"+
		"\7p\2\2\u0142\u0143\7q\2\2\u0143\u0144\7v\2\2\u0144N\3\2\2\2\u0145\u0146"+
		"\7\60\2\2\u0146P\3\2\2\2\u0147\u0148\7]\2\2\u0148R\3\2\2\2\u0149\u014a"+
		"\7_\2\2\u014aT\3\2\2\2\u014b\u014c\7p\2\2\u014c\u014d\7g\2\2\u014d\u014e"+
		"\7y\2\2\u014eV\3\2\2\2\u014f\u0150\7t\2\2\u0150\u0151\7q\2\2\u0151\u0152"+
		"\7d\2\2\u0152\u0153\7q\2\2\u0153\u0154\7v\2\2\u0154\u0155\7F\2\2\u0155"+
		"\u0156\7g\2\2\u0156\u0157\7c\2\2\u0157\u0158\7v\2\2\u0158\u0159\7j\2\2"+
		"\u0159X\3\2\2\2\u015a\u015b\7t\2\2\u015b\u015c\7q\2\2\u015c\u015d\7d\2"+
		"\2\u015d\u015e\7q\2\2\u015e\u015f\7v\2\2\u015f\u0160\7C\2\2\u0160\u0161"+
		"\7v\2\2\u0161\u0162\7v\2\2\u0162\u0163\7c\2\2\u0163\u0164\7e\2\2\u0164"+
		"\u0165\7m\2\2\u0165\u0166\7g\2\2\u0166\u0167\7f\2\2\u0167Z\3\2\2\2\u0168"+
		"\u0169\7g\2\2\u0169\u016a\7p\2\2\u016a\u016b\7v\2\2\u016b\u016c\7k\2\2"+
		"\u016c\u016d\7v\2\2\u016d\u016e\7{\2\2\u016e\u016f\7F\2\2\u016f\u0170"+
		"\7g\2\2\u0170\u0171\7c\2\2\u0171\u0172\7v\2\2\u0172\u0173\7j\2\2\u0173"+
		"\\\3\2\2\2\u0174\u0175\7e\2\2\u0175\u0176\7j\2\2\u0176\u0177\7c\2\2\u0177"+
		"\u0178\7v\2\2\u0178\u0179\7O\2\2\u0179\u017a\7g\2\2\u017a\u017b\7u\2\2"+
		"\u017b\u017c\7u\2\2\u017c\u017d\7c\2\2\u017d\u017e\7i\2\2\u017e\u017f"+
		"\7g\2\2\u017f^\3\2\2\2\u0180\u0181\7u\2\2\u0181\u0182\7v\2\2\u0182\u0183"+
		"\7t\2\2\u0183\u0184\7k\2\2\u0184\u0185\7p\2\2\u0185\u0186\7i\2\2\u0186"+
		"\u0187\7O\2\2\u0187\u0188\7g\2\2\u0188\u0189\7u\2\2\u0189\u018a\7u\2\2"+
		"\u018a\u018b\7c\2\2\u018b\u018c\7i\2\2\u018c\u018d\7g\2\2\u018d\u018e"+
		"\7T\2\2\u018e\u018f\7g\2\2\u018f\u0190\7e\2\2\u0190\u0191\7g\2\2\u0191"+
		"\u0192\7k\2\2\u0192\u0193\7x\2\2\u0193\u0194\7g\2\2\u0194\u0195\7f\2\2"+
		"\u0195`\3\2\2\2\u0196\u0197\7g\2\2\u0197\u0198\7p\2\2\u0198\u0199\7v\2"+
		"\2\u0199\u019a\7k\2\2\u019a\u019b\7v\2\2\u019b\u019c\7{\2\2\u019c\u019d"+
		"\7O\2\2\u019d\u019e\7g\2\2\u019e\u019f\7u\2\2\u019f\u01a0\7u\2\2\u01a0"+
		"\u01a1\7c\2\2\u01a1\u01a2\7i\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7T\2\2"+
		"\u01a4\u01a5\7g\2\2\u01a5\u01a6\7e\2\2\u01a6\u01a7\7g\2\2\u01a7\u01a8"+
		"\7k\2\2\u01a8\u01a9\7x\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7f\2\2\u01ab"+
		"b\3\2\2\2\u01ac\u01ad\7p\2\2\u01ad\u01ae\7w\2\2\u01ae\u01af\7o\2\2\u01af"+
		"\u01b0\7d\2\2\u01b0\u01b1\7g\2\2\u01b1\u01b2\7t\2\2\u01b2d\3\2\2\2\u01b3"+
		"\u01b4\7d\2\2\u01b4\u01b5\7q\2\2\u01b5\u01b6\7q\2\2\u01b6\u01b7\7n\2\2"+
		"\u01b7f\3\2\2\2\u01b8\u01b9\7e\2\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7q\2"+
		"\2\u01bb\u01bc\7t\2\2\u01bc\u01bd\7f\2\2\u01bd\u01be\7k\2\2\u01be\u01bf"+
		"\7p\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2\7g\2\2\u01c2"+
		"\u01c3\7u\2\2\u01c3h\3\2\2\2\u01c4\u01c5\7u\2\2\u01c5\u01c6\7v\2\2\u01c6"+
		"\u01c7\7t\2\2\u01c7\u01c8\7k\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca\7i\2\2"+
		"\u01caj\3\2\2\2\u01cb\u01cc\7E\2\2\u01cc\u01cd\7q\2\2\u01cd\u01ce\7n\2"+
		"\2\u01ce\u01cf\7n\2\2\u01cf\u01d0\7g\2\2\u01d0\u01d1\7e\2\2\u01d1\u01d2"+
		"\7v\2\2\u01d2\u01d3\7k\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7p\2\2\u01d5"+
		"l\3\2\2\2\u01d6\u01d7\7G\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7v\2\2\u01d9"+
		"\u01da\7k\2\2\u01da\u01db\7v\2\2\u01db\u01dc\7{\2\2\u01dcn\3\2\2\2\u01dd"+
		"\u01de\7K\2\2\u01de\u01df\7v\2\2\u01df\u01e0\7g\2\2\u01e0\u01e1\7o\2\2"+
		"\u01e1p\3\2\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7c\2\2\u01e4\u01e5\7p\2"+
		"\2\u01e5\u01e6\7i\2\2\u01e6\u01e7\7g\2\2\u01e7r\3\2\2\2\u01e8\u01e9\7"+
		"v\2\2\u01e9\u01ea\7q\2\2\u01eat\3\2\2\2\u01eb\u01ec\t\2\2\2\u01ecv\3\2"+
		"\2\2\u01ed\u01ee\t\3\2\2\u01eex\3\2\2\2\u01ef\u01f0\t\4\2\2\u01f0z\3\2"+
		"\2\2\u01f1\u01f2\7\f\2\2\u01f2|\3\2\2\2\u01f3\u01f4\7a\2\2\u01f4~\3\2"+
		"\2\2\u01f5\u01f7\5y=\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0201\3\2\2\2\u01fa\u01fe\7\60\2\2"+
		"\u01fb\u01fd\5y=\2\u01fc\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0201"+
		"\u01fa\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0080\3\2\2\2\u0203\u0204\5\u0083"+
		"B\2\u0204\u0205\7$\2\2\u0205\u0082\3\2\2\2\u0206\u020f\7$\2\2\u0207\u020e"+
		"\n\5\2\2\u0208\u020b\7^\2\2\u0209\u020c\13\2\2\2\u020a\u020c\7\2\2\3\u020b"+
		"\u0209\3\2\2\2\u020b\u020a\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u0207\3\2"+
		"\2\2\u020d\u0208\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0084\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\7v"+
		"\2\2\u0213\u0214\7t\2\2\u0214\u0215\7w\2\2\u0215\u021c\7g\2\2\u0216\u0217"+
		"\7h\2\2\u0217\u0218\7c\2\2\u0218\u0219\7n\2\2\u0219\u021a\7u\2\2\u021a"+
		"\u021c\7g\2\2\u021b\u0212\3\2\2\2\u021b\u0216\3\2\2\2\u021c\u0086\3\2"+
		"\2\2\u021d\u021e\7p\2\2\u021e\u021f\7w\2\2\u021f\u0220\7n\2\2\u0220\u0221"+
		"\7n\2\2\u0221\u0088\3\2\2\2\u0222\u0226\5u;\2\u0223\u0226\5w<\2\u0224"+
		"\u0226\5}?\2\u0225\u0222\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0224\3\2\2"+
		"\2\u0226\u022d\3\2\2\2\u0227\u022c\5u;\2\u0228\u022c\5w<\2\u0229\u022c"+
		"\5y=\2\u022a\u022c\5}?\2\u022b\u0227\3\2\2\2\u022b\u0228\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u008a\3\2\2\2\u022f\u022d\3\2\2\2\u0230"+
		"\u0231\5{>\2\u0231\u008c\3\2\2\2\u0232\u0233\7*\2\2\u0233\u008e\3\2\2"+
		"\2\u0234\u0235\7+\2\2\u0235\u0090\3\2\2\2\u0236\u0238\t\6\2\2\u0237\u0236"+
		"\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023c\bI\2\2\u023c\u0092\3\2\2\2\u023d\u023e\7\61"+
		"\2\2\u023e\u023f\7\61\2\2\u023f\u0243\3\2\2\2\u0240\u0242\n\7\2\2\u0241"+
		"\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0246\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\bJ\2\2\u0247"+
		"\u0094\3\2\2\2\17\2\u01f8\u01fe\u0201\u020b\u020d\u020f\u021b\u0225\u022b"+
		"\u022d\u0239\u0243\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}