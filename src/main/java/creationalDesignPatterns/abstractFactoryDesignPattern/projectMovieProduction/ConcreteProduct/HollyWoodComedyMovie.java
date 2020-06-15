package creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.HollyWoodMovieInterface;

public class HollyWoodComedyMovie implements HollyWoodMovieInterface {
    @Override
    public String getMovieName() { return "The Jerk is a Hollywood Comedy Movie"; }
}