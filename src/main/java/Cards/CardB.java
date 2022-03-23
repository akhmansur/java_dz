package Cards;


public class CardB {

    private int rank;

    private String suit;

    public CardB()
    {
        this.rank = 2;
        this.suit = "diamonds";
    }

    public String getSuit()
    {
        return this.suit;
    }

    public int getRank() {
        return rank;
    }
}
