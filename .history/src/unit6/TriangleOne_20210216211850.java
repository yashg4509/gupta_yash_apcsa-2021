package unit6;


import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		for (int i = 0; i < word.length(); i++) {
			word = word.substring(0, word.length() - 1);
		}
	}
}