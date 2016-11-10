package command;

import java.util.Stack;

import entity.Account;
import service.AccountService;

public class AccountOnTransferFundsCommand implements Command{
	
	AccountService accountService;
	
	Stack<Command> execute ;
	Stack<Command> unexecute ;
	
	private Account fromAccount;
	private Account toAccount;
	private double amount;
	
	
	public AccountOnTransferFundsCommand(AccountService accountService) {
		this.accountService=accountService;
		execute=new Stack<Command>();
		unexecute=new Stack<Command>();
	}
	
	
	public void excute() {
		accountService.transferFunds(fromAccount, toAccount, amount);
		
		execute.push(this);
		
	}


	public void undo() {
		
		accountService.transferFunds(toAccount, fromAccount, amount);
		if(!unexecute.isEmpty())
			unexecute.pop();
		
	}


	public Account getFromAccount() {
		return fromAccount;
	}


	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}


	public Account getToAccount() {
		return toAccount;
	}


	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}
}
