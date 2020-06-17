package behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.Main;

import behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.ConcreteStrategy.BlueBalloon;
import behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.ConcreteStrategy.RedBalloon;
import behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.ConcreteStrategy.YellowBalloon;
import behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.Context.ScoreBoard;

//Strategy Design Pattern Game Score System.
//ScoreCalculation is a generalized Strategy that is implemented by different types of Concrete Balloons used by Context of a ScoreBoard.
public class Main {

    public static void main(String[] args) {
    	System.out.println("Strategy Design Pattern Game Score System:");
    	System.out.println("ScoreCalculation is a generalized Strategy that is implemented by different types of Concrete Balloons used by Context of a ScoreBoard.\n");
    	ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Red Balloon Score:\t");
        scoreBoard.scoreCalculation = new RedBalloon();
        scoreBoard.showScore(10, 5);
        
        System.out.print("Yellow Balloon Score:\t");
        scoreBoard.scoreCalculation = new YellowBalloon();
        scoreBoard.showScore(10, 5);

        System.out.print("Blue Balloon Score:\t");
        scoreBoard.scoreCalculation = new BlueBalloon();
        scoreBoard.showScore(10, 5);
    }
}
