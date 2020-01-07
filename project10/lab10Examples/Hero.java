package lab10Examples;

/*
 * Joshua Loftus ComSci 227 Section A
 */
public class Hero
	{
	private Weapon rightWeapon;
	private Weapon leftWeapon;
	
	
	
	public void pickUpLeft(Weapon newWeapon)
		{
		leftWeapon = newWeapon;
		}
		
		
		
	public void pickUpRight(Weapon newWeapon)
		{
		rightWeapon = newWeapon;
		}
		
		
		
	public void fight()
		{
		rightWeapon.use();
		}
		
		
		
	public void fightDirty()
		{
		leftWeapon.use();
		rightWeapon.use();
		}
	}
