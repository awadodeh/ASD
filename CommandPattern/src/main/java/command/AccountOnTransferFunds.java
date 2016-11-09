package command;

import entity.Account;
import service.Receiver;

public class AccountOnTransferFunds implements Command{
	
	Receiver receiver;
	
	public AccountOnTransferFunds(Receiver receiver) {
		this.receiver=receiver;
	}
	
	
	public void excute() {
		receiver.transferFunds(new Account());
		
	}


	public void undo() {
		
		
	}

}
