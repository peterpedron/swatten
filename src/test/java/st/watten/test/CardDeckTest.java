package st.watten.test;

import org.junit.Test;

import st.watten.Card;
import st.watten.CardDeck;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CardDeckTest {

    @Test
    public void createCardDeck() {
        CardDeck deck = new CardDeck();

        assertEquals(33, deck.getCardCount());
    }

    @Test
    public void allSuitsAndRanksAreNotNone() {
        CardDeck deck = new CardDeck();

        while (deck.getCardCount() > 0) {
            Card card = deck.drawCard();
            assertNotEquals(Card.Suit.NONE, card.getSuit());
            assertNotEquals(Card.Rank.NONE, card.getRank());
        }
    }
}