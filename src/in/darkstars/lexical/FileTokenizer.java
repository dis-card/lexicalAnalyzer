package in.darkstars.lexical;

import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class FileTokenizer extends AbstractTokenizer{

	public static final String READ_MODE = "r";
	private RandomAccessFile srcFile;

	public FileTokenizer ( String filePath ) throws FileNotFoundException {

		srcFile = new RandomAccessFile ( filePath, READ_MODE );

	}

	public FileTokenizer ( File inputFile ) throws FileNotFoundException {

		srcFile = new RandomAccessFile ( inputFile, READ_MODE );

	}

	private List<Token> tokenList;


	public List<Token> getTokenList () throws TokenizerNotInitException, IOException {

		int ch;
		tokenList = new ArrayList<Token>();

		if ( srcFile == null ) {
			throw new TokenizerNotInitException ();
		}



		while ( (ch = srcFile.read()) != EOF ) {

			if ( isDigit(ch) ) {

				Token token = new Token();
				token.setType(Token.Type.NUM);
				token.appendValue( ( char ) ch);

				while ( ( isDigit ( ch = srcFile.read() ) ) ) {

					token.appendValue( ( char ) ch);

				}
				tokenList.add( token );
				if ( ch != EOF ) {
					srcFile.seek( srcFile.getFilePointer() - 1 );
				}

			} else if ( isOperator ( ch )) {

				Token token = new Token();
				token.setType(Token.Type.OPS);
				token.appendValue( ( char ) ch);

				/*while ( ( isOperator ( ch = srcFile.read() ) ) ) {

					token.appendValue( ( char ) ch);

				}
*/				tokenList.add( token );
/*				if ( ch != EOF ) {
					srcFile.seek( srcFile.getFilePointer() - 1 );
				}
*/
			} else if ( isSpace ( (char ) ch) ) {

				Token token = new Token();
				token.setType(Token.Type.SPACE);
				token.appendValue( ( char ) ch);

				while ( ( isSpace ( (char) (ch = srcFile.read()) ) ) ) {

					token.appendValue( ( char ) ch);

				}
				tokenList.add( token );
				if ( ch != EOF ) {
					srcFile.seek( srcFile.getFilePointer() - 1 );
				}

			} else if ( isChar( ( char ) ch )) {
				
				Token token = new Token();
				token.appendValue( ( char ) ch);

				while ( ( isChar ( (char) (ch = srcFile.read()) ) ) ) {
					
					token.appendValue( ( char ) ch);
					
				}
				
				if ( isKeyWord( token.getValue() ) ) {
					token.setType(Token.Type.KEYWORD);
				} else {
					token.setType(Token.Type.IDENTIFIER);
				}
				
				tokenList.add( token );
				if ( ch != EOF ) {
					srcFile.seek( srcFile.getFilePointer() - 1 );
				}
			} else {

				System.out.println("FATAL:Unknown character encountered");
				break;

				//System.exit(1);
			}

		}
		srcFile.close();


		return tokenList;
	}




}
