package behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.ConcreteStrategy;

import behavioralDesignPatterns.strategyDesignPattern.projectGameScoreSystem.Strategy.ScoreCalculation;

public class BlueBalloon extends ScoreCalculation{
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
