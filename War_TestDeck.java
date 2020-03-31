public class War_TestDeck {

	public static void main(String[] args) {
		Deck aDeck = new Deck();
		
		// add some cards;
		aDeck.addCard(new Card(14, "Spades"));
		aDeck.addCard(new Card(2, "Spades"));
		aDeck.addCard(new Card(3, "Spades"));
		
		System.out.println("Should say false: " + aDeck.isEmpty());
		
		// will the come out in order?
		System.out.println("Should say Ace Spades: " + aDeck.getCard());
		System.out.println("Should say 2 Spades: " + aDeck.getCard());
		System.out.println("Should say 3 Spades: " + aDeck.getCard());

		System.out.println("Should say true: " + aDeck.isEmpty());
		
		// add some cards;
		aDeck.addCard(new Card(14, "Spades"));
		aDeck.addCard(new Card(2, "Spades"));
		aDeck.addCard(new Card(3, "Spades"));
		
		Deck someLoser = new Deck();
		
		// add some cards;
		aDeck.addCard(new Card(1, "Hearts"));
		aDeck.addCard(new Card(2, "Hearts"));
		aDeck.addCard(new Card(3, "Hearts"));
		
		aDeck.addDeck(someLoser);
		
		System.out.println("Should say true: " + someLoser.isEmpty());
		
		System.out.println("Should say Ace Spades: " + aDeck.getCard());
		System.out.println("Should say 2 Spades: " + aDeck.getCard());
		System.out.println("Should say 3 Spades: " + aDeck.getCard());
		
		System.out.println("Should say Ace Hearts: " + aDeck.getCard());
		System.out.println("Should say 2 Hearts: " + aDeck.getCard());
		System.out.println("Should say 3 Hearts: " + aDeck.getCard());
		System.out.println("Should say true: " + aDeck.isEmpty());
		
		// test out random
		aDeck.addCard(new Card(14, "Spades"));
		System.out.println("Should say Ace Spades: " + aDeck.getCard());
		System.out.println("Should say true: " + someLoser.isEmpty());
		
		// add a few
		aDeck.addCard(new Card(1, "Hearts"));
		aDeck.addCard(new Card(2, "Hearts"));
		aDeck.addCard(new Card(3, "Hearts"));
		
		// print em out
		for (int i = 0 ; i < 3; i++)
			System.out.println("Should be a card that was just added, a hearts, unknown order: " + aDeck.getRandom());
		System.out.println("Should say true: " + aDeck.isEmpty());
		
		// test summations
		aDeck.addCard(new Card(3, "Hearts"));
		aDeck.addCard(new Card(2, "Hearts"));
		aDeck.addCard(new Card(3, "Hearts"));
		System.out.println("Should print 8: " + aDeck.sum());
		
		Deck ordered = new Deck();
		ordered.orderedInsert(new Card(3, "Hearts"));
		ordered.orderedInsert(new Card(3, "Spades"));
		ordered.orderedInsert(new Card(2, "Hearts"));
		ordered.orderedInsert(new Card(13, "Hearts"));
		// Don't worry about Ace in this situation,
		// because it's schrodinger's card
		System.out.println("Should match, though the 3s can be in either order Heart/Spade or Spade/Heart:");
		System.out.println("[2 Hearts, 3 Hearts, 3 Spades, King Hearts]");
		System.out.println(ordered);
			
	}

}
