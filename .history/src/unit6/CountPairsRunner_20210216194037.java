package unit6;

import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		System.out.println( CountPairs.pairCounter("test_cases") );
		System.out.println( CountPairs.pairCounter("ddogccatppig") );
		System.out.println( CountPairs.pairCounter("dogcatpig") );
		System.out.println( CountPairs.pairCounter("xxyyzz") );
		System.out.println( CountPairs.pairCounter("a") );
		

	}
}