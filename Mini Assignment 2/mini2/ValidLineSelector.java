package mini2;

import api.Selector;

//)0

/**
 * Selector that returns false for a strings that are
 * empty, that are all whitespace, or whose first non-whitespace
 * character is the '#' character.
 */
public class ValidLineSelector implements Selector
	{
	
	public boolean select(String s) 
		{
		s = s.replaceAll(" ", "");
		if (s.length() == 0 || s.charAt(0) == '#') 
			{
			return false;
			}
		else 
			{
			return true;
			}
		}
	}
