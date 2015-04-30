/*		Author	:-	dis-card
 *		Date	:-	Thu 30 Apr 2015 05:33:00 PM IST
 *		Purpose	:-	To include general methods of a tokenizer.
 *				Most of the "is*" methods take asciiValue of the 
 *				character to be tested because read opertion on 
 *				streams return integer.
 */
package in.darkstars.lexical;

public abstract class AbstractTokenizer implements Tokenizer {



	public boolean isSpace ( char input) {

		boolean result = false;
		
		switch ( input ) {

			case ' ':
			case '\t':
				result = true;
		}

		return result;

	}




	public boolean isDigit ( int asciiValue ) {

		boolean result = false;
		
		if ( asciiValue >= 48 && asciiValue <= 57 ) {
			result = true;
		}

		return result;

	}

	public boolean isDigit ( char input ) {

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


	public boolean isOperator ( int asciiValue ) {

		boolean result = false;

		if ( asciiValue == 42 || asciiValue == 43 || asciiValue == 45 || asciiValue == 47  ) {
			result = true;
		}

		return result;

	}


	public boolean isOperator ( char input ) {

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

	

}
