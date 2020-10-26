package assignment3;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int topSpeed;
		int ponies;
		
		try(Scanner input = new Scanner(System.in)){
		System.out.print("Enter car's top speed: ");
		topSpeed = input.nextInt();
		
		System.out.print("Enter car's horsepower: ");
		ponies = input.nextInt();
		}
		
		SportsCar sc1 = new SportsCar(topSpeed, ponies);
		
		sc1.sportsCarData();

	}

}
