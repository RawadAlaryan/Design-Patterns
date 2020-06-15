package creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.BollyWoodMovieInterface;

public class BollyWoodComedyMovie implements BollyWoodMovieInterface {
    @Override
    public String getMovieName() { return "Munna Bhai MBBS is a Bollywood Comedy Movie"; }
}