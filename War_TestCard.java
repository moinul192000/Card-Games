
public class War_TestCard {
	
	public static void main(String [] args) {
		Card c = new Card(10, "Spades");
		
		System.out.println("Should say 10:" + c.getValue());
		System.out.println("Should say Spades:" + c.getSuit());
	}

}
