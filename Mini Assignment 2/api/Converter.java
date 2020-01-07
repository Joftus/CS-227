package api;

import java.io.FileNotFoundException;

/**
 * Transformation that converts the given string into an 
 * object of type T.
 * @param <T>
 */
public interface Converter<T>
{
  /**
   * Converts the given string into an object of type T.
   * @param s
   *   any string
   * @return
   *   an object of type T
 * @throws FileNotFoundException 
   */
  T convert(String s) throws FileNotFoundException;
}
