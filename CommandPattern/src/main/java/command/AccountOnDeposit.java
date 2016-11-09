package command;

import entity.Account;
import service.Receiver;

public class AccountOnDeposit implements Command{
	
	Receiver receiver;
	
	public AccountOnDeposit(Receiver receiver) {
		this.receiver=receiver;
	}
	
	
	public void excute() {
		receiver.deposit(new Account());
		
	}

	public void undo() {
		
	}
}
