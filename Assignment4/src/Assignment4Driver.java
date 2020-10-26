import java.util.ArrayList;
import java.util.Collections;


public class Assignment4Driver {

	public static void main(String[] args) {
		ArrayList<Account> acctList = new ArrayList<Account>();
		
		SavingsAccount s1 = new SavingsAccount(1300.00, .04);
		s1.withdraw(32.57);
					
		CheckingAccount c1 = new CheckingAccount(1200);
		c1.withdraw(11.17);
		c1.orderChecks();
		System.out.println("Current Check Number: " + c1.getCheckNumber());
			
		acctList.add(s1);
		acctList.add(c1);
		
		Collections.sort(acctList);
		
		System.out.println(acctList.get(0).toString());
		System.out.println(acctList.get(1).toString());
		
		
		
	}

}
