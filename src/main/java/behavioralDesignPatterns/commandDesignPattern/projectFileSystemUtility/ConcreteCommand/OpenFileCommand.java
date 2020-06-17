package behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Receiver.FileSystemReceiver;


public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    //Store previous state for undo, String someState

    public OpenFileCommand(FileSystemReceiver fs) { fileSystem = fs; }

    @Override
    public void execute() {
        //Save previous state, in case undo called  someState = ……. ;
        this.fileSystem.openFile();
    }
}
