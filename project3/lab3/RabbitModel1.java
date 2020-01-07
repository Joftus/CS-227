package lab3;

/*Joshua 
Loftus
ComSci 227
Section A*/

//works

public class RabbitModel1 {
	
	private int totalRabbits = 0;

	public int getPopulation() {
		return totalRabbits;}
	  
	public void simulateYear() {
		totalRabbits += 1;
		totalRabbits = totalRabbits % 5;}
	  
	public void reset() {
		totalRabbits = 0;}
}
