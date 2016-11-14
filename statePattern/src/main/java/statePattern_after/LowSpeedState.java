package statePattern_after;

public class LowSpeedState implements State{
	
	CeilingFan ceilingFan;
	
	public LowSpeedState(CeilingFan ceilingFan) {
		this.ceilingFan=ceilingFan;
	}
	
	public void pullgreen(){
		ceilingFan.setState(ceilingFan.mediumSpeedState);
		System.out.println( "medium speed" );
	}
	
	public void pullred(){
		ceilingFan.setState(ceilingFan.offState);
		System.out.println( "turning off" );
		
	}
}
