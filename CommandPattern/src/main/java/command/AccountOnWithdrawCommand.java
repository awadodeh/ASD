package command;

import java.util.Stack;

import entity.Account;
import service.AccountService;

public class AccountOnWithdrawCommand implements Command{


	AccountService accountService;
	
	Stack<Command> execute ;
	Stack<Command> unexecute ;
	
	Account account = new Account();
	double amount=0;
	
	public AccountOnWithdrawCommand(AccountService receiver) {
		this.accountService=receiver;
		
		execute=new Stack<Command>();
		unexecute=new Stack<Command>();
	}
	
	
	public void excute() {
		accountService.withdraw(this.account,this.amount);
		
		execute.push(this);
		
		
	}


	public void undo() {
		
		accountService.deposit(this.account,this.amount);
		
		if(!unexecute.isEmpty())
		unexecute.pop();
		
	}
	
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
}
