package structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Subsystem;

public class NonVeganMenu implements Menu {
	public NonVeganMenu() {
        System.out.println("Creating a Non Vegan Menu.");
    }

    public void showMenu() {
        System.out.println("Menu items in Non Vegan Menu!");
    }
}
