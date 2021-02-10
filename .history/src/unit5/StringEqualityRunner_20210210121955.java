package unit5;

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{

		StringEquality test = new StringEquality("hello", "goodbye");
		out.println(test);
		out.println(test);
		out.println(test);
		out.println(test);
		out.println(test);
		out.println(test);
		out.println(test);

		test.setWords("hello", "goodbye");
		test.setWords("one", "two");
		test.setWords("three", "four");
		test.setWords("TCEA", "UCIL");
		test.setWords("State", "Champions");
		test.setWords("ABC", "ABC");
		test.setWords("ABC", "CBA");
		test.setWords("same", "same");
		
	}
}