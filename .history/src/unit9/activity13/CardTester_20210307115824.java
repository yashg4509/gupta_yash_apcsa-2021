package unit9.activity13;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		Card c1 = new Card("10", "Hearts", 10);
		Card c2 = new Card("Ace", "Clubs", 13);
		Card c3 = new Card("4", "Clubs", 4);

		System.out.println(c1.rank());
		System.out.println(c2.rank());
		System.out.println(c3.rank());

		System.out.println("---------------------------------------------------");

		System.out.println(c1.suit());
		System.out.println(c2.suit());
		System.out.println(c3.suit());

		System.out.println("---------------------------------------------------");

		System.out.println(c1.pointValue());
		System.out.println(c2.pointValue());
		System.out.println(c3.pointValue());

		System.out.println("---------------------------------------------------");

		System.out.println(c1.matches(c2));
		System.out.println(c2.matches(c3));
		System.out.println(c3.matches(c1));
		System.out.println(c3.matches(c3));


	}
}
