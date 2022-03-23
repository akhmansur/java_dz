package Cards;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.random;

public class Deck {
    private ArrayList<CardC> cards; //initialize cards arrayList using the card class

    protected Deck(boolean isWJocker) throws Exception {
        cards = new ArrayList<>();

        String[] arr = {"clubs", "diamonds", "spades", "hearts"};
        for (String str : arr) {
            for (int b = 0; b <= 12; b++) {
                cards.add(new CardC(b, str));
            }
        }
        if(isWJocker) {
            cards.add(new CardC("hearts"));
            cards.add(new CardC("spades"));
        }
        Collections.shuffle(cards); // shuffle the deck of cards
    }

    static protected Deck getDeckWithJokers() throws Exception {
        return new Deck(true);
    }

    static protected Deck getDeckWithoutJokers() throws Exception {
        return new Deck(false);
    }

    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    public CardC getRandom() {
        int v = (int) (random() * cards.size());
        return this.cards.get(v);
    }

    public CardC getCard() {
        if (this.cards.size() > 0)
            return this.cards.remove(this.cards.size()-1);
        return null;
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public void addCard(CardC a) {
        if (!this.cards.contains(a)) {
            this.cards.add(a);
        }
    }

    public boolean isEmpty() {
        return this.cards.isEmpty();
    }

    @Override
    public String toString() {
        if(isEmpty()) return "Cards.Deck is empty!";

        StringBuilder result = new StringBuilder("Cards.Deck:\n");
        for(CardC card: this.cards) {
            result.append(card.toString()).append("\n");
        }
        return result.toString();
    }
}