
public class SavingsAccount extends BankAccount {
	private final double rate = .025;
	private String accountNumber;
	private int savingsNumber = 0;
	
	SavingsAccount(String name, double initial){
		super(name, initial);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	SavingsAccount(SavingsAccount account, double initial){
		super(account, initial);
		savingsNumber += 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {
		double interest = super.getBalance() * (rate / 12);
		deposit(interest);
	}
	
	public String getAccountNumber () {
		return accountNumber;
	}
}
