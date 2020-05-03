package st.watten.test;

import st.watten.Card;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CardTest {

    private Card testCard = new Card(Card.Suit.HERZ, Card.Rank.KOENIG);

    @Test
    public void createHerzKoenig() {
        assertEquals(Card.Suit.HERZ, testCard.getSuit());
        assertEquals(Card.Rank.KOENIG, testCard.getRank());
    }

    @Test
    public void checkEqualsMethod() {
        assertNotEquals(null, testCard);
        assertNotEquals(new String("Hebn!"), testCard);
        assertNotEquals(new Card(Card.Suit.EICHEL, Card.Rank.SIEBEN), testCard);
        assertEquals(new Card(Card.Suit.HERZ, Card.Rank.KOENIG), testCard);
    }

    @Test(expected = AssertionError.class)
    public void checkWeliCanOnlyBeCreatedWithSchellSuit() {
        testCard = new Card(Card.Suit.EICHEL, Card.Rank.WELI);
    }
}