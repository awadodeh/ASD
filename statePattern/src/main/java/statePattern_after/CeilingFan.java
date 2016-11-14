package statePattern_after;

public class CeilingFan {
	
	State offState;
	State lowSpeedState;
	State mediumSpeedState;
	State highSpeedState;
	
	State state = offState;
	
	public CeilingFan() {
		
		 offState = new OffState(this);
		 lowSpeedState = new LowSpeedState(this);
		 mediumSpeedState = new MediumSpeedState(this);
		 highSpeedState = new HighSpeedState(this);
		 
		 state = offState;
		
	}
	
	public void pullgreen() {
//		if (state == 0) {
//			state = 1;
//			System.out.println( "low speed" );
//		} else if (state == 1) {
//			state = 2;
//			System.out.println( "medium speed" );
//		} else if (state == 2) {
//			state = 3;
//			System.out.println( "high speed" );
//		} else {
//			state = 0;
//			System.out.println( "turning off" );
//		}
		
		state.pullgreen();
	}

	public void pullred() {
//		if (state == 0) {
//			state = 3;
//			System.out.println( "high speed" );
//		} else if (state == 1) {
//			state = 0;
//			System.out.println( "turning off" );
//		} else if (state == 2) {
//			state = 1;
//			System.out.println( "low speed" );
//		} else {
//			state = 2;
//			System.out.println( "medium speed" );
//		}
		
		state.pullred();
	} 

	
	public void setState(State state) {
		this.state = state;
	}
	
	
}
