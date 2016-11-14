package remote_practice2;

import remote_practice.Command;

public class StereoOnWithCDCommand implements Command{
	
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo=stereo;
	}
	
	
	
	@Override
	public void execute() {
		this.stereo.setCd();
		this.stereo.on();
		stereo.setVolume(11);
		
	}

}
