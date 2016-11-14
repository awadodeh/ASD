package service;

import entity.Account;

/**
 * Created by 985191 on 11/1/2016.
 */
public interface AccountService{
        

    public void createAccount(Account account) ;

   
	public void deposit(Account account, double amount);

    public void withdraw(Account account, double amount) ;

    public void transferFunds(Account fromAccount,Account toAccount,double amount);

    public void getAllAccounts(Account account);

    public void getAccount(Account account) ;

}