package mini2;

import api.Transformation;

//)0

/**
 * Transformation whose <code>apply</code> method prepends a line number to each string.  
 * For a newly created LineNumberer, the line numbers start at 1 and increase on
 * each successive call.  The line number is left-justified in a field 5 spaces wide.
 */
public class LineNumberer implements Transformation
	{
	private int lineCount = 1;
	
	public String apply(String s) 
		{
		int numSpaces = 0;
	    String lineNum = lineCount + "";
	    lineCount += 1;
	    numSpaces = 5 - lineNum.length();
	    String spaces = "";
	    while (numSpaces > 0) 
	    		{
	    		spaces += " ";
	    		numSpaces -= 1;
	    		}
		return lineNum + spaces + s;
		}
	}