package codeware;

public class CardGame {
    
    /*
    
Steve and Josh are bored and want to play something. They don't want to think too much, so they come up with a really simple game. Write a function called winner and figure out who is going to win.

They are dealt the same number of cards. They both flip the card on the top of their deck. Whoever has a card with higher value wins the round and gets one point (if the cards are of the same value, neither of them gets a point). After this, the two cards are discarded and they flip another card from the top of their deck. They do this until they have no cards left.

deckSteve and deckJosh are arrays representing their decks. They are filled with cards, represented by a single character. The card rank is as follows (from lowest to highest):

'2','3','4','5','6','7','8','9','T','J','Q','K','A'

     */
    public static String winner(String[] deckSteve, String[] deckJosh) {

        int joshScore = 0;
        int steveScore = 0;

        for (int i = 0; i < deckJosh.length; i++) {

            // find the ith card rank
            int joshCardValue = getCardValue(deckJosh[i]);
            int steveCardValue = getCardValue(deckSteve[i]);

            // give the round score
            if (joshCardValue > steveCardValue) {
                joshScore++;
            }
            if (steveCardValue > joshCardValue) {
                steveScore++;
            }
        }

        if (joshScore > steveScore) {
            return String.format("Josh wins %d to %d", joshScore, steveScore);
        }

        if (steveScore > joshScore) {
            return String.format("Steve wins %d to %d", steveScore, joshScore);
        }
        return "Tie";
    }

    public static int getCardValue(String card) {
        String[] cardScore = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        for (int i = 0; i < cardScore.length; i++) {
            if (card.equalsIgnoreCase(cardScore[i])) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] steve = {"A", "7", "8"};
        String[] josh = {"K", "5", "9"};
        System.out.println(winner(steve, josh));
    }
}
