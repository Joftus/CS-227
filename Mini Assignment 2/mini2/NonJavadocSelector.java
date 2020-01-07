package mini2;

import api.Selector;

//)0

/**
 * Selector that returns false if the current string is
 * within a javadoc comment, true otherwise.  Using a NonJavadocSelector
 * in the filter method of a StringList has the effect of removing all
 * javadoc comments.  Note that we are assuming that javadoc comments
 * always start and end on different lines, and that no executable
 * code ever appears on the same line as a javadoc comment.
 */
public class NonJavadocSelector implements Selector
{

	private int count = 0;
	
	public boolean select(String s) {
		if (s.contains("/**")) {
			count = 1;}
		if (s.contains("*/")) {
			count = 0;
			return false;}
		if (count == 1) {
			return false;}
		return true;
	}
}
