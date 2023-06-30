public class Card implements Comparable<Card> {

    private int suit;
    private int rank;

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.rank, o.rank);
    }

    @Override
    public String toString() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        return ranks[rank - 1] + " of " + suits[suit - 1];
    }
}
