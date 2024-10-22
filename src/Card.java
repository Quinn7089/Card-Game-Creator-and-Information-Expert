public class Card {

    private Face face;
    private Suit suit;
    private int value;


    public Card(Face face, Suit suit, int value) {
        this.face = face;
        this.suit = suit;
        this.value = value;
    }

    public Face getFace() {
        return face;
    }

    public void setFace(Face face) {
        this.face = face;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "face=" + face +
                ", suit=" + suit +
                ", value=" + value +
                '}';
    }
}
