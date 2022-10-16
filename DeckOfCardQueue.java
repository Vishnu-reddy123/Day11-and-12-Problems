package DeckOfCardsQueue;

import java.util.Random;

public class DeckOfCardQueue {
    int[][] cardArray = new int[4][13];    //  2D array of cards

    public static void main(String[] args) {
        DeckOfCardQueue cardDeck = new DeckOfCardQueue();

        // card allocation to each player
        for (int playerNumber = 1; playerNumber <= 4; playerNumber++) {
            cardDeck.cardAllocation(playerNumber);
            System.out.println("Player " + playerNumber + " cards:");
            cardDeck.sort(playerNumber);
            System.out.println();
        }
    }


    //Allots cards to one player
    void cardAllocation(int playerNumber) {
        for (int i = 0; i < 9; i++) {
            oneCardAllocation(playerNumber);
        }
    }

    //randomly allocation of one card
    void oneCardAllocation(int playerNumber) {
        Random random = new Random();

        int suit = random.nextInt(4);
        int rank = random.nextInt(13);

        if (cardArray[suit][rank] != 0) {
            oneCardAllocation(playerNumber);
        } else {
            cardArray[suit][rank] = playerNumber;
        }
    }

    //Prints cards in ascending order
    void sort(int playerNumber) {
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 0; rank < 13; rank++) {
                if (cardArray[suit][rank] == playerNumber) {
                    System.out.print(getSuit(suit) + " " + getRank(rank) + "   ");
                }
            }
        }
        System.out.println();
    }

    //returns rank of the card from number
    String getRank(int rankNumber) {
        switch (rankNumber) {
            case 0:
                return "2";
            case 1:
                return "3";
            case 2:
                return "4";
            case 3:
                return "5";
            case 4:
                return "6";
            case 5:
                return "7";
            case 6:
                return "8";
            case 7:
                return "9";
            case 8:
                return "10";
            case 9:
                return "Jack";
            case 10:
                return "Queen";
            case 11:
                return "King";
            case 12:
                return "Ace";
            default:
                return "";
        }
    }

    //returns suit name from number
    String getSuit(int suitNumber) {
        switch (suitNumber) {
            case 0:
                return "Clubs ";
            case 1:
                return "Diamonds";
            case 2:
                return "Hearts";
            case 3:
                return "Spades";
            default:
                return "";
        }
    }
}