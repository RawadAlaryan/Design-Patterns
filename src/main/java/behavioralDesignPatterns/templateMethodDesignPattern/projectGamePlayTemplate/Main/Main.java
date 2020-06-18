package behavioralDesignPatterns.templateMethodDesignPattern.projectGamePlayTemplate.Main;

import behavioralDesignPatterns.templateMethodDesignPattern.projectGamePlayTemplate.ConcreteSubclass.FootballGame;
import behavioralDesignPatterns.templateMethodDesignPattern.projectGamePlayTemplate.ConcreteSubclass.RunnerGame;
import behavioralDesignPatterns.templateMethodDesignPattern.projectGamePlayTemplate.Template.GamePlayTemplate;

//Template Method Design Pattern Game Play Template.
//Following a Game Template for starting Games, implemented inside different Game Sub classes.
public class Main {

	public static void main(String[] args) {
		System.out.println("Template Method Design Pattern Game Play Template.");
		System.out.println("Following a Game Template for starting Games, implemented inside different Game Sub classes:\n");
		
		//Playing the Runner Game:
		System.out.println("Playing the Runner Game:");
		GamePlayTemplate runnerGame = new RunnerGame();
		runnerGame.play();
		
		//Playing the Runner Game:
		System.out.println("\nPlaying the Football Game:");
		GamePlayTemplate footballGame = new FootballGame();
		footballGame.play();
	}
}
