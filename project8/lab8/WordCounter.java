package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class WordCounter {
	public static void main(String[] args) throws FileNotFoundException
	  {
		int wordCount = 0;
	    File file = new File("story.txt");
	    Scanner scanner = new Scanner(file);
	    int lineCount = 1;

	    while (scanner.hasNextLine())
	    {
	      String line = scanner.nextLine();
	      String[] words = new String[line.length()];
	      words = line.split(" ");
	      wordCount = words.length;
	      System.out.println("line: " + lineCount + " has " + wordCount + " words");
	      lineCount += 1;
	    }
	    scanner.close();
	  }
}
