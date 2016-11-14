package entity;

import java.util.Date;

/**
 * Created by 985191 on 11/1/2016.
 */
public class AccountEntry {

    Date date;
    long amount;
    String description;
    String fromAccountNumber;
    String fromPersonName;
    
    
    
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public String getFromPersonName() {
		return fromPersonName;
	}
	public void setFromPersonName(String fromPersonName) {
		this.fromPersonName = fromPersonName;
	}
    
    
}


