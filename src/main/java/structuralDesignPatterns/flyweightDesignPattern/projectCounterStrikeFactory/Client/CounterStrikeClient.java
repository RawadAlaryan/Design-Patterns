package structuralDesignPatterns.flyweightDesignPattern.projectCounterStrikeFactory.Client;

import java.util.Random;

import structuralDesignPatterns.flyweightDesignPattern.projectCounterStrikeFactory.FlyweightFactory.Player;
import structuralDesignPatterns.flyweightDesignPattern.projectCounterStrikeFactory.FlyweightFactory.PlayerFactory;

//Flyweight Design Pattern CounterStrike.
//Creating lots of Game Characters (CounterTerrorist, Terrorist) to play CounterStrike Game using a Player Factory.
public class CounterStrikeClient {
	// All player types and weapons (used by getRandPlayerType()
    // and getRandWeapon()

    // Utility methods to get a random player type and weapon
    public static String getRandPlayerType()   {
        Random r = new Random();

        // Will return an integer between [0,2)
        int randInt = r.nextInt(playerType.length);

        // return the player stored at index 'randInt'
        return playerType[randInt];
    }

    public static String getRandWeapon()   {
        Random r = new Random();

        // Will return an integer between [0,5)
        int randInt = r.nextInt(weapons.length);

        // Return the weapon stored at index 'randInt'
        return weapons[randInt];
    }

    private static String[] playerType =  {"Terrorist", "CounterTerrorist"};

    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String args[]) {
    	System.out.println("Flyweight Design Pattern CounterStrike.");
    	System.out.println("Creating lots of Game Characters (CounterTerrorist, Terrorist) to play CounterStrike Game using a Player Factory:\n");
    	
        /* Assume that we have a total of 10 players in the game. */
        for (int i = 0; i < 10; i++)  {
            /* getPlayer() is called simply using the class name since the method is a static one */
            Player p = PlayerFactory.getPlayer(getRandPlayerType());

            /* Assign a weapon chosen randomly uniformly from the weapon array  */
            p.assignWeapon(getRandWeapon());

            // Send this player on a mission
            p.mission();
        }
    }
}

