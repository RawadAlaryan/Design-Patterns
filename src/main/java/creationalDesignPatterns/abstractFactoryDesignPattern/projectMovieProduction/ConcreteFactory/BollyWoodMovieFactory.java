package creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.ConcreteFactory;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractFactory.MovieFactoryInterface;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.BollyWoodMovieInterface;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.HollyWoodMovieInterface;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.ConcreteProduct.BollyWoodActionMovie;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.ConcreteProduct.BollyWoodComedyMovie;

public class BollyWoodMovieFactory implements MovieFactoryInterface {
    @Override
	public HollyWoodMovieInterface GetHollyWoodMovie(String type) { return null; }

    @Override
    public BollyWoodMovieInterface GetBollyWoodMovie(String type) {
        if(type.equalsIgnoreCase("action")) { return new BollyWoodActionMovie(); }
        else if (type.equalsIgnoreCase("comedy")) { return new BollyWoodComedyMovie(); }
        return null;
    }
}
