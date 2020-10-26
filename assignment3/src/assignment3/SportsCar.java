package assignment3;


public class SportsCar {
	// private member variables
	private int maxSpeed;
	private int horsepower;
	private int maxSpeedRequirement = 200; // 200kph
	private int horsepowerRequirement = 250; // 250bhp

	//public variables
	
	// private methods
	private void setSpeed(int s)
	{
		maxSpeed = s;
	}
	
	private int getSpeed()
	{
		return maxSpeed;
	}
	
	private void setHp(int hp)
	{
		horsepower = hp;
	}

	private int getHp() 
	{
		return horsepower;
	}
	
	private void setSpeedReq(int sr)
	{
		maxSpeedRequirement = sr;
	}
	
	private int getSpeedRequirement()
	{
		return maxSpeedRequirement;
	}
	
	private void setHpRequirement(int hpr)
	{
		horsepowerRequirement = hpr;
	}

	private int getHpRequirement() 
	{
		return horsepowerRequirement;
	}
	
	// public methods
	public boolean sportsCheck() 
	{
		if (maxSpeed < maxSpeedRequirement || horsepower < horsepowerRequirement)
		{
			return false;
		} else {
			return true;
		}
	}
	
	public void sportsCarData()
	{
		System.out.println("Minimum Required Top Speed: " + getSpeedRequirement());
		System.out.println("Top Speed: " + this.getSpeed() );
		System.out.println("Minimum Required Horsepower: " + getHpRequirement());
		System.out.println("Horespower: " + this.getHp());
		
		System.out.println("Meets Sportscar requirements: " + this.sportsCheck());
	}
	
	// constructors
	
	public SportsCar(int s, int hp)
	{
		setSpeed(s);
		setHp(hp);
	}
	
}
