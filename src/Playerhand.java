import java.util.ArrayList;
import java.util.List;

public class Playerhand {

   private List<Card> hand = new ArrayList<>();

    public Playerhand(List<Card> hand) {
        this.hand = hand;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        String handString =
        "Playerhand{ + hand=";
        for (Card c : hand) {
            handString += c;
                };

        return handString;
    }
}
