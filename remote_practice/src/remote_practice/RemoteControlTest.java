package remote_practice;


/**
 * In this case our RemoteControlTest is the Client
 * @author Awad
 *
 */
public class RemoteControlTest {
	
	public static void main(String[] args){
		
		//SimpleRemoteControl is our Invoker
		SimpleRemoteControl remote=new SimpleRemoteControl();
		
		//light is our Receiver 
		Light light = new Light();
		
		//this is our command object
		LightsOnCommand command = new LightsOnCommand(light);
		
		//Here, pass the command to the Invoker.
		remote.setCommand(command);
		
		
		//And then we simulate the button being pressed.
		remote.buttonWasPressed();
		
		
		
		
		GarageDoor door = new GarageDoor();
		
		GarageDoorOpenCommand command2 = new GarageDoorOpenCommand(door);
		
		remote.setCommand(command2);
		remote.buttonWasPressed();

		
		
	}

}
