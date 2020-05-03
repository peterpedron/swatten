package st.watten;

import java.util.Collections;
import java.util.Vector;

/**
 * This class represents a Card Deck used in Blindwatten
 *
 * @author Peter Pedron
 */
public class CardDeck {

    private Vector<Card> deck = new Vector<Card>();

    public CardDeck() {
        generateDeck();
        mix();
    }

    private void generateDeck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                if ((suit != Card.Suit.NONE) && (rank != Card.Rank.NONE) && (rank != Card.Rank.WELI)) {
                    deck.add(new Card(suit, rank));
                }
            }
        }
        deck.add(new Card(Card.Suit.SCHELL, Card.Rank.WELI));

        assert deck.size() == 33;
    }

    public void mix() {
        Collections.shuffle(deck);
    }

    public int getCardCount() {
        return deck.size();
    }

    public Card drawCard() {
        if (deck.size() > 0) {
            return deck.remove(0);
        }
        return null;
    }

}