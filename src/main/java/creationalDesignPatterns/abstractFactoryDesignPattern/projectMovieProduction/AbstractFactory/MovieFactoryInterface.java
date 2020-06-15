package creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractFactory;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.BollyWoodMovieInterface;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.HollyWoodMovieInterface;

public interface MovieFactoryInterface {
    public HollyWoodMovieInterface GetHollyWoodMovie(String type);
    public BollyWoodMovieInterface GetBollyWoodMovie(String type);
}
