package ui.main;

import java.util.Objects;

public class Card implements Cards {
    private int rank, suit;
    private PokerHand pokerHand;
    private static String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs"};
    private static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    public static String rankAsString( int __rank ) {
            return ranks[__rank - 1];
    }//End of rankAsString class
    public static String suitAsString( int __suit ) {
        return suits[__suit];
    }

    public Card(int suit, int rank) {
        this.rank = rank;
        this.suit = suit;
        this.pokerHand = pokerHand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank;
    }

    @Override
    public int hashCode() {

        return Objects.hash(rank);
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

public void addPH(PokerHand ph) {
    this.pokerHand = ph;
}
        public PokerHand getPH() {
            return pokerHand;
        }

    public int getStrength() {
        return rank;
    }//End of getRank method

    public int getSuit() {
        return suit;
    }//End of getSuit method

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                '}';
    }
}
//End of Card



