package behavioralDesignPatterns.commandDesignPattern.projectGameMoves.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Receiver.LuigiCharacterReceiver;

public class LuigiDownCommand implements Command {

    private LuigiCharacterReceiver luigiCharacterReceiver;

    public LuigiDownCommand(LuigiCharacterReceiver luigiCharacterReceiver) {
        this.luigiCharacterReceiver = luigiCharacterReceiver;
    }

    @Override
    public void execute() { luigiCharacterReceiver.moveDown(); }
}
