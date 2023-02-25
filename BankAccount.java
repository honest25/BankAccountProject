package project;
import java.util.Scanner;
public class BankAccount {
	    private String accountNumber;
	    private String accountHolderName;
	    private double balance;

	    public BankAccount(String accountNumber, String accountHolderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolderName = accountHolderName;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposit successful. New balance is " + balance);
	    }

	    public void withdraw(double amount) {
	        if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawal successful. New balance is " + balance);
	        }
	    }

	    public void checkBalance() {
	        System.out.println("Current balance is " + balance);
	    }
	}

