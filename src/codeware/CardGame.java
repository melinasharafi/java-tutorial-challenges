package codeware;

public class CardGame {
    public String winner(String[] deckSteve, String[] deckJosh) {

        int joshScore = 0;
        int steveScore = 0;

        for (int i = 0; i < deckJosh.length; i++) {

            // find the ith card rank
            int joshCardScore = findCardIndex(deckJosh[i]);
            int steveCardScore = findCardIndex(deckSteve[i]);

            // give the round score
            if (joshCardScore > steveCardScore) {
                joshScore++;
            }
            if (joshCardScore < steveCardScore) {
                steveScore++;
            }
        }

        if (joshScore > steveScore) {
            return String.format("Josh wins %d to %d", joshScore, steveScore);
        }

        if (steveScore > joshScore) {
            String.format("Steve wins %d to %d", steveScore, joshScore);
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
