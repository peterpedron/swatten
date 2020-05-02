package st.watten;

/**
 * This class represents the most essential part of the Watten game, a card. It
 * holds a sign and a value. Watten in South Tyrol traditionally makes use of
 * the Salzburger Spielkarten.
 *
 * @see https://de.wikipedia.org/wiki/Spielkarte#Deutsches_Blatt
 *
 * @author Peter Pedron
 */
public class Card {

    /**
     * Card sign values, aka. "Schlag"
     */
    public enum Sign {
        ASS, // ACE
        KOENIG, // KING
        OBER, // QUEEN
        UNTER, // JACK
        ZEHN, // TEN
        NEUN, // NINE
        ACHT, // EIGHT
        SIEBEN, // SEVEN
        WELI, // SIX (Special card with color "SCHELL")
        NONE, // No sign, used in the game
    }

    /**
     * Card color values, aka. "Farbe"
     */
    public enum Color {
        EICHEL, // OAK
        LAUB, // LEAF
        HERZ, // HEART
        SCHELL, // BELL
        NONE, // No color, used in the game
    }

    /** sign value of the card */
    private Sign sign;
    /** color value of the card */
    private Color color;

    /**
     * Class constructor specifying sign and color of the card
     */
    public Card(Color color, Sign sign) {
        this.color = color;
        this.sign = sign;
    }

    /**
     * @return color value of the card
     */
    public Color getColor() {
        return this.color;
    }

    /**
     * @return sign value of the card
     */
    public Sign getSign() {
        return this.sign;
    }
}