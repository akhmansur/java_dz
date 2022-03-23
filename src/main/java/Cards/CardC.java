package Cards;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class CardC implements Comparable<CardC>{

    public static int maxRank = 14;
    public static Pattern pattern = Pattern.compile("diamonds|clubs|hearts|spades");
    protected String suit;
    protected int rank;

    protected String[] suits = { "clubs","diamonds", "spades", "hearts"};
    protected String[] ranks = {"Ace", "2", "3", "4", "5", "6","7", "8", "9","10", "Jack", "Queen", "King" };

    public CardC(String suit) throws Exception {
        if(pattern.matcher(suit).find()) {
            this.suit =  suit;
            this.rank = CardC.maxRank + 1;
        }
        else {
            throw new Exception("Suit type is incorrect");
        }
    }

    public CardC(int rank, String suit) throws Exception {
        if(pattern.matcher(suit).find()) {
            this.suit =  suit;
            this.rank = rank;
        }
        else {
            throw new Exception("Suit type is incorrect");
        }
    }

    public String getSuit()
    {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    @Override
    public String toString() {
        String rankName = "";
        rankName = Arrays.asList(ranks).get(this.rank);
        return rankName + " of " + this.suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardC cardC = (CardC) o;
        return rank == cardC.rank && suit.equals(cardC.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    public boolean isCorrect(CardC card) {
        return card.getRank() > 2 && card.getRank() < 54;
    }

    public int compareTo(CardC other) {
        List<String> li = Arrays.asList(suits);
        int firstIndex = li. indexOf(this.getSuit());
        int secondIndex = li. indexOf(other.getSuit());
        if(firstIndex >  secondIndex) {
            return 1;
        } else if (firstIndex <  secondIndex) {
            return -1;
        } else {
            if(this.rank > other.rank) return 1;
            else if (this.rank < other.rank) return -1;
            return 0;
        }
    }
}
