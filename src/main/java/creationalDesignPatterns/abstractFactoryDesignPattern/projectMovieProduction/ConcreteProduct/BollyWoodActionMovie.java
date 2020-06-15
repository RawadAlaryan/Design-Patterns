package creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.BollyWoodMovieInterface;

public class BollyWoodActionMovie implements BollyWoodMovieInterface {
    @Override
    public String getMovieName() { return "Bang Bang is a Bollywood Action Movie"; }
}
