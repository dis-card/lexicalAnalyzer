package in.darkstars.lexical;

import java.util.List;
import java.io.IOException;

public interface Tokenizer {


	public List<Token> getTokenList () throws TokenizerNotInitException, IOException;

	public int EOF = -1;
	
	// keywords	
	public String BREAK 	= "break";
	public String CASE 		= "case";
	public String CHAR 		= "char";
	public String CONTINUE 	= "continue";
	public String DO 		= "do";
	public String DOUBLE 	= "double";
	public String ELSE 		= "else";
	public String FLOAT 	= "float";
	public String FOR 		= "for";
	public String IF 		= "if";
	public String INT 		= "int";
	public String LONG 		= "long";
	public String SWITCH 	= "switch";
	public String VOID 		= "void";
	public String WHILE 	= "while";
		

}
