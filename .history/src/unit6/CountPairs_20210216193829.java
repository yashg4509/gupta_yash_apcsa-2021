package unit6;

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;

		for(int i = 0; i < str.length(); i++) {

			if(str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}

		}

		return count; 
	}
}