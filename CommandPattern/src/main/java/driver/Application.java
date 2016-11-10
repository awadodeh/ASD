package driver;

import service.AccountService;

/**
 * Created by 985191 on 11/1/2016.
 */
public class Application {

    private AccountService accountService;
  
	public static void main(String[] args){

		
		
    }


	public AccountService getAccountService() {
		return accountService;
	}


	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
    
}
