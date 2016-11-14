package statePattern_after;

public class OffState implements State{
	
	CeilingFan ceilingFan;
	
	public OffState(CeilingFan ceilingFan) {
		this.ceilingFan=ceilingFan;
	}
	
	public void pullgreen(){
		ceilingFan.setState(ceilingFan.lowSpeedState);
		System.out.println( "low speed" );
		
	}
	
	public void pullred(){
		ceilingFan.setState(ceilingFan.highSpeedState);
		System.out.println( "high speed" );
		
	}
}
