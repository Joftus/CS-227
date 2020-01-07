package lab4;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class Donuts {
	  /**
	   * Try out the donut and coffee calculation.
	   * @param args
	   */
	  public static void main(String[] args)
	  {
	    double result = donutHelper(52, 10);
	    System.out.println("52 donuts and 10 coffees should be 38.00, actual " + result);
	    
	    result = donutHelper(52, 5);
	    System.out.println("52 donuts and 5 coffees should be 35.00, actual " + result);
	  }

	  /**
	   * Returns the total cost for a given number of donuts and coffees.
	   * @param donuts
	   *   number of donuts
	   * @param coffees
	   *   number of coffees
	   * @return
	   *   cost for a given number of donuts and coffees
	   */
	  private static double donutHelper(int donuts, int coffees)
	  {
	    int dozens = donuts / 12;
	    int singles = donuts % 12;
	    int freeCoffees = dozens * 2;
	    coffees = coffees - freeCoffees;
	    if (coffees <= 0) {
	    		coffees = 0;}
	    double donutCost = dozens * 8.00 + singles * .75;
	    double coffeeCost = coffees * 1.50;
	    return donutCost + coffeeCost;
	  }
}
