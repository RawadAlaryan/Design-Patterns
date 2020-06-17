package behavioralDesignPatterns.commandDesignPattern.projectRemoteController.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Receiver.LightReceiver;

public class LightOffCommand implements Command { 
    LightReceiver light;
    
    //The constructor is passed the light it is going to control.
    public LightOffCommand(LightReceiver light) { this.light = light; }
    
    public void execute() { light.off(); } 
}
