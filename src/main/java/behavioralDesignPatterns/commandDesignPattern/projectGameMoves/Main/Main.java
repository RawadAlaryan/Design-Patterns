package behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Main;

import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.ConcreteCommand.*;
import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Invoker.GameConsoleInvoker;
import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Receiver.LuigiCharacterReceiver;
import behavioralDesignPatterns.commandDesignPattern.projectGameMoves.Receiver.MarioCharacterReceiver;

//Command Design Pattern Game Moves.
//Game Character Receivers (Mario, Luigi) receive Move Commands (Up, Down, Left, Right) which are invoked by GameConsoleInvoker.
public class Main {

    public static void main(String[] args) {
    	System.out.println("Command Design Pattern Game Moves.");
    	System.out.println("Game Character Receivers (Mario, Luigi) receive Move Commands (Up, Down, Left, Right) which are invoked by GameConsoleInvoker:\n");
    	
        //Create game Character Mario Receiver:
        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        System.out.println("Creating a game-character:\tMario");
        mario.setName("Mario");

        //Create game Character Luigi Receiver:
        LuigiCharacterReceiver luigi = new LuigiCharacterReceiver();
        System.out.println("Creating a game-character:\tLuigi");
        luigi.setName("Luigi");

        //Create Commands for Mario-Character:
        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

        //Create Commands for Luigi-Character:
        LuigiUpCommand kirbyUpCommand = new LuigiUpCommand(luigi);
        LuigiDownCommand kirbyDownCommand = new LuigiDownCommand(luigi);
        LuigiLeftCommand kirbyLeftCommand = new LuigiLeftCommand(luigi);
        LuigiRightCommand kirbyRightCommand = new LuigiRightCommand(luigi);

        //Create Invoker for Playing Mario-Game:
        GameConsoleInvoker marioGame = new GameConsoleInvoker(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
        System.out.println("\nPlaying Mario-Game in Console:");
        marioGame.arrowDown();
        marioGame.arrowUp();
        marioGame.arrowLeft();
        marioGame.arrowRight();

        //Create Invoker for Playing Luigi-Game:
        GameConsoleInvoker luigiGame = new GameConsoleInvoker(kirbyUpCommand, kirbyDownCommand, kirbyLeftCommand, kirbyRightCommand);
        System.out.println("\nPlaying Luigi-Game in Console:");
        luigiGame.arrowDown();
        luigiGame.arrowUp();
        luigiGame.arrowLeft();
        luigiGame.arrowRight();
    }
}
