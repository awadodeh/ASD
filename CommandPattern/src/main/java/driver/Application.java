package driver;

import dataAccess.AccountDAO;
import entity.Account;
import service.AccountService;

/**
 * Created by 985191 on 11/1/2016.
 */
public class Application {

    private AccountService accountService;
  
	public static void main(String[] args){
		AccountDAO accountDAO;
		Application app = new Application(); 
		
		
				
		app.accountService.createAccount(new Account());
		
    }


	public AccountService getAccountService() {
		return accountService;
	}


	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
    
}
