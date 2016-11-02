package entity;

import java.util.List;

/**
 * Created by 985191 on 11/1/2016.
 */
public class Account {

    private String accountNumber;
    private List<AccountEntry> accountEntryList;
    private Customer customer;
    private InterestStrategy interestStrategy;
    private long balance;
    private long interest;
    
    
    
    
    public long getInterest() {
		return interest;
	}

	public void setInterest(long interest) {
		this.interest = interest;
	}

	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
    
    
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public List<AccountEntry> getAccountEntryList() {
		return accountEntryList;
	}
	
	public void setAccountEntryList(List<AccountEntry> accountEntryList) {
		this.accountEntryList = accountEntryList;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public InterestStrategy getInterestStrategy() {
		return interestStrategy;
	}
	
	public void setInterestStrategy(InterestStrategy interestStrategy) {
		this.interestStrategy = interestStrategy;
	}
   
	/**
	  * This method will add the interest rate to the balance directly
	 */
	 public void addInterest() {
		 setInterest(getInterestStrategy().addInterest(getBalance()));
	    	
		 long newBalance=getBalance()+getInterest();
		 setBalance(newBalance);

	 }
}

