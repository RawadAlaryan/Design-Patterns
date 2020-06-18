package behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.ConcreteStrategy;

import behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.Strategy.ScoreCalculation;

public class RedBalloon extends ScoreCalculation {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}