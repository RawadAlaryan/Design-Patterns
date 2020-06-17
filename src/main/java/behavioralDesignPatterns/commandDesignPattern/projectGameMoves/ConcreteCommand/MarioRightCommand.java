package behavioralDesignPatterns.commandDesignPattern.projectGameMoves.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Receiver.MarioCharacterReceiver;

public class MarioRightCommand implements Command {

    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioRightCommand(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() { marioCharacterReceiver.moveRight(); }
}
