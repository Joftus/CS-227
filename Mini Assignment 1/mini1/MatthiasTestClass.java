package mini1;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class MatthiasTestClass {
	
	public static void main(String[] args) {
		System.out.println(MatthiasTestClass.isLucasSequence("-2 1 -1 0 -1 -1 -2 -3 -5 -8"));
		}
	
	
	public static boolean isLucasSequence(String text) {
		String[] numList = text.split(" ");
		String temp_s = "";
		int len = numList.length;
		int count = 0;
		int temp_n = 0;
		int result = 0;
		int n_1 = 0;
		int n_2 = 0;
		
		while (count < len) {
			temp_s = numList[count];
			temp_n = Integer.parseInt(temp_s);
			if (count == 0) {
				n_2 = temp_n;}
			if (count == 1) {
				n_1 = temp_n;}
			if (n_1 + n_2 == temp_n && count != 0 && count != 1) {
				result += 1;}
			count += 1;
			n_2 = n_1;
			n_1 = temp_n;}
		if (result == len - 3 || len < 3) {
			return true;}
		else {
			return false;}}
}