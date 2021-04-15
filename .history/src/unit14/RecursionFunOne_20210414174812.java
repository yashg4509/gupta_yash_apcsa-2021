package unit14;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		int digits = 0;
		int current = 0;
		
		while (num > 0) 
		{
		    current = num % 10;
		    num = num / 10;
		    if(current % 2 == 1)
		    {
		    	digits++;
		    }
		}
		return digits;
	}
}