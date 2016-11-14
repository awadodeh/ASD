package statePattern_after;

public class MediumSpeedState implements State{
	
	CeilingFan ceilingFan;
	
	public MediumSpeedState(CeilingFan ceilingFan) {
		this.ceilingFan=ceilingFan;
	}
	
	public void pullgreen(){
		ceilingFan.setState(ceilingFan.highSpeedState);
		System.out.println( "high speed" );
	}
	
	public void pullred(){
		ceilingFan.setState(ceilingFan.lowSpeedState);
		System.out.println( "low speed" );
	}
}
