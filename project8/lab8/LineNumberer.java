package lab8;

/*Joshua 
Loftus
ComSci 227
Section A*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineNumberer {
		  public static void main(String[] args) throws FileNotFoundException
		  {
		    File file = new File("../project7/lab7/Card.java");
		    @SuppressWarnings("resource")
			Scanner scanner = new Scanner(file);
		    int lineCount = 1;

		    while (scanner.hasNextLine())
		    {
		      String line = scanner.nextLine();
		      System.out.print(lineCount + " ");
		      System.out.println(line);
		      lineCount += 1;
		    }
		    
		    System.out.println("Done");
		  }
		}
