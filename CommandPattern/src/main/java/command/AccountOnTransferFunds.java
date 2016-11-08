package command;

import dataAccess.AccountDAOImpl;

public class AccountOnTransferFunds implements Commmand{
	
	AccountDAOImpl accountDAOImpl;
	
	public AccountOnTransferFunds(AccountDAOImpl accountDAOImpl) {
		this.accountDAOImpl=accountDAOImpl;
	}
	
	
	public void excute() {
		accountDAOImpl.updateAccount();
		
	}

}
