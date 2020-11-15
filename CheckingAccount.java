
public class CheckingAccount extends BankAccount{
	final static double fee = 0.15;
	
	public CheckingAccount(String name, double initial) {
		super(name, initial);
		setAccountNumber(getAccountNumber() + "-10");
		
	}
	
	public boolean withdraw(double amount) {
		amount += fee;
		return super.withdraw(amount);
	}
}
