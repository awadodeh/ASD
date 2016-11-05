package service;

import java.util.ArrayList;
import java.util.List;
import dataAccess.AccountDAO;
import entity.Account;

/**
 * Created by 985191 on 11/1/2016.
 */
public class AccountService{

    List<Account> account;
    AccountDAO accountDAO;
    
    /**
     * this constructor to create account service based on the accountDAO we pass 
     * @param accountDAO
     */
    public AccountService(AccountDAO accountDAO) {
    	
    	account=new ArrayList<Account>();
    	this.accountDAO=accountDAO;
    	
    }

    public void createAccount(Account account) {
    	this.accountDAO.saveAccount(account);

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

}