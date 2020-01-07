package mini2;



import api.Combiner;
import api.Selector;

/*
 * Joshua Loftus ComSci 227 Section A
 */



//)0
public class TestCases
	{
	public static void main(String[] args) 
		{
		//Selector s = new NonJavadocSelector();
		//System.out.println(s.select("banana"));   // should be true
		//System.out.println(s.select("/** apple"));  // should be false now
		//System.out.println(s.select("grapefrult"));   // should still be false
		//System.out.println(s.select("  */ "));   // should still be false
		//System.out.println(s.select("apricot"));   // should be true now
		
		/*
		Combiner a = new FirstLetterCombiner();
		System.out.println(a.combine("foo", ""));
		*/
		
		/*
		Combiner b = new SlocCounter();
		System.out.println(b.combine(17, "   } // else "));
		*/
		
		Selector c = new NonLineCommentSelector();
		System.out.println(c.select("/a"));
		}
	}
