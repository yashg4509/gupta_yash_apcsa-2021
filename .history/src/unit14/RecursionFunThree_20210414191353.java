package unit14;

//� A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunThree
{
	/* luckyThrees will return the count of 3s in the number
	 * unless the 3 is at the front and then it does not count
	 * 3 would return 0
	 * 31332  would return 2
	 * 134523 would return 2
	 * 3113  would return 1
	 * 13331 would return 3
	 * 777337777  would return 2
	 * the solution to this problem must use recursion
	 */
	public static int luckySevens(long number)
	{
		int sum = 0;
		int length = 0;
		long temp = number;
		
		while(number > 0)
		{
			length++;
			number /= 10;
		}
		number = temp;
		long[] digits = new long[length];
		for(int a = 0; number != 0; a++)
		{
			digits[a] = number % 10;
			number /= 10;
		}
		for(int b = 0; b < digits.length - 1; b++)
		{
			if(digits[b] == 7)
			{
				if(digits[b+1] == 7)
				{
					sum += 14;
					b++;
				}
				else
				{
					sum++;
				}
			}
		
		}
		return sum;
	}
}