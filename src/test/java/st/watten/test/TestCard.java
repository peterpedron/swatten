package st.watten.test;

import st.watten.Card;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCard {

    @Test
    public void createHerzKoenig() {
        Card card = new Card(Card.Color.HERZ, Card.Sign.KOENIG);

        // assert statements
        assertEquals(Card.Color.HERZ, card.getColor());
        assertEquals(Card.Sign.KOENIG, card.getSign());
    }
}