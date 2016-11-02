package driver;

import entity.Account;
import entity.CheckingAccount;
import entity.SavingAccount;
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
//    	List<Account> accounts = new ArrayList<Account>();
    	
    	Account checkingAccount = new CheckingAccount();
    	Account savingAccount = new SavingAccount();
    	
    	checkingAccount.setBalance(1001);
    	savingAccount.setBalance(2000);
    	
//    	checkingAccount.addInterest();
//    	savingAccount.addInterest();
    	
    	Application app = new Application();
    	app.getAccountService().addInterest();
    	
    	
    	
    	
    	
    }


	public AccountService getAccountService() {
		return accountService;
	}


	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
    
}
