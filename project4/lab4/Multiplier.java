package lab4;

/*Joshua 
Loftus
ComSci 227
Section A*/

import java.util.Scanner;

public class Multiplier {
	public static void main(String[] args)
	  {
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int first = scanner.nextInt();
	    System.out.print("Enter a number: ");
	    int second = scanner.nextInt();
	    int result = first * second;
	    System.out.println(first + " times " + second + " is " + result);
	  }
}
