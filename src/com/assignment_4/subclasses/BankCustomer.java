package com.assignment_4.subclasses;

/***
 * @author Miruna, Cornelia
 * @version 1.0
 * 
 */
import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

/***
 * 
 * This is a subclass till class Human It has one attribute which is an
 * ArrayList
 */
public class BankCustomer extends Human {
	ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/***
	 * This is the constructor with two parameters
	 * 
	 * @param name is a string
	 * @param age an int
	 */
	public BankCustomer(String name, int age) {
		super(name, age);

	}

	/***
	 * Here are the getters and setters
	 * 
	 * @return customerAccounts
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	/***
	 * This is the method addAccount where we add a bankAccount
	 * 
	 * @param bankAccount is a string
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);

	}

	/***
	 * This is the method we use to deposit money to a bankAccount
	 * 
	 * @param accountNumber is a string
	 * @param amount is a double
	 */
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).depositMoney(amount);

			}
		}
	}

	/***
	 * 
	 * This is the method we use to withdraw money from a bankAccount
	 * 
	 * @param accountNumber is a string
	 * @param amount is a double
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if (customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}

	
	public String toString() {
		System.out.println("Customer " + getName() +" Age: "+ getAge());
		return "BankCustomer [customerAccounts="  + customerAccounts + "]";
	}

	/***
	 * 
	 * This is the method we use to print name and age of the customer and
	 * information about customers accounts
	 */

	}


