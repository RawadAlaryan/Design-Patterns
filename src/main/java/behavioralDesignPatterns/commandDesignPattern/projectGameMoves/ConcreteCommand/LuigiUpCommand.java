package behavioralDesignPatterns.commandDesignPattern.projectGameMoves.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Receiver.LuigiCharacterReceiver;

public class LuigiUpCommand implements Command{

    private LuigiCharacterReceiver luigiCharacterReceiver;

    public LuigiUpCommand(LuigiCharacterReceiver luigiCharacterReceiver) {
        this.luigiCharacterReceiver = luigiCharacterReceiver;
    }

    @Override
    public void execute() { luigiCharacterReceiver.moveUp(); }
}
