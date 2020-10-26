
public class SavingsAccount extends Account {

	private double interest;
	
	public void setInterest(double x) {
		interest = x;
	}
	
	public void compound() {
		balance = balance + balance * interest;
	}
	
	public String toString() {
		return "Savings Account Balance: " + this.getBalance();
	}
	
	public SavingsAccount(double d, double i) {
		this.deposit(d);
		this.setInterest(i);
		this.compound();
	}
}
