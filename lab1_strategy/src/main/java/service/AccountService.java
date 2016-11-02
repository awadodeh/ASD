package service;

import dataAccess.AccountDAO;
import entity.Account;

/**
 * Created by 985191 on 11/1/2016.
 */
public class AccountService {

    Account account;
    AccountDAO accountDAO;


    public void createAccount(Account account) {

    }

    public void deposit(Account account) {

    }

    public void withdraw(Account account) {

    }

    public void transferFunds(Account account) {

    }

    public void getAllAccounts(Account account) {

    }

    public void getAccount(Account account) {

    }
    
    
    /**
	  * This method will add the interest rate to the balance directly
	 */
	 public void addInterest() {
		 account.setInterest(account.getInterestStrategy().addInterest(account.getBalance()));
	    	
		 long newBalance=account.getBalance()+account.getInterest();
		 account.setBalance(newBalance);

	 }
}