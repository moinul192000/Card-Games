public class Card {
    /* Special Ranks */
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    private int value;
    private String suit;
    public Card(int mValue, String mSuit) {
        value = mValue;
        suit = mSuit;
    }

    public String getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        String out = "";
        switch (this.value) {
            case JACK:
                out += "Jack";
                break;
            case QUEEN:
                out += "Queen";
                break;
            case KING:
                out += "King";
                break;
            case ACE:
                out += "Ace";
                break;
            default:
                out += value;
                break;
        }


        return out+" "+suit;
    }
}
