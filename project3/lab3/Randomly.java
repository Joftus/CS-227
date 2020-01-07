package lab3;
import java.util.Random;
/*Joshua 
Loftus
ComSci 227
Section A*/

public class Randomly {
	
	public static void main(String[] args) {
		Random rand = new Random(137);
		System.out.println(rand.nextInt(6));
		System.out.println(rand.nextInt(6));
		System.out.println(rand.nextInt(6));
		System.out.println(rand.nextInt(6));
	}
}
