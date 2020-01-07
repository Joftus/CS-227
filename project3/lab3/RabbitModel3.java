package lab3;

/*Joshua 
Loftus
ComSci 227
Section A*/

//works

import java.util.Random;

public class RabbitModel3 {
	
	private int totalRabbits = 2;
	private Random rand = new Random();

	public int getPopulation() {
		return totalRabbits;}
	  
	public void simulateYear() {
		totalRabbits = totalRabbits + rand.nextInt(10);}
	  
	public void reset() {
		totalRabbits = 2;}
}
