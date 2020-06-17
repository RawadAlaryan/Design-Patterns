package behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Receiver.FileSystemReceiver;

public class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs){ this.fileSystem=fs; }
    @Override
    public void execute() { this.fileSystem.writeFile(); }

}
