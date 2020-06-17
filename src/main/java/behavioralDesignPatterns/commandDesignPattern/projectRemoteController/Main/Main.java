package behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Main;

import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.ConcreteCommand.*;
import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Invoker.RemoteControlInvoker;
import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Receiver.LightReceiver;
import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Receiver.StereoReceiver;

//Command Design Pattern Remote Controller.
//Device Receivers (Light, Stereo) receive Control Commands (On, Off, Volume, etc) which are invoked by RemoteControllerInvoker.
public class Main {

    public static void main(String[] args) {
    	System.out.println("Command Design Pattern Remote Controller.");
    	System.out.println("Device Receivers (Light, Stereo) receive Control Commands (On, Off, Volume, etc) which are invoked by RemoteControllerInvoker:\n");
    	
    	RemoteControlInvoker remoteController = new RemoteControlInvoker(); 
    	LightReceiver light = new LightReceiver(); 
    	System.out.println("Creating a Light Receiver.");
    	StereoReceiver stereo = new StereoReceiver(); 
    	System.out.println("Creating a Stereo Receiver.");
    	
    	//Testing Light Commands:
    	System.out.println("\nTesting Stereo Commands:");
    	remoteController.setLightCommandButton(new LightOnCommand(light)); 
    	remoteController.lightButtonPressed();
    	remoteController.setLightCommandButton(new LightOffCommand(light)); 
    	remoteController.lightButtonPressed();    	
    	
    	//Testing Stereo Commands:
    	System.out.println("\nTesting Stereo Commands:");
    	remoteController.setStereoCommandButton(new StereoOnWithCDCommand(stereo)); 
    	remoteController.stereoButtonPressed();
    	remoteController.setStereoCommandButton(new StereoOffCommand(stereo)); 
    	remoteController.stereoButtonPressed();
    }
}
