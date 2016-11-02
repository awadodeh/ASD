package entity;

/**
 * Created by 985191 on 11/1/2016.
 */
public class SavingAccount extends Account{
	
	 public SavingAccount() {
			
			setInterestStrategy(new SavingInterestStrategy());
			
			
	 }
}
