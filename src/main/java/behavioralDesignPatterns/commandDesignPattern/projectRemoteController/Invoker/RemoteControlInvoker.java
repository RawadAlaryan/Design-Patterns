package behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Invoker;

import behavioralDesignPatterns.commandDesignPattern.projectRemoteController.Command.Command;

public class RemoteControlInvoker { 
    Command lightButton;
    Command stereoButton;
    
    public RemoteControlInvoker() {		} 
  
    //Setting Commends for Light Button:
    public void setLightCommandButton(Command command) { lightButton = command; } 
    public void lightButtonPressed() { lightButton.execute(); }

    //Setting Commends for Stereo Button:
    public void setStereoCommandButton(Command command) { stereoButton = command; } 
    public void stereoButtonPressed() { stereoButton.execute(); }
}

