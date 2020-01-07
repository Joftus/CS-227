package lab3;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class RabbitModel4 {
	
	private int totalRabbits = 0;
	private int yearBefore = 1;
	private int twoYearsBefore = 0;

	public int getPopulation() {
		return totalRabbits;}
	  
	public void simulateYear() {
	  	totalRabbits = yearBefore + twoYearsBefore;
		twoYearsBefore = yearBefore;
		yearBefore = totalRabbits;}
	
	public void reset() {
		totalRabbits = 0;
		yearBefore = 1;
		twoYearsBefore = 0;}
}
