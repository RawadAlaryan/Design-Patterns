package behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Invoker;

import behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Command.Command;

public class FileInvoker {
    public Command command;

    public FileInvoker(Command c) { command = c; }

    public void execute() { command.execute(); }
}
