package in.darkstars.lexical;
import java.util.List;
import in.darkstars.lexical.Tokenizer;
import in.darkstars.lexical.FileTokenizer;
import in.darkstars.lexical.Token;
public class Test {

	public static void main ( String args [] ) throws Exception {
	
		Tokenizer tokenizer = new FileTokenizer ( args [0] );
		List<Token> tokenList = tokenizer.getTokenList();
		for ( Token token : tokenList )	{
			System.out.println( token );
		}
	

	}

}
