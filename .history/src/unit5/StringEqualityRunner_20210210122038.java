package unit5;

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{

		StringEquality test = new StringEquality("hello", "goodbye");
		out.println(test);
		
		test.setWords("hello", "goodbye");

		out.println(test);
		test.setWords("one", "two");

		out.println(test);
		test.setWords("three", "four");

		out.println(test);
		test.setWords("TCEA", "UCIL");

		out.println(test);
		test.setWords("State", "Champions");

		out.println(test);
		test.setWords("ABC", "ABC");

		out.println(test);
		test.setWords("ABC", "CBA");

		out.println(test);
		test.setWords("same", "same");
		out.println(test);

		
	}
}