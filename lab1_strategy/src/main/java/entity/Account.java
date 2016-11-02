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
   
    
}

