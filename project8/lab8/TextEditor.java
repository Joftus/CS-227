package lab8;

/*Joshua 
Loftus
ComSci 227
Section A*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextEditor {

	  public static void main(String[] args) throws FileNotFoundException
	  {
	    @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
	    File outFile = new File("../project7/Deck.java");
	    if (outFile.exists())
	    {
	      System.out.print("File already exists, ok to overwrite (y/n)? ");
	      if (!in.nextLine().startsWith("y"))
	      {
	        return;
	      }
	    }

	    PrintWriter out = new PrintWriter(outFile);

	    // Echo keyboard input out to the file.
	    while (in.hasNextLine())
	    {
	      String line = in.nextLine();
	      out.println(line);
	    }
	    
	    System.out.println("Done");
	    out.close(); // Important: don't forget to close!
	  }
}