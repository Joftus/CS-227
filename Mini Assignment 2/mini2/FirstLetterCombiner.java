package mini2;

import api.Combiner;

//)0

/**
 * Combiner that appends the first letter of a string onto
 * the accumulator.  If the string is empty, returns the 
 * accumulator.
 */
public class FirstLetterCombiner implements Combiner<String>
	{
	public String combine(String obj, String s) 
		{
		if (s.equals("")) {
			return obj;}
		obj += s.charAt(0);
		return obj;
		}
	}
