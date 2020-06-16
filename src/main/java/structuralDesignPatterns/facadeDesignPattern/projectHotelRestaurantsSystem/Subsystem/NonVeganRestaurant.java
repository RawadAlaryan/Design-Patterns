package structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Subsystem;

public class NonVeganRestaurant implements HotelRestaurant {
    public Menu getMenu() {
        NonVeganMenu nonVeganMenu = new NonVeganMenu();
        return nonVeganMenu;
    }
}
