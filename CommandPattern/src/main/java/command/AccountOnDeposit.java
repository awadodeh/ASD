package command;

import dataAccess.AccountDAOImpl;

public class AccountOnDeposit implements Commmand{
	
	AccountDAOImpl accountDAOImpl;
	
	public AccountOnDeposit(AccountDAOImpl accountDAOImpl) {
		this.accountDAOImpl=accountDAOImpl;
	}
	
	
	public void excute() {
		accountDAOImpl.updateAccount();
		
	}

}
