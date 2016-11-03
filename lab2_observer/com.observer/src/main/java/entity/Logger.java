package entity;

public class Logger implements Observer{

	private Observable accountService;
	
	public Logger(Observable accountService) {

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

		System.out.println("Logger Observer Message!");
	}
	

}
