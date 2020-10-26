package assignment3Robot;


public class Robot {
	// private member variables
	private String name = "unknown";
	private int age = 0;
	private boolean isOn = false;
	
	private static int robotsCreated = 0;

	
	// Methods
	private void setName(String n)
	{
		name = n;
	}
	
	private String getName()
	{
		return name;
	}
	
	private void setAge(int a)
	{
		age = a;
	}
	
	private int getAge()
	{
		return age;
	}
	
	private void setIsOn(boolean i)
	{
		isOn = i;
	}
	
	private boolean getIsOn()
	{
		return isOn;
	}
	
	private void updateRobotCount()
	{
		robotsCreated++;
	}
	
	private void robotCountCheck(boolean i) {
		if (robotsCreated > 5)
		{
			setIsOn(false);
		} else {
			setIsOn(i);
		}
	}
	
	public void printRobot()
	{
		System.out.println("Your Robot: " + name);
		System.out.println(name + "'s age: " + age);
		System.out.println(name + " is on: " + isOn);
	}
	
	// Constructors
	public Robot( ) {}
	
	public Robot (String n, int a, boolean i)
	{
		setName(n);
		setAge(a);
		updateRobotCount();
		robotCountCheck(i);
		
	}
	
	
	
}
