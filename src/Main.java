import java.util.ArrayList;
import java.util.List;



    private List<Card> hand = new ArrayList<Card>(){
        {
      add(new Card(Face.Eight, Suit.Club, 8));
      add(new Card(Face.Ace, Suit.Diamond, 1));
      }

    };

    Player bod = new Player("Robert Smith", new Playerhand(hand));


public void main(String[] args) {

    System.out.println(bod);
}