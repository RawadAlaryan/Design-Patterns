package creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.Main;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractFactory.FactoryProducer;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractFactory.MovieFactoryInterface;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.BollyWoodMovieInterface;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectMovieProduction.AbstractProduct.HollyWoodMovieInterface;

//Abstract Factory Design Pattern Movie Production.
//Using multiple Movie Factories Classes to manufacture different Movies: HollywoodMovies (Comedy, Action) and BollywoodMovies (Comedy, Action).
public class Main {
    public static void main(String [] args) {
		System.out.println("Abstract Factory Design Pattern Movie Production.");
		System.out.println("Using multiple Movie Factories Classes to manufacture different Movies: HollywoodMovies (Comedy, Action) and BollywoodMovies (Comedy, Action).:\n");

        MovieFactoryInterface hollyWoodMovieFactory = FactoryProducer.getFactory("HollyWoodMovie");

        HollyWoodMovieInterface hAction = hollyWoodMovieFactory.GetHollyWoodMovie("action");
        HollyWoodMovieInterface hComedy = hollyWoodMovieFactory.GetHollyWoodMovie("comedy");

        System.out.println("\nHollyWood movies  are:");
        System.out.println(hAction.getMovieName());
        System.out.println(hComedy.getMovieName());

        MovieFactoryInterface bollyWoodMovieFactory = FactoryProducer.getFactory("BollyWoodMovie");

        BollyWoodMovieInterface bAction = bollyWoodMovieFactory.GetBollyWoodMovie("action");
        BollyWoodMovieInterface bComedy = bollyWoodMovieFactory.GetBollyWoodMovie("comedy");

        System.out.println("\nBollyWood movies  are:");
        System.out.println(bAction.getMovieName());
        System.out.println(bComedy.getMovieName());
    }
}
