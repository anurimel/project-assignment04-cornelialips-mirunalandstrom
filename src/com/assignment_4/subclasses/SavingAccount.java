package com.assignment_4.subclasses;
/***
 * @author Miruna, Cornelia
 * @version 1.0
 * 
 */
import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;
/***
 * 
 * This is a subclass to BankAccount
 *
 */

public class SavingAccount extends BankAccount{
/***
 * This is the constructor, takes no parameters
 */
	public SavingAccount() {
		this.setAccountNumber(UUID.randomUUID().toString().substring(0, 6));
		this.setBalance(0.0);
		this.setAccountType("Personal Account");
	}

}
