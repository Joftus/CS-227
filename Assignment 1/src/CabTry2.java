/*Joshua 
Loftus
ComSci 227
Section A*/

public class CabTry2 {
	
	private double baseFare;
	private double perMileRate;
	
	private double totalCash;
	private double incomePerMile;
	private double currentRate;
	private double totalMiles;
	private double meter;
	private boolean hasPassenger;
	private double miles;
	
	
	
	public CabTry2(double givenBaseFare, double givenPerMileRate) {
		baseFare = givenBaseFare;
		perMileRate = givenPerMileRate;}
	
	public void pickUp() {
		hasPassenger = true;
		currentRate = perMileRate;}
	
	public double currentRate() {
		if (hasPassenger == true) {
			currentRate = perMileRate;}
		else {
			currentRate = 0;}
		return currentRate;}
	
	public void drive(double givenMiles) {
		miles = givenMiles;
		meter = baseFare + (currentRate * miles);
		totalMiles += miles;}
	
	public double getCurrentRate() {
		return currentRate;}
	
	public double getMeter() {
		return meter;}
	
	public void dropOff() {	
		hasPassenger = false;
		totalCash += meter;
		currentRate = 0;
		meter = 0;}
	
	
	
	
	
	
	
	
	
	
	
	public double getIncomePerMile() {
		incomePerMile = totalCash / totalMiles;
		return incomePerMile;}
	
	public double getTotalCash() {
		return totalCash;}
	
	public double getTotalMiles() {
		return totalMiles;}
}
