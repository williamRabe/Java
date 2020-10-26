
public class Account implements Comparable<Account>{

	protected double balance;
	
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double d)
	{
		balance+= d;
	}
	
	public void withdraw(double w)
	{
		balance-= w;
	}
	
	public int compareTo(Account a)
	{
		return Double.compare(this.balance,a.balance);
	}
	
	
}
