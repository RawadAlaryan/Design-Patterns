package structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Subsystem;

public class VeganMenu implements Menu {
    public VeganMenu() {
        System.out.println("Creating a Vegan Menu.");
    }

    public void showMenu() {
        System.out.println("Menu items in Vegan Menu!");
    }
}