package unit4;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		double finalPrice = 0;

		if(bill > 2000) {
			finalPrice = 0.85 * bill;
		} else if (bill <= 2000) {
			finalPrice = bill;
		}

		return finalPrice;
	}
}