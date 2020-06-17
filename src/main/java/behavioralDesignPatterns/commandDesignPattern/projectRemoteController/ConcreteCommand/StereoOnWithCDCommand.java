package behavioralDesignPatterns.commandDesignPattern.projectRemoteController.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Receiver.StereoReceiver;

public class StereoOnWithCDCommand implements Command { 
    StereoReceiver stereo; 
    
    public StereoOnWithCDCommand(StereoReceiver stereo) { this.stereo = stereo; }
    
    public void execute() { 
        stereo.on(); 
        stereo.setCD(); 
        stereo.setVolume(10); 
    } 
}
