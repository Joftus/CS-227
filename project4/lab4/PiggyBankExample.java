package lab4;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class PiggyBankExample {

	  /**
	   * @param args
	   */
	  public static void main(String[] args)
	  {
	    PiggyBank piggy = new PiggyBank(5);
	    piggy.addCoins(1);
	    piggy.addCoins(1);
	    int a = piggy.getNumCoins();
	    System.out.println("Should contain 2 coins: " + a);
	    System.out.println("Should be false (not smashed): " + piggy.isSmashed());
	    piggy.addCoins(1);
	    System.out.println("Should now contain 3 coins: " + piggy.getNumCoins());
	  }

}
