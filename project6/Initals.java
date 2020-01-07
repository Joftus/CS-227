/*Joshua 
Loftus
ComSci 227
Section A*/

public class Initals {
	
	public static void main(String[] args) {
		System.out.println(Initals.initializor("Josh loftus"));
		System.out.println("Exepcted: Jl");
		System.out.println(Initals.initializor("osh Ftus"));
		System.out.println("Exepcted: oF");
		
		System.out.println(vowelLocatoranator("josh loftus"));
		System.out.println("Exepcted: 1");
		System.out.println(vowelLocatoranator("jsh loftus"));
		System.out.println("Exepcted: 5");
		}

	public static String initializor(String givenName) {
		String[] splitter = givenName.split(" ");
		int len = splitter.length;
		int count = 0;
		String initals = "";
		while (count < len) {
			char a = splitter[count].charAt(0);
			initals += a + "";
			count ++;}
		return initals;}
	
	
	
	public static int vowelLocatoranator(String givenString) {
		int len = givenString.length();
		String vowels = "aeiouAEIOU";
		for (int count = 0; count < len; count ++) {
			if (vowels.contains(String.valueOf(givenString.charAt(count)))){
				return count;}}
		return -1;}
}
