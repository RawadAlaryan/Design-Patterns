package structuralDesignPatterns.facadeDesignPattern.projectHomeTheaterSystem.Main;

import structuralDesignPatterns.facadeDesignPattern.projectHomeTheaterSystem.Facade.HomeTheaterFacade;
import structuralDesignPatterns.facadeDesignPattern.projectHomeTheaterSystem.Subsystem.*;

//Facade Design Pattern Home Theater System.
//Using a HomeTheater Facade to control a lot of subsystems needed to watch a Movie.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Facade Design Pattern Home Theater System.");
    	System.out.println("Using a HomeTheater Facade to control a lot of subsystems needed to watch a Movie:\n");
    	
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
