package command;

import dataAccess.AccountDAOImpl;

public class AccountOnWithdraw implements Commmand{


	AccountDAOImpl accountDAOImpl;
	
	public AccountOnWithdraw(AccountDAOImpl accountDAOImpl) {
		this.accountDAOImpl=accountDAOImpl;
	}
	
	
	public void excute() {
		accountDAOImpl.updateAccount();
		
	}
}
