package codeware;

public class CardGame {
    public String winner(String[] deckSteve, String[] deckJosh) {

        int joshScore = 0;
        int steveScore = 0;

        for (int i = 0; i < deckJosh.length; i++) {

        }
        return "Tie";
    }

    public int findCardIndex(String deck) {
        String[] cardScore = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        for (int i = 0; i < cardScore.length; i++) {
            if (deck.equalsIgnoreCase(cardScore[i])) {
                return i;
            }
        }

        return -1;
    }
}
