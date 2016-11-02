package entity;

public class CheckingInterestStrategy implements InterestStrategy {

	public CheckingInterestStrategy() {
		// TODO Auto-generated constructor stub
	}
	

	 /**
	     * Interest for a checking account:
	     If balance < 1000 then you get 1,5% interest
	     If balance > 1000 then you get 2,5% interest
	  */
	public long addInterest(long balance) {
		
		if(balance <= 1000){
			return (long) (balance*0.015);
		}else{
			return (long) (balance*0.025);
		}

	}

}
