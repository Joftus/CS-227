package mini2;

import api.Combiner;

//)0

/**
 * Combiner whose <code>combine</code> method, given an Integer n and a string, 
 * returns n if the string is a blank line or a line containing
 * a single curly brace; otherwise returns n + 1.  (A curly brace on a line whose
 * only other text is an end-of-line comment is treated as just a curly brace.)
 * Using a SlocCounter in the reduce method has the general effect of counting 
 * the number of "source lines of code" that are actual program statements,
 * assuming that line comments and javadoc comments have already been
 * filtered out.
 */
public class SlocCounter implements Combiner<Integer>
{
	public Integer combine(Integer obj, String s)
		{
		String[] noDash = s.split("/");
		s = noDash[0];
		String a = s.replace(" ", "");
		
		if (a.contains("{") && a.length() == 1)
			{
			return obj;
			}
		if (a.contains("}") && a.length() == 1)
			{
			return obj;
			}
		if (a.equals(""))
			{
			return obj;
			}
		else
			{
			return obj + 1;
			}
		}
}