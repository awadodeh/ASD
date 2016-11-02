package entity;

/**
 * Created by 985191 on 11/1/2016.
 */
public class CheckingAccount extends Account{


   
    public CheckingAccount() {
		
		setInterestStrategy(new CheckingInterestStrategy());
		
		
	}

//    /**
//     * This method will add the interest rate to the balance directly
//     */
//	public void addInterest() {
//    	setInterest(getInterestStrategy().addInterest(getBalance()));
//    	
//    	long newBalance=getBalance()+getInterest();
//    	setBalance(newBalance);
//
//    }
}
