package entity;

public class EmailSender implements Observer{

	private Observable accountService;
	
	public EmailSender(Observable accountService) {

		this.accountService=accountService;
		accountService.registerObserver(this);
	}
	
	
	public void update() {
		System.out.println("EmailSender Observer Message!");
		
	}
	
	
	public Observable getAccountService() {
		return accountService;
	}
	public void setAccountService(Observable accountService) {
		this.accountService = accountService;
	}
	

}
