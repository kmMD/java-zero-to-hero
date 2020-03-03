package ee.itcollage.level10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cardgame {

    public static List<Card> buildDeck() {
        List<Card> cards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        return cards;
    }

    public static List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }

    public static void main(String[] args) {
        // 1 fix tests
        // 2 simulate playing poker (buildDeck, shuffle and get 5 cards)

        List<Card> deck = buildDeck();
        deck = shuffle(deck);
        for(int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }

    }
}
