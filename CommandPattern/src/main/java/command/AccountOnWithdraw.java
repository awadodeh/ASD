package command;

import entity.Account;
import service.Receiver;

public class AccountOnWithdraw implements Command{


	Receiver receiver;
	
	public AccountOnWithdraw(Receiver receiver) {
		this.receiver=receiver;
	}
	
	
	public void excute() {
		receiver.withdraw(new Account());
		
	}


	public void undo() {
		
	}
}
