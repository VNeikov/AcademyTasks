package AcademyTaskGame;

public abstract class Creature {

	private int strength;
	private int health;
	
	Creature(int strength , int health){

		this.health = health;
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}
	
	
}
