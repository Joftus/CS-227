
/*Joshua 
Loftus
ComSci 227
Section A*/

public class AtomClean {
	
	private int protons;
	private int neutrons;
	private int electrons;
	
	public AtomClean(int givenProtons, int givenNeutrons, int givenElectrons){
		protons = givenProtons;
		neutrons = givenNeutrons;
		electrons = givenElectrons;}
		
	public int getAtomicMass(){
		int atomicMass = protons + neutrons;
		return atomicMass;}
	
	public int getAtomicCharge(){
		int atomicCharge = protons - electrons;
		return atomicCharge;}
	
	public void decay(){
		protons -= 2;
		neutrons -= 2;}
}
