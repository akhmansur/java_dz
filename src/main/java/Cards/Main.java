package Cards;

public class Main {

    public static void main(String[] args) throws Exception {
        Deck deck = Deck.getDeckWithoutJokers();
        System.out.println("Take card: " + deck.getCard().toString());
        CardC card = deck.getCard();
        deck.addCard(card);
        deck.addCard(card);
        System.out.println("Double returned card: " + card);
        System.out.println("\nCurrent deck: \n" + deck);
        System.out.println("Take card: " + deck.getCard().toString());
        System.out.println("Take card: " + deck.getCard().toString());
        System.out.println("Take card: " + deck.getCard().toString());
        System.out.println("Take card: " + deck.getCard().toString());
        deck.shuffleDeck();
        System.out.println("\nShuffled deck:\n " + deck + "\n");
        deck.sort();
        System.out.println("\nSorted deck:\n " + deck + "\n");
        System.out.println("Removing all cards from the deck...\n ");
        do {
            deck.getCard().toString();
        }while (!deck.isEmpty());
        CardC lastCard = deck.getCard();
        System.out.println("Try take card from empty deck: " + (lastCard != null? lastCard.toString(): "null"));
    }
}

