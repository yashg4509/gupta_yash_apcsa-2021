package unit5;


import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		setString("");
	}

	public StringOddOrEven(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{

		if(Integer.parseInt(word)%2 == 0) {
			return true;
		}

		return false;

	}

 	public String toString()
 	{
 		String output="";
 		return output;
	}
}