package structuralDesignPatterns.flyweightDesignPattern.projectCounterStrikeFactory.FlyweightFactory;

import java.util.HashMap;

import structuralDesignPatterns.flyweightDesignPattern.projectCounterStrikeFactory.ConcreteFlyweight.CounterTerrorist;
import structuralDesignPatterns.flyweightDesignPattern.projectCounterStrikeFactory.ConcreteFlyweight.Terrorist;

public class PlayerFactory {
    private static HashMap<String, Player> playersHashMap = new HashMap<String, Player>();

    public static Player getPlayer(String type) {
        Player player = null;
        if (playersHashMap.containsKey(type)) { player = playersHashMap.get(type); }
        else {
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");
            }
            playersHashMap.put(type, player);
        }
        return player;
    }
}
