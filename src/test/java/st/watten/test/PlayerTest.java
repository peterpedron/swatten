package st.watten.test;

import org.junit.Test;
import org.junit.Before;

import st.watten.Player;
import st.watten.Card;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Vector;

public class PlayerTest {

    private static final int testId = 123;
    private Player testPlayer;

    @Before
    public void setUp() {
        testPlayer = new Player(testId);
    }

    @Test
    public void createPlayer() {
        assertEquals(testId, testPlayer.getId());
        assertEquals(0, testPlayer.getCards().size());
    }

    @Test
    public void handleCards() {
        Vector<Card> cards = new Vector<Card>();
        cards.add(new Card(Card.Suit.SCHELL, Card.Rank.SIEBEN));
        cards.add(new Card(Card.Suit.HERZ, Card.Rank.ASS));
        testPlayer.assignCards(cards);
        assertEquals(2, testPlayer.getCards().size());
    }
}