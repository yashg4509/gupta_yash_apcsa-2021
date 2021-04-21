package unit13;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortTwoRunner
{
	public static void main(String args[])
	{
		WordSortTwo a = new WordSortTwo ("abc ABC 12321 fred alexander");
		a.sort();
		System.out.println(a.toString());
		
		WordSortTwo b = new WordSortTwo ("a zebra friendly acrobatics 435 TONER PRinTeR");
		b.sort();
		System.out.println(b.toString());
		
		WordSortTwo c = new WordSortTwo ("b x 4 r s y $");
		c.sort();
		System.out.println(c.toString());
		
		WordSortTwo d = new WordSortTwo ("123 ABC abc 034 dog cat sally sue bob 2a2");
		d.sort();
		System.out.println(d.toString());
		

		
	}
}