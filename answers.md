1. Deck of cards
2. 
    1. You pull out the deck of cards. 
    2. You shuffle the deck of cards. 
    3. You deal out nine cards. 
    4. If there is a pair of cards that add up to 11, set aside the pair and replace them        with 2 cards from the top of the deck. 
    5. If there is a J, Q, and K, set aside and replace with 3 cards from the top of deck. 
    6. Continue steps 4 and 5 until no cards can be replaced(lose) or until there are no         cards left in the deck(win).
3. Yes
4a. The dealMyCards method is called in the ElevensBoard constructor, as well as in the method of creating a new game.
4b. the replaceSelectedCards, and isLegal method
4c. 0   1 | 2   3 | 4 | 5 | 6 | 7 | 8
    0   1   3   6   7
4d.
public static printCards(ElevensBoard board) {
    List<Integer> cIndexes = board.cardIndexes();
    System.out.println(board.toString());
}
