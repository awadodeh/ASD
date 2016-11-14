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
		state.pullgreen();
	}

	public void pullred() {

		state.pullred();
	} 

	
	public void setState(State state) {
		this.state = state;
	}
	
	
}
