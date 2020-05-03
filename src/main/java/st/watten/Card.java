package st.watten;

/**
 * This class represents the most essential part of the Watten game, a card. It
 * holds a rank and a value. Watten in South Tyrol traditionally makes use of
 * the Salzburger Spielkarten.
 *
 * @see https://de.wikipedia.org/wiki/Spielkarte#Deutsches_Blatt
 *
 * @author Peter Pedron
 */
public class Card {

    /**
     * Card rank values, aka. "Schlag"
     */
    public enum Rank {
        ASS, // ACE
        KOENIG, // KING
        OBER, // QUEEN
        UNTER, // JACK
        ZEHN, // TEN
        NEUN, // NINE
        ACHT, // EIGHT
        SIEBEN, // SEVEN
        WELI, // SIX (Special card only with suit "SCHELL")
        NONE, // No rank, used in the game
    }

    /**
     * Card suit values, aka. "Farbe"
     */
    public enum Suit {
        EICHEL, // OAK
        LAUB, // LEAF
        HERZ, // HEART
        SCHELL, // BELL
        NONE, // No suit, used in the game
    }

    /** rank value of the card */
    private Rank rank;
    /** suit value of the card */
    private Suit suit;

    /**
     * Class constructor specifying suit and rank of the card
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;

        // Assert WELI is only created with SCHELL suit
        assert ((this.rank == Card.Rank.WELI) && (this.suit == Card.Suit.SCHELL))
                || (this.rank != Card.Rank.WELI) : "WELI can only be of suit SCHELL";
    }

    /**
     * @return suit value of the card
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * @return rank value of the card
     */
    public Rank getRank() {
        return this.rank;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (other.getClass() != getClass()) {
            return false;
        }

        Card otherCard = (Card) other;
        return this.suit == otherCard.suit && this.rank == otherCard.rank;
    }
}