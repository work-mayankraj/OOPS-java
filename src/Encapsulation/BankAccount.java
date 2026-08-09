package Encapsulation;
public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	void setAccNum(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	void setBalance(double balance) {
	    if (balance >= 0) {
	        this.balance = balance;
	    } else {
	        System.out.println("Not possible");
	    }
	}
	void setaccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	int getaccountNumber() {
		return accountNumber;
	}
	String getaccountHolder() {
		return accountHolder;
	}
	double getbalance() {
		return balance;
	}
	void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
			System.out.println("Balance :"+balance);
		}
		else {
			System.out.println("Deposited amount must be greater than zero");
		}
	}
	void withdraw(double amount) {
		if(amount<=balance) {
			balance -= amount;
			System.out.println("Balance :"+balance);
		}
		else { 
			System.err.println("withdrawing amount can not be greater than balance");
		}
	}
	
}
