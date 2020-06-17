package behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.Context;

import behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.Strategy.ScoreCalculation;

public class ScoreBoard {
	
    public ScoreCalculation scoreCalculation;

    public void showScore(int taps, int multiplier) {
        System.out.println(scoreCalculation.calculateScore(taps, multiplier));
    }
}
