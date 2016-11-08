package remote_practice2;

import remote_practice.Light;
import remote_practice.LightsOnCommand;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		
		Light kitchenLight = new Light("Kitchen");
		
//		CeilingFan ceilingFan= new CeilingFan(“Living Room”);
//		
//		GarageDoor garageDoor = new GarageDoor(“”);
		
		Stereo stereo = new Stereo("Living Room");
		
		
		LightsOnCommand livingRoomLightOn =
				new LightsOnCommand(livingRoomLight);
				LightOffCommand livingRoomLightOff =
				new LightOffCommand(livingRoomLight);
				LightsOnCommand kitchenLightOn =
				new LightsOnCommand(kitchenLight);
				LightOffCommand kitchenLightOff =
				new LightOffCommand(kitchenLight);

				
				StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
				StereoOffCommand stereoOff =
				new StereoOffCommand(stereo);
				
				
				remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
				remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff); 
//				remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff); 
				remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
				
				
				System.out.println(remoteControl);
				
				
				remoteControl.onButtonWasPushed(0); 
				remoteControl.offButtonWasPushed(0); 
				remoteControl.onButtonWasPushed(1); 
				remoteControl.offButtonWasPushed(1); 
				remoteControl.onButtonWasPushed(2); 
				remoteControl.offButtonWasPushed(2);
				//remoteControl.onButtonWasPushed(3); remoteControl.offButtonWasPushed(3);
		
	}
}
