package lab3;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class RabbitModelBase {
	
	private int totalRabbits = 2;

	public int getPopulation() {
		return totalRabbits;}
	  
	public void simulateYear() {
	  	totalRabbits += 1;}
	
	public void reset() {
		totalRabbits = 2;}
}
