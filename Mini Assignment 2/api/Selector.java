package api;

//)0

/**
 * Interface representing a section operation that returns 
 * a boolean value for a given string.  Can be used as a means 
 * of selecting a subset of strings from a StringList.
 */
public interface Selector
{
  /**
   * Determines whether the given string should be selected.
   * @param s
   *   any string
   * @return
   *   true if the string is selected, false otherwise
   */
  boolean select(String s);
}
