package lab7;

/*Joshua 
Loftus
ComSci 227
Section A*/

import java.util.Random;

import lab7.Card.Suit;


public class Deck {
	/**
	 * Class representing a standard 52-card deck of playing
	 * cards from which cards can be selected at random.
	 */
	  /**
	   * The cards comprising this deck.
	   */
	  private Card[] cards;
	  
	  /**
	   * The random number generator to use for selecting cards.
	   */
	  private Random rand;
	  
	  /**
	   * Constructs a new deck with a default random number generator.
	   */
	  public Deck()
	  {
	    rand = new Random();
	    init();
	  }

	  /**
	   * Constructs a new deck with the given random number generator.
	   */
	  public Deck(Random givenGenerator)
	  {
	    rand = givenGenerator;
		init();
	  }
	  
	  
	  
	  
	  
	  
	  
	  /**
	   * Returns a new array containing k elements selected
	   * at random from this deck.
	   */
	  public Card[] select(int k)
	  {
	    Card[] hand = new Card[k];
	    for (int x = 0; x < k; x++) {
	    		int index = rand.nextInt(51 - x);
	    		Card temp = cards[index];
	    		cards[index] = cards[51 - x];
	    		cards[51 - x] = temp;}
	    int count = 0;
	    while (k > 0) {
	    		hand[count] = cards[52 - k];
	    		count ++;
	    		k --;}
	    
	    	return hand;
	  }
	  
	  
	  
	  
	  
	  
	  
	  /**
	   * Initializes a new deck of 52 cards.
	   */
	  private void init()
	  {
		int used = 0;
	    cards = new Card[52 - (used * 5)];
	    int index = 0;
	    for (int rank = 1; rank <= 13; ++rank)
	    {
	      cards[index] = new Card(rank, Suit.CLUBS);
	      index += 1;
	      cards[index] = new Card(rank, Suit.DIAMONDS);
	      index += 1;
	      cards[index] = new Card(rank, Suit.HEARTS);
	      index += 1;
	      cards[index] = new Card(rank, Suit.SPADES);
	      index += 1;
	    }
	    used ++;
	  }
}
