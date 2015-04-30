
package in.darkstars.lexical;

public class Token {

	public static enum Type {
		OPS,
		NUM,
		SPACE,		
		KEYWORD,
		IDENTIFIER,
		OPENPRAN,	// (
		CLOSEPRAN,	// )
		OPENBRACE,	// {
		CLOSEBRACE	// }
	}

	private Type type;
	private StringBuilder value = new StringBuilder();

	public Type getType() {
		return type;
	}

	public void setType ( Type type ) {
		this.type = type;
	}

	public String getValue() {
		return value.toString();
	}

	public void appendValue ( char value ) {
		this.value.append(value);
	}


	public String toString() {

		return "<"+getValue()+","+getType().toString()+">";

	}


}
