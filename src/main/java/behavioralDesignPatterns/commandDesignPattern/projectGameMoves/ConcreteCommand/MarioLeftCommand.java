package behavioralDesignPatterns.commandDesignPattern.projectGameMoves.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Command.Command;
import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Receiver.MarioCharacterReceiver;

public class MarioLeftCommand implements Command {

    private MarioCharacterReceiver marioCharacter;

    public MarioLeftCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() { marioCharacter.moveLeft(); }
}
