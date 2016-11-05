package driver;

import dataAccess.AccountDAO;
import dataAccess.AccountDAOEnum;
import dataAccess.AccountDAOFactory;
import entity.Account;
import service.AccountService;

/**
 * Created by 985191 on 11/1/2016.
 */
public class Application {

    private AccountService accountService;
  
	public static void main(String[] args){
		AccountDAO accountDAO;
		AccountDAOFactory accountDAOFactory;
		Application app = new Application(); 
		
		accountDAOFactory = new AccountDAOFactory();
		
		accountDAO = accountDAOFactory.getAccountDAO(AccountDAOEnum.TESTING);
//		accountDAO = accountDAOFactory.getAccountDAO(AccountDAOEnum.PRODUCTION);
		
		app.accountService= new AccountService(accountDAO);
		
		app.accountService.createAccount(new Account());
		
    }


	public AccountService getAccountService() {
		return accountService;
	}


	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
    
}
