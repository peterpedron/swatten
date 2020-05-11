package st.watten.test;

import org.junit.Test;
import org.junit.Before;

import st.watten.Card;
import st.watten.CardDeck;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Vector;

public class CardDeckTest {

    private CardDeck testDeck;

    private void drawAllCards() {
        testDeck.drawCards(CardDeck.MAX_CARD_COUNT);
    }

    @Before
    public void setUp() {
        testDeck = new CardDeck();
    }

    @Test
    public void createNewCardDeck() {
        assertEquals(CardDeck.MAX_CARD_COUNT, testDeck.getCardCount());
    }

    @Test
    public void drawCardsReducesDeckSize() {
        for (int i = 0; i < CardDeck.MAX_CARD_COUNT; i++) {
            int countBefore = testDeck.getCardCount();
            Card card = testDeck.drawCard();
            assertEquals(countBefore - 1, testDeck.getCardCount());
        }
        assertEquals(0, testDeck.getCardCount());
    }

    @Test
    public void suitsAndRanksOfCardsAreNotNone() {
        while (testDeck.getCardCount() > 0) {
            Card card = testDeck.drawCard();
            assertNotEquals(Card.Suit.NONE, card.getSuit());
            assertNotEquals(Card.Rank.NONE, card.getRank());
        }
    }

    @Test
    public void drawNCardsFromDeck() {
        int drawCount = 5;
        Vector<Card> cards = testDeck.drawCards(drawCount);

        assertEquals(CardDeck.MAX_CARD_COUNT - drawCount, testDeck.getCardCount());
    }

    @Test
    public void drawNegativeNumberOfCardsFromEmptyDeck() {
        int drawCount = -3;
        Vector<Card> cards = testDeck.drawCards(drawCount);
        assertEquals(0, cards.size());
    }

    @Test
    public void drawACardFromEmptyDeck() {
        drawAllCards();

        Card card = testDeck.drawCard();
        assertEquals(null, card);
    }

    @Test
    public void drawNCardsFromEmptyDeck() {
        drawAllCards();

        int drawCount = 3;
        Vector<Card> cards = testDeck.drawCards(drawCount);
        assertEquals(0, cards.size());
    }

}