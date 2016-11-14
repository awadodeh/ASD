package remote_practice2;

import remote_practice.Command;
import remote_practice.Light;

public class LightOffCommand implements Command{
	
	Light light;
	
	public LightOffCommand( Light light) {
		this.light=light;
	}
	
	
	@Override
	public void execute() {
		light.off();
	}

}
