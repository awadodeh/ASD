package dataAccess;

public class AccountDAOFactory {
	
//	getAccountDAO

	public AccountDAO getAccountDAO(AccountDAOEnum accountDAOEnum){
		
		
		switch(accountDAOEnum){
		case PRODUCTION:
			return new AccountDAOImpl();
			
		case TESTING:
			return new AccountDAOMock();
			
		default: 
			throw new ExceptionInInitializerError();
			
		}
		
	}
}
