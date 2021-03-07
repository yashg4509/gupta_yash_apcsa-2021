package unit9.activity13;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {

		String[] rank1 = { "8", "10", "8" };
		String[] suit1 = { "Clubs", "Spades", "Spades" };
		int[] value1 = { 8, 10, 8 };
		Deck deck1 = new Deck(rank1, suit1, value1);
		System.out.println("The size is: " + deck1.size());

		String[] rank2 = { "3", "8", "4" };
		String[] suit2 = { "Diamonds", "Hearts", "Diamonds" };
		int[] value2 = { 3, 8, 4 };
		Deck deck2 = new Deck(rank2, suit2, value2);
		System.out.println("The deck is not empty because isEmpty returned " + deck2.isEmpty());

		String[] rank3 = { "King", "Jack", "8" };
		String[] suit3 = { "Spades", "Spades", "Hearts" };
		int[] value3 = { 12, 11, 8 };
		Deck deck3 = new Deck(rank3, suit3, value3);
		System.out.println("The card dealt is: " + deck3.deal());

	}
}
