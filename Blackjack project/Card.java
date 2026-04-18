//Teagan Peabody
//AT Java
//Blackjack project

public class Card {
    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public boolean isAce() {
        return "A".equals(rank);
    }

    public int getBlackjackValue() {
        if ("A".equals(rank)) {
            return 11;
        }

        if ("K".equals(rank) || "Q".equals(rank) || "J".equals(rank)) {
            return 10;
        }

        return Integer.parseInt(rank);
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
