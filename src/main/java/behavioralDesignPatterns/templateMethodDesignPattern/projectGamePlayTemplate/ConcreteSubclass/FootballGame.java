package behavioralDesignPatterns.templateMethodDesignPattern.projectGamePlayTemplate.ConcreteSubclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import behavioralDesignPatterns.templateMethodDesignPattern.projectGamePlayTemplate.Template.GamePlayTemplate;

public class FootballGame extends GamePlayTemplate {
    @Override
    public void initialize() { System.out.println("\tFootball Game Initializing."); }

    @Override
    public void startPlay() { 
    	System.out.println("\tFootball Game Starting."); 
//    	playerWantsNewCharacter();	
    }

    @Override
    public void endPlay() { System.out.println("\tFootball Game Ending."); }

    @Override
    protected void addNewCharacterToTheGame() { System.out.println("\tAdding new Character to the Football Game."); }

    public boolean isPlayerWantsNewCharacter() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) { return true; }
        else { return false; }
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("\tWould you like to add a new character to the Football Game? (y/n)?\t");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try { answer = in.readLine(); }
        catch (IOException ioe) { System.out.println("IO Error"); }
        if (answer == null) { return "n"; }
        return answer;
    }
    
    //Add more methods.
}
