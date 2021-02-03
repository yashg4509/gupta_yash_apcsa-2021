package unit3;

import java.util.Scanner; 
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		System.out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		System.out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		// //add more test cases
        // System.out.print("Enter the distance :: ");
		// int dist2 = keyboard.nextInt();

		// System.out.print("Enter the hours :: ");
		// int hrs2 = keyboard.nextInt();

		// System.out.print("Enter the minutes :: ");
		// int mins2 = keyboard.nextInt();

		// MilesPerHour test2 = new MilesPerHour(dist2, hrs2, mins2);
		// test.calcMPH();
        // test.print();
        
        // System.out.print("Enter the distance :: ");
		// int dist3 = keyboard.nextInt();

		// System.out.print("Enter the hours :: ");
		// int hrs3 = keyboard.nextInt();

		// System.out.print("Enter the minutes :: ");
		// int mins3 = keyboard.nextInt();

		// MilesPerHour test3 = new MilesPerHour(dist3, hrs3, mins3);
		// test.calcMPH();
        // test.print();
		
	}
}
    

