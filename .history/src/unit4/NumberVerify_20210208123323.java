package unit4;

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		boolean isOdd = false;

		if(num%2 != 0) {
			isOdd = true;
		} 

		return isOdd;

	}
	public static boolean isEven( int num )
	{
		boolean isEven = false;

		if(num%2 == 0) {
			isEven = true;
		} 

		return isEven;	}	
}