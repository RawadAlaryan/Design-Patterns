package behavioralDesignPatterns.commandDesignPattern.projectRemoteController.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Receiver.StereoReceiver;

public class StereoOffCommand implements Command { 
    StereoReceiver stereo; 
    
    public StereoOffCommand(StereoReceiver stereo) { this.stereo = stereo; } 
    
    public void execute() { stereo.off(); } 
}
