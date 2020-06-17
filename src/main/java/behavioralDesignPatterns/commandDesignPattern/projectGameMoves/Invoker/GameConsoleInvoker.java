package behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Invoker;

import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Command.Command;

public class GameConsoleInvoker {
    private Command UpCommand;
    private Command DownCommand;
    private Command LeftCommand;
    private Command RightCommand;

    public GameConsoleInvoker(Command upCommand, Command downCommand, Command leftCommand, Command rightCommand) {
        UpCommand = upCommand; // concrete Commands
        DownCommand = downCommand;
        LeftCommand = leftCommand;
        RightCommand = rightCommand;
    }

    public void arrowUp() { UpCommand.execute(); }
    
    public void arrowDown() { DownCommand.execute(); }

    public void arrowRight() { RightCommand.execute(); }
    
    public void arrowLeft() { LeftCommand.execute(); }
}
