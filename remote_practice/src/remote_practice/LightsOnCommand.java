package remote_practice;

public class LightsOnCommand implements Command {
	
	Light light;
	
	public LightsOnCommand(Light light) {
		
		this.light=light;
	}

	@Override
	public void execute() {

		light.on();
	}

}
