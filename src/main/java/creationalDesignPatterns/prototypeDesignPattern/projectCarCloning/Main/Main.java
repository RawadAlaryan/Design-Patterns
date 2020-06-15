package creationalDesignPatterns.prototypeDesignPattern.projectCarCloning.Main;

import creationalDesignPatterns.prototypeDesignPattern.projectCarCloning.Prototype.BasicCar;
import creationalDesignPatterns.prototypeDesignPattern.projectCarCloning.Prototype.BasicCarCache;

//Prototype Design Pattern Car Cloning.
//Using a Car Cache to clone other cars.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Prototype Design Pattern Car Cloning.");
    	System.out.println("Using a Car Cache to clone other cars:\n");
    	
        BasicCarCache.loadCache();

        BasicCar bc = (BasicCar) BasicCarCache.getCar("Honda");

        //Price will be more than 100000 for sure:
        bc.price = bc.price+BasicCar.setPrice();
        System.out.println("Car is: "+ bc.getModelName()+" and it’s price is: " + bc.price);

        bc = (BasicCar ) BasicCarCache.getCar("Ford");

        //Price will be more than 500000 for sure:
        bc.price = bc.price+BasicCar.setPrice();
        System.out.println("Car is: "+ bc.getModelName()+" and it’s price is: " + bc.price);
    }
}
