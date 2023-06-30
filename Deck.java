import java.util.Random;

public class Deck {

    private static final int DECK_SIZE = 52;
    private static final int SHUFFLE_EXCHANGES = 2000;
    private static final int HAND_SIZE = 5;

    private Card[] deck = new Card[DECK_SIZE];
    private int restOfDeck = 6;
    private Random random;

    public Deck() {
        random = new Random();
    }

    public void fillDeck() {
        int counter = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card card = new Card();
                card.setSuit(suit);
                card.setRank(rank);
                deck[counter] = card;
                counter++;
            }
        }
    }

    public void shuffle() {
        for (int i = DECK_SIZE - 1; i >= 1; i--) {
            int j = random.nextInt(i + 1);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card[] deal() {
        Card[] hand = new Card[HAND_SIZE];
        System.arraycopy(deck, 0, hand, 0, HAND_SIZE);
        return hand;
    }

    public Card drawNext() {
        Card nextCard = deck[restOfDeck];
        restOfDeck++;
        return nextCard;
    }

    public void refreshDeckPosition() {
        restOfDeck = 6;
    }
}
