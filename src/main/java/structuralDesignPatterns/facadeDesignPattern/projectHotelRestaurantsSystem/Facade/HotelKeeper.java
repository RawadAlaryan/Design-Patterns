package structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Facade;

import structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Subsystem.NonVeganMenu;
import structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Subsystem.NonVeganRestaurant;
import structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Subsystem.VeganMenu;
import structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Subsystem.VeganRestaurant;

public class HotelKeeper {
    
	public VeganMenu getVegMenu() {
        VeganRestaurant veganRestaurant = new VeganRestaurant();
        VeganMenu veganMenu = (VeganMenu) veganRestaurant.getMenu();
        return veganMenu;
    }

    public NonVeganMenu getNonVeganMenu() {
        NonVeganRestaurant nonVeganRestaurant = new NonVeganRestaurant();
        NonVeganMenu nonVeganMenu = (NonVeganMenu) nonVeganRestaurant.getMenu();
        return nonVeganMenu;
    }
}
