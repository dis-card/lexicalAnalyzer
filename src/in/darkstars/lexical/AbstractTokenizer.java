/*		Author	:-	dis-card
 *		Date	:-	Thu 30 Apr 2015 05:33:00 PM IST
 *		Purpose	:-	To include general methods of a tokenizer.
 *				Most of the "is*" methods take asciiValue of the 
 *				character to be tested because read opertion on 
 *				streams return integer.
 */
package in.darkstars.lexical;

public abstract class AbstractTokenizer implements Tokenizer {



	protected boolean isSpace ( char input) {

		boolean result = false;
		
		switch ( input ) {

			case ' ':
			case '\t':
			case '\n':
			case '\r':
				result = true;
		}

		return result;

	}




	protected boolean isDigit ( int asciiValue ) {

		boolean result = false;
		
		if ( asciiValue >= 48 && asciiValue <= 57 ) {
			result = true;
		}

		return result;

	}

	protected boolean isDigit ( char input ) {

		boolean result = false;
		
		switch ( input ) {

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				result = true;
		}

		return result;

	}


	protected boolean isOperator ( int asciiValue ) {

		boolean result = false;

		if ( asciiValue == 42 || asciiValue == 43 || asciiValue == 45 || asciiValue == 47  ) {
			result = true;
		}

		return result;

	}


	protected boolean isOperator ( char input ) {

		boolean result = false;

		switch ( input ) {

			case '+':
			case '-':
			case '*':
			case '/':
				result = true;

		}

		return result;
	}
	
	protected boolean isChar ( char input ) {
		
		boolean result = false;
		
		switch ( input ) {
		
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case '_':
				result = true;
			
		}		
		
		return result;
		
	}
	
	protected boolean isKeyWord ( String input ) {
		
		boolean result = false;
		
		if ( input.equals(BREAK) 
				|| input.equals(CASE)
				|| input.equals(CHAR)
				|| input.equals(CONTINUE)
				|| input.equals(DO)
				|| input.equals(DOUBLE)
				|| input.equals(ELSE)
				|| input.equals(FLOAT)
				|| input.equals(FOR)
				|| input.equals(IF)
				|| input.equals(INT)
				|| input.equals(LONG)
				|| input.equals(SWITCH)
				|| input.equals(VOID)
				|| input.equals(WHILE)) {
			result = true;
			
		}		
		
		return result;		
		
	}
	
	

	

}
