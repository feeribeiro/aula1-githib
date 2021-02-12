package entities;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	private static double fee = 5.00;
	
	
	public Account(int accountNumber, String accountHolder, double initialValue) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialValue);
	}
	
	public Account(int account, String accountHolder) {
		this.accountNumber = account;
		this.accountHolder = accountHolder;
	}
	
	
	public int getaccountNumber() {
		return accountNumber;
	}
	
	public String getaccountHolder() {
		return accountHolder;
	}
	
	public void setaccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getValue() {
		return accountBalance;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void deposit(double value) {
		this.accountBalance += value;
	}
	
	public void withdraw(double value) {
		this.accountBalance -= (value + fee);
	}
	
	public String toString() {
		return "Account "
			+ accountNumber
			+ ", Holder: "
			+ accountHolder
			+ ", Balance: $ "
			+ String.format("%.2f" ,accountBalance);
	}
	
}
