package entity;

/**
 * Created by 985191 on 11/1/2016.
 */
public class CheckingAccount extends Account{


   
    public void addInterest() {
    	super.getInterestStrategy().addInterest();

    }
}
