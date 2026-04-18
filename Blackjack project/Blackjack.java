//Teagan Peabody
//AT Java
//Blackjack project 

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Blackjack {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {
        "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
    };

    public static void main(String[] args) {
        System.out.println("Welcome to Console Blackjack!");

        boolean playing = true;
        while (playing) {
            String choice = prompt("\nEnter 'p' to play a hand or 'q' to quit: ").toLowerCase();
            if ("q".equals(choice)) {
                playing = false;
            } else if ("p".equals(choice)) {
                playHand();
            } else {
                System.out.println("Invalid choice. Please enter 'p' or 'q'.");
            }
        }

        System.out.println("Thanks for playing!");
    }

    private static void playHand() {
        ArrayList<Card> playerHand = new ArrayList<>();
        ArrayList<Card> dealerHand = new ArrayList<>();

        // Initial deal: one card each face up.
        playerHand.add(drawCard());
        dealerHand.add(drawCard());

        // Second card: player face up, dealer face down.
        playerHand.add(drawCard());
        dealerHand.add(drawCard());

        System.out.println("\n=== New Hand ===");
        showHands(playerHand, dealerHand, true);

        int playerScore = calculateScore(playerHand);
        int dealerScore = calculateScore(dealerHand);

        if (dealerScore == 21 || playerScore == 21) {
            resolveInitialBlackjack(playerHand, dealerHand, playerScore, dealerScore);
            return;
        }

        // Player turn.
        while (true) {
            playerScore = calculateScore(playerHand);
            if (playerScore > 21) {
                System.out.println("\nPlayer busts with " + playerScore + ". Dealer wins.");
                return;
            }

            String action = prompt("Hit or stand? (h/s): ").toLowerCase();
            if ("h".equals(action)) {
                Card newCard = drawCard();
                playerHand.add(newCard);
                System.out.println("Player draws: " + newCard);
                System.out.println("Player score: " + calculateScore(playerHand));
            } else if ("s".equals(action)) {
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'h' or 's'.");
            }
        }

        // Dealer turn.
        System.out.println("\nDealer reveals hole card: " + dealerHand.get(1));
        dealerScore = calculateScore(dealerHand);

        while (dealerScore < 17) {
            delay(500);
            Card newCard = drawCard();
            dealerHand.add(newCard);
            dealerScore = calculateScore(dealerHand);
            System.out.println("Dealer draws: " + newCard + " (score: " + dealerScore + ")");
        }

        playerScore = calculateScore(playerHand);
        showHands(playerHand, dealerHand, false);
        resolveEndOfHand(playerScore, dealerScore);
    }

    private static void resolveInitialBlackjack(ArrayList<Card> playerHand, ArrayList<Card> dealerHand,
                                                int playerScore, int dealerScore) {
        System.out.println("\nChecking for blackjack...");
        showHands(playerHand, dealerHand, false);

        if (dealerScore == 21 && playerScore != 21) {
            System.out.println("Dealer has 21. Player loses.");
        } else if (playerScore == 21 && dealerScore != 21) {
            System.out.println("Player has 21. Player wins!");
        } else {
            System.out.println("Both player and dealer have 21. It's a draw.");
        }
    }

    private static void resolveEndOfHand(int playerScore, int dealerScore) {
        System.out.println("\nFinal score - Player: " + playerScore + ", Dealer: " + dealerScore);

        if (dealerScore > 21) {
            System.out.println("Dealer busts. Player wins!");
        } else if (playerScore > dealerScore) {
            System.out.println("Player wins!");
        } else if (dealerScore > playerScore) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("Draw.");
        }
    }

    private static Card drawCard() {
        String suit = SUITS[RANDOM.nextInt(SUITS.length)];
        String rank = RANKS[RANDOM.nextInt(RANKS.length)];
        return new Card(suit, rank);
    }

    private static int calculateScore(ArrayList<Card> hand) {
        int score = 0;
        int aceCount = 0;

        for (Card card : hand) {
            score += card.getBlackjackValue();
            if (card.isAce()) {
                aceCount++;
            }
        }

        // Convert aces from 11 to 1 while needed to avoid busting.
        while (score > 21 && aceCount > 0) {
            score -= 10;
            aceCount--;
        }

        return score;
    }

    private static void showHands(ArrayList<Card> playerHand, ArrayList<Card> dealerHand, boolean hideDealerHoleCard) {
        System.out.println("\nDealer hand:");
        for (int i = 0; i < dealerHand.size(); i++) {
            if (i == 1 && hideDealerHoleCard) {
                System.out.println("  [Hidden card]");
            } else {
                System.out.println("  " + dealerHand.get(i));
            }
        }

        if (hideDealerHoleCard) {
            System.out.println("Dealer visible score: " + dealerHand.get(0).getBlackjackValue());
        } else {
            System.out.println("Dealer score: " + calculateScore(dealerHand));
        }

        System.out.println("\nPlayer hand:");
        for (Card card : playerHand) {
            System.out.println("  " + card);
        }
        System.out.println("Player score: " + calculateScore(playerHand));
    }

    private static String prompt(String text) {
        System.out.print(text);
        return SCANNER.nextLine().trim();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long msec) {
        try {
            Thread.sleep(msec);
        } catch (Exception e) {
            // Ignore sleep interruption for simple console gameplay.
        }
    }
}
