package creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.ConcreteFactory;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractFactory.MovieFactoryInterface;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.BollyWoodMovieInterface;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.HollyWoodMovieInterface;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.ConcreteProduct.HollyWoodActionMovie;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.ConcreteProduct.HollyWoodComedyMovie;

public class HollyWoodMovieFactory implements MovieFactoryInterface {
    @Override
	public HollyWoodMovieInterface GetHollyWoodMovie(String type) {
        if (type.equalsIgnoreCase("action")) { return new HollyWoodActionMovie(); }
        else if (type.equalsIgnoreCase("comedy")) { return new HollyWoodComedyMovie(); }
        return null;
    }

    @Override
    public BollyWoodMovieInterface GetBollyWoodMovie(String type) { return null; }
}
