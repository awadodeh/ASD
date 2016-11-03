package driver;

import entity.Account;
import entity.Logger;
import entity.SMSSender;
import service.AccountService;

/**
 * Created by 985191 on 11/1/2016.
 */
public class Application {

    private AccountService accountService;
    
    
    public Application() {
    	accountService = new AccountService();
	}

    public Application(AccountService accountService) {

    	this.accountService = accountService;
	}


	public static void main(String[] args){

		AccountService accService = new AccountService();
		
		Logger logger = new Logger(accService);
		SMSSender smsSender=new SMSSender(accService);
//		EmailSender emailSender=new EmailSender(accService);
		
		
		accService.deposit(new Account());
		
			
    	
    	
    }


	public AccountService getAccountService() {
		return accountService;
	}


	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
    
}
