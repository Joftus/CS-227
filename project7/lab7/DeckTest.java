package lab7;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class DeckTest {
	 public static void main(String[] args)
	  {
	    Deck deck = new Deck();
	    Card[] hand = deck.select(5);
	    System.out.println(Card.toString(hand));
	  }
}
