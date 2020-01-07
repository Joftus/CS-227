package postage1;

/*Joshua 
Loftus
ComSci 227
Section A*/

import java.util.Scanner;
import postage3.PostageUtil;

public class PostageTest2 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Weight: ");
		double nextDouble = input.nextDouble();
		System.out.println(PostageUtil.computePostage(nextDouble));}
}
