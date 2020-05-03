package st.watten.test;

import st.watten.Card;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CardTest {

    @Test
    public void createHerzKoenig() {
        Card card = new Card(Card.Suit.HERZ, Card.Rank.KOENIG);

        // assert statements
        assertEquals(Card.Suit.HERZ, card.getSuit());
        assertEquals(Card.Rank.KOENIG, card.getRank());
    }
}