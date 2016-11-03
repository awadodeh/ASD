package entity;

public class SMSSender implements Observer{

	
	private Observable accountService;
	
	public SMSSender(Observable accountService) {

		this.accountService=accountService;
		accountService.registerObserver(this);
	}
	
	public Observable getAccountService() {
		return accountService;
	}
	public void setAccountService(Observable accountService) {
		this.accountService = accountService;
	}
	
	public void update() {

		System.out.println("SMSSender Observer Message!");

	}
	
}
