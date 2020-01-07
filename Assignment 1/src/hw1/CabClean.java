package hw1;

public class CabClean {
	
	
private double baseFare;
	private double perMileRate;
	

	private double totalCash;
	private double incomePerMile;
	private double currentRate;
	private double totalMiles;
	private double meter;
	private boolean hasPassenger = false;
	private double miles;

	public CabClean(double givenBaseFare, double givenPerMileRate) {
		baseFare = givenBaseFare;
		perMileRate = givenPerMileRate;}
	
	public boolean hasPassenger(){ 
		return hasPassenger;}

	public void pickUp() {
		currentRate = perMileRate;
		hasPassenger = true;
		meter = baseFare;}
	
		/**if (hasPassenger == true) {
			currentRate = perMileRate;}
		else {
			currentRate = 0;}
		return currentRate;
		**/

	public void drive(double givenMiles) {
		miles = givenMiles;
		totalMiles += miles;
		if (hasPassenger == true){
			meter = meter + (currentRate * miles);}
		else{
			meter = 0;}
	}
		

	public double getCurrentRate() {
		return currentRate;}
	

	public double getMeter() {
		return meter;}
	

	public void dropOff() {	
		hasPassenger = false;
		totalCash += meter;
		currentRate = 0;
		meter = 0;}

	public double getAverageIncomePerMile() {
		incomePerMile = totalCash / totalMiles;
		return incomePerMile;}

	public double getTotalCash() {
		return totalCash;}
	
	public double getTotalMiles() {
		return totalMiles;}
}