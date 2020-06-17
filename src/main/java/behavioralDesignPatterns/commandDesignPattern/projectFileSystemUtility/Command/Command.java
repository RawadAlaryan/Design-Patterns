package behavioralDesignPatterns.commandDesignPattern.projectFileSystemUtility.Command;

public interface Command {
    public void execute();
    //We can add an undo() or redo() commands to this Command interface.
}
