package mini2;



import api.Selector;



//)0
/**
 * Selector whose <code>select</code> method returns false for strings whose
 * first non-whitespace text is "//", and true for all other strings.
 */
public class NonLineCommentSelector implements Selector
	{
	public boolean select(String s) 
		{
		String a = s.replace(" ", "");
		if (a.length() == 0)
			{
			return true;
			}
		if (a.charAt(0) == '/' && a.charAt(1) == '/') 
			{
			return false;
			}
		return true;
		}
	}