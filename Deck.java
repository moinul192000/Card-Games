import java.util.*;

public class Deck {
    private Queue<Card> cards;

    public Deck() {
        cards = new LinkedList<Card>();
    }

    public boolean isEmpty() {
        return cards == null || cards.isEmpty();
    }

    public Card getCard() {
        if (cards == null || cards.isEmpty()) {
            throw new IllegalStateException();
        }
        return cards.remove();
    }

    public String toString() {
        return cards.toString();
    }

    public void addCard(Card mSpades) {
        cards.add(mSpades);
    }

    public void addDeck(Deck mDeck){
        while(!mDeck.isEmpty()){
            addCard(mDeck.getCard());
        }
    }

    public int sum() {
        int sumValue = 0;
        //Todo: Implement the sum Function
        return sumValue;
    }

    public Card getRandom() {
        if(isEmpty()){
            return null;
        }else{
            return cards.remove();
        }
    }
}