package assignment3Robot;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
		String name;
		int age;
		boolean onOff;
		boolean buildBot = false;
		List<Robot> army = new ArrayList<Robot>();
		
		try(Scanner input = new Scanner(System.in)){
		
			System.out.println("Do you wish to build a robot? true/false: ");
			buildBot = input.nextBoolean();
			
			while(buildBot)
			{
						
			System.out.print("Enter your Robot's Name: ");
			name = input.next();
			
			System.out.print("Enter your Robot's Age: ");
			age  = input.nextInt();
			
			System.out.print("Is your Robot on? true/false ");
			onOff = input.nextBoolean();
			
			army.add(new Robot(name, age, onOff));
			
			System.out.print("Do you wish to build another robot? true/false: ");
			buildBot = input.nextBoolean();
			
			
			System.out.println();
			
			}
		}
		
		Iterator<Robot> iterator = army.listIterator();
		while (iterator.hasNext()) {
		    iterator.next().printRobot();
		}
		

	}

}
