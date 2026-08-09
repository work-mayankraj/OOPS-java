package Encapsulation;
import java.util.*;
public class BankAccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		BankAccount b1 = new BankAccount();
		System.out.println("Enter account number :");
		b1.setAccNum(sc.nextInt());
		System.out.println("Enter balance :");
		b1.setBalance(sc.nextInt());
		b1.setaccountHolder("Mayank");
		
		System.out.println("Account Number :"+b1.getaccountNumber());
		System.out.println("Account Holder Name :"+b1.getaccountHolder());
		System.out.println("Account Balance :"+b1.getbalance());
		
		System.out.println("Enter deposite amount ");
		double amount = sc.nextInt();
		b1.deposit(amount);
		
		System.out.println("ENter withdraw amount ");
		double amount2 = sc.nextInt();
		b1.withdraw(amount2);
	}
}
