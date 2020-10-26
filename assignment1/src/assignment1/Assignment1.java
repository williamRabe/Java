package assignment1;

public class Assignment1 {

	public static void main(String[] args) {
		
		Automobile car1 = new Automobile(),
				car2 = new Automobile();
		
		car1.setDescription("Nissan Rogue");
		car1.setOdometer(197423);
		car1.setSpeed(73);
		car1.setGear('D');
		
		car2.setDescription("Lexus RC350");
		car2.setOdometer(3640);
		car2.setSpeed(102);
		car2.setGear('5');
		
		System.out.println("You have the following cars: ");
		car1.displayAutomobileInfo();
		car2.displayAutomobileInfo();
		
	}

}
