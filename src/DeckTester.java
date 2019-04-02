/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rankss = {"ace", "king", "queen"};
		String[] suitss = {"spades", "hearts"};
		int[] valuess = {1, 13, 12};

		Deck deck = new Deck(rankss, suitss, valuess);

		System.out.println(deck.isEmpty());
		System.out.println(deck.getSize());

		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());

		System.out.println(deck.getSize());
	}
}
