package lab4;

/*Joshua 
Loftus
ComSci 227
Section A*/

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args)
	  {
	    String theInput = "Huey Louie Dewey";
	    
	    // construct a scanner to read from the string
	    @SuppressWarnings("resource")
		Scanner in = new Scanner(theInput);
	    
	    // parse the input to get the three items
	    String first = in.next();
	    String second = in.next();
	    String third = in.next();
	    
	    // print them out
	    System.out.println(first);
	    System.out.println(second);
	    System.out.println(third);
	  }
}
