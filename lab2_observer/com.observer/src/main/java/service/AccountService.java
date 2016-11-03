package service;

import java.util.ArrayList;
import java.util.List;

import dataAccess.AccountDAO;
import dataAccess.AccountDAOImpl;
import entity.Account;
import entity.EmailSender;
import entity.Observable;
import entity.Observer;

/**
 * Created by 985191 on 11/1/2016.
 */
public class AccountService implements Observable{

    List<Account> account;
    AccountDAO accountDAO;
	List<Observer> observers;
    
    public AccountService() {
    	
    	account=new ArrayList<Account>();
    	accountDAO=new AccountDAOImpl();
    	
    	observers=new ArrayList<Observer>();
    }

    public void createAccount(Account account) {

    	notifyEmailObserver();
    }

    

	public void deposit(Account account) {
    	notifyObservers();


    }

    public void withdraw(Account account) {

    	notifyObservers();

    }

    public void transferFunds(Account account) {
    	notifyObservers();

    	
    }

    public void getAllAccounts(Account account) {
    	
    }

    public void getAccount(Account account) {

    }

	public void registerObserver(Observer o) {

		observers.add(o);
	}

	public void removeObserver(Observer o) {

		int i = observers.indexOf(o);
		if (i >= 0) {
		observers.remove(i); }
	}

	
	public void notifyObservers() {
		
		if(observers !=null)
		{
			observers.forEach(o -> {
				if(o.getClass() !=EmailSender.class){
					o.update();
				}
			});
		}else{
			System.out.println("Observers are empty");
		}
			
	}
	
	public void notifyEmailObserver() {

    	if(observers !=null)
		{
			observers.forEach(o -> {
				if(o.getClass()==EmailSender.class){
					o.update();
				}
			});
		}
	}
}