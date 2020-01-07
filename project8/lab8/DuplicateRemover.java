package lab8;

import java.util.ArrayList;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class DuplicateRemover {
	
	public static void main(String[] args) {
		ArrayList<String> original = new ArrayList<String>();
		original.add("A");
		original.add("A");
		original.add("B");
		original.add("A");
		original.add("B");
		System.out.println(removeDuplicates(original));
	}

	public static ArrayList<String> removeDuplicates(ArrayList<String> original) {
		ArrayList<String> uniques = new ArrayList<String>();
		for (String element : original) {
			if (!uniques.contains(element)) {
				uniques.add(element);
			}
		}
		return uniques;
	}
}
