package lab3;

/*Joshua 
Loftus
ComSci 227
Section A*/

//works

public class RabbitModel2 {
	
	private int year = 0;
	private int totalRabbits;
	
	public int getPopulation() {
		return totalRabbits;}
	  
	public void simulateYear() {
		year = year + 1;
	  	totalRabbits /= 2;}
	  
	public void reset() {
		totalRabbits = 500;
		year = 0;}
}
