package structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Main;

import structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Facade.HotelKeeper;
import structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Subsystem.NonVeganMenu;
import structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Subsystem.VeganMenu;

//Facade Design Pattern Hotel Restaurants System.
//Hotel Keeper is a Facade to get Menus from different HotelRestaurants in a Hotel.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Facade Design Pattern Hotel Restaurants System.");
    	System.out.println("Hotel Keeper is a Facade to get Menus from different HotelRestaurants in a Hotel:\n");
    	
        HotelKeeper hotelKeeper = new HotelKeeper();

        VeganMenu veganMenu = hotelKeeper.getVegMenu();
        veganMenu.showMenu();
        
        NonVeganMenu nonVeganMenu = hotelKeeper.getNonVeganMenu();
        nonVeganMenu.showMenu();
    }
}
