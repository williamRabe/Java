package assignment2;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		int num;
		String str1, str2, str3, str4, str5;
		try(Scanner input = new Scanner(System.in)){
		
		System.out.print("Enter 5 phrase words: ");
		str1 = input.next();
		str2 = input.next();
		str3 = input.next();
		str4 = input.next();
		str5 = input.next();
		
		System.out.print("Enter default n value: ");
		num = input.nextInt();
		}
		
		PasswordGenerator p1 = new PasswordGenerator(str1, str2, str3, str4, str5, num);
		
		System.out.println("Using n: " + p1.getN());
		System.out.println("Password Length = " + p1.getPasswordLength() + ": " + p1.getPassword());
		
		PasswordGenerator p2 = new PasswordGenerator(str1, str2, str3, str4, str5, num+1);
		System.out.println("Using n: " + p2.getN());
		System.out.println("Password Length = " + p2.getPasswordLength() + ": " + p2.getPassword());
	}


}
