package command;

import java.util.Stack;

import entity.Account;
import service.AccountService;

public class AccountOnDepositCommand implements Command{
	
	AccountService accountService;
	
	Stack<Command> execute ;
	Stack<Command> unexecute ;

	private Account account;

	private double amount;
	
	public AccountOnDepositCommand(AccountService accountService) {
		this.accountService=accountService;
		execute=new Stack<Command>();
		unexecute=new Stack<Command>();
	}
	
	
	public void excute() {
		accountService.deposit(this.account, this.amount);
		
		execute.push(this);
		
	}

	public void undo() {
		
		accountService.withdraw(this.account, this.amount);
		
		unexecute.pop();
		
	}
	
	
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Account getAccount() {
		return account;
	}
	
	public double getAmount() {
		return amount;
	}
}
