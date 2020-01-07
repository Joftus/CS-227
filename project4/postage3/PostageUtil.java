package postage3;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class PostageUtil {
	public static double computePostage(double weight){
		double cost = .47;
		if (weight > 1) {
			cost = cost + Math.ceil(weight - 1) * .21;}
		if (weight > 3.5) {
			cost = cost + .47;}
		return cost;}
}
