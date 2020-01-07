/*Joshua
 * Loftus
 * ComSci 227
 * Section A
 */
package hw1;

/*
 * This class is for drivers for hire to calculate some basic statistics
 * such as total miles, earnings and earningspermile. Cab class also keeps track
 * of whether or not you have a customer in your car. 
 */
public class Cab {
	
	/**
	 * baseFare is the price to get in the cab essentially.
	 */
	private double baseFare;
	
	/**
	 * perMileRate is how much a user gets charged for each mile they are driven.
	 */
	private double perMileRate;
	
	/**
	 * totalCash tells the driver how much money he has made overall.
	 */
	private double totalCash;
	
	/**
	 * incomePerMile tells the driver how much money they make per mile they drive a customer.
	 */
	//private double incomePerMile;
	
	/**
	 * currentRate is the sister variable to hasPassenger as it dictates the perMileRate based on the cabs vacancy.
	 */
	private double currentRate;
	
	/**
	 * totalMiles tells the driver how many miles they have driven overall
	 */
	private double totalMiles;
	
	/**
	 * meter is what would be displayed in the cab, informs the customer of total cost.
	 * Turns off when the cab is vacant.
	 */
	private double meter;
	
	/**
	 * hasPassenger keeps track of whether their is a customer in the car.
	 * P.S. pretty sure the default for a boolean variable is false but 
	 * I realized it too late and I Spec Checker doesn't run on my MacBook Pro :(.
	 */
	private boolean hasPassenger = false;
	
	/**
	 * miles is the distance the customer wants to travel
	 */
	private double miles;
	
	/**
	 * Constructs a cab that will use the given base fare and per-mile rate.
	 * @param 
	 * givenBaseFare - assigned by company, dictates how much a customer is charged for stepping into the cab.
	 * givenPerMileRate - assigned by company, dictates how much a customer is charged for each mile driven throughout their trip.
	 */
	public Cab(double givenBaseFare, double givenPerMileRate) {
		baseFare = givenBaseFare;
		perMileRate = givenPerMileRate;}
	
	/**
	 * Determines whether the cab currently has a passenger (i.e., the current rate is nonzero).
	 * @return
	 * hasPassenger - true or false value, show whether or not their is a customer in the cab.
	 */
	public boolean hasPassenger(){ 
		return hasPassenger;}
	
	/**
	 * Starts a new ride, setting the meter to the base fare and setting the current rate to the per mile charge.
	 */
	public void pickUp() {
		currentRate = perMileRate;
		hasPassenger = true;
		meter = baseFare;}
	
	/**
	 * Drives the cab the given number of miles, updating the total miles and possibly updating the meter.
	 * @param 
	 * givenMiles - assigned by the passenger, this is found after getting the destination and mapping it out.
	 */
	public void drive(double givenMiles) {
		miles = givenMiles;
		totalMiles += miles;
		if (hasPassenger == true){
			meter = meter + (currentRate * miles);}
		else{
			meter = 0;}}
		
	/**
	 * Returns the current per-mile rate, which is always either zero or the per-mile rate given in the constructor.
	 * @return
	 * currentRate - either zero or the per-mile rate given
	 */
	public double getCurrentRate() {
		return currentRate;}
	
	/**
	 * Returns the amount of money shown on the meter for the current ride.
	 * @return
	 * meter - would be displayed for customer to see what they owe.
	 */
	public double getMeter() {
		return meter;}
	
	/**
	 * Ends the current ride, updating the total cash collected and resetting the meter and current rate to zero.
	 */
	public void dropOff() {	
		hasPassenger = false;
		totalCash += meter;
		currentRate = 0;
		meter = 0;}

	/**
	 * Returns the average income earned by this cab per mile driven.
	 * @return
	 * incomePerMile - totalCash divided by totalMiles
	 */
	public double getAverageIncomePerMile() {
		double incomePerMile = totalCash / totalMiles;
		return incomePerMile;}

	/**
	 * Returns the total cash collected by this cab during its lifetime.
	 * @return
	 * totalCash - summation of all the drivers earnings
	 */
	public double getTotalCash() {
		return totalCash;}
	
	/**
	 * Returns the total miles driven by this cab during its lifetime.
	 * @return
	 * totalMiles - summation of all the drivers miles driven.
	 */
	public double getTotalMiles() {
		return totalMiles;}
}
