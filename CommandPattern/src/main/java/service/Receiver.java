package service;

import java.util.List;

import command.Command;
import entity.Account;

public class Receiver {

    List<Account> account;
    Command commmand;
    
 
    public Receiver(Command commmand) {
    	
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
