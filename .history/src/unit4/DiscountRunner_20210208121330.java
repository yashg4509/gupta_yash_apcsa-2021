package unit4;

import java.util.Scanner;
import static java.lang.System.*;


public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.print("Bill after discount :: " + Discount.getDiscountedBill(amt));
		
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		out.print("Bill after discount :: " + Discount.getDiscountedBill(amt2));

		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		out.print("Bill after discount :: " + Discount.getDiscountedBill(amt3));

	}
}