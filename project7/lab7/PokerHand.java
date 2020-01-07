package lab7;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class PokerHand {
	
	public static void main(String[] args)
	  {
	    Deck deck = new Deck();
	    
	    // counters
	    int straights = 0;
	    int fullHouses = 0;
	    int flushes = 0;
	    
	    // if you uncomment any of the SOPs below for testing, 
	    // maybe make this number smaller!
	    int iterations = 100000;
	    
	    for (int i = 0; i < iterations; ++i)
	    {
	      Card[] cards = deck.select(5);
	    	  
	      PokerHand hand = new PokerHand(cards);
	      if (hand.isStraight())
	      {
	        straights += 1;
	        //System.out.println(Card.toString(cards));
	      }
	      else if (hand.isFullHouse())
	      {
	        fullHouses += 1;
	        //System.out.println(Card.toString(cards));
	      }
	      else if (hand.isFlush())
	      {
	        flushes += 1;
	        //System.out.println(Card.toString(cards));
	      }
	    }
	    
	    System.out.printf("Flushes     (expected .00198): %7.5f\n", ((double) flushes) / iterations);
	    System.out.printf("Straights   (expected .00355): %7.5f\n", ((double) straights) / iterations);
	    System.out.printf("Full Houses (expected .00144): %7.5f\n", ((double) fullHouses) / iterations);

	  }

	/*public static void main(String[] args)
	  {
	    // try a straight
	    Card[] cards = new Card[5];
	    cards[0] = new Card(2, Card.Suit.SPADES);
	    cards[1] = new Card(3, Card.Suit.HEARTS);
	    cards[2] = new Card(5, Card.Suit.CLUBS);
	    cards[3] = new Card(4, Card.Suit.DIAMONDS);
	    cards[4] = new Card(1, Card.Suit.SPADES);
	    
	    // print out the hand
	    System.out.println(Card.toString(cards));
	    PokerHand hand = new PokerHand(cards);

	    System.out.println(hand.isStraight());  // expected true
	    System.out.println(hand.isFullHouse()); // expected false
	    
	    // method call above should sort by rank (but not by suit) 
	    System.out.println(Card.toString(cards));
	    System.out.println();
	    
	    // try a full house
	    cards = new Card[5];
	    cards[0] = new Card(2, Card.Suit.SPADES);
	    cards[1] = new Card(7, Card.Suit.HEARTS);
	    cards[2] = new Card(7, Card.Suit.CLUBS);
	    cards[3] = new Card(2, Card.Suit.SPADES);
	    cards[4] = new Card(7, Card.Suit.DIAMONDS);
	    hand = new PokerHand(cards);
	    System.out.println(Card.toString(cards));
	    
	    System.out.println(hand.isStraight());  // expected false
	    System.out.println(hand.isFullHouse()); // expected true

	    // should now be sorted by rank
	    System.out.println(Card.toString(cards));

	  }*/


  /**
   * The 5 cards comprising a hand.
   */
  private Card[] cards;

  /**
   * Creates a hand using the 5 cards passed in.
   */
  public PokerHand(Card[] cards)
  {
    this.setHand(cards);
  }

  /**
   * Sets the cards in the hand.
   * 
   * @param cards
   *          a 5 card array. If not 5 cards, a RuntimeException is thrown.
   */
  public void setHand(Card[] cards)
  {
    if (cards.length == 5)
    {
      this.cards = cards;
    }
    else
    {
      throw new RuntimeException("Wrong number of cards. ");
    }
  }

  /**
   * Determines whether or not a hand is made up of cards from a single suit.
   * Should work with more than 4 suits, and any number of cards.
   * 
   * @return true iff all the cards have the same suit
   */
  public boolean isFlush()
  {
    sortWithSuit();
    return cards[0].getSuit().equals(cards[cards.length - 1].getSuit());
  }
  
  
  
  
  
  

  /**
   * Determines whether or not a hand is made up of consecutively increasing
   * ranks. E.g. 2, 3, 4, 5, 6. Should work with more than 4 suits, and any
   * number of cards.
   * 
   * @return true iff we have a straight
   */
  public boolean isStraight()
  	{
    sortNoSuit();
    int count = 0;
    for (int x = 0; x < cards.length - 1; x++) 
    		{
    		Card current = cards[x];
    		Card next = cards[x + 1];
    		if (current.getRank() + 1 == next.getRank()) 
    			{
    			count ++;
    			}
    		}
    if (count == cards.length - 1) 
    		{
    		return true;
    		}
    	return false;
  	}

  
  
  
  
  
  
  /**
   * Looks if we have a pair and a three of a kind in the hand.
   * 
   * @return true iff we have a full house.
   */
  public boolean isFullHouse()
  {
    sortNoSuit();
    int pair = 0;
    int trips = 0;
    
    for (int x = 0; x < cards.length; x++) {
    		Card current = cards[x];
    		int score = 0;
    		for (int y = 0; y < cards.length; y++) {
    			Card comp = cards[y];
    			if (current.getRank() == comp.getRank()) {
    				score ++;
    			}
    		}
    		if (score == 3) {
    			trips = current.getRank();
    		}
    		if (score == 2) {
    			pair = current.getRank();
    		}	
    	}
    if (trips > 0 && pair > 0) {
    		return true;}
    return false;
  }

  
  
  
  
  
  
  /**
   * Sorts the cards by their suit and then their rank.
   */
  private void sortWithSuit()
  {
    for (int i = 0; i < cards.length - 1; ++i)
    {
      // Step 1: find the "minimal" element to the right of position i
      int indexOfMin = findIndexOfMin(i);

      // Step 2: swap the minimal element into position i
      swap(i, indexOfMin);
    }
  }

  /**
   * Returns the index of the minimal element to the right of position 'start',
   * where cards are ordered first by suit, and within the same suit, by rank.
   * 
   * @param start
   *          first index at which to look
   * @return index of the smallest element to the right of 'start'
   */
  private int findIndexOfMin(int start)
  {
    int indexOfMin = start;
    for (int j = start + 1; j < cards.length; ++j)
    {
      // look at the two cards, the minimal one we've found,
      // and the one at the current position j
      Card min = cards[indexOfMin];
      Card current = cards[j];

      // if current has a lower suit than the current min, then it should come
      // first
      if (current.getSuit().compareTo(min.getSuit()) < 0)
      {
        indexOfMin = j;
      }
      else if (current.getSuit().equals(min.getSuit()))
      {
        // suits are the same, so compare ranks
        if (current.getRank() < min.getRank())
        {
          indexOfMin = j;
        }
      }
      // otherwise, current does not come before min, so ignore it
    }
    return indexOfMin;
  }

  
  
  
  
  
  
  /**
   * Sorts the cards according to their rank, ignoring their suits.
   */
  private void sortNoSuit()
  {
	  Card[] sorted = new Card[cards.length];
	  for (int x = 0; x < cards.length; x++) {
		  int place = 0;
		  Card current = cards[x];
		  for (int y = 0; y < cards.length; y++) {
			  Card comp = cards[y];
			  if (current.getRank() > comp.getRank()) {
				  place ++;
				  }
			  if (current.getRank() == comp.getRank() && x > y) {
				  place ++;
				  }
			  }
		  sorted[place] = cards[x];
		  }
	  for (int z = 0; z < cards.length; z++) {
		  cards[z] = sorted[z];
		  }
	  }
	 

  
  
  
  
  
  /**
   * Swaps the cards i and j in the hand.
   * 
   * @param i
   *          the first card to swap
   * @param j
   *          the card to swap with
   */
  private void swap(int i, int j)
  {
    Card c = cards[i];
    cards[i] = cards[j];
    cards[j] = c;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString()
  {
    if (isFullHouse())
    {
      return "a Full House!";
    }
    else if (isFlush())
    {
      if (isStraight())
      {
        return "a Straight Flush!";
      }
      else
      {
        return "a Flush!";
      }
    }
    else if (isStraight())
    {
      return "a Straight!";
    }
    return "Nothing";
  }

  /**
   * Prints out the suit and rank of each card in the hand in order.
   */
  public void printHand()
  {
    for (int i = 0; i < 5; i++)
    {
      System.out.print(cards[i].getSuit() + ":" + cards[i].getRank() + ", ");
    }
    System.out.println();
  }

}
