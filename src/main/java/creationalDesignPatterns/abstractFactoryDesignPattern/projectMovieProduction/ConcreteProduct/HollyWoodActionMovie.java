package creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.HollyWoodMovieInterface;

public class HollyWoodActionMovie implements HollyWoodMovieInterface {
    @Override
    public String getMovieName() { return "True Lies is a Hollywood Action Movie"; }
}
