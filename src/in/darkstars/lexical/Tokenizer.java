package in.darkstars.lexical;

import java.util.List;
import java.io.IOException;

public interface Tokenizer {


	public List<Token> getTokenList () throws TokenizerNotInitException, IOException;

	public int EOF = -1;

}
