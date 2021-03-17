//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		
		System.out.print("Enter the word to display :: ");
		String word = n.nextLine();

		System.out.println("Enter the times to display :: ");
		int times = n.nextInt();

		for (int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}
}