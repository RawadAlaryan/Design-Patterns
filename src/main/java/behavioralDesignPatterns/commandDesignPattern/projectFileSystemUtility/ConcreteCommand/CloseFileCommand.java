package behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Receiver.FileSystemReceiver;

public class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) { this.fileSystem = fs; }

    @Override
    public void execute() { this.fileSystem.closeFile(); }
}
