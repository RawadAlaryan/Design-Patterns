package behavioralDesignPatterns.commandDesignPattern.projectGameMoves.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Receiver.LuigiCharacterReceiver;

public class LuigiRightCommand implements Command {
    private LuigiCharacterReceiver luigiCharacterReceiver;

    public LuigiRightCommand(LuigiCharacterReceiver luigiCharacterReceiver) {
        this.luigiCharacterReceiver = luigiCharacterReceiver;
    }

    @Override
    public void execute() { luigiCharacterReceiver.moveRight(); }
}
