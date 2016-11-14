package statePattern_after;

public class HighSpeedState implements State{
	
	CeilingFan ceilingFan;
	
	public HighSpeedState(CeilingFan ceilingFan) {
		this.ceilingFan=ceilingFan;
	}
	
	public void pullgreen(){
		ceilingFan.setState(ceilingFan.offState);
		System.out.println( "turning off" );
	}
	
	public void pullred(){
		
		ceilingFan.setState(ceilingFan.mediumSpeedState);
		System.out.println( "medium speed" );
		
		
	}
}