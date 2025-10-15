package st.watten;

import java.util.Vector;

public class Player {

    public static final int MAX_CARDS = 5;

    private int id;
    private Vector<Card> cards = new Vector<Card>(MAX_CARDS);

    public Player(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public boolean assignCards(Vector<Card> cards) {
        if (this.cards.size() + cards.size() > MAX_CARDS) {
            return false;
        }
        this.cards.addAll(cards);
        return true;
    }

    public final Vector<Card> getCards() {
        return this.cards;
    }

    public void returnCards() {
        this.cards.clear();
    }

    public boolean playCard(Card card) {
        return false;
    }

}