package entity;

public class SavingInterestStrategy implements InterestStrategy{

	public SavingInterestStrategy() {
		// TODO Auto-generated constructor stub
	}

	
	/**
     * Interest for a savings account:
         If balance < 1000 then you get 1% interest
         If balance > 1000 and balance < 5000 then you get 2% interest
         If balance > 5000 then you get 4% interest
     */
	public long addInterest(long balance) {
		if(balance <= 1000){
			return (long) (balance*0.01);
		}else if(balance > 1000 && balance <= 5000){
			return (long) (balance*0.02);
		}else{
			return (long) (balance*0.04);
		}
	}
}
