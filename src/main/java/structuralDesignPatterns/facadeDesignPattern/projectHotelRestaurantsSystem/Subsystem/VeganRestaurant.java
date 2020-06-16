package structuralDesignPatterns.facadeDesignPattern.projectHotelRestaurantsSystem.Subsystem;

public class VeganRestaurant implements HotelRestaurant {
    public Menu getMenu() {
        VeganMenu veganMenu = new VeganMenu();
        return veganMenu;
    }
}
