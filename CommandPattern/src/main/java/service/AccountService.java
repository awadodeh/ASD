package service;

import java.util.List;

import command.Commmand;
import entity.Account;

/**
 * Created by 985191 on 11/1/2016.
 */
public class AccountService{

    List<Account> account;
    Commmand commmand;
    
 
    public AccountService(Commmand commmand) {
    	
    	this.commmand=commmand;
    	
    }
    

    public void createAccount(Account account) {

    }

   
	public void deposit(Account account) {

		commmand.excute();

    }

    public void withdraw(Account account) {

    	commmand.excute();
    }

    public void transferFunds(Account account) {

    	commmand.excute();
    }

    public void getAllAccounts(Account account) {
    	
    }

    public void getAccount(Account account) {

    }

}