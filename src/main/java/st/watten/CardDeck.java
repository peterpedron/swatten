package st.watten;

import java.util.Collections;
import java.util.Vector;

/**
 * This class represents a Card Deck used in Blindwatten
 *
 * @author Peter Pedron
 */
public class CardDeck {

    public static final int MAX_CARD_COUNT = 33;

    private Vector<Card> deck = new Vector<Card>(MAX_CARD_COUNT);

    public CardDeck() {
        generateDeck();
        shuffle();
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

    public void shuffle() {
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

    public Vector<Card> drawCards(int count) {
        Vector<Card> cards = new Vector<Card>();
        if (deck.size() >= count) {
            for (int i = 0; i < count; i++) {
                cards.add(drawCard());
            }
        }
        return cards;
    }

}