package lab2;

/*Joshua 
Loftus
ComSci 227
Section A*/

public class Atom {
	  /**
	   * Number of protons in the atom.
	   */
	private int protons;
	  /**
	   * Number of neutrons in the atom.
	   */
	private int neutrons;
	  /**
	   * Number of electrons in the atom.
	   */
	private int electrons;
	
	  /**
	   * Constructs an atom with the given number of protons, neutrons and electrons.
	   * @param givenProtons, givenNeutrons, givenElectrons.
	   */
	public Atom(int givenProtons, int givenNeutrons, int givenElectrons){
		protons = givenProtons;
		neutrons = givenNeutrons;
		electrons = givenElectrons;}
		
	  /**
	   * Determines the atomic mass of the atom.
	   * @return
	   * The sum of the protons and neutrons
	   */
	public int getAtomicMass(){
		int atomicMass = protons + neutrons;
		return atomicMass;}
	
	  /**
	   * Determines the atomic charge of the atom.
	   * @return
	   * The difference of the protons and electrons.
	   */
	public int getAtomicCharge(){
		int atomicCharge = protons - electrons;
		return atomicCharge;}
	
		/**
		 * Removes 2 protons and 2 electrons
		 */
	public void decay(){
		protons -= 2;
		neutrons -= 2;}
}