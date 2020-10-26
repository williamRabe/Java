
public class CheckingAccount extends Account {

	
	private int nextCheckNumber;
	
	public int getCheckNumber()
	{
		return nextCheckNumber;
	}
	public void orderChecks() 
	{
		nextCheckNumber += 1000;
	}
	
	public String toString() {
		return "Checking Account Balance: " + this.getBalance();
	}
	
	public CheckingAccount(double d) {
		this.orderChecks();
		this.deposit(d);
	}
	
}
