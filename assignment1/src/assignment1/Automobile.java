package assignment1;

public class Automobile {
	
	// Member Variables
	private String description;
	private int odometer;
	private	int speed;
	private char gear;
	
	// methods
	
	public void setDescription(String d) 
	{
		this.description = d;
	}
	
	public String getDescription() 
	{
		return this.description;
	}
	
	public void setOdometer(int o) 
	{
		this.odometer = o;
	}
	
	public int getOdometer() 
	{
		return this.odometer;
	}
	public void setSpeed(int s) 
	{
		this.speed = s;
	}
	
	public int getSpeed() 
	{
		return this.speed;
	}
	
	public void setGear(char g) 
	{
		this.gear = g;
	}
	
	public char getGear() 
	{
		return this.gear;
	}
	
	public void displayAutomobileInfo()
	{
		System.out.println("Description: " + getDescription( ));
		System.out.println("Odometer: " + getOdometer( ));
		System.out.println("Speed: " + getSpeed( ));
		System.out.println("Gear: " + getGear( ));
		System.out.println();
	}	
	
}
