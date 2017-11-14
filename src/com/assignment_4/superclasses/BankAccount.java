package com.assignment_4.superclasses;
/***
 * @author Miruna, Cornelia
 * @version 1.0
 */
import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

/***
 * 
 * This is the superclass where we implements methods from interface
 * The class has three attributes
 */
public class BankAccount implements BankOperations {
	private String accountNumber = "";
	private String accountType = "";
	private double balance = 0.0;
	/***
	 * this is the constructor with no parameters
	 */
	public BankAccount() {
		super();
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
		this.accountType = "Bank account";
		this.balance = 0;
	}
	/***
	 * Here we implements the interfaces methods 
	 * 
	 */
	public void withdrawMoney(double amount)  {
		if (amount>=0) {
			setBalance(getBalance() - amount);
		}else {
			System.out.println("You can not withdraw a negative value!");
		}
	}
		public void depositMoney(double amount) {
			if (amount>=0) {
				setBalance(getBalance() + amount);
				
			}else {
				System.out.println("You can not deposit a negative value!");
		}
			}
	/***
	 * Here we have getters and setters for our attributes	
	 *@return accountNumber is a string
	 *
	 */
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
/***
 * This is the method toString which returns a sting with information about a BankAccount 
 */
	public String toString() {
		return "BankAccount [AccountNumber=" + this.accountNumber + ", AccountType=" + this.accountType + ", Balance=" + this.balance
				+ "]";
	}
	
	}

	
	
	


