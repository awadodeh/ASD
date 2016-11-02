package driver;

import entity.Account;
import service.AccountService;

/**
 * Created by 985191 on 11/1/2016.
 */
public class Application {

    AccountService accountService;
    
    
    public Application() {
    	accountService = new AccountService();
	}

    public Application(AccountService accountService) {

    	this.accountService = accountService;
	}


	public static void main(String[] args){

    	
    	Application app = new Application();
    	
    	
    	
    	
    	
    }


	public AccountService getAccountService() {
		return accountService;
	}


	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
    
}
